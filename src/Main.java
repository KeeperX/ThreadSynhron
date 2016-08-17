/**
 * Created by Admin on 17.08.2016.
 */
public class Main {
    private static int number;
    public static void main (String[] arg){
        Thread t1= new Thread(new Worker());
        Thread t2= new Thread(new Worker());
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(number);
    }
    public static synchronized void increaseNumber(){
        number++;
    }
}
