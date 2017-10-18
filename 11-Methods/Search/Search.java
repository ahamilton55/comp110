public class Search {
    // main is the main method of the program. It is the default method that the
    // Java Virtual Machine uses to when executing your program.
    public static void main(String[] args) {
        int[] data = {1, 2, 4, 5, 9, 10, 11};
        int value = 0;
        int index;

        try {
            value = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer");
            System.exit(1);
        }

        // Print out our array
        System.out.print("Our array: ");
        printArray(data);
        System.out.println();
        System.out.println();

        // Print out our array again.
        // Get back a string value and print it
        System.out.print("Our array again: ");
        String output = arrayToString(data);
        System.out.println(output);
        System.out.println();

        // Run a binary search for the value
        index = BinarySearch(data, value);
        System.out.println("Binary search result: " + index);
        System.out.println();

        // Run a linear search for the value
        index = LinearSearch(data, value);
        System.out.println("Linear search result: " + index);
    }

    // arrayToString creates a space separated string representation for a provided array
    // The return type is void meaning that no return value is returned to the user
    public static String arrayToString(int[] data) {
        String output = "";

        for (int i = 0; i < data.length; i++ ) {
            output += data[i] + " ";
        }

        return output;
    }

    // printArray will print out the provided array
    // printArray also uses the arrayToString method above to create the string that is
    // printed out by this method.
    // The return type is void meaning that no return value is returned to the user
    public static void printArray(int[] data) {
        System.out.print(arrayToString(data));
    }

    // BinarySearch will search through the provided array for the provided value
    // The return type of method is an int
    // The arguments are an integer array named data and an integer named value
    public static int BinarySearch(int[] data, int value) {
        int first = 0;
        int last = data.length - 1;
        int index = -1;
        while(first<=last) {
           int i = first + (last-first)/2;

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

        return index;
    }

    // LinearSearch will search through the provided array for the provided value
    // The return type of method is an int
    // The arguments are an integer array named data and an integer named value
    public static int LinearSearch(int[] data, int value) {
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
        return index;
    }
}