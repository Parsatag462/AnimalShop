import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String,String> fruitBowl = new HashMap<String,String>();

        addElements(fruitBowl);
        System.out.println();
        System.out.println(fruitBowl);
        System.out.println();
        displayElements(fruitBowl);

        System.out.println();
        findElement(fruitBowl, "Banana");
        findElement(fruitBowl, "Pear");
    }

    static void findElement(HashMap<String,String> bowl, String fruit){
        if (bowl.containsKey(fruit)){
            System.out.println("The " +fruit+ " is "+bowl.get(fruit));
        } else {
            System.out.println("There is no "+fruit+" in the bowl");
        }
    }

    static void addElements(HashMap<String,String> bowl){
        bowl.put("Apple ", "Green");
        bowl.put("Cherry", "Red");
        bowl.put("Orange", "Orange");
        bowl.put("Banana", "Yellow");
        bowl.put("Apple ", "Red");
    }

    static void displayElements(HashMap<String,String> bowl){
        for (Map.Entry<String,String> fruit: bowl.entrySet())
            System.out.println("Fruit: "+fruit.getKey()+" - Color: "+fruit.getValue());
    }
}
