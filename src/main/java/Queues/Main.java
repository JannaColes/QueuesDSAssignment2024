package Queues;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalShelter shelter = new AnimalShelter();
        String command;

        while (true) {
            System.out.println("Enter a command (enqueueDog, enqueueCat, dequeueAny, dequeueDog, dequeueCat, or exit): ");
            command = scanner.nextLine();

            if (command.equals("exit")) {
                break;
            }

            switch (command) {
                case "enqueueDog":
                    System.out.println("Enter the dog's name: ");
                    String dogName = scanner.nextLine();
                    shelter.enqueue(new Dog(dogName));
                    System.out.println("Added Dog: " + dogName);
                    break;

                case "enqueueCat":
                    System.out.println("Enter the cat's name: ");
                    String catName = scanner.nextLine();
                    shelter.enqueue(new Cat(catName));
                    System.out.println("Added Cat: " + catName);
                    break;

                case "dequeueAny":
                    Animal adoptedAny = shelter.dequeueAny();
                    if (adoptedAny != null) {
                        System.out.println("Adopted: " + adoptedAny.getName());
                    }
                    break;

                case "dequeueDog":
                    Dog adoptedDog = shelter.dequeueDog();
                    if (adoptedDog != null) {
                        System.out.println("Adopted Dog: " + adoptedDog.getName());
                    }
                    break;

                case "dequeueCat":
                    Cat adoptedCat = shelter.dequeueCat();
                    if (adoptedCat != null) {
                        System.out.println("Adopted Cat: " + adoptedCat.getName());
                    }
                    break;

                default:
                    System.out.println("Invalid command, please try again.");
                    break;


            }
        }

        scanner.close();
    }
}
