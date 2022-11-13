package org.example;
import java.util.Random;

public class EnemyRobot {
    Random rand = new Random();

    public void smashWithHands() {
        int attackDamage = rand.nextInt(10) + 1;
        System.out.println("Enemy Robot caused " + attackDamage + " damage with it's hands.");
    }

    public void walkForward() {
        int movement = rand.nextInt(5) + 1;
        System.out.println("Enemy Robot walks forward " + movement + " spaces.");
    }


    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot tramps on " + driverName + ".");
    }

}
