public class IfElseIfElse {
    public static void main(String[] args) {

        String weather = "rainy";

        if (weather == ("sunny")) {
            System.out.println("It's a nice day for a walk.");
        } else if (weather == ("rainy")) {
            System.out.println("Bring an umbrella!");
        } else {
            System.out.println("Not sure what to do in this weather.");
        }


        int score = 85;

        if (score >= (80)) {
            System.out.println("You got an A!");
        } else if (score >= (70)) {
            System.out.println("You got a B!");
        } else if (score >= (60)) {
            System.out.println("You got a C.");
        } else if ( score >= (50)) {
            System.out.println("You got a D.");
        } else {
            System.out.println("You failed :(");
        }


        String jobTitle = "manager";

        if (jobTitle == ("CEO")) {
            System.out.println("You're the boss!");
        } else if (jobTitle == ("manager")) {
            System.out.println("You're in charge of a team.");
        } else {
            System.out.println("You're an employee");
        }


        char grade = 'B';

        if (grade == ('A')) {
            System.out.println("Excellent work!");
        } else if (grade == ('B')) {
           System.out.println("Good job!"); 
        } else if (grade == ('C')) {
            System.out.println("You did okay.");
        } else if (grade == ('D')) {
            System.out.println("Hey, you still passed!");
        } else {
            System.out.println("You failed :(");
        }
    }
}
