public class RecursionExample {
    public static void main(String[] args) {
        recursiveMethod(4);
        factorial(5);
    }

    public static double factorial(double num){
        if (d<=1)
            return 1;
        else
            return d * factorial(d-1);
    }

    static void recursiveMethod(int num){
        if (num==0)
            return;
        else{
            System.out.println("Hello "+num);
            recursiveMethod(--num);
            System.out.println(" "+num);
            return;
        }
    }
}
