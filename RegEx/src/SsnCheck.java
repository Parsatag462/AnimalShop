import java.util.Scanner;

public class SsnCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ssn;
        ssn = getSsn(sc);
        if (validSsn(ssn))
            System.out.println(ssn+" is a valid Social Security Number");
        else
            System.out.println("This ssn is not valid. Must be in the format of (999-99-9999)");
        sc.close();
    }

    static boolean validSsn(String ssn){
        return ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");
    }

    private static String getSsn(Scanner sc){
        System.out.println("Please input your social security number: ");
        return sc.next();
    }
}
