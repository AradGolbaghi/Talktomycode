import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String correct = scan.nextLine();
        if (correct.equals("c") || correct.equals("brazil")) {
            System.out.println("Correct");
        }

        System.out.println("Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saaturn\n\tc) Mercury\n\td) Mars\n");
        String cor = scan.nextLine();
        if (cor.equals("venus") || cor.equals("a")) {
            System.out.println("Correct");
        }

        System.out.println("What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String blood = scan.nextLine();
        if (blood.equals("d") || blood.equals("AB-Negative")) {
            System.out.println("Correct");
        }

        System.out.println("\n Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy");
        String harry = scan.nextLine();
        if (harry.equals("Ron Weasley") || harry.equals("a")) {
            System.out.println("Correct");
        }

        if ((correct.equals("Brazil") || correct.equals("b")) &&
            (cor.equals("Venus") || cor.equals("a")) &&
            (blood.equals("d") || blood.equals("AB-Negative")) &&
            (harry.equals("Ron Weasley") || harry.equals("a"))) {
            System.out.println("\n20/20\nNice job :D");
        } else {
            System.out.println("Not good enough");
        }

        scan.close();
    }
}
