package Core.java.strings;

public class SCP {


    public static void main(String[] args) {
        String str1="INDIA";
        String str2="Ajava";
        String str3="INDIA";
        String str4= new String("INDIA");
        if(str1==str4){
            System.out.println("Strings match");
        }
        else
        {
            System.out.println("Not matched");
        }
    }

}