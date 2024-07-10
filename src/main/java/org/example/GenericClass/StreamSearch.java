package org.example.GenericClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamSearch {

    public static <T> T findElement(T[] array, T element, T notFoundValue) {
        List<T> list = Arrays.asList(array);
        Optional<T> result = list.stream().filter(e -> e.equals(element)).findFirst();
        return result.orElse(notFoundValue);
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println(findElement(intArray, 3, -1));  // Output: 3
        System.out.println(findElement(intArray, 6, -1));  // Output: -1

        String[] strArray = {"apple", "banana", "cherry"};
        System.out.println(findElement(strArray, "banana", "Not Found"));  // Output: banana
        System.out.println(findElement(strArray, "date", "Not Found"));    // Output: Not Found
    }
}
