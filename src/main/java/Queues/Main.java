package Queues;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("Charlie"));
        shelter.enqueue(new Cat("Tabby"));
        shelter.enqueue(new Dog("Ziggy"));
        shelter.enqueue(new Cat("Simba"));

        System.out.println("Adopted: " + shelter.dequeueAny().getName());
        System.out.println("Adopted: " + shelter.dequeueCat().getName());
        System.out.println("Adopted: " + shelter.dequeueDog().getName());
        System.out.println("Adopted: " + shelter.dequeueAny().getName());
    }
}
