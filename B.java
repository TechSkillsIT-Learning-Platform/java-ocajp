
package com.beans;

import com.main.Student;

public class B {
    public void displayStudents(Student[] sarry){
         
        
        for(Student s : sarry){
            System.out.println(s.name + "--" + s.roll + "--" + s.address);
        }
    }
}
