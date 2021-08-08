import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToList {
    public static void main(String[] args) {

        int [] arr = new int[]{1,2,3,4,5};
//        Converting Array to String
        String str = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(","));
        str = "["+str+"]";
        System.out.println(str);

//        Converting String to List
        List<Integer> list = Arrays.stream(str.substring(1,str.length()-1).split(",")).map(Integer::parseInt).toList();
        list.forEach(System.out::println);
    }
}
