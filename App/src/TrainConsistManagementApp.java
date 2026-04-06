import java.util.*;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a List to store passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        // 2. Add bogies with capacities
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:");
        bogies.forEach(System.out::println);

        // 3. Apply Comparator to sort by capacity (Ascending)
        // Use .reversed() if you want to identify high-capacity bogies first
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // 4. Display sorted bogies [cite: 1]
        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}