public class AnimalTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Ace", "Beagle", 45.6, "brown");
        Dog dog2 = new Dog("Bailey", "Boerboel", "arf-arf", 80.2, "Tan");

        Fish fish1 = new Fish("Bubbles", "goldfish", "cold", "orange");

        System.out.println("Dog Name:        " + dog1.getName());
        System.out.println("Dog Breed:       " + dog1.getBreed());
        System.out.println("Bark Noise:      ");
        dog1.bark();
        System.out.println("Dog Weight:      " + dog1.getWeight());
        System.out.println("Dog Color:       " + dog1.getColor());
        System.out.println();

        System.out.println("Dog Name:        " + dog2.getName());
        System.out.println("Dog Breed:       " + dog2.getBreed());
        System.out.println("Bark Noise:      ");
        dog2.bark();
        System.out.println("Dog Weight:      " + dog2.getWeight());
        System.out.println("Dog Color:       " + dog2.getColor());
        System.out.println();

        System.out.println("Fish Name:       " + fish1.getName());
        System.out.println("Fish Breed:      " + fish1.getBreed());
        System.out.println("Fish Water Type: " + fish1.getWaterType());
        System.out.println("Fish Color:      " + fish1.getColor());
    }
}
