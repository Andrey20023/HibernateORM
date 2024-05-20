package ru.netology.hibernateorm.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.hibernateorm.entity.Persons;

import java.util.List;


@Repository
public class RepositoryDAO {

    @PersistenceContext
    private EntityManager entityManager;

    /* public List<Person> getPersonsByCity(String city) {
         return entityManager.createQuery("FROM Person WHERE city_of_living = :city")
                 .setParameter("city", city).getResultList();
     }*/


    public List<Persons> getPersonsByCity(String city) {
        var query = entityManager.createQuery("select p from Persons p where lower(p.city_of_living) = lower(:city)", Persons.class);
        query.setParameter("city", city);
        return  query.getResultList();
    }
}
