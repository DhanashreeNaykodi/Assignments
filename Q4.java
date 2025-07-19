//Compress a string in the below format
//Input: -> "aaabbcccdd"	Output: -> "a3b2c3d2"

import java.util.*;
public class Q4 {

//    ONLY WORKS FOR CONSECUTIVE ELEMENTS
//    static String compress(String s){
//        StringBuilder sb = new StringBuilder();
//        int count=1;
//        for(int i=1; i<s.length(); i++) {
//            char c = s.charAt(i-1);
//            if(c == s.charAt(i)) {
//                count++;
//            }
//            else {
//                sb.append(c);
//                sb.append(count);
//                count=1;
//            }
//            if(i == s.length()-1) {
//                sb.append(s.charAt(i));
//                sb.append(count);
//            }
//        }
//        return sb.toString();
//    }

    //USING CHAR ARRAY - WORKS BOTH FOR CONSECUTIVE AND NON-CONSECUTIVE ELEMENTS
    static String func(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i=1; i<arr.length; i++) {
            char c = arr[i-1];

            if(c == arr[i]) {
                count++;
            }
            else{
                sb.append(c);
                sb.append(count);
                count=1;
            }
            if(i == s.length()-1) {
                sb.append(arr[i]);
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aabbcccddcc";
        System.out.println(func(s));
        //System.out.println(compress(s));
    }
}
