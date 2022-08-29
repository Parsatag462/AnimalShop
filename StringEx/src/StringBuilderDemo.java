public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Learning Java with Oracle");

        System.out.println("StringB = "+str+"\n");

        System.out.println("The length of the text is: "+str.length());
        System.out.println("The first character is   : "+str.charAt(0));
        System.out.println("The second character is  : "+str.charAt(1));
        System.out.println("The position of the start of the text \"acl\" is  : "+str.indexOf("acl"));
        System.out.println("The following text is included within the string: "+str.substring(1,4));

        System.out.println("Reverse: "+str.reverse());
        System.out.println("esreveR: "+str.reverse());
        str.append(" is fun");
        System.out.println("Appended String: "+str);

        str.delete(8,13);
        System.out.println("Deleted String: "+str);
        str.insert(8, " Java Programing");
        System.out.println("Inserted String: "+str);
        str.replace(13,25, " String Processing ");
        System.out.println("Replaced String: "+str);

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("q"));
        System.out.println(str.indexOf("a", 7));
    }
}
