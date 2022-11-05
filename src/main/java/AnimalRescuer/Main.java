package AnimalRescuer;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Falco");
        dog.setAge(2);
        dog.setWeight(30.5);
        dog.setBreed("samoyed");
        dog.setColor("white");
        dog.setGender("Male");

        System.out.println(dog.getName() + " is a dog from the " + dog.getBreed() + " breed, is "
                + dog.getGender() + " and his color is " + dog.getColor() + ", is "
                + dog.getAge() + " years old and weighs " + dog.getWeight() + " kg.");

        dog.setTalk("ham-ham");
        dog.setEat("oase");
        System.out.println(dog.getName()+" likes to do \""+dog.getTalk()+"\" and gnaw \""+ dog.getEat()+"\".");

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Popescu Ion");
        veterinarian.setSpecialitate("veterinarian");
        System.out.println(veterinarian.getName() + " is a " + veterinarian.getSpecialitate() + ".");

        Adoption adoption = new Adoption();
        adoption.setName("Florescu Maria");
        adoption.setAmountofmoneyavailable(30);
        System.out.println(adoption.getName() + " has " + adoption.getAmountofmoneyavailable() + " euro at her disposal.");

        Recreation recreation=new Recreation();
        recreation.setName("relax");
        recreation.setRecreere("running");
        System.out.println("For "+recreation.getName()+" "+dog.getName()+" likes to "+recreation.getRecreere()+".");

        AnimalFood animalFood=new AnimalFood();
        animalFood.setName("uscata - Alpha");
        animalFood.setPrice(200);
        animalFood.setAmount(55);
        animalFood.setAvailabilityinstock(1);
        System.out.println("Mancarea \""+animalFood.getName() + "\" are pretul \"" +animalFood.getPrice() + " ron\" pentru cantitatea de \"" +animalFood.getAmount() + " kg/sac\" si in stoc este \"" +animalFood.getAvailabilityinstock()+"\" buc.");
    }
}
