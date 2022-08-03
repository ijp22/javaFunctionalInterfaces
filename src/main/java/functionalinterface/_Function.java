package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        // Declarative
        int increment = incrementByOne(1);
        System.out.println(increment);


        // Functional
        int increment2 = incrementByOneFunction.apply(2);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);

        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        // Bi Function (take 2 arguments)
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));

    }

    // Declarative
    static int incrementByOne(int number){
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numberToMultiplyBy){
        return (number + 1) * numberToMultiplyBy;
    }

    // Functional
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;


    // Bi Function
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;


    // Consumer

}
