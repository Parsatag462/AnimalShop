public class StringSplit {
    public StringSplit(){
        String sent = "This is my sentence";
        String[] words = sent.split(" ");
        String[] tokens = sent.split("i");
        for (String token : tokens)
            System.out.println(token+", ");
        String[] split = sent.split("[ie]");
    }
}
