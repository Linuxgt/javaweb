/*
 * author:linuxc
 * date:2018.7.14
 * application:斐波那契数列
 * */
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        while (sum < 80) {
            sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }

}