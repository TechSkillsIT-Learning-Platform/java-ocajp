
package com.main;
 
/**
 * @author imtiyazhirani : TechSkillsIT.com
 */

public class App {
    public static void main(String[] args) {
        //Type 1
        int[] x={1,2,3,4};
        
        //Type 2
        int[] x1 = new int[5];
        x1[0] = 1;
        x1[2] = 2;
        System.out.println(x1.length); // 5
        //Type 3: Anonymous Type 
        int[] x2 = new int[]{1,2,3,4} ;
        System.out.println(x2.length);//4
        
         
        
    }
}
