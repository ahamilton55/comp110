public class Dice {
    private Die[] d; 

    // A constructor that will take in the number of dice being requested
    // and default the number of sides to 6
    public Dice(int n) {
        Dice myD = new Dice(n, 6);
        d = myD.d;
    }

    // A constructor that will take in the number of dice and the number of
    // sides
    public Dice(int n, int sides) {
        // Update the size of the array for the number of dice
        d = new Die[n];
        // Iterate through each die and create it
        for (int i = 0; i < n; i++) {
            if (sides <= 0) {
                d[i] = new Die();
            } else {
                d[i] = new Die(sides);
            }
        }
    }

    // Roll all of the dice and return the sum of all of the rolls
    public int roll() {
        int sum = 0;

        for (int i = 0; i < d.length; i++) {
            sum += d[i].roll();
        }

        return sum;
    }

    // A "getter" for the number of sides for the dice. It uses the "getter"
    // in the Die class for the first die
    public int getSides() {
        if (d.length > 0) {
            return d[0].getSides();
        }
        return 0;
    }

    // Static main method used for execution
    public static void main(String[] args) {
        Dice myDice = new Dice(2, 6);
        Dice myDice2 = new Dice(2);
        System.out.println("Sides " + myDice.getSides());
        System.out.println("Sides of 2 " + myDice2.getSides());

        System.out.println(myDice.roll());
        System.out.println(myDice2.roll());
    }
}