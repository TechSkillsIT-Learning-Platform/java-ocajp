 
package com.main;
 
import com.beans.A;
import com.beans.B;


public class App4 {
    public static void main(String[] args) {
        Student s1 = new Student("harry potter", 2, "hogwards 101"); //10X
        Student s2 = new Student("ronald wesley", 1, "hogwards 101"); //20X
        Student s3 = new Student("dumbledor", 3, "hogwards 100"); //30X
        
        A a=new A();
        Student[] sarry = a.convert(s1,s2,s3); //I am giving 3 students to A and A will make an arry add
        //these student and return the arry back to main
        
        B b=new B();
        b.displayStudents(sarry);
        
        
        
    }
}
