import models.Student;
import org.hibernate.jpa.HibernatePersistenceProvider;
import persistence.CustomPersistenceUniInfo;

import java.util.Map;

public class main {
    public static void main(String[] args) {
        try (var entityManagerFactory = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUniInfo(), Map.of())) {
            var enityManager = entityManagerFactory.createEntityManager();

            enityManager.getTransaction().begin();
            Student student = new Student(1, "Ret", "Max");
            enityManager.persist(student);
            enityManager.getTransaction().commit();
        } catch (Exception exception) {
            System.err.println("Erro:: \n");
        }
        new HibernatePersistenceProvider();
    }
}
