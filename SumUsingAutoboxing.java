import java.util.ArrayList;
import java.util.Scanner;

public class SumUsingAutoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to finish):");
        while (true) {
            String input = sc.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                // Parsing string to int, autoboxing into Integer
                Integer num = Integer.parseInt(input);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, enter an integer or 'done'.");
            }
        }

        int sum = 0;
        // Enhanced for-loop with unboxing
        for (Integer n : numbers) {
            sum += n; 
        }

        System.out.println("Sum of integers: " + sum);
        sc.close();
    }
}
