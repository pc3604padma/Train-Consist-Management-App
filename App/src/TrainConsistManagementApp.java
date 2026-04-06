import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Define Regex Patterns
        // Train ID: Starts with 'TRN-' followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // Cargo Code: Starts with 'PET-' followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Compile patterns using the Pattern class
        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        // 3. User Input
        System.out.print("Enter Train ID (e.g., TRN-1234): ");
        String trainIdInput = scanner.nextLine();

        System.out.print("Enter Cargo Code (e.g., PET-AB): ");
        String cargoCodeInput = scanner.nextLine();

        // 4. Create Matcher objects and validate using matches()
        Matcher trainIdMatcher = trainIdPattern.matcher(trainIdInput);
        Matcher cargoCodeMatcher = cargoCodePattern.matcher(cargoCodeInput);

        // 5. Output Validation Results
        System.out.println("\n--- Validation Results ---");

        if (trainIdMatcher.matches()) {
            System.out.println("Train ID [" + trainIdInput + "] is VALID.");
        } else {
            System.out.println("Train ID [" + trainIdInput + "] is INVALID. (Expected format: TRN-XXXX)");
        }

        if (cargoCodeMatcher.matches()) {
            System.out.println("Cargo Code [" + cargoCodeInput + "] is VALID.");
        } else {
            System.out.println("Cargo Code [" + cargoCodeInput + "] is INVALID. (Expected format: PET-XX)");
        }

        scanner.close();
    }
}