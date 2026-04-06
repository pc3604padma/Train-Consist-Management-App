import java.util.ArrayList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create an ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // 2. Add bogies: Sleeper, AC Chair, First Class
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 3. Print the list after insertion
        System.out.println("Train Consist after adding bogies: " + passengerBogies);

        // 4. Remove one bogie (e.g., AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        // 5. Use contains() to check if Sleeper exists [cite: 1]
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Status: Sleeper bogie is present in the train.");
        } else {
            System.out.println("Status: Sleeper bogie is not found.");
        }

        // 6. Print final list state [cite: 1]
        System.out.println("Final Train Consist: " + passengerBogies);
    }
}