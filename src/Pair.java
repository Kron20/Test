import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pair {
    public static void main(String[] args) {
        HashMap<String, Integer> words = new HashMap<>();
        (new BufferedReader(new InputStreamReader(System.in))).lines()
                .flatMap(x -> Stream.of(x.split("[\\p{Punct}\\s]+")))
                .map(n -> n.toLowerCase())
                .forEach(n -> {
                    if (words.containsKey(n)) {
                        words.put(n, words.get(n) + 1);
                    } else {
                        words.put(n, 1);
                    }
                });
        words.entrySet().stream()
                .sorted((s1, s2) -> s1.getValue() == s2.getValue() ? s1.getKey().compareTo(s2.getKey()) : s2.getValue().compareTo(s1.getValue()))
                .limit(10).forEach(e -> System.out.println(e.getKey()));
    }
}