import java.io.*;
import java.util.Scanner;

public class Monster {
    public static void main(String[] args) {
        int number;
        boolean run;
        run = true;
        Scanner get = new Scanner(System.in);

        Novice player = new Novice(100);
        System.out.print("Please Enter your name: ");
        String name = get.nextLine();
        System.out.println("Welcome" + " " + name);

        while (run) {
            System.out.println("****************************");
            System.out.println("Please Enter the activity number to do");
            System.out.println("1 For Kill Monter");
            System.out.println("2 For Add Item 'Bow' ");
            // System.out.println("3 For Eat Poison");
            System.out.println("3 Show Items");
            System.out.println("0 For End");
            System.out.println("****************************");
            System.out.print("Enter number : ");
            number = get.nextInt();
            System.out.println("****************************");

            if (number == 1) {
                System.out.println("Level Up!!!");
                // System.out.println("Your level is " + player.killMonter());
                // player.
            } else if (number == 2) {
                // System.out.println("Your HP is " + player.eatFood());
                player.addItem("Bow");
            } else if (number == 3) {
                // System.out.println("Your HP is " + player.eatPoison());
                player.showItem();
            }
            // else if (number == 4){
            // System.out.println("Your HP is " + player.sleep());
            // }
            else if (number == 0) {
                run = false;
                System.out.println("#### GAME OVER ####");
            }
        }

    }
}