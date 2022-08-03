package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        // Lambda
        Function<String, String> upperCaseName = name -> name.toUpperCase();

        // Method Reference
        Function<String, String> upperCaseName2 = String::toUpperCase;

        // With code block
        Function<String, String> upperCaseName3 = name -> {
            if(name.isBlank()) throw new IllegalArgumentException("Name can't be blank");
            return name.toUpperCase();
        };

        // With Multiply Args
        BiFunction<String, Integer, String> upperCaseName4 = (name, age) -> name.toUpperCase();

    }
}
