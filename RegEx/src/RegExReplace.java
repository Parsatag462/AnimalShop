public class RegExReplace {
    public static void main(String[] args) {
        String s = "Help  me   I have     no idea what's   going   on!  !     !";
        s = s.replaceAll(" {2,}", " ");
        System.out.println(s);
    }
}
