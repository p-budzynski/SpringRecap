package pl.kurs.dao;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.stereotype.Repository;
import pl.kurs.entity.Phone;

@Repository
public class PhoneDao extends GenericDao<Phone> {
    public PhoneDao(EntityManagerFactory entityManagerFactory) {
        super(entityManagerFactory, Phone.class);
    }
}
