package dataAccess.concretes.hibernate;

import Entity.Category;
import dataAccess.abstracts.CategoryDao;

import java.util.ArrayList;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
      getCategoryDB.add(category);
      System.out.println(category.getCategoryName()+"hibernate ile veritabanına eklendi..");
    }

    @Override
    public void update(Category category) {
        System.out.println("hibernate ile " + category + " güncellendi");
    }

    @Override
    public void delete(Category category) {
        System.out.println(" Hibernate ile veritabanindan silindi: "+ category);
    }

    @Override
    public ArrayList<Category> getCategories() {
        //veritabanındaki kategorileri döner. onuda şimdilik getcategoryDB yaptık.
        return getCategoryDB;
    }

    @Override
    public boolean isExist(String categoryName) {
        ArrayList<Category> categories = getCategories();
        for (Category c : categories)
        {   if(c.getCategoryName().equals(categoryName))
                  {  return true; }

        }
        return false;
    }
}
