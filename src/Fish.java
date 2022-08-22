public class Fish extends Animal {
    private String waterType;

    public Fish (String name, String breed, String waterType, String color){
        super(name, breed, color);
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }
}