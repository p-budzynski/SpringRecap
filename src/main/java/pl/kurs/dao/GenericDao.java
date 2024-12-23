package pl.kurs.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class GenericDao <T> {
    private final EntityManagerFactory entityManagerFactory;
    private final Class<T> typeParameterClass;

    public T findById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        T t = entityManager.find(typeParameterClass, id);
        entityManager.close();
        return t;
    }

    public void save(T t) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(t);
        transaction.commit();
        entityManager.close();
    }
}
