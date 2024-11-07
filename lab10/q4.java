import java.util.List;
import java.util.Arrays;

public class WildcardDemo {
    // Method using wildcard arguments
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("A", "B", "C");

        System.out.print("Integer List: ");
        printList(intList); // Prints Integer list using wildcard

        System.out.print("String List: ");
        printList(strList); // Prints String list using wildcard
    }
}
