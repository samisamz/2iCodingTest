import java.util.*;
public class Main
{
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 3, 2, 1, 4));
        System.out.println("ArrayList with duplicate elements: " + numbers);

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(numbers);
        
        numbers.clear();

        numbers.addAll(set);
        System.out.println("ArrayList without duplicate elements: " + numbers);
        
        numbers.sort(Comparator.reverseOrder());
        System.out.println("ArrayList without duplicate elements sorted: " + numbers);
    }
}
