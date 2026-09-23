import java.util.Scanner;
public class Conditionals {
    public static void main(String [] args) {

        //simulate flipping a coin
        //and output the heads/tails result

        int randomNum = (int)(Math.random() * 2) + 1;
        System.out.println(randomNum);

        //conditional statements (if-statements)
        //check whether a boolean expression evaluates
        //to true to decide whether to run a set of code
        if (randomNum == 1) {
            //this code will only run when the condition is true
            System.out.println("heads");
        }

//        System.out.println("fadsfas");

        //an optional else statement can be added immediately after
        //the if statement (outside the curly braces)
        //-this will run when the condition for the IF is not true
        else {
            System.out.println("tails");
        }

        //s is just a variable name - call your scanner what you want
        Scanner s = new Scanner(System.in);

        //prompt the user for 3 numbers, then output the largest
        System.out.println("give me 3 numbers");
        System.out.println("enter num 1");
        int a = s.nextInt();
        System.out.println("enter num 2");
        int b = s.nextInt();
        System.out.println("enter num 3");
        int c = s.nextInt();

        int max = 0;

        //check whether a is the largest
        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c > b) {
            max = c;
        }
        System.out.println("biggest is " + max);


        if (a > b && a > c) {
            max = a;
        }

        if (b > a && b > c) {
            max = b;
        }
        //else statements are only attached to the IF that comes immediately
        //before it
        //-that means max will ALWAYS get set to b or c, regardless of whether
        //it previously got set to a
        else {
            max = c;
        }
        System.out.println("max is " + max);


        if (a > b && a > c) {
            max = a;
        }
        //else if allows the program to check multiple conditionals and only the first
        //branch that's true will run (you can have multiple ELSE IFs)
        else if (b > a && b > c) {
            max = b;
        }
        else {
            max = c;
        }
        System.out.println("max is " + max);

        //prompt user for their password and give one
        //output out of multiple options
        s.nextLine();

        String realPW = "hello";
        System.out.println("what is the password?");
        String userPW = s.nextLine();

        //if the code to run inside an if statement
        //is only one line, you don't need curly braces
        if (realPW.equals(userPW))
            System.out.println("wow congrats good job ");
        //a string's length is how many characters it has
        else if (userPW.length() == 0)
            System.out.println("you didn't type anything you dummy");
        else if (userPW.length() == realPW.length()) //check if both strings have the same length
            System.out.println("nice try but still WRONG");
        else //run when the length is different
            System.out.println("NO");

        System.out.println("bye");

        //ask the user for a number between 10 and 20,
        //give feedback for too high, too low, in range
        System.out.println("give me a number between 10 and 20");
        int num = s.nextInt();

        //nested conditionals - if statements can go in other if statements
        //(and in elses and else ifs)
        if (num > 10) {

            //this will only run when the outer if statement
            //checking > 10 is true
            if (num < 20) {
                System.out.println("in range");
            }
            else {
                //IS greater than 10 but NOT less than 20
                System.out.println("too high");
            }
        }
        else {
            System.out.println("too low");
        }

    }
}
