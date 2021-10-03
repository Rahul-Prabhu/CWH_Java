package com.company;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.time.*;
import java.util.HashSet;
import java.util.*;

public class CWH_102_AdvanceJava1_PS {
    public static void main(String[] args) {
//        Question 1
//        ArrayList arr=new ArrayList();
//        arr.add("Student 1: Rahul");
//        arr.add("Student 2: Chitra");
//        arr.add("Student 3: Akanksha");
//        arr.add("Student 4: Ram");
//
//        for(Object i : arr){
//            System.out.println(i);
//        }

        //Question 2
//        Date d=new Date();
//        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        //Question 3
//        Calendar c=Calendar.getInstance() ;
//        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        //Question 4
//        LocalTime t=LocalTime.now();
//        DateTimeFormatter dt=DateTimeFormatter.ofPattern("H:m:s a");
//        System.out.println(t);
//        System.out.println(dt);
//        String myDate = t.format(dt); // Creating date string using date and format
//        System.out.println(myDate);
//        //Question 5

        HashSet<Integer> myhashset=new HashSet<>(6,0.75f);
        myhashset.add(1);
        myhashset.add(2);
        myhashset.add(1);
        myhashset.add(10);
        myhashset.add(19);
        System.out.println(myhashset);

    }
}
