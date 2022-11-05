package AnimalRescuer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog falco = new Dog();

        System.out.println(falco.name + " is a dog from the " + falco.breed + " breed, is "
                + falco.gender + " and his color is " + falco.color + ", is "
                + falco.age + " years old and weighs " + falco.weight + "kg.");
        falco.talk();
        falco.eat();

        Veterinarian popescu = new Veterinarian();
        System.out.println(popescu.nume + " is a " + popescu.specialitate + ".");

        Adoption florescu = new Adoption();
        System.out.println(florescu.nume + " has " + florescu.amountofmoneyavailable + " euro at her disposal.");

        Recreation.recreere();
    }
}
