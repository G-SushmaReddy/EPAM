/*You are given a list of integers. Use Java 8 Streams to perform the following operations:

        Filter out the even numbers.

        Square each remaining number.

        Collect the result into a list and print it.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day_1 {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> result = al.stream()
                .filter(n->n%2==0)
                .map(n->n*n)
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
