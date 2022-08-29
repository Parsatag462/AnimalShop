public class StringVsBuilder {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder("Test Immutability");
        String str = "Test Immutability";

        System.out.println("StringBuilder: "+stb.hashCode());
        System.out.println("String       : "+str.hashCode());

        stb.replace(0, stb.length(), "HelloWorld");
        str = "HelloWorld";

        System.out.println("StringBuilder: "+stb.hashCode());
        System.out.println("String       : "+str.hashCode());
    }
}
