package dataAccess.abstracts;

import Entity.Category;

import java.util.ArrayList;

public interface CategoryDao {
    public void add(Category category);
    public  void update(Category category);
    public  void delete(Category category);
    public ArrayList<Category> getCategories();
    public boolean isExist(String categoryName);

    //şimdilik veriyi bu listede tutucam.
    public static ArrayList<Category> getCategoryDB = new ArrayList<>();
}
