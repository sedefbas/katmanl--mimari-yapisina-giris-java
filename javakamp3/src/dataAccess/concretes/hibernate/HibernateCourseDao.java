package dataAccess.concretes.hibernate;

import Entity.Course;
import dataAccess.abstracts.CourseDao;

import java.util.ArrayList;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("hibernate ile course eklendi");
    }

    @Override
    public void update(Course course) {
        System.out.println("hibernate ile course güncelendi");

    }

    @Override
    public void delete(Course course) {
        System.out.println("hibernate ile course silindi");

    }

    @Override
    public ArrayList<Course> getCourses() {
        return getcoursesDB;
    }

    @Override
    public boolean isExist(String courseName) {
        ArrayList<Course> courses=getCourses();
        for (Course course : courses) {
            if(course.getCourseName().equals(courseName)) {
                return true;
            }
        }
        return false;
    }
}
