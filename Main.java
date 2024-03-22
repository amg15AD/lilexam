package firslilexam;

public class Main {
    public static void main(String[] args) {
        printsoddnums(10);
        System.out.println("<=====NEXT_ANSWER=====>");// Answer 1

        int[] firstnumlist = {10, 10, 10, 10, 50};
        System.out.println(sumofallnumbers(firstnumlist));
        System.out.println("<=====NEXT_ANSWER=====>");// Answer 2

        System.out.println(avgfallnumbers(firstnumlist));
        System.out.println("<=====NEXT_ANSWER=====>");// Answer 3
        randomnum(1,6);


    }

    //Create a method that only prints odd numbers from 10 down to 1.
    public static void printsoddnums(int a) {

        for (int i = a; a >= 1; a--)
            if (a % 2 != 0) {
                System.out.println(a);
            }
    }

    //2.Write a method that takes an array of integers and returns the sum of all the numbers
    public static int sumofallnumbers(int[] num) {
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];

        }return sum;
    }//sumofallnumbers

//3.Create a method that calculates the average of the numbers in an array.
public static int avgfallnumbers(int[] num){
        int avg = 0;

    for (int i = 0; i < num.length; i++) {
        avg += num[i];
    } int totalavg = avg / num.length;

        return totalavg;
}


//4.Create a method that generates a random number from 1 to 6
    public static void randomnum(int ){


    }
//5.Write a method that calculates the sum of all even numbers in an array.
    public static int sumOfEvens(int[]numbers){
        int evensum = 0;

//        for (int i = 0; i < numbers.length; i++){
//            if ([i] % 2 == 0)
//
//        }


//        (number % 2 == 0)
    }

//6.Write a method that calculates the volume of a cube.
//7.Write a method to count how many times a particular character appears in a String.
//8.Create a method that determines if a String is a palindrome.
//9.Create a method that checks if a year is a leap year.
// 10. Create a method that first scans for a user's ticket number then scans for a
//user's destination in that order. Use the information to print the following below:
//        "Now serving customer number [replace with ticket number]. Enjoy your trip to
//        [replace with destination].

}// Main class