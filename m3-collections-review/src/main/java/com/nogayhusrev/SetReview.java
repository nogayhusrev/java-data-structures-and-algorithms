package org.cydeo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {

        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student(1,"Jack"));
        students.add(new Student(2,"Julia"));
        students.add(new Student(3,"Mike"));
        students.add(new Student(4,"Mary"));


        System.out.println(students);





    }

    public static Character firstRepeatingChar(String str){

        //create a hash set
        Set<Character> chars = new HashSet<>();
        //itera26te over the char array and add chars into hashset
        for (Character ch : str.toCharArray()) {
            if (!chars.add(ch))
                return ch;
        }

        return  null;
    }
}
