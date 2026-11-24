# Java Studies
Java exercises along my path to becoming a backend developer: logic and OOP problems, HackerRank solutions and functional
interfaces. All code is documented with Javadoc and written in English.

---

## Structure

- `logic-exercises/` — logic exercises (loops, conditionals, OOP, enums, etc.). One folder per exercise.
- `hackerrank/` — HackerRank challenge solutions. One folder per solution.
- `functional-interfaces/` — Examples of the main methods of functional interfaces. One folder per interface.

---

## Contents

### Logic exercises
| Exercise                                                                           | Concept                                         |
|------------------------------------------------------------------------------------|-------------------------------------------------|
| [triangle-classification](logic-exercises/triangle-classification)                 | conditionals, triangle inequality               |
| [second-highest-value](logic-exercises/second-highest-value)                       | arrays, tracking two variables in a single pass |
| [shapes-inheritance-polymorphism](logic-exercises/shapes-inheritance-polymorphism) | abstract class, inheritance, polymorphism       |
| [modified-fizzbuzz](logic-exercises/modified-fizzbuzz)                             | loops, conditionals, String accumulator         |
| [order-status-enum](logic-exercises/order-status-enum)                             | enum, constant-specific methods, state machine  |

### HackerRank

| Challenge                                                                  | Concept                                                 |
|----------------------------------------------------------------------------|---------------------------------------------------------|
| [java-if-else](hackerrank/java-if-else)                                    | conditionals                                            |
| [fizzbuzz](hackerrank/fizzbuzz)                                            | loop, conditionals                                      |
| [java-loops-1](hackerrank/java-loops-1)                                    | loop                                                    |
| [java-loops-2](hackerrank/java-loops-2)                                    | nested loops, running accumulationm                     |
| [java-output-formatting](hackerrank/java-output-formatting)                | printf, format specifiers, zero padding                 |
| [java-datatypes](hackerrank/java-datatypes)                                | primitive types, try catch, InputMismatchException      |
| [java-end-of-file](hackerrank/java-end-of-file)                            | reading input until EOF, Scanner.hasNext()              |
| [java-static-initializer-block](hackerrank/java-static-initializer-block)  | static initialization block, static fields              |
| [java-int-to-string](hackerrank/java-int-to-string)                        | type conversion, round-trip check with Integer.parseInt |
| [java-date-and-time](hackerrank/java-date-and-time)                        | Calendar, zero-based months, getDisplayName             |
| [java-currency-formatter](hackerrank/java-currency-formatter)              | NumberFormat, Locale, currency formatting               |
| [java-strings-introduction](hackerrank/java-strings-introduction)          | String length, comparteTo, substring                    |
| [simple-array-sum](hackerrank/simple-array-sum)                            | List, for-each, BufferedReader, input validation        |


### Functional interfaces

| Interface                                                         | Main methods                           |
|-------------------------------------------------------------------|----------------------------------------|
| [Predicate](functional-interfaces/predicate-interface)            | test, and, or, negate, Predicate.not   | 

---

## Requirements

- JDK 17 or later (developed with JDK 27). Check your version with `java -version` on terminal.

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

## Conventions

- Names, comments and documentation in English
- Javadoc on non-trivial methods; HackerRank solutions link to the original challenge (statements are not reproduced)
- Commits follow Conventional Commits
