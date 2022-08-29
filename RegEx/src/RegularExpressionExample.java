public class RegularExpressionExample {
    public static void main(String[] args) {
        if (getAnimal("bat"))
            System.out.println("This is a valid animal");
        else
            System.out.println("This is not a valid animal");
    }

    public static boolean getAnimal(String ani){
        return ani.matches("[Cc]at|[Dd]og");
    }
}
