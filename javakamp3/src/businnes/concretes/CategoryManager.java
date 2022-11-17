package businnes.concretes;

import Entity.Category;
import businnes.abstracts.CategoryService;
import core.logger.abstracts.Logger;
import dataAccess.abstracts.CategoryDao;

import java.util.ArrayList;

public class CategoryManager implements CategoryService {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

    public void setCategoryDao(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public Logger[] getLoggers() {
        return loggers;
    }

    public void setLoggers(Logger[] loggers) {
        this.loggers = loggers;
    }

    @Override
    public void add(Category category) {
        categoryDao.add(category);

    }

    @Override
    public void delete(Category category) {
        categoryDao.delete(category);

    }

    @Override
    public void update(Category category) {
        categoryDao.update(category);

    }

    @Override
    public ArrayList<Category> getCategories() {
        return categoryDao.getCategories();
    }
}
