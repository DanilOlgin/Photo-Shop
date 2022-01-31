import com.bookstore.entity.Users;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UserDAOTest {

    @Test
    public void testCreateUsers() {
        Users user = new Users();
        user.setEmail("danilolgin1@gmail.com");
        user.setFullName("Daniil Olgin");
        user.setPassword("Hello Password!");


        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("BookStoreWebsite");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


    }
}