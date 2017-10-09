public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {1, 2, 4, 5, 9, 10, 11};
        int value = 0;

        try {
            value = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer");
            System.exit(1);
        }

        int first = 0;
        int last = data.length - 1;
        int index = -1;
        while(first<=last) {
           int i = first + (last-first)/2;
           System.out.println(i);

           if (data[i] == value) {
               index = i;
               break;
           }

           if (data[i] > value) {
               last = i-1;
           } else {
               first = i+1;
           }
        }

        System.out.println("Index: " + index);
    }
}