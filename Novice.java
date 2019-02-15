import java.io.*;
import java.util.Scanner;

public class Novice {

    private int hp;
    private int exp;
    private int maxHp;
    private int maxExp;
    private int level;
    private Bag bag;
    private String name;
    private int attack;

    public Novice(int initialHealth) {
        this.hp = initialHealth;
        this.exp = 0;
        this.maxHp = 100;
        this.maxExp = 300;
        this.level = 1;
        this.name = "Papa";
        this.bag = new Bag();
        this.attack = 10;
    }

    public int levelUp() {
        level = level + 1;
        return level;
    }

    public int hpSleep() {
        if (hp < maxHp) {
            hp = maxHp;
        }
        return hp;
    }

    public int hpUp() {
        if (hp < maxHp) {
            hp = hp + 10;
        }
        return hp;
    }

    public int hpDown() {
        if (hp <= 0) {
            hp = 0;
            System.out.println("#### GAME OVER ####");
        } else if (hp > 0) {
            hp = hp - 20;
        }
        return hp;
    }

    public int sleep() {
        if (hp < maxHp) {
            hp = hp + 25;
            System.out.println("I'm ready!!!");
        } else if (hp >= maxHp) {
            System.out.println("I'm ready!!!");
        }
        return hp;
    }

    public int eatFood() {
        if (hp < maxHp) {
            this.hpUp();
        } else if (hp >= maxHp) {
            System.out.println("I'm Full!!!");
        }

        return hp;
    }

    public int eatPoison() {
        if (hp > 20) {
            this.hpDown();
            System.out.println("The taste is bad!!!");
        } else if (hp <= 20) {
            this.hpDown();
            System.out.println("#### GAME OVER ####");
        }
        return hp;
    }

    public int killMonter() {
        exp = exp + 300;
        if (exp >= maxExp) {
            this.levelUp();
        }
        exp = exp % maxExp;
        return level;
    }

    public void addItem(String itemName) {
        this.bag.addItem(itemName);
    }

    public void showItem() {
        this.bag.showItem();
        System.out.println();
    }
}