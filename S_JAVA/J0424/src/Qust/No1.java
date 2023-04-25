package Qust;

//import java.util.Arrays;

import java.io.*;
import java.util.*;
  
public class No1 {
    public static void main(String[] args) {
    	
    	
    // String[] arr = {"K", "o", "r", "e", "a", "n"};
    // Arrays.sort(arr, Comparator.naturalOrder());
    // System.out.println(Arrays.toString(arr)); 
    	
    	
    	String[] s = {"K", "o", "r", "e", "a", "n"}; // 문자열 리스트 
    	Collections.sort(Arrays.asList(s));
    	System.out.println(Arrays.toString(s));     
    }
    
}