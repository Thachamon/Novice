import java.io.*;
import java.util.Scanner;

public class Item {
    private String Bow;
    private String Knife;
    private int attack;
    private String name;
    public int hp;
    public int mana;

    public Item(String name) {
        this.name = name;

        if (this.name.equals("Bow")) {
            this.attack = 15;
        }

        else if (this.name.equals("Knife")) {
            this.attack = 10;
        }

    }

    public void show() {
        System.out.println("Name = " + this.name);
        System.out.println("HP : "+this.hp);
        System.out.println("Mana : "+this.mana);
    }

}

 class Armor extends Item{
    public Armor(String name){
        this.hp = hp;
     }
    public int ArmorUp (){
         hp = hp+25;
    }
}

class Shoes extends Item{
    public Shoes(String name){
        this.mana = mana;
    }
    public int ShoesUp(){
        mana = mana+20;
    }
}
