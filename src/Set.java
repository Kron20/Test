import java.io.Reader;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.*;
import static java.util.Collections.reverse;

public class Set {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> numbers = new ArrayDeque<>();
        int count = 0;
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if(count%2 == 0 || count == 0) {
                count++;
            }
            else {
                numbers.addFirst(number);
                count++;
            }
        }
        for (int s : numbers) {
            System.out.println(numbers.toString());
        }
    }
}
