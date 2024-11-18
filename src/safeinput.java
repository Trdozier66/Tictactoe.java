import java.util.Scanner;

public class safeinput {

    public static int getRangedInt(Scanner console, String prompt, int low, int high) {
        int result;
        do {
            System.out.print(prompt);
            while (!console.hasNextInt()) {
                System.out.println("Invalid input. Try again.");
                console.next();
            }
            result = console.nextInt();
        } while (result < low || result > high);
        return result;
    }

    public static boolean getYNConfirm(Scanner console, String prompt) {
        System.out.print(prompt);
        String response = console.next().toLowerCase();
        return response.equals("y");
    }
}

