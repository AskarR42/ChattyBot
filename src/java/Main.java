import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello!  My name is Eliss");
        System.out.println("I was created 2021.04.12");
        System.out.println("Please, remember me your name");

        String name = scanner.next();
        System.out.println("What a great name you have " + name + "!");
    }
}
