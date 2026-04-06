import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a HashMap<String, Integer> to store bogie-capacity information
        // String represents the Bogie Name (Key), Integer represents Capacity (Value)
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // 2. Insert capacity values using the put() method
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("General", 90);

        System.out.println("--- Train Bogie Capacity Mapping ---");

        // 3. Iterate over the map using entrySet() to display details
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();
            System.out.println("Bogie: " + bogieName + " | Capacity: " + capacity);
        }

        // 4. Example of Fast Lookup using a Key
        String searchBogie = "Sleeper";
        if (bogieCapacityMap.containsKey(searchBogie)) {
            System.out.println("\nFast Lookup: The capacity of " + searchBogie +
                    " is " + bogieCapacityMap.get(searchBogie));
        }
    }
}