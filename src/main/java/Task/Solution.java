package Task;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public static void main(String[] args) {


        // map пример с List
        List<String> list = List.of("Tom", "Alex", "Denis", "Pet");
        // преобразовали String в Integer
        List<Integer> list1 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        // System.out.println(list1); //3,4,5,3

        //пример с массивом
        int[] array = {1, 2, 4, 45, 3, 2, 34, 8};
        //если наши элементы делятся на 2 то дели их если нет то не меняй
        array = Arrays.stream(array).map(num -> {
            if (num % 2 == 0) {
                num = num / 2;
            }
            return num;
        }).toArray();
        // System.out.println(Arrays.toString(array)); //1,1,2,45,3,1,17,4

        // пример с Set
        Set<String> set = new TreeSet<>(Set.of("Tom", "Alex", "Denis", "Pet"));
        Set<Integer> set1 = set.stream().map(element -> element.length()).collect(Collectors.toSet());
        // System.out.println(set1); // 3,4,5 элементы отсортированы и уникальные
        // мы можем так же поток который получили преобразовать в List
        List<Integer> list2 = set.stream().map(element -> element.length()).collect(Collectors.toList());
        //  System.out.println(list2); // 4,5,3,3 set по алфавиту был отсортирован так как TreeSet и получили такой порядок

        // filter
        List<String> list3 = List.of("Tom", "Alex", "Denis", "Pet");
        list3 = list3.stream().filter(element -> element.length() > 4).collect(Collectors.toList());
        // System.out.println(list3); // Denis так как длина строки больше 4


        // forEach
        Arrays.stream(array).forEach(num -> {
            num *= 2;
            //     System.out.println(num);
        }); // все элементы в массиве * 2

        //   list.stream().forEach(str -> System.out.println(str)); // развернутый вариант

        //   list.stream().forEach(System.out::println); // сокращенный вариант reference ссылка

        list = list.stream().sorted().collect(Collectors.toList());
        //System.out.println(list);


        // distinct
        Stream<Integer> stream = Stream.of(1,2, 34, 1, 34, 5,6,1, 2,3);
        // stream.distinct().forEach(System.out::println);

        // count
        Stream<Integer> stream1 = Stream.of(1,2, 34, 1, 34, 5,6,1, 2,3);
        // System.out.println(stream1.count()); // 10

        // peek
        Stream<Integer> stream2 = Stream.of(1,2, 34, 1, 34, 2,34,1, 2,3);
        System.out.println(stream2.distinct().peek(System.out::println).count()); //1,2,34,3, 4 (выводим уникальные значения и их 4)

        Stream<String> str = Stream.of("Tom", "Alex", "Denis", "Pet");
        String string = str.filter(element -> element.length()>=5).findFirst().get();
        System.out.println(string); // Denis


    }


}

class StreamPractice {
    public static void main(String[] args) {
//      String string = "madam";
//      List<Character> list = new ArrayList<>();
//      for (char ch : string.toCharArray()){
//          list.add(ch);
//      }
//        //   System.out.println(list);
//
//
//    ListIterator<Character> iterator = list.listIterator();
//    ListIterator<Character> reverseIterator = list.listIterator(list.size());
//    boolean isPalendrom = true;
//    while (iterator.hasNext() && reverseIterator.hasPrevious()){
//        if (iterator.next() != reverseIterator.previous()){
//            isPalendrom = false;
//            break;
//        }
//    }

        List<Integer>integerList = List.of(12,1,2,6,7,1);
        OptionalDouble average = integerList.stream().filter(el -> el % 2 != 0).filter(el -> el % 5 == 0).mapToInt(Integer::intValue).average();
        average.ifPresent(System.out::println);

        List<String> list = List.of("Denis", "programmer", "privet", "Poka", "verylongword","programmer","verylongword");
        long result = list.stream().filter(el -> el.length() > 8).distinct().count();
        // System.out.println(result);

        //Map.of
        Map<String, Integer> map = new HashMap<>();
        map.put("1",1);
        map.put("22",2);
        map.put("344",3);
        map.put("4444",4);
        map.put("55555",5);
        map.put("666666",6);
        map.put("7777777",7);
        map.put("88888888",8);
        map.put("999999999",9);
        map.put("1000000000",10);
        int sum = map.entrySet().stream()
                .filter(val -> val.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue).sum();
        // System.out.println(sum);

        List<Integer> list1 = List.of(12, 23, 4, 5, 6, 56, 23, 4, 5, 56, 245, 456, 76);
        String collect = list1.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
class Person{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ivan", "Ivanov", 23),
                new Person("Alex", "Aktdffff", 45),
                new Person("Kostyan", "Pdfgddfdfdfdfdfdf", 57),
                new Person("Petr", "Ortdfffffff", 36),
                new Person("Robert", "Lockddddddd", 37)
        );
        people.stream()
                .filter(name -> name.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);



    }


}

