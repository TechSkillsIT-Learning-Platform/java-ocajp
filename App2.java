 
package com.main;
 
public class App2 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        
        arr[0] = 2;
        arr[2] = 3;
        //System.out.println(arr[2]);
        
        
        int[] a1 = arr; //10x
        System.out.println("arr");
        for(int temp : arr){
            System.out.println(temp);
        }
        System.out.println("a1");
        for(int temp : a1){
            System.out.println(temp);
        }
        
        arr[1]= 3;
        
        System.out.println("arr");
        for(int temp : arr){
            System.out.println(temp);
        }
        System.out.println("a1");
        for(int temp : a1){
            System.out.println(temp);
        }
    }
}


/*

Stack   
int[] arr: 10x
int[] a1 : 10X

Heap
10x:IntObj: 20x: 30x: 40x : 50x
20x: 2
30x: 3
40x: 3
50x: 0

*/