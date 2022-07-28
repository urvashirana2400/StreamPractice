import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SumStream {

    public static void main(String[] args) {

        List<Integer> ls= new ArrayList<>();
        ls.add(3);
        ls.add(6);
        ls.add(13);
        ls.add(13);

       int a= ls.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Max:"+ls.stream().mapToInt(Integer::intValue).max().getAsInt());
        System.out.println("Count:"+ls.stream().mapToInt(Integer::intValue).count());
       System.out.println("sum:"+a);
       Set<Integer> unique=new HashSet<>();
        Set<Integer> duplicate=ls.stream().filter(n->!unique.add(n)).collect(Collectors.toSet());
        System.out.println(duplicate);
    }
}
