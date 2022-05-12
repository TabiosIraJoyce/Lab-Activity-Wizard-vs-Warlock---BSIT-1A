package com.lab;

public class Warlock extends Character{
    Warlock(String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);
    }
    public void electricibility(Character enemyCharacter) {
        int damagePoints = 70;
        int manaCost = 30;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with electricibility (Damage - 50)");
        damageTarget(enemyCharacter, damagePoints);
    }
    public void waterBall(Character enemyCharacter){
        int damagePoints = 60;
        int manaCost = 40;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with waterBall (Damage - 70)");
        damageTarget(enemyCharacter, damagePoints);
    }
    public void healthRegen(){
        int heal=60;
        int manaRegen=60;

        healthPoints += heal;
        manaPoints += manaRegen;

        System.out.println(super.characterName +" use Spell Regen (Health +"+ heal +")" + " (Mana +"+ manaRegen +")");
    }

}