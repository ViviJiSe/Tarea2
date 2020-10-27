import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;

public class PrimeNumbers {

    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int numProvidedByUser = 0;
        int counter = 2;
        int var = 0;

        do {

            out.print("Please enter a number between 5 and 300: ");
            numProvidedByUser = in.nextInt();

        } while (!(numProvidedByUser >= 5 && numProvidedByUser <= 300));

        double squareRootFromUsersNum =  Math.sqrt(numProvidedByUser);
//        while (counter <= squareRootFromUsersNum) {
//
//            if ( numProvidedByUser % counter ==0){
//                out.println(numProvidedByUser + " is a Prime Number");
//            }
//            counter++;
//            if (counter > squareRootFromUsersNum){
//                out.println(numProvidedByUser + " is not a Prime Number");
//            }
//        }

        while(counter <= squareRootFromUsersNum) {
            if (numProvidedByUser % counter == 0) {
                var = 1;
            }
            counter++;
        }
//
            if (var != 0){
                out.println(numProvidedByUser + " is not a prime number");

            }else {
                out.println(numProvidedByUser + " is a prime number");
            }


        }
    }



