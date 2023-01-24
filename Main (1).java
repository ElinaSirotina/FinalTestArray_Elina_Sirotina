import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] array ;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите элементы массива через пробел");
        String str = scaner.nextLine();
        array = str.split(" ");
        String[] res_array = new String[array.length];
        sort(array,res_array);
        res_array = Arrays.stream(res_array)
                .filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);
        print(array);
        print(res_array);
    }
     static void sort(String[] arr, String[] res){
        int index = 0;
        for (String value: arr) {
            if(value.length()<=3){
                res[index] = value;
                index++;
            }
        }
     }
    static void print(String[] arr){
        System.out.println("Массив:");
        for (String value: arr) {
            System.out.print(value+"  \n");
        }
    }
}