import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxMinSumStream {
    public static void main(String[] args) {
        List<Employee> emplist=new ArrayList<>();
        emplist.add(new Employee(1,"Urvashi"));
        emplist.add(new Employee(2,"Urvashi1"));
        emplist.add(new Employee(3,"Urvashi2"));
        emplist.add(new Employee(4,"Urvashi3"));
        emplist.add(new Employee(5,"Urvashi4"));
        emplist.add(new Employee(6,"Urvashi5"));
        emplist.add(new Employee(7,"Urvashi6"));
    List<Employee> sortedDesc=emplist.stream().toList().stream().sorted((o1,o2)->o2.getId()-o1.getId()).collect(Collectors.toList());
        System.out.println(sortedDesc);

    }
}
