import com.bsejawal.algorithms.binary.BinarySearch;
import com.bsejawal.algorithms.sort.QuickSort;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
String s = "He is a very very good boy, isn't he?".trim();
String array[] = s.split("[!,?._'@\\s]+");

//        "[!,?._'@\\s]+"
        System.out.println(Arrays.toString(array));


    }

    public static boolean isPrimeNumber(int n){
        if(n==2)
            return true;
        if(n<2 || n%2==0)
            return false;
        for(int i=3; i<= Math.sqrt(n); i+=2){
            if(n%i == 0)return false;
        }
        return true;
    }
    public static boolean isAnagram(String a, String b){
        int aLength = a.length();
        int bLength = b.length();
        a = a.toLowerCase();
        b=b.toLowerCase();
        if(aLength != bLength)
            return false;
        int char_frequencies[] = new int[26];
        for(int i=0; i<aLength; i++){
            char currentChar = a.charAt(i);
            int index = currentChar-'a';
            char_frequencies[index]++;
        }
        for(int i=0; i<bLength; i++){
            char currentChar = b.charAt(i);
            int index = currentChar-'a';
            char_frequencies[index]--;
        }
        for(int i=0; i<char_frequencies.length; i++){
            if(char_frequencies[i] != 0)
                return false;
        }

        return true;
    }
}