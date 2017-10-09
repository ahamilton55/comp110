// Import for the Scanner class
import java.util.*;
// Import for the FileInputStream class
import java.io.*;

public class Cat {
    public static void main(String[] args) {
        // If we don't get any arguments, assume that we want to
        // get standard input (stdin)
        if(args.length == 0) {
            args = new String[1];
            // This will work on Linux and OS X. Not sure about Windows
            // This is the default location to lookup stdin
            args[0] ="/dev/stdin";
        }

        // Calls the function below called outputData and uses the arguments array
        // created by the main function
        outputData(args);
    }

    // outputData will take in an array of files and print the contents out to stdout
    public static void outputData(String[] files) throws Exception {
        // Loop over all of the files provided
        for(int i=0; i < files.length; i++) {
            try {
                // Check to see if the provided file path is actually a directory
                // If it is a directory then print out an error message and continue
                File f = new File(files[i]);
                if (f.isDirectory()) {
                    System.out.printf("cat: %s: Is a directory\n", files[i]);
                    continue;
                }

                // Open the file as a Scanner so that we can get the input
                Scanner in = new Scanner(new FileInputStream(files[i]));
                String line = "";

                // Loop while we continue to have new lines to read and print out
                while(in.hasNextLine()) {
                    line = in.nextLine();
                    System.out.println(line);
                }

                // Close our scanner when we are done with it to make sure that we don't exhaust
                // the number of open files on the system
                in.close();
            // Catch the execption that occurs if we attempt to open a file that does not exist
            } catch (FileNotFoundException e) {
                // cat: ../doesnotexist.txt: No such file or directory
                // We use printf here which allows us to enter a string varaible to our output
                System.out.printf("cat: %s: No such file or directory\n", files[i]);
            }
        }
    }
}