import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions (link in resources folder of
        // Udemy video).

        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String morgage = scan.nextLine();
        if (morgage.equals("yes")) {
            System.out.println("\nGreat! In one line" +
                    "\nHow much money do you have in your savings?" +
                    "\nAnd, how much do you owe in credit card debt?");
            int credit = scan.nextInt();
                    System.out.println("\nHow many years have you worked for?");
                    int worked = scan.nextInt();
                            System.out.println("What is your name?");
                            scan.nextLine();
                            String name = scan.nextLine();
                                    System.out.println("Congratulations " + name + " You have been approved!");
        if (!(credit >= 500 && worked >= 1)) {
                    System.out.println("Sorry, you are not eligible for a mortgage.");
        }
        } else {
                    System.out.println("\nOK. Have a nice day!");
        }
        scan.close();
    }
}
