package org.cydeo;

public class Recursion {

    public static void main(String[] args) {

        System.out.println(fact(5));
        for (int i = 0; i < 20; i++) {
            if (i == 0){
                for (int j = 0 ; j < 3*(20-i) ; j++) {
                    System.out.print(" ");
                }
                System.out.print(fibo(i));
            }else {
                for (int j = 0 ; j < 3*(20-i) ; j++) {
                    System.out.print(" ");
                }
                System.out.print(fibo(i));
                for (int j = 0; j < i * 6 ; j++) {
                    System.out.print(" ");
                }
                System.out.print(fibo(i));
                System.out.println();
            }

        }


    }

    public static long fact(long n ){
        if (n <= 1)
            return 1;
        else
            return n * fact(n-1);
    }

    public static long fibo(long n){
        if (n == 0 )
            return 0;
        if (n == 1)
            return 1;

        return fibo(n-1) + fibo(n-2);

    }
}
