# FizzBuzz Implementation in Java

## Description

This project implements the classic **FizzBuzz** problem in Java. The program generates a sequence of numbers from 1 to `n` (inclusive) and substitutes:

- Numbers divisible by 3 with `"Fizz"`
- Numbers divisible by 5 with `"Buzz"`
- Numbers divisible by both 3 and 5 with `"FizzBuzz"`

The results are returned as a comma-separated string. A set of unit tests using JUnit ensures the correctness and robustness of the implementation.

---

## Features

- **Handles Large Inputs:** Processes numbers up to `10,000` efficiently.
- **Validates Input:** Returns an empty string for `n <= 0`.
- **JUnit Test Coverage:** Includes tests for a variety of scenarios to ensure functionality.

---

## How to Run

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Build tool (e.g., Maven or Gradle)

### Steps to Execute

1. **Clone the Repository:**
   ```bash
   git clone <repository-url>
   cd fizzbuzz-java
   ```

2. **Compile and Run the Program:**
   ```bash
   javac -d out src/main/java/org/example/Main.java
   java -cp out org.example.Main
   ```

3. **Run Tests (JUnit):**
   If using Maven, run:
   ```bash
   mvn test
   ```

---

## Usage

Modify the input value of `n` in the `main()` method in `Main.java` to generate the desired FizzBuzz sequence.

Example:
```java
String result = main.FizzBuzz(15);
System.out.println(result);
```

Output:
```
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz
```

---

## Testing

JUnit is used to test the functionality. The test cases include:

- **Valid Inputs:** Small numbers (`n = 3, 5, 15`) and large inputs (`n = 10,000`).
- **Edge Cases:** Zero (`n = 0`), negative numbers, and one (`n = 1`).
- **Performance:** Ensures the function does not crash with large inputs.

To run tests, execute:
```bash
mvn test
```

---

## Author

Developed by [Alexis Binch](https://github.com/your-github-profile).

---

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.