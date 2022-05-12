package com.lab;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");
        //creating the objects

        Wizard Ian = new Wizard("Ian", 10,120,200);
        Warlock Ira = new Warlock("Ira", 10, 110, 150);
        //the implementation of method nameDisplay();
        Ian.nameDisplay();
        Ira.nameDisplay();

        //start of the sequence
        Ian.telepathy(Ira);
        Ian.showStats();
        Ira.showStats();

        Ira.electricibility(Ian);
        //implementation of method showStats();
        Ian.showStats();
        Ira.showStats();

        //the use of regen spell
        Ian.healSpell();
        Ian.showStats();
        Ira.showStats();

        Ira.waterBall(Ian);
        Ian.showStats();
        Ira.showStats();

        Ian.Gun(Ira);
        //the levelUp();method
        Ian.levelUp();
    }
}