package Control;

import java.util.Scanner;

public class Control3 {
    private int[] a;
    private int b;
    private int result;

    public static int sum(int[] a, int n) {
        if (n == 0)
            return a[n];
        else
            return a[n] + sum(a, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        while (true){
            double n = sc.nextDouble();
            if(n==0){
                break;
            }
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
