import java.util.*;
import java.util.stream.Collectors;

// Basic Bogie class for the Train Consist Management App
class Bogie {
    private String type;
    private String id;

    public Bogie(String type, String id) {
        this.type = type;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Bogie{id='" + id + "', type='" + type + "'}";
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        // 1. User creates a list of bogies
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", "S1"),
                new Bogie("Sleeper", "S2"),
                new Bogie("AC Chair", "A1"),
                new Bogie("First Class", "F1"),
                new Bogie("AC Chair", "A2")
        );

        // 2. System converts the list into a stream
        // 3. groupingBy() collector is applied
        // 4. Bogies are grouped into a Map
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // 5. Grouped result is displayed
        System.out.println("--- Grouped Bogies by Type ---");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + ": " + list);
        });
    }
}