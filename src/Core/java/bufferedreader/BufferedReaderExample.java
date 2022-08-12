package Core.java.bufferedreader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {

        // Using BufferedReader for Getting Input from User*******************************
        /*InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.print("Please enter the input: ");
        String name = reader.readLine();
        System.out.print("You entered: ");
        System.out.println(name);

        // Closing to avoid memory leak.
        input.close();*/


        // Using Scanner for Getting Input from User**************************
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.println("You entered string: " + name);

        int age = input.nextInt();
        System.out.println("You entered integer: " + age);

        float percentage = input.nextFloat();
        System.out.println("You entered float: " + percentage);

        // Closing to avoid memory leak.
        input.close();

        /*// Using Console Class****************************
            Console c = System.console();
            System.out.print("Enter your name: ");
            String n = c.readLine();
            System.out.println("Welcome " + n);

*/


    }
}
