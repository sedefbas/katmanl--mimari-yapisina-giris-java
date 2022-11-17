package dataAccess.abstracts;

import Entity.Course;

import java.util.ArrayList;

public interface CourseDao {
    public void add(Course course);
    public void update(Course course);
    public void delete(Course course);
    public ArrayList<Course> getCourses();
    public boolean isExist(String courseName);

    public static ArrayList<Course> getcoursesDB= new ArrayList<>();
}
