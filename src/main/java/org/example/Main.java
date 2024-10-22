package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        // Call the FizzBuzz function for n = 15, for example
        String result = main.FizzBuzz(15);
        System.out.println(result);
    }

    public String FizzBuzz(int n) {
        List<String> fizzBuzzList = new ArrayList<>();
        double max = Math.pow(10, 4);

        // FizzBuzz logic inside the loop
        for (int i = 1; i <= n && i <= max; i++) {
            boolean isFizz = i % 3 == 0;
            boolean isBuzz = i % 5 == 0;

            if (isFizz && isBuzz) {
                fizzBuzzList.add("FizzBuzz");
            } else if (isFizz) {
                fizzBuzzList.add("Fizz");
            } else if (isBuzz) {
                fizzBuzzList.add("Buzz");
            } else {
                fizzBuzzList.add(String.valueOf(i));
            }
        }

        // Return the result as a single string (you can return a list if needed)
        return String.join(", ", fizzBuzzList);
    }
}
