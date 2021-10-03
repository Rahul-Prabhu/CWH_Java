//Question 4
package com.company;
import java.util.*;
public class CWH_chapter1_PS {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Pl.enter Distance in km: ");
//        float km=sc.nextFloat();
//        float mile=km*0.621371f;
//        System.out.println("Distance in miles is: "+mile);
//    }
//}
//Question 5
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("pl.enter anything:");
        boolean ans = sc.hasNextInt();
        if (ans)
            System.out.println("User entered Integer");
        else
            System.out.println("User did not entered Integer");
    }
}