package org.cydeo;

import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"Jack"));
        students.add(new Student(2,"Julia"));
        students.add(new Student(3,"Mike"));
        students.add(new Student(4,"Mary"));

        //1. For Loop with get(index)

        System.out.println("-----------------Printing with legacy For-Loop.----------------");
        for (int i = 0; i < students.size() ; i++) {
            System.out.println(students.get(i));
        }

        //1. Iterator
        //Forward Iteration
        System.out.println("-----------------Printing with Forward Iterator.----------------");
        Iterator<Student> iterator = students.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            
        }

        //Forward Iteration
        System.out.println("-----------------Printing with Backward Iterator.----------------");
        while (((ListIterator<Student>) iterator).hasPrevious()){
            System.out.println(((ListIterator<Student>) iterator).previous());

        }

        //3. For-Each Loop
        System.out.println("-----------------Printing with For-Each.----------------");
        for (Student student : students){
            System.out.println(student);
        }

        //4. Lambda
        System.out.println("-----------------Printing with Lambda.----------------");
        students.forEach(student -> System.out.println(student));


        //Sorting List
        System.out.println("-----------------Sorting List With Id Descending----------------");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.id-o1.id;

            }
        });

        students.forEach(student -> System.out.println(student));

        //Sorting List
        System.out.println("-----------------Sorting List With Name Descending----------------");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.name.compareToIgnoreCase(o1.name);

            }
        });

        students.forEach(student -> System.out.println(student));



    }
}
