package org.example;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greetUser();
        String name = getUserName(scanner);
        int age = guessUserAge(scanner);
        countToNumber(scanner);
        testProgrammingKnowledge(scanner);
        tellStory(name, age);
        dayOfWeek(scanner);

        scanner.close();
    }

    // Greet the user
    public static void greetUser() {
        System.out.println("Hello! I'm your friendly chat bot.");
    }

    // Ask for the user's name
    public static String getUserName(Scanner scanner) {
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        return name;
    }

    // Guess the user's age
    public static int guessUserAge(Scanner scanner) {
        System.out.println("I will try to guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "!");
        return age;
    }

    // Count to a number
    public static void countToNumber(Scanner scanner) {
        System.out.println("Enter a number and I will count to it:");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    // Test programming knowledge
    public static void testProgrammingKnowledge(Scanner scanner) {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is the output of the following code?");
        System.out.println("int x = 5;");
        System.out.println("System.out.println(x++);");
        System.out.println("1. 5");
        System.out.println("2. 6");
        System.out.println("3. Error");
        System.out.println("4. None of the above");
        int answer;
        do {
            answer = scanner.nextInt();
            if (answer != 1) {
                System.out.println("Please, try again.");
            }
        } while (answer != 1);
        System.out.println("Congratulations! You are correct.");
    }

    // Tell a story about the user
    public static void tellStory(String name, int age) {
        System.out.println("Once upon a time, there was a person named " + name + " who was " + age + " years old.");
        System.out.println(name + " loved to explore new things and learn about programming.");
    }

    // Output a phrase about each day of the week
    public static void dayOfWeek(Scanner scanner) {
        System.out.println("Enter a number from 1 to 7 to know what I enjoy about each day of the week:");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("I'm a little buggy on Mondays.");
                break;
            case 2:
                System.out.println("Tuesdays are for troubleshooting!");
                break;
            case 3:
                System.out.println("Wednesdays are wonderful for coding.");
                break;
            case 4:
                System.out.println("I thrive on Thursdays.");
                break;
            case 5:
                System.out.println("Fridays are fantastic for finishing tasks.");
                break;
            case 6:
                System.out.println("I enjoy debugging on Saturdays.");
                break;
            case 7:
                System.out.println("Sundays are for rest and relaxation.");
                break;
            default:
                System.out.println("That's not a valid day of the week!");
        }
    }

}
