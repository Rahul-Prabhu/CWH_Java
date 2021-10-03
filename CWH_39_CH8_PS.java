package com.company;

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
class Square{
    int side;
    int area;
     public int getArea(){
         area=side*side;
         return area;
     }
     public int getPerimeter(){
         return (4*side);
     }
}

class CellPhone{
    public void ringing(){
        System.out.println("Ringing");
    }
    public void vibrating(){
        System.out.println("Vibrating");
    }
}

class Employee1{
    String name;
    int salary;
    public int getSalary() {
        return salary;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

}
public class CWH_39_CH8_PS {
    public static void main(String[] args) {
        //Problem 1
//        Employee1 e1 =new Employee1();
//        e1.name="Rahul";
//        e1.salary=12000000;
//        System.out.println(e1.getSalary());
//        System.out.println(e1.getName());
        //Problem 2
//        CellPhone c=new CellPhone();
//        c.ringing();
//        c.vibrating();
        //Problem 3
        Square s=new Square();
        s.side=4;
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
        //Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
