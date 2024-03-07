
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
//        System.out.println("Commands:\n" +
//                "Add - adds a bird\n" +
//                "Observation - adds an observation\n" +
//                "All - prints all birds\n" +
//                "One - prints one bird\n" +
//                "Quit - ends the program\n");
        BirdList list = new BirdList();

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            switch (command) {
                case "Quit":
                    return; // Exit the method and the loop
                case "Add":
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Name in Latin: ");
                    String nameInLatin = scan.nextLine();
                    Bird bird = new Bird(name, nameInLatin);
                    list.addBird(bird);
                    break;
                case "Observation":
                    System.out.print("Bird? ");
                    String name1 = scan.nextLine();
                    list.addObservation(name1);
                    break;
                case "All":
                    list.printAll();
                    break;
                case "One":
                    System.out.print("Bird? ");
                    String name2 = scan.nextLine();
                    list.printOne(name2);
                    break;
                default:
                    System.out.println("Incorrect input");
                    break;
            }
        }
    }
}
