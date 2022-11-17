package businnes.abstracts;

import Entity.Category;

import java.util.ArrayList;

public interface CategoryService {
    public void add(Category category);
    public void delete(Category category);
    public void update(Category category);
    public ArrayList<Category> getCategories();
}
