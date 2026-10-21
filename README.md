# Java Studies

Java exercises form my path to becoming a backend developer: logic and OPP problems plus HackerRank solutions.
Every code is documented with Javadoc and written in English.

---

## Structure

- `logic-exercises/` — logic exercises (loops, conditionals, OOP, enums, etc.)
- `hackerrank/` — HackerRank challenge solutions

## Contents
| Exercise                                          | Concept                                            |
|---------------------------------------------------|----------------------------------------------------|
| `logic-exercises/triangle-classification`         | conditionals, triangle inequality                  |
| `logic-exercises/second-highest-value`            | arrays, tracking tow variables in a single pass    |
| `logic-exercises/shapes-inheritance-polymorphism` | abstract class, inheritance, polymorphism          |
| `hackerrank/if-else`                              | conditionals                                       |
| `hackerrank/fizzbuzz`                             | loop, conditionals                                 |
| `hackerrank/java-loops-I`                         | loop                                               |
| `hackerrank/java-loops-II`                        | nested loops, running accumulation                 |
| `hackerrank/java-output-formatting`               | printf, format specifiers, zero padding            |
| `hackerrank/java-datatypes`                       | primitive types, try-catch, InputMismatchException |
| `hackerrank/end-of-file`                          | reading input until EOF, Scanner.hasNext()         |

---

## Requirements

- JDK 11 or later (developed with JDK 27). Check your version with ´java -version` on terminal.

---

## How to run

Run the commands from the exercise folder.

**Exercises with several files** (compile everything, then run the class that has `main`):

```bash
cd ./logic-exercises/shapes-inheritance-polymorphism/
java Main.java
```

**Single-file solutions** (compile and run in one step):

```bash
cd ./hackerrank/end-of-file/
java ./EndOfFileSolution.java
```

**Solutions that read input** Wait for keyboard input. Each of them includes a sample `input.txt` to feed instead:
```bash
java EndOfFileSolution.java < input.txt
```

On PowerShell: `Get-Content input.txt | Java EndOfFileSolution.java`

---