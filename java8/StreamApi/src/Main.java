import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {





        // different ways to create stream

        List<Integer> temp = new ArrayList<>();
        Stream<Integer> stream = temp.stream();


        int [] arr = new int[]{};
        IntStream stream1 = Arrays.stream(arr);


        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);


        Stream.Builder <String> builder = Stream.builder();
        builder.add("abc").add("cde");
        Stream<String> build = builder.build();


        Stream<Integer> integerStream1 = Stream.<Integer>builder().add(23).build();


        List<String> list8 = new ArrayList<>();
        list8.add("123");
        list8.add("55");

        List<String> list9 = new ArrayList<>();
        list9.add("76");
        list9.add("34");

        List<List<String>> lists = new ArrayList<>();
        lists.add(list8);
        lists.add(list9);


        Stream<String> stringStream1 = lists.stream().flatMap((List<String> sentence) -> sentence.stream());
        List<String> collect2 = stringStream1.collect(Collectors.toList());
        System.out.println("Flat map: " + collect2);
        List<Integer> salaries = new ArrayList<>();
        salaries.add(201);
        salaries.add(311);
        salaries.add(333);
        salaries.add(124);
        salaries.add(992);
        salaries.add(829);

        // filter out salaries > 300

        long count = salaries.stream().filter((Integer val) -> val > 300).count();
        System.out.println("count: " + count);


        // map (function<T, R> mapper

        List<String> names = new ArrayList<>();
        names.add("tryr");
        names.add("jsjs");
        names.add("oqoq");
        names.add("eaea");
        names.add("nana");

        List<String> collect = names.stream().map((String name) -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect.toString());

        // flatMap(function <T, Stream<R>> mapper )

        List<List<String>> listOfLists = new ArrayList<>();

        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        List<String> list2 = new ArrayList<>();
        list2.add("Dog");
        list2.add("Elephant");
        list2.add("Frog");


        listOfLists.add(list1);
        listOfLists.add(list2);

        List<String> stringStream = listOfLists.stream().flatMap((List<String> list) -> list.stream()).collect(Collectors.toList());
        System.out.println(stringStream);


        // distinct()

        List<Integer> duplicateValues = Arrays.asList(1,2,3,4,1,2,3,4);
        Stream<Integer> distinct = duplicateValues.stream().distinct();
        System.out.println(distinct.collect(Collectors.toList()));
        
        
        // sorted()

        List<Integer> collect1 = duplicateValues.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1);
        
        // sort in descending order - method 1

        Stream<Integer> sorted = duplicateValues.stream().sorted(Comparator.reverseOrder());
        
        // sort in descending order - method 2

        Stream<Integer> sorted1 = duplicateValues.stream().sorted((Integer a, Integer b) -> b - a);

        // peek (Consumer<T> action)

        System.out.println("peek stream");
        duplicateValues.stream().filter((Integer val)-> val > 2)
                .peek((Integer val) -> System.out.println("peek value: " + val))
                .count();


        // mapToInt(MapToInt<T> mapper)

        List<String> integerStrings = Arrays.asList("123", "456", "789", "0", "-456", "+123");
        int[] ints = integerStrings.stream().mapToInt((String num) -> Integer.parseInt(num)).toArray();
        Arrays.stream(ints).forEach(a-> System.out.println("map to int :" +a));



        // allMatch(Predicate<T> predicate)

        List<Integer> nums = Arrays.asList(1,2,4,5,6);
        boolean b = nums.stream()
                .allMatch((Integer val) -> val < 7);
        System.out.println(b);



        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 20)
        );

        List<Person> collect3 = people.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
        System.out.println(" sorted by age: ");

        collect3.forEach((p) -> System.out.println(p));

    }
}