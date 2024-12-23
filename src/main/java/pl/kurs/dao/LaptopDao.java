package pl.kurs.dao;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.stereotype.Repository;
import pl.kurs.entity.Laptop;

@Repository
public class LaptopDao extends GenericDao<Laptop> {
    public LaptopDao(EntityManagerFactory entityManagerFactory) {
        super(entityManagerFactory, Laptop.class);
    }
}
