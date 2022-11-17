package Entity;

public class Course {
    private int courseId;
    private String courseName;
    private  double priceCourse;

    private String aboutTheCourse;

    public Course(int courseId, String courseName, double priceCourse, String aboutTheCourse) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.priceCourse = priceCourse;

        this.aboutTheCourse = aboutTheCourse;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPriceCourse() {
        return priceCourse;
    }

    public void setPriceCourse(double priceCourse) {
        this.priceCourse = priceCourse;
    }

    public String getAboutTheCourse() {
        return aboutTheCourse;
    }

    public void setAboutTheCourse(String aboutTheCourse) {
        this.aboutTheCourse = aboutTheCourse;
    }
}
