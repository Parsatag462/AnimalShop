import java.util.Scanner;

public class RhymeGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the name of the animal: ");
        String animal /*= sc.next()*/;
        animal = getAnimal(sc);
        sc.close();
        if (rhymingAnimal(animal))
            System.out.println("This animal rhymes with cat");
        else
            System.out.println("This animal doesn't rhyme");
    }

    private static boolean rhymingAnimal(String ani){
        return ani.matches("[a-zA-Z]{1,2}(at|AT)");
    }

    private static String getAnimal(Scanner in){
        System.out.println("Please enter the name of the animal: ");
        return in.next();
    }
}
