package com.company;

class Monkey{
     void jump(){
         System.out.println("I can jump");
     }
     void bite(){
         System.out.println("I can bite anyone");
     }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("I can eat");
    }
    @Override
    public void sleep(){
        System.out.println("I have to sleep once a day");
    }
    public void speak(){
        System.out.println("Hello Everyone !");
    }

}

public class CWH_60_AbstractClass_PS {
    public static void main(String[] args) {
        Human adam=new Human();
        adam.jump();
        adam.bite();
        adam.eat();
        adam.sleep();
        adam.speak();
    }
}
