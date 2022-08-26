public class StringExample {
    public static void main(String[] args) {
        String str = "Sample String";

        displayString(str);
    }

    static void displayString(String str){
        System.out.println(str);

        for (int i=0; i<str.length(); i++)
            System.out.println(str.charAt(i));
    }
}
