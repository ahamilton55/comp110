import java.util.*;
import java.io.*;

public class Cat {
    public static void main(String[] args) throws Exception {
        if(args.length == 0) {
            args = new String[1];
            args[0] ="/dev/stdin";
        }

        outputData(args);
    }

    public static void outputData(String[] files) throws Exception {
        for(int i=0; i < files.length; i++) {
            try {
                File f = new File(files[i]);
                if (f.isDirectory()) {
                    System.out.printf("cat: %s: Is a directory\n", files[i]);
                    continue;
                }
                Scanner in = new Scanner(new FileInputStream(files[i]));
                String line = "";

                while(in.hasNextLine()) {
                    line = in.nextLine();
                    System.out.println(line);
                }
                in.close();
            } catch (FileNotFoundException e) {
                // cat: ../doesnotexist.txt: No such file or directory
                System.out.printf("cat: %s: No such file or directory\n", files[i]);
            }
        }
    }
}