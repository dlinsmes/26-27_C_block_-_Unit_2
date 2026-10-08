import java.util.Scanner;
public class NestedLoops {

    public static void main(String [] args) {
        //warm up
        //with a loop - prompt user for 5 nums
        //output the smallest and biggest of their nums
        Scanner s = new Scanner(System.in);

        //initialize the big variable to a SMALL number
        //so then any user inputs should be biggger
        int big = Integer.MIN_VALUE;

        //similar - initialize the small var to a big number
        //so then user inputs should all be smaller
        int small = Integer.MAX_VALUE;

        //the range of values an int can hold is limited
        // - to get to those values, they're saved in
        //built-in variables: Integer.MIN_VALE and MAX_Value

        //initial 0 for big and 99999 for small assume that the user's
        //numbers will all be positive but also less than the initial small value

        //one workaround - take the first input and save that
        //value as both the initial big and small variables

//        for (int i = 0; i < 5; i++) {
//            System.out.println("give me a number");
//            int n = s.nextInt();
//            if (n > big) {
//                big = n;
//            }
//            if (n < small) {
//                small = n;
//            }
//        }

        //don't need to memorize the values
        System.out.println("int min: " + Integer.MIN_VALUE);
        System.out.println("int max: " + Integer.MAX_VALUE);

        //if you go beyond the negative limit, the value wraps around to
        //the positive side
        System.out.println("int min - 1: " + (Integer.MIN_VALUE - 1));
        System.out.println("int max + 1: " + (Integer.MAX_VALUE + 1));

        //technically should be an infinite loop
        //but bc of int range limits, the value will become negative
        //so the condition will become false
        int x = 0;
        while (x >= 0) {
            x++;
        }
        System.out.println(x);


        //nested loops
        //-loops can go in other loops

        int count = 0;
        for (int i = 0 ; i < 5; i++) {

            //every iteration that the outer loop runs,
            //the inner loop restarts and runs 10 times
            for (int j = 0; j < 10; j++) {
                count++;

                //50 line outputs bc 5 * 10 = 50
                System.out.println(count + " - potato, i is " + i + ", j is " + j );
            }
        }

        System.out.println();

        //nested loops can be used to print 2d grids and patterns

        //outer loop controls how many horizontal rows
        for (int i = 0; i < 4; i++) {

            //inner loop controls number of values per row
            for (int j = 0; j < 8; j++) {
                //print() not println() to keep each value
                //on the same horizontal line
                System.out.print("x");
            }
            //println() AFTER the inner loop so then the
            //next row will get its own line
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            //the quantity of values printed per row is
            //changing and dependent on the i value (which row it's on)
            for(int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        //use decreasing i values to make a shape that
        //forms in the other direction
        // (bigger rows first that get smaller)
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println();

        //goal: use an incrementing for loop to
        //create the same shape as previous
        //output a large row first, then decrement in
        //size with each subsequent row
        for (int i = 0; i < 10; i++) {
            //also works:
//            for (int j = 10; j > i; j--) {
            for (int j = 0; j < (10-i); j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
