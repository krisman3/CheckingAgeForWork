import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Please enter your age to check if you are eligible to work: ");

            int age = scanner.nextInt();
            scanner.nextLine(); //Consuming the "New line" symbol, which breaks the loop of the program.

            if (age >= 16) {
                System.out.println("You are eligible to work.");
            } else if (age == 0) {
                System.out.println("You are not born yet. You can't work");
            } else {
                System.out.println("You are under 16, hence - not eligible to work.");
            }
            System.out.println("Would you like to check another age?");

            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("yup")) {
                break;
            }
        }
    }
}