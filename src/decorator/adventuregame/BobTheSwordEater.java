package decorator.adventuregame;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class BobTheSwordEater {

    public static void main(String[] args) {

        GameCharacter bob = new BasicCharacter("Bob");
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        String input;

        do{
            System.out.println("You come to a 4-way fork in your path.");
            System.out.println("Which number path do you take? (1-4)");
            keyboard.nextLine();


            //The following has repeat code because copy paste is fast, if this is unacceptable I can change it
            switch (rand.nextInt(4)){
                case 0:
                    System.out.println("You've come across a Spear!");
                    System.out.println("Eat it? (Y to eat)");
                    input = keyboard.nextLine();

                    if(input.toLowerCase().equals("y")){
                        System.out.println(bob.getName() + " has become:");
                        bob = new Spear(bob);
                        System.out.println(bob.getName()+"!");
                    }
                    else System.out.println("You move along.");
                    System.out.println("Your might has increased to "+bob.getMight());
                    break;
                case 1:
                    System.out.println("You've come across a Sword!");
                    System.out.println("Eat it? (Y to eat)");
                    input = keyboard.nextLine();

                    if(input.toLowerCase().equals("y")){
                        System.out.println(bob.getName() + " has become:");
                        bob = new Sword(bob);
                        System.out.println(bob.getName()+"!");
                    }
                    else System.out.println("You move along.");
                    System.out.println("Your might has increased to "+bob.getMight());
                    break;
                case 2:
                    System.out.println("You've come across a Shield!");
                    System.out.println("Eat it? (Y to eat)");
                    input = keyboard.nextLine();

                    if(input.toLowerCase().equals("y")){
                        System.out.println(bob.getName() + " has become:");
                        bob = new Shield(bob);
                        System.out.println(bob.getName()+"!");
                    }
                    else System.out.println("You move along.");
                    System.out.println("Your might has increased to "+bob.getMight());
                    break;
                case 3:
                    System.out.println("You've become very very hungry.");
                    System.out.println("You are now starving.");
                    System.out.println(bob.getName() + " has become:");
                    bob = new Starving(bob);
                    System.out.println(bob.getName()+"!");
                    System.out.println("Your might has decreased to "+bob.getMight());
                    break;
            }
        }while(bob.getMight()>=0);
        System.out.println("You dead");



    }



}
