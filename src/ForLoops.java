import java.util.Scanner;

public class ForLoops {
    public static void main(String [] args) {
        //warm up
        //ask the user for numbers until they put in 0
        //then output the sum of their numbers
        Scanner s = new Scanner(System.in);
        System.out.println("give me numbers or enter 0 to stop");
        int num = s.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num;
            System.out.println("give me numbers or enter 0 to stop");
            num = s.nextInt();
        }
        System.out.println("sum of numbers is: " + sum);

        //for loops are good for when the number of iterations can be
        //determined beforehand

        //parts of a for loop:
        //initialization: int i = 0 - declare a variable and set its value
        //condition: i < 10 - will get checked before another iteration of the loop runs
        //advancement/increment: i++ - update the value of the declared variable so that eventuall
        //the loop condition will become false
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            //the advancement step (i++) gets applied AFTER each iteration
            //of the loop
            //so the first output number is 0 and the last is 9
        }

        System.out.println();

        //the scope of the declared loop variable (i) is only within that loop
        //System.out.println(i);

        //change the advancement step to add 2
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i +  " ");
        }

        System.out.println();
        //count down from 20 to 15
        for(int i = 20; i >= 15; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        //for loops can always be written as while loops
        int x = 20;
        while (x >= 15 ) {
            System.out.print(x + " ");
            x--;
        }

        //while loops cannot always be written as for loops
        //when the number of times to run cannot be predetermined,
        //you must use a while loop

        System.out.println();

        //ask the user for two numbers (assume the second is bigger
        //than the first)
        //calculate the sum of numbers between their two inputs
        //ex: 10 and 15, output 10+11+12+13+14+15
        System.out.println("give me a number");
        int n1 = s.nextInt();
        System.out.println("give me a bigger number");
        int n2 = s.nextInt();

        sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        System.out.println("sum of nums between " + n1 + " and " + n2
        + " is " + sum);

        //ask the user for a number and output whether it's prime
        //a number is prime when it's divisible only by 1 and itself
        System.out.println("give me a prime number");
        int n = s.nextInt();

        boolean isPrime = true;

        //don't include 1 or n bc every number is divisible by 1 and n so that doesn't
        //help you determine whether n is prime

        for (int i = 2; i < n; i++) {
            //check divisibility of n by i bc if any of the i values
            //goes into n, then n is not prime
            if (n % i == 0) {
                isPrime = false;
            }
            //DON'T want to set isPrime back to true bc
            //once you prove that n is divisible by something, it
            //is NOT prime and cannot be changed back to prime
            //just because it's not divisible by some later number
            //ex: n = 8 and i = 7
//            else {
//                isPrime = true;
//            }
        }


        if (isPrime == true) {
            System.out.println(n + " is prime");
        }
        else {
            System.out.println(n + " is not prime");
        }
    }
}
