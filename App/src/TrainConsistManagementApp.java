import java.util.LinkedList;

public class TrainConsistManager {
    public static void main(String[] args) {
        // 1. Create a LinkedList for the consist
        LinkedList<String> consist = new LinkedList<>();

        // 2. Add initial bogies to maintain physical sequence
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Train Consist: " + consist);

        // 3. Insert a Pantry Car at position 2 (index 2)
        // This demonstrates the efficiency of middle insertion in LinkedList
        consist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car: " + consist);

        // 4. Remove the first and last bogie [cite: 1]
        consist.removeFirst(); // Removes Engine
        consist.removeLast();  // Removes Guard

        // 5. Display the final ordered train consist [cite: 1]
        System.out.println("Final Ordered Train Consist: " + consist);

        // Final Output Check
        System.out.println("\n--- Key Operations Performed ---");
        System.out.println("Order preserved: " + consist);
    }
}