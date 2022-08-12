package Core.java.bitwiseoperator;

public class BitwiseOp{

    // lower case to CAPS
    static String toUpper(char[] a)
    {
        for (int i=0; i<a.length; i++) {

            // Bitwise AND with 32
            a[i]&=(~32);
        }
        return new String(a);
    }
    // CAPS to lower case
    static String toLower(char[] a)
    {
        for (int i=0; i<a.length; i++) {

            // Bitwise OR with 32
            a[i]|=32;
        }
        return new String(a);
    }

    /* Driver program */
    public static void main(String[] args)
    {
        String str = "Love";
        System.out.print("Toggle case: ");
        str = toLower(str.toCharArray());
        System.out.println(str);

        String str1 = "scaler";
        System.out.print("Toggle case: ");
        str = toUpper(str.toCharArray());


    }
}

