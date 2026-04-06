import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie{type='" + type + "', capacity=" + capacity + "}";
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        // 1. Create a list of bogies (Reusing logic from previous use cases)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 80));

        System.out.println("Original Bogie List:");
        bogies.forEach(System.out::println);

        // 2. Convert list into a stream
        // 3. Apply filter() with a condition (capacity > 60)
        // 4. Collect matching bogies into a new list
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 5. Display the filtered bogies [cite: 1]
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        if (filteredBogies.isEmpty()) {
            System.out.println("No matching bogies found.");
        } else {
            filteredBogies.forEach(System.out::println);
        }
    }
}