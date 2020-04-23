 
package com.main;
 
import java.util.Arrays;

public class App6 {
    public static void main(String[] args) {
        int[] a1 = new int[]{4,2,1,6,9,3};
        
        Arrays.sort(a1); //sorting  {1,2,3,4,5,6,9}
        /*
        for(int temp : a1){
            System.out.println(temp);
        }
        */
        //Searching : Linear, Binary. 
        int element=9;
        
        int location = Arrays.binarySearch(a1, element);
        System.out.println(location);
        
        element=5;
        location = Arrays.binarySearch(a1, element);
        System.out.println(location);// 4+1 = 5 * -1 = -5
    }
}
