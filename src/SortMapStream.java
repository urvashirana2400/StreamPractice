import java.awt.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapStream {
    public static void main(String[] args) {
        Map<Integer, Employee> map=new HashMap<>();
        map.put(56,new Employee(1,"Urvashi"));
        map.put(5,new Employee(2,"Ajinkay"));
        map.put(3,new Employee(3,"Kanhiya"));
        map.put(54,new Employee(6,"Vaishnavi"));

        TreeMap<Integer,Employee> sorted=new TreeMap<>(map);
        System.out.println("Sorted map:"+sorted);
        System.out.println("sorted by value:");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


    }
}
