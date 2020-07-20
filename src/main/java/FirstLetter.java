import java.util.Scanner;

public class FirstLetter {
    public static String getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select colour(O-orange,P- purple,R-red):");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "O":
                    return "orange";
                case "P":
                    return "purple";
                case "R":
                    return "red";
                default:
                    System.out.println("Wrong colour");
            }
        }
    }
}