package businnes.abstracts;

import Entity.Course;

import java.util.ArrayList;

public interface CourseService {
    public void add(Course course) throws Exception;
    public void delete(Course course);
    public void update(Course course) throws Exception;
    public ArrayList<Course> getCourses();
}
