import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        System.out.println("--- Adding Bogies to the System ---");

        // 2. Add bogie IDs, including intentional duplicates
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Attempting to add a duplicate ID
        System.out.println("Attempting to add duplicate: BG101");
        boolean isAdded = bogieIds.add("BG101");

        if (!isAdded) {
            System.out.println("Duplicate detected! BG101 was not added.");
        }

        // 3. Print the final set of unique IDs
        System.out.println("\nFinal List of Unique Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println("Bogie ID: " + id);
        }

        // 4. Observe that duplicates are removed automatically
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
    }
}