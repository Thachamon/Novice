import java.io.*;
import java.util.Scanner;

public class Item {
    private String Bow;
    private String Knife;
    private int attack;
    private String name;

    public Item(String name) {
        this.name = name;
        if (this.name.equals("Bow")) {
            this.attack = 15;
        }

        else if (this.name.equals("Knife")) {
            this.attack = 10;
        }

    }

    public void showName() {
        System.out.println("Name = " + this.name);

    }
}
