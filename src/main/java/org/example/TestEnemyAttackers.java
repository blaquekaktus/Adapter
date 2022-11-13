package org.example;

public class TestEnemyAttackers {
    public static void main(String[] args) {

        EnemyTank xd181Tank = new EnemyTank();
        EnemyRobot freDestroyer = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(freDestroyer);

        System.out.println("\nThe Robot!");

        freDestroyer.reactToHuman("Paul");
        freDestroyer.walkForward();
        freDestroyer.smashWithHands();

        System.out.println("\nThe Enemy Tank!");

        xd181Tank.assignDriver("Frank");
        xd181Tank.driveForward();
        xd181Tank.fireWeapon();

        System.out.println("\nThe Robot with Adapter!");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }
}