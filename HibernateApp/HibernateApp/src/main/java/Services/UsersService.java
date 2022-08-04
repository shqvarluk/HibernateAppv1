package Services;

import DTO.DTOForUser;
import Entity.Users;
import Repos.UsersRepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UsersService implements UsersRepo{

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();

    public Users addUser(DTOForUser dtoForUser){
        transaction.begin();
        Users newUser = new Users();
        newUser.setLogin(dtoForUser.getLogin());
        entityManager.persist(newUser);
        entityManager.getTransaction().commit();
        return newUser;
    }

    public Users updateUser(DTOForUser dtoForUser){
        transaction.begin();
        Users updateUser = new Users();
        updateUser.setId(dtoForUser.getId());
        updateUser.setLogin(dtoForUser.getLogin());
        entityManager.merge(updateUser);
        entityManager.getTransaction().commit();
        return updateUser;
    }

    public void deleteUser(DTOForUser dtoForUser){
        transaction.begin();
        Users users = new Users();
        users.setId(dtoForUser.getId());
        users.setLogin(dtoForUser.getLogin());
        entityManager.remove(entityManager.merge(users));
        entityManager.getTransaction().commit();
    }
}
