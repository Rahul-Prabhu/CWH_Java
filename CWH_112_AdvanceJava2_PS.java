package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class CWH_112_AdvanceJava2_PS {
    public static void main(String[] args) throws IOException {
//        MyDeprecated d = new MyDeprecated();
//        d.meth1();
//        MyInt i = () -> System.out.println("I am display");
        String table = "";
        for(int i=2;i<10;i++) {
//           table += "";
            for (int j = 0; j < 10; j++) {
                table += i + "X" + (j + 1) + "=" + i * (j + 1);
                table += "\n";
            }
            table += "\n";
        }
//        try {

            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
