import java.util.Scanner;

public class shaahang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello\n What car are you looking for?");
        String car = scan.nextLine();

        System.out.println("Ok " + car + "\n We will have one ready for you in 5 min");

        System.out.println("What is your budget?");
        int budget = scan.nextInt();
        
        System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
        scan.nextLine();
        String insurance = scan.nextLine();
        System.out.println("\nDo you have a license? Write 'yes' or 'no'");
        String license = scan.nextLine();
        System.out.println("What is your credit score?");
        int creditScore = scan.nextInt();
        if (budget >= 10000 && insurance.equals("yes") && license.equals("yes") && creditScore >= 660) {
            System.out.println("Pleasure doing business with you!");
        } else {
            System.out.println("We're sorry. You are not eligible");
            scan.close();
        }
    }  
}
