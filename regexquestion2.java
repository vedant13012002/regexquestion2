import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexquestion2 {
    
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[n|N][a-z A-Z]*");
        Matcher m = p.matcher("nikhil");
        int c=0;
        while (m.find()){
            
            System.out.println(m.start()+"---"+m.end()+"---"+m.group());
            
            c++;
        }
    }
}
