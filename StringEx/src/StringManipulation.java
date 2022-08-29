import java.util.ArrayList;

public class StringManipulation {
    public StringManipulation(){
        String s = "Parse this String";
        ArrayList<String> w = new ArrayList<String>();

        while (s.length()>0){
            for (int i=0; i<s.length(); i++){
                if (i==s.length()-1){
                    w.add(s.substring(0));
                    s="";
                    break;
                } else if (s.charAt(i)==' '){
                    w.add(s.substring(0,i));
                    s=s.substring(i+1);
                    break;
                }
            }
        }

        for (String l : w)
            System.out.println(l+' ');
    }
}
