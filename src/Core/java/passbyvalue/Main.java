package Core.java.passbyvalue;
import java. util.*;
//Let's understand the pass-by-value using an example.

public class Main{
    //Variables hold the copies of the original value
    public void print(int x, int y) {
        //Increment the values of formal parameters
        ++x;
        ++y;
        System.out.println("Copied variable values: " + x + " " + y);
    }

    public static void main(String[] args) {
        //Creating an object of the Main class
        Main ob = new Main();
        int x = 6;
        int y = 7;
        //Printing the values of x and y
        System.out.println("Original values:"+ x + " " + y);
        //pass by value
        ob.print(x, y);
        //Printing the values of x and y
        System.out.println("Original values " + x + " " + y);

          //How Objects are Passed as Arguments in Java?
        List<Integer> lst=new ArrayList<>();
        System.out.println("Before Updating: "+lst);
        update(lst);
        System.out.println("After Updating the list:"+lst);

    }
    public static void update(List<Integer> lst){
        lst.add(1);
    }


}
