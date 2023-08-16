public class SwitchStatements {
    public static void main(String[] args) {

        String weather = "sunny";

        switch (weather) {
            case "sunny": System.out.println("It's a sunny day");break;
            case "cloundy": System.out.println("It may rain");break;
            case "rainy": System.out.println("It's a rainy day");break;
            default: System.out.println("It's a nice day");
        }

        int role = 2;

        switch (role) {
            case 1: System.out.println("Admin");break;
            case 2: System.out.println("Editor");break;
            case 3:System.out.println("User");break;
            default:
        }


        int temperature = 75;
        int humidity = 65;

        if (temperature >= 70 && humidity >=60) {
            System.out.println("It's a hot day");
        } else if (temperature <=30 && humidity <= 20) {
            System.out.println("It's a cold day");
        } else {
            System.out.println("It's a comfortable day");
        }

        int age = 25;
        int income = 50000;

        if (age >= 20 && income >= 40000) {
            System.out.println("You are eligibill");
        }else {
            System.out.println("Your not old enough or you don't have a hight income");
        }

        String lightColor = "green";

        switch (lightColor) {
            case "green": System.out.println("Go");break;
            case "orange": System.out.println("Slowly go");break;
            case "red": System.out.println("Stop");break;
            default:
        }

        int grade = 85;

        if (grade >=80) {
            System.out.println("You got an A");
        } else if (grade >= 70) {
            System.out.println("You got a B");
        } else if (grade >= 60) {
            System.out.println("You got a C");
        } else if (grade >= 50) {
            System.out.println("You got a D");
        } else {
            System.out.println("You Failed");
        }

        String browser = "Chrome";

        switch (browser) {
            case "Chrome": System.out.println("You use Chrome");break;
            case "Firefox": System.out.println("You use Firefox");break;
            case "Safari": System.out.println("You use Safari");break;
            default: System.out.println("Regular user");
        }
    }
}
