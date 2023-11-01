package Control;
import java.util.Scanner;

public class Control1{
    static Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        double x1,x2,y1,y2;
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        System.out.println(Math.sqrt(Math.pow((x1 - x2), 2)  + Math.pow((y1 - y2), 2)));
    }
}
