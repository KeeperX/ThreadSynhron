/**
 * Created by Admin on 17.08.2016.
 */
public class Main {
    private static int number=0;
    public static void main (String[] arg){
     new Thread(new Worker()).start();
    System.out.print(number);
    }
    public static void increaseNumber(){
        number++;
    }
}
