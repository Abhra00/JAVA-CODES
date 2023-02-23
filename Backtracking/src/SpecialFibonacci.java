

import java.util.*;
import java.lang.*;
import java.io.*;

    /* Name of the class has to be "Main" only if the class is public. */
    class SpecialFibonacci
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner in = new Scanner(System.in);
            int T = in.nextInt();

            while(T != 0) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                System.out.println(fib(n, a, b));
                T--;
            }
        }

        static int fib(int n, int a, int b) {
            if(n == 0) {
                return a;
            }

            if(n == 1) {
                return b;
            }


            return fib(n - 1, a, b) ^ fib(n - 2, a, b);
        }
    }
