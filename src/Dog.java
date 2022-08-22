public class Dog extends Animal {
    private String name;
    private String barkNoise = "Woof";
    private double weight;

    public Dog(String name, String breed, double weight, String color){
        super(name, breed, color);
        this.weight = weight;
    }

    public Dog(String name, String breed, String noise, double weight, String color){
        super(name, breed, color);
        barkNoise = noise;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void bark() {
        System.out.println(barkNoise);
    }

    public void bark(String bark) {
        System.out.println(bark);
    }
}

