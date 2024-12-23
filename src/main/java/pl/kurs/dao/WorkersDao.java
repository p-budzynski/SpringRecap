package pl.kurs.dao;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.stereotype.Repository;
import pl.kurs.entity.Workers;

@Repository
public class WorkersDao extends GenericDao<Workers> {

    public WorkersDao(EntityManagerFactory entityManagerFactory) {
        super(entityManagerFactory, Workers.class);
    }
}
