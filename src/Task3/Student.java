package Task3;

import java.util.ArrayList;

public class Student extends Person{
    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    Student(String name){
        super(name);
        passedCourses = new ArrayList<>();
    }



    @Override
    public boolean addCourse(String course) {
        if (!passedCourses.contains(course)){
            currentCourses.add(course);
            return true;
        }
        //System.out.println(getName() + " har allerede bestået dette kursus");
        return false;
    }
}
