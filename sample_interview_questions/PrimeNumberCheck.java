package sample_interview_questions;

/*
Q5) Prime Number Program.

✅ Logic:
1. A prime number is a number greater than 1 that has no divisors other than 1 and itself.
2. Steps:
   - If number <= 1 → Not prime.
   - Check divisibility from 2 up to sqrt(num).
   - If divisible by any → Not prime.
   - Otherwise → Prime.
*/

import java.util.Scanner;

public class PrimeNumberCheck {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num = sc.nextInt();

       if (num <= 1) {
           System.out.println("It is not a Prime Number");
       } else {
           boolean isPrime = true;
           for (int i = 2; i * i <= num; i++) {
               if (num % i == 0) {
                   isPrime = false;
                   break;
               }
           }

           if (isPrime) {
               System.out.println("It is a Prime Number");
           } else {
               System.out.println("It is not a Prime Number");
           }
       }
       sc.close();
   }
}

