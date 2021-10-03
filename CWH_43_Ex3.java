package com.company;
import java.util.*;

class Game{
   private int r;
    public Game(int random){
       r=random;
   }

    private int input;


    public void takeUserInput(int n){
        this.input=n;
    }
    public int isCorrectNumber() {
        if (input == r)
            return 1;
        else if (input > r)
            return 0;
        else
            return -1;

    }

}

public class CWH_43_Ex3 {
    public static void main(String[] args) {
        Random rd=new Random();
        int r=rd.nextInt(100);

        Scanner sc = new Scanner(System.in);
        int c=0;
        while(true) {
            System.out.println("pl.enter a number: ");
            int n = sc.nextInt();
            Game g = new Game(r);
            g.takeUserInput(n);
            if (g.isCorrectNumber() == 1) {
                System.out.println("************Congratulations!! Your guess is correct************"+
                        " You made "+c+" attempts");
                break;
            }
            else if(g.isCorrectNumber() == 0) {
                System.out.println("Your guess is greater than number");
                c += 1;
            }
            else {
                System.out.println("Your guess is less than number");
                c += 1;
            }
        }

    }
}