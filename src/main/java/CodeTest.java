import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodeTest {


    public static void main(String[] args) {

        int[]array = {1,2,4,4,5,67,12,12};
        Arrays.sort(array);
        int n  = array.length;

        int[] a = Arrays.copyOfRange(array,0,(n+1) / 2);
        int[] b = Arrays.copyOfRange(array,(n+1) / 2, n);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println();
        System.out.println();
    }

    public static String multiTable(int num) {
        return IntStream.rangeClosed(1,10).mapToObj(i -> i + " * " + num + " = " + i * num).collect(Collectors.joining("\n"));
    }

    public static String reverse(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }
//df
}
