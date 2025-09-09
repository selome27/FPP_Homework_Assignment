package LESSON5.lesson5_problem4;

public class ApplianceTest {
    public static void main(String[] args) {
        Electronics[] appliances = {
            new WashingMachine(7),
            new Refrigerator(4),
            new Microwave(800)
        };
        for (Electronics e : appliances) {
             e.performFunction();
            }

        }
    }

