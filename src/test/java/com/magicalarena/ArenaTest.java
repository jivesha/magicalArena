package com.magicalarena;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArenaTest {

    @Test
    void testFight() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena arena = new Arena();
        arena.fight(playerA, playerB);

        assertTrue(!playerA.isAlive() || !playerB.isAlive());
    }
}
