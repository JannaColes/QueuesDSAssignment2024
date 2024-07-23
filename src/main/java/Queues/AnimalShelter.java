package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private Queue<Dog> dogs = new LinkedList<>();
    private Queue<Cat> cats = new LinkedList<>();
    private int order = 0;


    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;

        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            System.out.println("There are no animals are available for adoption at this time. Please check back later.");
            return null;
        } else if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.getOrder() < cat.getOrder()) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }


    public Dog dequeueDog() {
        if (dogs.isEmpty()) {
            System.out.println("There are no dogs available for adoption at this time. Please check back later.");
            return null;
        }
        return dogs.poll();
    }


    public Cat dequeueCat() {
        if (cats.isEmpty()) {
            System.out.println("There are no cats available for adoption at this time. Please check back later.");
            return null;
        }
        return cats.poll();
    }
}
