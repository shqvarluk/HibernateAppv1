package Services;

import DTO.DTOForPosts;
import Entity.Posts;
import Repos.PostsRepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PostsService implements PostsRepo {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();

    public Posts addPost(DTOForPosts dtoForPosts){
        transaction.begin();
        Posts newPost = new Posts();
        newPost.setPosts(dtoForPosts.getPosts());
        newPost.setIdUser(dtoForPosts.getIdUser());
        newPost.setIdTag(dtoForPosts.getIdTag());
        entityManager.persist(newPost);
        entityManager.getTransaction().commit();
        return newPost;
    }

    public Posts updatePost(DTOForPosts dtoForPosts){
        transaction.begin();
        Posts newPost = new Posts();
        newPost.setId(dtoForPosts.getId());
        newPost.setPosts(dtoForPosts.getPosts());
        newPost.setIdUser(dtoForPosts.getIdUser());
        newPost.setIdTag(dtoForPosts.getIdTag());
        entityManager.merge(newPost);
        entityManager.getTransaction().commit();
        return newPost;
    }

    public void deleteUser(DTOForPosts dtoForPosts){
        transaction.begin();
        Posts newPost = new Posts();
        newPost.setId(dtoForPosts.getId());
        newPost.setPosts(dtoForPosts.getPosts());
        newPost.setIdUser(dtoForPosts.getIdUser());
        newPost.setIdTag(dtoForPosts.getIdTag());
        entityManager.remove(entityManager.merge(newPost));
        entityManager.getTransaction().commit();
    }

}
