package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        Student student1 = new Student("Johanne");
        Student student2 = new Student("Bertram");
        Student student3 = new Student("Trine");

        Teacher teacher1 = new Teacher("Karen");
        Teacher teacher2 = new Teacher("Ebbe");
        Teacher teacher3 = new Teacher("Helle");


        student1.passedCourses.add("Java 1.0");

        student2.passedCourses.add("Dinosaurus-læren");
        student2.passedCourses.add("Det vilde vesten");

        student3.passedCourses.add("Fodbold");
        student3.passedCourses.add("Java 1.0");

        teacher1.canTeach.add("Dinosaurus-læren");
        teacher1.canTeach.add("Trolde");

        teacher2.canTeach.add("Java 1.0");

        teacher3.canTeach.add("Fodbold");
        teacher3.canTeach.add(("BasketBall"));

        ArrayList<Person> studentsAndTeachers = new ArrayList<Person>();
        studentsAndTeachers.add(teacher1);
        studentsAndTeachers.add(teacher2);
        studentsAndTeachers.add(teacher3);
        studentsAndTeachers.add(student1);
        studentsAndTeachers.add(student2);
        studentsAndTeachers.add(student3);

        for (Person p : studentsAndTeachers){
            p.addCourse("Java 1.0");

            if (p.addCourse("Java 1.0") == false && p instanceof Student){
                System.out.println(p.getName() + " har allerede bestået dette kursus");}


            if  (p.addCourse("Java 1.0") == false && p instanceof Teacher) {
                System.out.println(p.getName() + " kan ikke undervise i dette fag");
            }
        }





    }


}
