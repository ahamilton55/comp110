public class LinearSearch {
    public static void main(String[] args) {
        int[] data = { 484, 489, 9, 29, 202, 391101, 39381};
        int value = 0;

        try {
            value = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer");
            System.exit(1);
        }

        int index = -1;
        for (int i=data.length-1; i >= 0; i--) {
            if (data[i] == value) {
                index = i;
                break;
            }
            if (data[i] != value) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Index found: " + index);
    }
}