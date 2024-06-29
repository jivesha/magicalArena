package com.magicalarena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter health for playerA:");
        int healthA = scanner.nextInt();
        System.out.println("Enter strength for playerA:");
        int strengthA = scanner.nextInt();
        System.out.println("Enter attack for playerA:");
        int attackA = scanner.nextInt();

        Player playerA = new Player(healthA, strengthA, attackA);

        System.out.println("Enter health for playerB:");
        int healthB = scanner.nextInt();
        System.out.println("Enter strength for playerB:");
        int strengthB = scanner.nextInt();
        System.out.println("Enter attack for playerB:");
        int attackB = scanner.nextInt();

        Player playerB = new Player(healthB, strengthB, attackB);

        Arena arena = new Arena();
        arena.fight(playerA, playerB);

        scanner.close();
    }
}
