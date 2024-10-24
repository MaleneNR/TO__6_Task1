package Task3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Teacher extends Person{
    ArrayList<String> canTeach;
    ArrayList<String> currentCourses = new ArrayList<>();


    Teacher(String name){
        super(name);
        canTeach = new ArrayList<>();
    }


    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)){
            currentCourses.add(course);
            return true;
        }
        //System.out.println(getName() + " kan ikke undervise i dette fag");
        return false;
    }}
