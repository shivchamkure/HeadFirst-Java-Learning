package Core.java.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hey this is our first Hello");
        C1 c1=new C1();
        c1.m1();
    }
}

class C1{
      void m1 (){
        System.out.println( "method");
    }
}

class C2 extends C1 {
    public void m1 (){
        System.out.println("child class");

    }
}
