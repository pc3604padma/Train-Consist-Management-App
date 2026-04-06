import java.util.List;

public class TrainConsistManagement {
    public static void main(String[] args) {
        // 1. User creates a list of bogies (Reuse existing Bogie objects)
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24)
        );

        // 2. System converts the list into a stream
        // 3. map() extracts capacity values
        // 4. reduce() sums the capacities using Integer::sum
        int totalSeatingCapacity = bogies.stream()
                .map(b -> b.getCapacity()) // Extract capacity
                .reduce(0, Integer::sum);  // Aggregate into total

        // 5. Total seating capacity is displayed
        System.out.println("Total seating capacity of the train: " + totalSeatingCapacity);
    }
}

// Supporting Bogie class structure based on UC10 requirements
class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}