import java.util.*;
import java.util.stream.Stream;

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() { return type; }
    public String getCargo() { return cargo; }
}

public class TrainSafetyCheck {
    public static void main(String[] args) {
        // 1. Prepare a list of goods bogies
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Rectangular", "Coal"),
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Open", "Grain")
        );

        // 2. Use Streams and allMatch() to check safety compliance
        // Rule: If type is Cylindrical, cargo must be Petroleum.
        boolean isSafe = bogies.stream().allMatch(bogie -> {
            if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                return bogie.getCargo().equalsIgnoreCase("Petroleum");
            }
            return true; // Non-cylindrical bogies pass by default
        });

        // 3. Display the result
        if (isSafe) {
            System.out.println("Result: The train is safety compliant.");
        } else {
            System.out.println("Result: Safety violation detected! Unsafe cargo configuration.");
        }
    }
}