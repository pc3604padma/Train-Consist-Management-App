import java.util.LinkedHashSet;
import java.util.Set;
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Create a LinkedHashSet to represent the train formation
        // LinkedHashSet maintains insertion order and enforces uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // 1. Attach bogies in order
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 2. Attempt to attach a duplicate bogie intentionally
        // LinkedHashSet will automatically ignore this duplicate [cite: 1]
        trainFormation.add("Sleeper");

        // 3. Display the final train formation [cite: 1]
        System.out.println("Final Train Formation (Order Preserved, No Duplicates):");
        System.out.println(trainFormation);

        // Detailed Iteration to show ordered sequence [cite: 1]
        System.out.println("\nBogie Attachment Sequence:");
        for (String bogie : trainFormation) {
            System.out.println("- " + bogie);
        }
    }
}