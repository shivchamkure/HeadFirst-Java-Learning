package Core.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Performance {
    public static void main(String[] args) {
        //Calculating square root of even numbers from 1 to N
        int min = 1;
        int max = 1000000;

        List<Integer> sourceList = new ArrayList<Integer>();
        for (int i = min; i < max; i++) {
            sourceList.add(i);
        }

        List<Double> result = new LinkedList<Double>();
        //Collections approach
        long t0 = System.nanoTime();
        long elapsed = 0;

//        for (Integer i : sourceList) {
//           if(i % 2 == 0){
//                result.add(Math.sqrt(i));
//           }
//        }
        //here is Lambda Expression for above for Loop
        //List<Double> finalResult = result;
        List<Double> finalResult = result;
        sourceList.forEach(i -> {if(i % 2 == 0) finalResult.add(Math.sqrt(i));});
//---------------------------------------
        List<String> names = Arrays.asList("Alex", "Brian", "Charles");
        Consumer<String> makeUpperCase = s -> s.toUpperCase();
        System.out.println(makeUpperCase);
//--------------------------------------------------

        elapsed = System.nanoTime() - t0;
        System.out.printf("Collections: Elapsed time:\t %d ns \t(%f seconds)%n", elapsed, elapsed / Math.pow(10, 9));


        //Stream approach
        Stream<Integer> stream = sourceList.stream();
        t0 = System.nanoTime();
        result = stream.filter(i -> i%2 == 0).map(i -> Math.sqrt(i)).collect(Collectors.toList());
        elapsed = System.nanoTime() - t0;
        System.out.printf("Streams: Elapsed time:\t\t %,3d ns \t(%.4f seconds)%n", elapsed, elapsed / Math.pow(10, 9));


        //Parallel stream approach
        stream = sourceList.stream().parallel();
        t0 = System.nanoTime();
        result = stream.filter(i -> i%2 == 0).map(i -> Math.sqrt(i)).collect(Collectors.toList());
        elapsed = System.nanoTime() - t0;
        System.out.printf("Parallel streams: Elapsed time:\t %d ns \t(%f seconds)%n", elapsed, elapsed / Math.pow(10, 9));
    }
}
