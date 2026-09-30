import java.util.Scanner;

public class ValidationLoops {
    public static void main(String [] args) {
        //warm up
        //make a while loop that runs 1000 times
        //-in the loop, generate a random number [1,10]
        //-after the loop, output how many times the
        //random number was 10

        int rep = 0;
        //declare and initialize OUTSIDE the loop so that
        //the value doesn't get reset to 0 every time the
        //loop restarts
        int tenCount = 0;
        int tenCount2 = 0;
        while(rep < 1000) {

            int r = (int)(Math.random() * 10 + 1);
            if (r == 10) {
                tenCount++;
            }

            rep++;
            //System.out.println(rep);


            //nested loops - loops can go inside another loop
            int count = 0;
            //every time the condition needs to be rechecked to decide
            //whether the loop should continue running, a NEW random
            //number gets generated (which won't necessarily be the same
            //one as before). For count to reach 10, then the random numbers
            //need to generate in increasing order 10 times in a row
            //-if you need a loop to run a random number of times and you want
            //equal distributions of chance for the random number, save that
            //number to a variable first and use while (count < random)
            while (count < (int)(Math.random() * 10 + 1)) {
                count++;
            }
            //count after the loop will represent how many times
            //the loop ran
            if (count == 10) {
                tenCount2++;
            }

        }

        //print outside and after the loop for just the final count
        System.out.println(tenCount);
        System.out.println(tenCount2);

        System.out.println();

        int x = 0;

        //infinite loops - when the loop condition is always true
        //and never becomes false, then the looped code will continue to
        //run forever
        //-infinite loops are BAD

//        while (x >= 0) {
//            System.out.println(x);
//            x++;
//        }
//
//        System.out.println("hello");

        //a loop can run 0 times if the condition is false to begin with
        //-the program doesn't crash - it will just continue to the code
        //after the loop
        while (x > 0) {
            System.out.println(x);
            x++;
        }
        System.out.println("after loop");

        //validation loops - ask the user for input and validate that
        //what they entered is one of the desired options
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number 1 or 2 or 3");
        int num = s.nextInt();

        //as long as the user's input is NOT 1 or 2 or 3, keep asking them
        //until they put in a good input
        // -these all work:
        // !(num == 1 || num == 2 || num == 3)
        // num!=1 && num != 2 && num!=3
        // !(num >= 1 && num <= 3 )
        while(num < 1 || num > 3) {
            System.out.println("invalid. try again");
            System.out.println("enter the number 1 or 2 or 3");
            num = s.nextInt();
        }
        //after the loop has finished running, it's guaranteed that
        //the num value is one of the desired inputs
        System.out.println("good job");

        //ask for string apple or banana
        //validate (keep asking until the answer is good)
        //then print good job
        s.nextLine();
        System.out.println("enter apple or banana");
        String word = s.nextLine();
        // !word.equals("apple") && !word.equals("banana")
        while(!(word.equals("apple") || word.equals("banana") )) {
            System.out.println("invalid. try again");
            System.out.println("enter apple or banana");
            word = s.nextLine();
        }
        System.out.println("good job");


    }
}
