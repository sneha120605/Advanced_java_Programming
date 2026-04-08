package ReduceExamples;

import java.util.*;

public class CombineMaps {
    public static void main(String[] args) {
        List<Map<String, Integer>> maps = Arrays.asList(
                Map.of("a", 1, "b", 2),
                Map.of("a", 3, "c", 4)
        );

        Map<String, Integer> result = maps.stream()
                .reduce(new HashMap<>(), (map1, map2) -> {
                    map2.forEach((k, v) ->
                            map1.merge(k, v, Integer::sum));
                    return map1;
                });

        System.out.println(result);
    }
}