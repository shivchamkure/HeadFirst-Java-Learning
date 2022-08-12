package Core.java.multithreading;

class MyCounter<Final> extends Thread {
    private int  threadno;

    public MyCounter(int threadNo) {
        this.threadno = threadNo;
    }

    public void countMe() {
        for (int i=0;i<9;i++){
            try{
                sleep(500);
            } catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("Vaslue of the i is "+i+" and thread number is "+threadno);
        }
    }
}

public class App{
    public static void main(String[] args) throws InterruptedException {
        MyCounter counter1= new MyCounter(1);
        MyCounter counter2= new MyCounter(2);
        counter1.countMe();
        System.out.println("---------------------------------");
        counter2.countMe();

    }
}
