public class StringArray {
    public static void main(String[] args) {
        String[] symbols = new String[10];
        int[] values = new int[10];

        symbols[0] = "x";
        values[0] = 5;

        symbols[1] = "y";
        values[1] = 4;

        int index = -1;

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == null) {
                index = i;
                break;
            }
        }

        System.out.println("Next open slot is: " + index);

        symbols[index] = "z";
        values[index] = 4;

        for (int i = 0; i < symbols.length; i++) {
            System.out.println(i + ": " + symbols[i] + " = " + values[i]);
        }
    }
}