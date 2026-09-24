import java.util.Scanner;

public class VariableScope {

    public static void main(String [] args) {
        //warm up
        //prompt for 2 nums and a word
        Scanner s = new Scanner(System.in);
        System.out.println("give me number");
        int num1 = s.nextInt();
        System.out.println("give me more number");
        int num2 = s.nextInt();
        s.nextLine();
        System.out.println("give me a word");
        String word = s.nextLine();

        int small = num1;
        int big = num2;
        if (num2 < num1) {
            small = num2;
            big = num1;
        }

        int output = 0;

        //-if word size smaller than smaller of two nums
        if (word.length() < small) {
            //generate random even number[2,20]
            //start with all random ints [1,10] THEN mult by 2
            int r = (int)(Math.random() * 10 + 1)  * 2;
            System.out.println(r);
            //variable scope -
            //where a variable is declared controls
            //where it can be accessed
            //-the r variable in this if statement
            //only exists within the if statement
            //(NOT outside of it and NOT in any else if or else statements)

            //since output was declared BEFORE and outside of the if,
            //it can be accessed anywhere in main() (including in the if)
            output = r;
        }
        //-if word size bigger than bigger of two nums
        else if (word.length() > big) {
            //generate random odd number[1,9]
            //start with even ints [0,8] then add 1
            //generate all ints [0,4], then mult by 2, then add 1
            int r = (int)(Math.random() * 5 ) * 2 + 1;
            //this is a separate r variable from the one in the if statement

            output = r;
        }
        //-if word size between (inclusive) two nums
        else {
            //generate random negative number
            int r = -(int)(Math.random() * 12344);
            output = r;
        }
        //-output generated number

        //since r's scope is only within each individual conditional branch,
        //it does NOT exist outside each of those branches
        //System.out.println(r);
        System.out.println(output);

    }
}
