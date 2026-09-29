import java.util.Scanner;
public class WhileLoops {
    public static void main(String [] args) {
        //warm up
        //prompt user for heads or tails
        Scanner s = new Scanner(System.in);
        System.out.println("heads or tails?");
        String ans = s.nextLine();


        //flip coin
        String flip = "heads";
        if (Math.random() < 0.5)
            flip = "tails";

        //output for correct guess, incorrect, or invalid input
        if (ans.equals(flip))
            System.out.println("correct");
        else if (ans.equals("heads") && flip.equals("tails"))
            System.out.println("incorrect");
        else if (ans.equals("tails") && flip.equals("heads"))
            System.out.println("incorrect");
        else
            System.out.println("invalid");

        //same
        if (ans.equals(flip))
            System.out.println("correct");
        else if (ans.equals("heads") || ans.equals("tails"))
            System.out.println("incorrect");
        else
            System.out.println("invalid");

        //same
        if (ans.equals("heads") || ans.equals("tails")) {
            if (flip.equals(ans)) {
                System.out.println("correct");
            }
            else {
                System.out.println("incorrect");
            }
        }
            System.out.println("invalid");



        //loops
        //loops allow code to be repeated

        //while loops are like repeating if statements
        //as long as the condition is true, the code inside the loop
        //continues to run

        int x = 0;
        while (x < 5) {
            System.out.println(x);

            //add 1 to the value of x
            x++;
        }
        //this prints numbers 0-4
        //5 is not printed bc once x becomes 5, the loop condition
        //is no longer true
        System.out.println("x outside and after the loop: " + x);

        x = 0;
        while (x < 5) {
            x++;
            System.out.println(x);
        }
        //by switching the order of lines inside the loop,
        //the change to the value of x happens BEFORE it gets printed
        //so the first value output is 1 and the last is 5

        //while loops are good for when the number of iterations
        //cannot be determined beforehand and there is some other
        //condition that needs to be met

        //count how many coin flips it takes to land on heads 10 times
        int totalFlips = 0;
        int nHeads = 0;

        while( nHeads < 10) {
            if (Math.random() < 0.5)
                nHeads++;
            totalFlips++;
        }

        //for just final count, output AFTER the loop
        System.out.println("it took " + totalFlips + " flips to land on heads 10 times");



    }
}
