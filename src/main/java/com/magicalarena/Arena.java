package com.magicalarena;

public class Arena {

    public void fight(Player player1, Player player2) {
        Dice attackDice = new Dice(6);
        Dice defenseDice = new Dice(6);

        Player attacker = player1.getHealth() <= player2.getHealth() ? player1 : player2;
        Player defender = attacker == player1 ? player2 : player1;

        while (attacker.isAlive() && defender.isAlive()) {
            calculateDamage(attacker, defender, attackDice, defenseDice);
            if (defender.isAlive()) {
                // Swap roles
                Player temp = attacker;
                attacker = defender;
                defender = temp;
            }
        }

        System.out.println("Winner: " + (attacker.isAlive() ? "Attacker" : "Defender"));
    }

    public void calculateDamage(Player attacker, Player defender, Dice attackDice, Dice defenseDice) {
        int attackRoll = attackDice.roll();
        int defenseRoll = defenseDice.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseStrength = defender.getStrength() * defenseRoll;

        int damageToDefender = attackDamage - defenseStrength;
        if (damageToDefender > 0) {
            defender.takeDamage(damageToDefender);
        }

        System.out.printf("Attacker rolled %d (attack damage: %d), Defender rolled %d (defense strength: %d). Defender's health: %d\n",
                attackRoll, attackDamage, defenseRoll, defenseStrength, defender.getHealth());
    }
}
