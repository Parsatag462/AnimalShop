import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[A-F]{5,}.*");
        String str = "AAAAAhhh";

        System.out.println(isMatch(str, p));
    }

    private static boolean isMatch(String s, Pattern p){
        Matcher match = p.matcher(s);
        return match.matches();
    }
}
