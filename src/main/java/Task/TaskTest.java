package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskTest {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 1, 2, 3, 1, 4, 5, 6, 7, 45, 5, 7, 7);
        List<String> list2 = List.of("Privet", "Как дела?");
        String str = "is true. in either caseu.";
       // System.out.println(findUniqChar(str));
        String strings = new String("User" + "Hello" + "People");
//        System.out.println(findNumber(list));
        //System.out.println(findElenent(list));
    }

    // TODO: 05.10.2022 Найти элемент который повторяется 1 раз
    public static List<Integer> findElenent(List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(t -> t, Collectors.counting()));
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            if (entry.getValue().equals(1L)) {
                list1.add(entry.getKey());
            }
        }
        return list1;
    }


    // TODO: 05.10.2022 Найти первый элемент в строке String
    public static String findUniqChar(String s) {
        for (Character ch : s.toCharArray()) {
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return ch.toString();
            }
        }
        return "not found";
    }

    public static char findUniqCharStream(String s) {
        return (char) s.chars().filter(t -> s.indexOf(t) == s.lastIndexOf(t)).findFirst().orElse(0);
    }




    class PracticeTest {
//        int[] array = {1, 1, 2, 3, 3, 1, 4, 5, 6, 7, 45, 5, 7, 7};
//        Map<Integer, Long> collect = Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        for (Map.Entry<Integer, Long> entry : collect.entrySet()) {
//            if (entry.getValue().equals(1L)) {
//               // System.out.println(entry.getKey());
//            }
//        }
        public static void main(String[] args) {
            System.out.println("rkkl-2");
        }
    }

//    public static List<Integer> findNumber(List<Integer> integerList) {
//        List<Integer> result = new ArrayList<>();
//        Map<Integer, Long> collect = integerList.stream().collect(Collectors.groupingBy(el -> el, Collectors.counting()));
//        Set<Map.Entry<Integer, Long>> collect1 = collect.entrySet().stream().filter(el -> el.getValue().equals(1L)).collect(Collectors.toSet());
//        for (Map.Entry<Integer, Long> entry : collect1) {
//            result.add(entry.getKey());
//        }
//        return result;
//    }



}