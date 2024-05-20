package ru.netology.hibernateorm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernateorm.entity.Persons;
import ru.netology.hibernateorm.repository.RepositoryDAO;

import java.util.List;


@RestController

public class ControllerDAO {
    private final RepositoryDAO repositoryDAO;

    public ControllerDAO(RepositoryDAO repositoryDAO) {
        this.repositoryDAO = repositoryDAO;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getPersonsByCity(@RequestParam("city") String city) {
        return repositoryDAO.getPersonsByCity(city);
    }
}
