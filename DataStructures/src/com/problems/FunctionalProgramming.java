package com.problems;

import java.time.LocalDate;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class FunctionalProgramming {

    public static void main(String args[]){
        Supplier<String> s1 = () -> "Ravi";
        System.out.println(s1.get());

        Supplier<LocalDate> s2 = () -> LocalDate.now();
        System.out.println(s2.get());

        Consumer<String> c1 = (a) -> System.out.println(a);
        c1.accept("Rambo");

        Predicate<String> p1 = a -> a.startsWith("a");
        System.out.println(p1.test("bc"));

        Function<String, Boolean> f1 = (a) -> a.startsWith("Hello");
        System.out.println(f1.apply("Hello"));

        Stream<String> empty = Stream.empty();
        Stream<String> singleElement = Stream.of("1");
        Stream<Integer> arrayElement = Stream.of(1,2,3,4,5);

        singleElement.forEach(c1);

        //List to Stream
        var list = List.of(1,2,3);
        Stream<Integer> fromList = list.stream();
        Stream<Integer> parallelStream = list.parallelStream();

        //Infinite Streams
        Stream<Integer> randoms = Stream.generate(() -> (int)(Math.random() * 10));
        randoms.limit(10).forEach(a -> System.out.print(a));

        UnaryOperator<Integer> operator = n -> n+2;

        Stream<Integer> oddNumbers = Stream.iterate(1,operator );
        oddNumbers.limit(10).forEach(System.out::print);

    }


}
