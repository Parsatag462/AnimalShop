public class StringExample {
    public static void main(String[] args) {
        String str = "Sample String";

        displayString(str);
        displayStringBackwards(str);
        searchString(str, 'S');

        System.out.println();
        StringManipulation man = new StringManipulation();
        System.out.println();
        StringSplit spt = new StringSplit();
    }

    static void searchString(String str, char c){
        int count=0;
        for (int i=0; i<str.length(); i++)
            if (str.charAt(i)==c)
                count++;
        System.out.println("The character "+c+" appears in the text "+count+" times");
    }

    static void displayString(String str){
        System.out.println(str);

        for (int i=0; i<str.length(); i++)
            System.out.println(str.charAt(i));
    }

    static void displayStringBackwards(String str){
        String strb = " ";
        for (int i=str.length()-1; i>=0; i--)
            strb+=str.substring(i, i+1);
        System.out.println(strb);
    }
}
