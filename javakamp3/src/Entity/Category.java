package Entity;

import java.util.ArrayList;

public class Category {
    private int categoryId;
    private String categoryName;
    private ArrayList<Course> courses;

    public Category(int categoryId, String categoryName, ArrayList<Course> courses) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.courses = courses;
    }
    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
