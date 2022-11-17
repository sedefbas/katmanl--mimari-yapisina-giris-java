import Entity.Category;
import Entity.Course;
import businnes.concretes.CategoryManager;
import businnes.concretes.CourseManager;
import core.logger.abstracts.Logger;
import core.logger.concretes.DataLog;
import core.logger.concretes.MailLog;
import dataAccess.concretes.hibernate.HibernateCategoryDao;
import dataAccess.concretes.hibernate.HibernateCourseDao;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] logger1 = { new DataLog(), new MailLog()};
        Logger[] logger2 = {new DataLog()};

        Category c1 = new Category(1,"java");
        Category c2 = new Category(2,"C#");
        Category c3 = new Category(3,"pyhton");
        Category c4 = new Category(4,"Angular");

        Course cs1 = new Course(1,"A",350,"jdahsjh");
        Course cs2 = new Course(2,"B",370,"dsnkjk");
        Course cs3 = new Course(3,"C",390,"kjawklje");


        CategoryManager CM =new CategoryManager(new HibernateCategoryDao(),logger1);
        CM.add(c1);
        CM.add(c2);
        CM.add(c3);
        CM.update(c4);

        CourseManager CoM = new CourseManager(new HibernateCourseDao(),logger2);
        CoM.add(cs1);
        CoM.add(cs2);
        CoM.delete(cs2);


    }
}
