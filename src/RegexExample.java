import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        Pattern P = Pattern.compile("ANOOP");
        Matcher m = P.matcher("abcANOOPxyzagh");
        int ctr = 0;
        while(m.find()){
            ctr++;

        }
        System.out.println(ctr);

    }

}
