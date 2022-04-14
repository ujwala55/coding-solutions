import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void getPhoneNumber(String s) {
        // Write your code here
        String[] str_arr = s.split(" ");
        Vector<String> v = new Vector<String>();
        for (int i = 0; i < str_arr.length; i++) {
            if (str_arr[i].equals("double")) {
                if (str_arr[i + 1].equals("one"))
                    v.add("11");
                if (str_arr[i + 1].equals("two"))
                    v.add("22");
                if (str_arr[i + 1].equals("three"))
                    v.add("33");
                if (str_arr[i + 1].equals("four"))
                    v.add("44");
                if (str_arr[i + 1].equals("five"))
                    v.add("55");
                if (str_arr[i + 1].equals("six"))
                    v.add("66");
                if (str_arr[i + 1].equals("seven"))
                    v.add("77");
                if (str_arr[i + 1].equals("eight"))
                    v.add("88");
                if (str_arr[i + 1].equals("nine"))
                    v.add("99");
                i++;
            }else if (str_arr[i].equals("triple")) {
                if (str_arr[i + 1].equals("one"))
                    v.add("111");
                if (str_arr[i + 1].equals("two"))
                    v.add("222");
                if (str_arr[i + 1].equals("three"))
                    v.add("333");
                if (str_arr[i + 1].equals("four"))
                    v.add("444");
                if (str_arr[i + 1].equals("five"))
                    v.add("555");
                if (str_arr[i + 1].equals("six"))
                    v.add("666");
                if (str_arr[i + 1].equals("seven"))
                    v.add("777");
                if (str_arr[i + 1].equals("eight"))
                    v.add("888");
                if (str_arr[i + 1].equals("nine"))
                    v.add("999");
                i++;
            } 
            else {
                switch (str_arr[i]) {
                    case "one":
                        v.add("1");
                        break;
                    case "two":
                        v.add("2");
                        break;
                    case "three":
                        v.add("3");
                        break;
                    case "four":
                        v.add("4");
                        break;
                    case "five":
                        v.add("5");
                        break;
                    case "six":
                        v.add("6");
                        break;
                    case "seven":
                        v.add("7");
                        break;
                    case "eight":
                        v.add("8");
                        break;
                    case "nine":
                        v.add("9");
                        break;
                    case "zero":
                        v.add("0");
                        break;
                }
            }
        }

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i));
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        getPhoneNumber(str);
    }
}
