package Services;

import DTO.DTOForTags;
import Entity.Tags;
import Repos.TagsRepo;

import javax.persistence.*;

public class TagsService implements TagsRepo {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();

    public Tags addTag(DTOForTags dtoForTags){
        transaction.begin();
        Tags newTag = new Tags();
        newTag.setName(dtoForTags.getName());
        entityManager.persist(newTag);
        entityManager.getTransaction().commit();
        return newTag;
    }

    public Tags updateTag(DTOForTags dtoForTags){
        transaction.begin();
        Tags newTag = new Tags();
        newTag.setId(dtoForTags.getId());
        newTag.setName(dtoForTags.getName());
        entityManager.merge(newTag);
        entityManager.getTransaction().commit();
        return newTag;
    }

    public void deleteTag(DTOForTags dtoForTags){
        transaction.begin();
        Tags tags = new Tags();
        tags.setId(dtoForTags.getId());
        tags.setName(dtoForTags.getName());
        entityManager.remove(entityManager.merge(tags));
        entityManager.getTransaction().commit();
    }
}
