import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Retrive {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(45);
        list.add(65);
        list.add(70);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(450);
        list.add(60);

        List<Integer> list2=list.stream().filter(x->(x>15)).collect(Collectors.toList());

        List<Integer> sorted=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sorted.stream().forEach(x->System.out.println(x));




    }
}
