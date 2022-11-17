package businnes.concretes;

import Entity.Course;
import businnes.abstracts.CourseService;
import core.logger.abstracts.Logger;
import dataAccess.abstracts.CourseDao;

import java.util.ArrayList;

public class CourseManager implements CourseService {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public CourseDao getCourseDao() {
        return courseDao;
    }

    public void setCourseDao(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public Logger[] getLoggers() {
        return loggers;
    }

    public void setLoggers(Logger[] loggers) {
        this.loggers = loggers;
    }

    @Override
    public void add(Course course) throws Exception {
      courseDao.add(course);
    }

    @Override
    public void delete(Course course) {
     courseDao.delete(course);
    }

    @Override
    public void update(Course course) throws Exception {
     courseDao.update(course);
    }

    @Override
    public ArrayList<Course> getCourses() {
        return courseDao.getCourses();
    }
}
