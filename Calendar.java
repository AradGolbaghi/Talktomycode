public class Calendar {
    public static void main(String[] args) {

        String day = "Friday";
        System.out.println("Hey, are you free on " + day + "? \n");

        System.out.println("Hmm, let me check my calendar.");

        switch (day) {
            case "Monday": System.out.println("Cant't"); break;
            case "Tuesday": System.out.println("Busy"); break;
            case "Wednsday": System.out.println("Let's do it"); break;
            case "Thursday": System.out.println("Yeah"); break;
            case "Friday": System.out.println("Perhaps"); break;
            case "Saturday": System.out.println("Sure"); break;
            case "Sunday": System.out.println("Certainly"); break;
            default: 
        }
    }
}
