import java.util.*;

class Tests {  // Kattis - Easy : "FYI"
    public static void main(String args[]) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int number = rand.nextInt(101); // random number
        System.out.println("Your random number is between 0 and 100");

        while (true) {
            System.out.print("input a number: ");
            int input = sc.nextInt(); // user input
            if (input == number) {
                System.out.println(input + " is CORRECT!");
                break;
            } else {
                if (input == Math.max(input,number)) {
                    System.out.println("Lower");
                } else {
                    System.out.println("Higher");
                }
            }
        }
    }
}
