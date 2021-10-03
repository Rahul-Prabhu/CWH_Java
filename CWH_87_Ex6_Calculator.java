package com.company;
import java.util.*;

class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "pl. enter input less than 100000";
    }
}
class MaxMultiplierException extends Exception{
    @Override
    public String toString(){
        return "pl. enter input less than 7000";
    }
}

public class CWH_87_Ex6_Calculator {
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }


    public static void main(String[] args) {
        System.out.println("--------This is a Calculator--------");
        System.out.println("Pl.enter the operation that you expect:" +
                "1. Addition 2. Subtraction 3. Multiplication 4. Division");
        Scanner sc = new Scanner(System.in);

        try {
            int n=sc.nextInt();

        switch (n) {
            case 1:
            {
                try {
                    System.out.println("pl. enter two numbers");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    if (a>=100000 || b>=100000)
                    {
                        throw new MaxInputException();
                    }
                    int result = add(a, b);
                    System.out.println("Answer is "+result);
                }
                catch(MaxInputException e){
                    System.out.println(e.toString());
                }
            }
            break;
            case 2:
            {
                System.out.println("pl.enter two number");
                try {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    if (a>=100000 || b>=100000)
                    {
                        throw new MaxInputException();
                    }
                    int result = sub(a, b);
                    System.out.println("Answer is: " + result);
                }
                catch(MaxInputException e){
                    System.out.println(e.toString());
                }
            }
            break;
            case 3:
            {
                System.out.println("pl.enter two number");
                try {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    if (a>=100000 || b>=100000)
                    {
                        throw new MaxInputException();
                    }
                    if (a>=7000 || b>=7000)
                    {
                        throw new MaxMultiplierException();
                    }
                    int result = mul(a, b);
                    System.out.println("Answer is: " + result);
                }
                catch(MaxInputException e){
                    System.out.println(e.toString());
                }
                catch(MaxMultiplierException e){
                    System.out.println(e.toString());
                }
            }
            break;
            case 4:
            {
                System.out.println("pl.enter two number");
                try {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    if (a>=100000 || b>=100000)
                    {
                        throw new MaxInputException();
                    }
                    int result = div(a, b);
                    System.out.println("Answer is: " + result);
                }
                catch(MaxInputException e){
                    System.out.println(e.toString());
                }
                catch(ArithmeticException e){
                    System.out.println(e.toString());
                }
            }
            break;
            default:
                System.out.println("Pl.enter valid input");
        }
        }
        catch (Exception InvalidInputException) {
            System.out.println("Pl.enter valid input");
        }
    }
}
