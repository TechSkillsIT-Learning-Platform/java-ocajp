package com.main;
/**
 * @author imtiyazhirani : TechSkillsIT.com
 */
public class App1 {
    public static void main(String[] args) {
        //int[] arry = new int[5];
        //int x = arry.length;
        //x++;
        //System.out.println(x); //6
        
        //System.out.println(arry.length); //length is a final property 
        
        int[] arr = new int[]{1,2,3,4,5,6,7};
        
        System.out.println("Traditional for loop ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("Enhanced for loop");
        for(int temp : arr ){
            System.out.println(temp);
        }
    }
}
