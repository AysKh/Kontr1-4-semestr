package Control;

import java.util.Scanner;

public class Control2 {
    private int[] a;
    private int n;
    private int result;

    public static int sum(int a, int b) {
        if (b == 0)
            return a;
        else
            return sum(a+1, b-1);
    }
    public static void main(String[] args){

        System.out.println(sum(20,5));
    }
}