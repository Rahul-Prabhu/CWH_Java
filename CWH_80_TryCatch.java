package com.company;

public class CWH_80_TryCatch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        System.out.println("Start of the Program");
        // Without Try:
//        int c = a / b;
//        System.out.println("The result is " + c);
//         With Try:
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch(Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
