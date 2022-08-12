package Core.java.systemexit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SystemExit {

    public static void exampleMethod(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            if (i > 4) {                   //Check condition for i
                System.out.println("Terminating JVM...");
                //System.exit(0);            //Terminates JVM when if condition is satisfied
            }
            System.out.println("Array Index: " + i + " Array Element: " + array1[i]);
        }
    }

    public static void main(String[] args) {
        int[] array1 = {0, 2, 4, 6, 8, 10, 12, 14, 16};
        exampleMethod(array1);             //function call


//Let's see one more example of exit() method in a try-catch-finally block.
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt")); //Reads "file.txt" file
            System.out.println(br.readLine());
//            br.close();            // Closes bufferreader 'br'
        } catch (IOException e) {   // Catches exception
            System.out.println("Exception caught. Terminating JVM.");
            System.exit(0);  //<--- Terminates JVM as file is not available
        } finally {
            System.out.println("Exiting the program"); //<---As the JVM is terminated in the catch block, JVM won't be able to read the final block
        }
    }

}