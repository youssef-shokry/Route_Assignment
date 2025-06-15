package week_4.objective1;
import java.util.ArrayList;

public class Student extends Person{
    private final ArrayList<Integer> grades = new ArrayList<Integer>();
    private final ArrayList<String> courses = new ArrayList<String>();
    private int numOfCourses = 0;

    public Student(String name, String address){
        super(name, address);
    }

    public void addCourseGrade(String Course, int Grade){
        if (numOfCourses != 10){
            if (!linerSearch(Course, courses)){
                courses.add(Course);
                grades.add(Grade);
            }
            else {
                int index = courses.indexOf(Course);
                grades.set(index, Grade);
            }
            numOfCourses++;
            return;
        }
        System.out.println(getName() + " exceeded the courses limit");
    }

    public void printGrades(){
        for(int i = 0; i < grades.size(); i++){
            System.out.println(courses.get(i) + "->" + grades.get(i));
        }
    }

    public double getAverageGrade(){
        int numberOfGrades = 0;
        double sumOfGrades = 0.0;

        for (int i = 0; i < grades.size(); i++){
            sumOfGrades += grades.get(i);
            numberOfGrades++;
        }

        return sumOfGrades / numberOfGrades;
    }
}
