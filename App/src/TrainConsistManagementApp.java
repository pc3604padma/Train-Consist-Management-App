import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
        public static void main(String[] args) {
            // Display welcome banner
            System.out.println("========================================");
            System.out.println("=== Train Consist Management App ===");
            System.out.println("========================================\n");

            // Create a dynamic list to store train bogies using ArrayList
            List<String> trainConsist = new ArrayList<>();

            // Display initial consist information and bogie count
            System.out.println("Train initialized successfully...");
            System.out.println("Initial bogie count: " + trainConsist.size());
        }
    }
