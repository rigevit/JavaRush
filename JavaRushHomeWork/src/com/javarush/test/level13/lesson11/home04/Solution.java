package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please type file path: ");
        String fileName = reader.readLine();
        System.out.println("Please type data for file:");
        ArrayList<String> list = new ArrayList<>();

        for (; true; ) {
            String rows = reader.readLine();
            if (rows.equals("exit")) {
                list.add(rows);
                break;
            }
                else list.add(rows);
        }

        OutputStream outStream = new FileOutputStream(fileName);
        OutputStreamWriter writer = new OutputStreamWriter(outStream);
        BufferedWriter out = new BufferedWriter(writer);
        for (int i = 0; i < list.size(); i++)
        {
            out.write(list.get(i));
            out.flush();
            writer.write(System.getProperty("line.separator"));
        }
    }
}
