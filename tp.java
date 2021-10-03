package com.company;
class rthread extends Thread{
    public rthread(String name){
        super(name);
    }
    public void run(){
        System.out.println("This is "+this.getName());
    }

}

class sthread extends Thread{
    public sthread(String name){
        super(name);
    }
    public void run(){
        System.out.println("This is "+this.getName());
    }

}


public class tp {
    public static void main(String[] args) {
        rthread rahul=new rthread("Rahul");
        sthread shraddha=new sthread("Shraddha");
        rahul.setPriority(Thread.MAX_PRIORITY);
        shraddha.setPriority(Thread.MIN_PRIORITY);
        shraddha.start();
        rahul.start();

    }

}
