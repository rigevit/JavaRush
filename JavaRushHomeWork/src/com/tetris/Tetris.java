package com.tetris;


        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.geom.Ellipse2D;


public class Tetris {
    public static void main(String[] args) {

        MainWindow tetrisGameWindow = new MainWindow("Sash Tetris", 600, 600);
    }

}

class MainWindow {
    private JFrame frame;
    private CanvasPane canvas;


    private Graphics2D graphic;
    private Color backgroundColor;
    private Image canvasImage;
    private TimerThread timerThread;
    private boolean gameOver = false;
    private boolean gamePaused = false;
    private TetrisGame theGame;
    private int[][] tetrisView = new int[12][25];
    private int[][] tetrisStatic = new int[12][25];
    public MainWindow(String title, int width, int height) {


        frame = new JFrame();
        frame.setSize(new Dimension(width, height+100));
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.black);
        canvas = new CanvasPane(); // JPanel
        canvas.setSize(new Dimension(width-100, height-100));
        canvas.setLocation(0, 0);
        frame.add(canvas);
        frame.setTitle(title);
        frame.setLocation(30, 30);
        frame.setVisible(true);
        timerThread = new TimerThread();



        if (graphic == null) {
            canvasImage = canvas.createImage(width-100, height-100);
            graphic = (Graphics2D) canvasImage.getGraphics();
            graphic.setColor(backgroundColor);
            graphic.fillRect(0, 0, width-100, height-100);
            graphic.setColor(Color.black);
        }

        JPanel buttonPanel = new JPanel();
        buttonPanel.setSize(new Dimension(width-150, 50));
        buttonPanel.setBackground(Color.PINK);
        buttonPanel.setLocation(0, height - 70);
        frame.add(buttonPanel);

        buttonPanel.setLayout(new GridLayout(1, 4));
        JButton buttonMoveLeft = new JButton("Move left");

        buttonMoveLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theGame.moveFigureLeft();
            }
        });
        JButton buttonMoveRight = new JButton("Move right");
        buttonMoveRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theGame.moveFigureRight();
            }
        });
        JButton buttonRotate = new JButton("Rotate");
        buttonRotate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theGame.rotateFigure();;
            }
        });

        JButton buttonMoveDown = new JButton("Move down");
        buttonMoveDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theGame.moveFigureDown();
            }

        });
//        buttonPanel.add(buttonMoveLeft);
//        buttonPanel.add(buttonRotate);
//        buttonPanel.add(buttonMoveRight);
//        buttonPanel.add(buttonMoveDown);
        buttonPanel.add (new Label("Use LEFT, RIGHT, DOWN for moving figures. UP for rotate. SPACE for pause"));
        buttonPanel.setFocusable(true);
        buttonPanel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 37:
                        theGame.moveFigureLeft();
                        break;
                    case 38:
                        theGame.rotateFigure();
                        break;
                    case 39:
                        theGame.moveFigureRight();
                        break;
                    case 40:
                        theGame.moveFigureDown();
                        break;
                    case 32:
                        gamePaused = !gamePaused;
                        if (!gamePaused){
                            timerThread = new TimerThread();
                            timerThread.start();
                        }
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        theGame = new TetrisGame();
        theGame.startMoveNewFigure();
        drawTetris();

        timerThread.start();
        buttonPanel.setFocusable(true);
    }

    public void draw(Shape shape) {
        graphic.draw(shape); // Graphic is JPanel.CanvasImage.Graphic
        canvas.repaint();
    }

    public void repaint() {
        frame.repaint();
    }


    public void erase() {
        Color original = graphic.getColor();
        graphic.setColor(Color.black);
        Dimension size = canvas.getSize();
        graphic.fill(new Rectangle(0, 0, size.width, size.height));
        graphic.setColor(original);
        canvas.repaint();

    }

    public void drawTetris(){
        int sizeOfCell = 20;
        erase();
        tetrisView = theGame.getTetrisView();
        tetrisStatic = theGame.getTetrisStaticView();
        for (int x = 1; x <= 10; x++)
            for (int y = 1; y <= 20; y++){
                graphic.setColor(Color.red);
                graphic.draw(new Rectangle(x * sizeOfCell, y * sizeOfCell, sizeOfCell, sizeOfCell));
                if (tetrisView[x][y]==1){
                    graphic.setColor(Color.green);
                    graphic.fill(new Ellipse2D.Double(x * sizeOfCell + 2, y * sizeOfCell + 2, sizeOfCell - 4, sizeOfCell - 4));
                }
            }

        for (int x = 1; x <= 10; x++)
            for (int y = 1; y <= 20; y++)
                if (tetrisStatic[x][y]==1){
                    graphic.setColor(Color.gray);
                    graphic.fill(new Ellipse2D.Double(x * sizeOfCell + 2, y * sizeOfCell + 2, sizeOfCell - 4, sizeOfCell - 4));
                }

        canvas.repaint();
    }

    private class CanvasPane extends JPanel {
        public void paint(Graphics g) {
            g.drawImage(canvasImage, 0, 0, null);
        }
    }




    class TimerThread extends Thread {
        public void run() {

            while (!gameOver && !gamePaused) {
                pause();
                theGame.moveFigureDown();
            }
        }

        private void pause() {
            try {
                Thread.sleep(800);   // pause for 300 milliseconds
            } catch (InterruptedException exc) {
            }
        }
    }
    class TetrisGame{



        private boolean figureOnAir = false;
        private boolean isMovingDown = false;
        private boolean isRotatingNow= false;
        private boolean isAddNewFigure= false;
        private int[][] tetrisMatrix = new int[15][25];
        private int[][] tetrisMatrixCash = new int[15][25];
        private int[][] tetrisMatrixStatic = new int[15][25];
        private int[][] tetrisMatrixView = new int[15][25];
        private int[][] figureDescription = new int[4][4];

        public boolean isFigureOnAir() {
            return figureOnAir;
        }

        public void setFigureOnAir(boolean figureOnAir) {
            this.figureOnAir = figureOnAir;
        }

        public TetrisFigure getFigure() {
            return figure;
        }

        public void setFigure(TetrisFigure figure) {
            this.figure = figure;
        }

        private TetrisFigure figure;

        public int[][] getTetrisView() {
            return tetrisMatrixView;
        }

        public int[][] getTetrisStaticView() {
            return tetrisMatrixStatic;
        }

        TetrisGame(){
            for (int i=0; i<21; i++){
                tetrisMatrixStatic[0][i] = 1;
                tetrisMatrixStatic[11][i] = 1;
                tetrisMatrixStatic[12][i] = 1;
                tetrisMatrixStatic[13][i] = 1;
                tetrisMatrixStatic[14][i] = 1;
            }
            for (int i=0; i<12; i++){
                tetrisMatrixStatic[i][21] = 1;
            }
            ServiceFunction.arrayCopy(tetrisMatrixStatic, tetrisMatrix, 15, 25);
            figure = new TetrisFigure();

        }
        public void startMoveNewFigure(){
            figureOnAir = true;
            isAddNewFigure = true;
            figure.newRandomFigure();
            putFigure(figure,5,1);
            isAddNewFigure = false;

        }
        public void moveFigureLeft(){
            putFigure(figure,figure.getCurrentX()-1,figure.getCurrentY());
        }
        public void moveFigureRight(){

            putFigure(figure,figure.getCurrentX()+1,figure.getCurrentY());
        }
        public void moveFigureDown(){
            isMovingDown = true;
            putFigure(figure,figure.getCurrentX(),figure.getCurrentY()+1);
            isMovingDown = false;
        }

        public void rotateFigure(){
            isRotatingNow = true;
            putFigure(figure,figure.getCurrentX(),figure.getCurrentY());
            isRotatingNow = false;
        }



        public void putFigure(TetrisFigure figure, int x, int y){
            if (gameOver) {
                drawTetris();
                return;
            }
            ServiceFunction.arrayCopy(tetrisMatrixStatic, tetrisMatrixCash, 15, 25);

            figureDescription = figure.getFigureDescription();
            if (isRotatingNow && figure.isRotateble())
            {
                ServiceFunction.rotateMatrix(figureDescription,figure.getSize());
            }
            for (int yy = 0; yy < 4; yy ++)
                for (int xx = 0; xx < 4; xx ++)
                {
                    try {
                        tetrisMatrixCash[x + xx][y + yy] += figureDescription[xx][yy];
                        tetrisMatrixCash[x + xx][y + yy] = tetrisMatrixCash[x + xx][y + yy];
                    }catch (ArrayIndexOutOfBoundsException e){
                        // System.out.println("Err, x = "+ x+ " y= " + y + " xx =" +xx + " yy =" + yy );
                    }

                }
            if (checkOverloadMatrix())
            {
                figure.setCurrentX(x);
                figure.setCurrentY(y);
                figure.setFigureDecription(figureDescription);
                ServiceFunction.arrayCopy(tetrisMatrixCash, tetrisMatrixView,15,25);
            }
            else {
                if (isMovingDown) // And fail to move down
                {
                    ServiceFunction.arrayCopy(tetrisMatrixView, tetrisMatrixStatic,15,25);
                    isMovingDown = false;
                    figureOnAir = false;
                    deleteComleteRows();
                    startMoveNewFigure();
                }
                if (isRotatingNow) {
                    figureDescription = figure.getFigureDescription();
                    ServiceFunction.arrayCopy(tetrisMatrixStatic, tetrisMatrixCash, 15, 25);
                }
                if (isAddNewFigure) {
                    gameOver = true;
                    System.out.println("Game over");
                }
            }
            drawTetris();
        }
        public void deleteComleteRows(){
            int comleteRowsCount = 0;
            int summInRow = 0;
            for (int y = 1; y <= 20; y++){
                summInRow = 0;
                for (int x = 1; x <= 10; x++){
                    summInRow += tetrisMatrixStatic[x][y];
                }
                if (summInRow == 10){
                    comleteRowsCount ++;
                    for(int yy = y; yy > 1; yy -- ){
                        for (int x = 1; x <= 10; x++){
                            tetrisMatrixStatic[x][yy] = tetrisMatrixStatic[x][yy - 1];
                        }
                    }
                    for (int x = 1; x <= 10; x++){
                        tetrisMatrixStatic[x][0] = 0;

                    }
                    ServiceFunction.arrayCopy(tetrisMatrixStatic, tetrisMatrixView,15,25);
                    ServiceFunction.wait(300);
                    drawTetris();
                }
            }
            if (comleteRowsCount > 0){
                System.out.println("You have complete =" + comleteRowsCount + "= rows");
            }
        }
        public boolean checkOverloadMatrix(){
            for (int xx = 0; xx < 12; xx ++)
                for (int yy = 0; yy < 25; yy ++)
                    if (tetrisMatrixCash[xx][yy]>1){return false;}
            return true;
        }
    }
    static class TetrisFigure{
        private int currentX;
        private int currentY;



        private int size;
        private boolean rotateble = false;
        private int[][] figureDescription = new int[4][4];

        public int getCurrentX() {
            return currentX;
        }

        public void setCurrentX(int currentX) {
            this.currentX = currentX;
        }

        public int[][] getFigureDescription() {
            int[][] figureDescriptionCopy = new int[4][4];
            ServiceFunction.arrayCopy(figureDescription,figureDescriptionCopy,4,4);
            return figureDescriptionCopy;
        }

        public void setFigureDecription(int[][] figureDescriptionCopy) {
            ServiceFunction.arrayCopy(figureDescriptionCopy, this.figureDescription,4,4);
        }

        public int getCurrentY() {
            return currentY;
        }

        public void setCurrentY(int currentY) {
            this.currentY = currentY;
        }

        public boolean isRotateble() {
            return rotateble;
        }

        public void setRotateble(boolean rotateble) {
            this.rotateble = rotateble;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
        TetrisFigure(){
            newRandomFigure();
        }
        public void newRandomFigure(){
            ServiceFunction.clearMatrix(figureDescription,4,4);
            setCurrentX(5);
            setCurrentY(1);
            int r = 1 + (int) (Math.random()*7);
            switch (r){ //I, J, L, O, S, T, Z.
                case 1: {//I
                    figureDescription[1][0] = 1;
                    figureDescription[1][1] = 1;
                    figureDescription[1][2] = 1;
                    figureDescription[1][3] = 1;
                    setSize(4);
                    setRotateble(true);
                    break;
                }
                case 2: {// J
                    figureDescription[1][0] = 1;
                    figureDescription[1][1] = 1;
                    figureDescription[1][2] = 1;
                    figureDescription[0][2] = 1;
                    setSize(3);
                    setRotateble(true);
                    break;
                }
                case 3: {//L
                    figureDescription[1][0] = 1;
                    figureDescription[1][1] = 1;
                    figureDescription[1][2] = 1;
                    figureDescription[2][2] = 1;
                    setSize(3);
                    setRotateble(true);
                    break;
                }
                case 4: {//O
                    figureDescription[0][0] = 1;
                    figureDescription[1][0] = 1;
                    figureDescription[1][1] = 1;
                    figureDescription[0][1] = 1;
                    setSize(3);
                    setRotateble(false);
                    break;
                }
                case 5: {//S
                    figureDescription[1][0] = 1;
                    figureDescription[2][0] = 1;
                    figureDescription[0][1] = 1;
                    figureDescription[1][1] = 1;
                    setSize(3);
                    setRotateble(true);
                    break;
                }
                case 6: {//Z
                    figureDescription[0][0] = 1;
                    figureDescription[1][0] = 1;
                    figureDescription[1][1] = 1;
                    figureDescription[2][1] = 1;
                    setSize(3);
                    setRotateble(true);
                    break;
                }
                case 7: {//T
                    figureDescription[0][1] = 1;
                    figureDescription[1][1] = 1;
                    figureDescription[2][1] = 1;
                    figureDescription[1][0] = 1;
                    setSize(3);
                    setRotateble(true);
                    break;
                }
            }
        }

    }

}
class ServiceFunction{
    static void arrayCopy(int[][] scr, int[][] dest, int x, int y){
        for (int yy = 0; yy < y; yy ++)
            for (int xx = 0; xx < x; xx ++){
                dest[xx][yy] = scr[xx][yy];
            }
    }
    static void rotateMatrix(int[][] matrix, int size) {
        int[][] newMatrix = new int[4][4];
        for (int yy = 0; yy < size; yy++)
            for (int xx = 0; xx < size; xx++) {
                if (size == 3)
                {newMatrix[xx][yy] = matrix[size - 1 - yy][xx];}
                else if (size == 4){
                    newMatrix[xx][yy] = matrix[yy][xx];
                }
            }
        arrayCopy(newMatrix,matrix,4,4);
    }
    static void clearMatrix(int[][] matrix,int x, int y) {
        for (int yy = 0; yy < y; yy++)
            for (int xx = 0; xx < x; xx++)
                matrix[xx][yy] = 0;
    }

    public static void wait(int milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        }
        catch (Exception e)
        {
            // ignoring exception at the moment
        }
    }
}
