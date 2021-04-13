import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello!  My name is Eliss");
        System.out.println("I was created 2021.04.12");
        System.out.println("Please, remember me your name");

        String name = scanner.next();
        System.out.println("What a great name you have " + name + "!");


        System.out.println("Let me guess your age");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7");

        int reminder3 = scanner.nextInt();
        int reminder5 = scanner.nextInt();
        int reminder7 = scanner.nextInt();

        int age = (reminder3 * 70 + reminder5 * 21 + reminder7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++){
            System.out.println(i + "!");
        }
        System.out.println("Completed, have a nice day!");
    }
}
