package week_4.objective1;
import java.util.ArrayList;

public class Teacher extends Person{
    private int numCourses = 0;
    private final ArrayList<String> courses = new ArrayList<String>();

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course){
        if (!linerSearch(course, courses)){
            if (numCourses > 5){
                System.out.println("Mr/Mrs. " + getName() + " exceeded there courses limit");
                return false;
            }
            courses.add(course);
            numCourses++;
            return true;
        }
        return false;


    }

    public boolean removeCourse(String course){
        if (linerSearch(course, courses)){
            courses.remove(course);
            numCourses--;
            return true;
        }
        return false;
    }
}
