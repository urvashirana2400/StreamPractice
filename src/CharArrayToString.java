import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharArrayToString {
    public static void main(String[] args) {
        char a[]={'a','b','c','d'};
        try {
            String s1=new String(a);
            System.out.println(s1);
           List<Character> list= s1.chars().mapToObj(c->(char) c).collect(Collectors.toList());
           list.stream().forEach(x-> System.out.println(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
