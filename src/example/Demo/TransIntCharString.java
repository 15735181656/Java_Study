package example.Demo;

import java.util.ArrayList;
import java.util.List;

public class TransIntCharString {

    public static void main(String[] args) {
        //Integer <-> String
        int num1 = 5;
        String str1 = String.valueOf(num1);
        System.out.println(str1);
        int num2 = Integer.parseInt(str1);
        System.out.println(num2);

        //Integer <-> Char
        char c1 = (char) (num1 + '0');
        System.out.println(c1);
        num2 = c1 - '0';
        System.out.println(num2);

        //char <-> String
        str1 = String.valueOf(c1);
        System.out.println(str1);
        c1 = str1.charAt(0);
        System.out.println(c1);

        //String -> char[]
        String str2 = "zzh";
        char[] chars = str2.toCharArray();
        for (char c : chars)
            System.out.print(c + " ");
        System.out.println();
        //List -> Array
        List<Integer> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            list1.add(i);
            list2.add((char)(i + 'a'));
            list3.add(String.valueOf(i));

        }
        Integer[] arrayInt = list1.toArray(new Integer[0]);;
        Character[] arrayChar = list2.toArray(new Character[0]);
        String[] arrayString = list3.toArray(new String[0]);
        for (int i = 0; i < 5; i++){
            System.out.println(arrayInt[i] + "  " + arrayChar[i] + "  " + arrayString[i]);
        }

        //String字符串出现需要转义的符号
        String string = "ab,c.d e|f\\z";
        String[] chars1 = string.split("[ |,.\\\\]");
        char[] chars2 = string.toCharArray();
        for (String c : chars1)
            System.out.print(c + "----");
        System.out.println();
        for (char c : chars2)
            System.out.print(c + "----");
    }
}
