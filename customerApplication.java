import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class customerApplication {
    public static void main(String[] args) {
        System.out
                .println("Hello and welcome to BCCA concerts! The tickets are over priced and the bands are unknown!");

        Map<String, Integer> Shows = new HashMap<>();
        Shows.put("Discord", 150);
        Shows.put("To New", 200);
        Shows.put("Flags", 80);

        for (String i : Shows.keySet()) {
            System.out.println(i);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("What show would you like to see: ");
        String choice = input.next();

        if (choice.equals("Discord")) {
            Integer x = Shows.get("Discord");
            System.out.println("Your total will be: $" + x);
        } else if (choice.equals("To New")) {
            Integer x = Shows.get("To New");
            System.out.println("Your total will be: $" + x);
        } else if (choice.equals("Flags")) {
            Integer x = Shows.get("Flags");
            System.out.println("Your total will be: $" + x);
        } else {
            System.out.print("That is not a choice!");
        }
        input.close();
    }
}