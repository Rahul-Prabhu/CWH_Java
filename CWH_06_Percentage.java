package com.company;
import java.util.*;
public class CWH_06_Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=500;
        System.out.println("pl.enter subject1:");
        float s1=sc.nextFloat();
        System.out.println("pl.enter subject2:");
        float s2=sc.nextFloat();
        System.out.println("pl.enter subject3:");
        float s3=sc.nextFloat();
        System.out.println("pl.enter subject4:");
        float s4=sc.nextFloat();
        System.out.println("pl.enter subject5:");
        float s5=sc.nextFloat();
        float percentage=((s1+s2+s3+s4+s5)/500)*100;
        System.out.println("Percentage of Student is: "+percentage);
    }


}
