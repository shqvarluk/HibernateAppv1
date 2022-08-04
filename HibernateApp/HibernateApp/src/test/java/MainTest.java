import DTO.DTOForUser;
import Repos.PostsRepo;
import Repos.TagsRepo;
import Repos.UsersRepo;
import Services.PostsService;
import Services.TagsService;
import Services.UsersService;
import org.junit.jupiter.api.Test;

class MainTest {
    UsersRepo testUser = new UsersService();
    TagsRepo testTag = new TagsService();
    PostsRepo testPost = new PostsService();

    @Test
        public void testAddUser() throws Exception{
            DTOForUser tUser = new DTOForUser();
            tUser.setLogin("R2");
            new UsersService().addUser(tUser);

        }
    /*@Test
    public void testDeleteUser(){

    }*/

/*
    @Test
    public void testUpdateUser() throws Exception{
        String newUserLogin = "Bob";
        int id = 14;

        testUser.updateUser(id, newUserLogin);
    }

    @Test
    public void testDeleteUser() throws Exception{
        int id = 14;

        testUser.deleteUser(id);
    }

    @Test
    public void testAddTag() throws Exception{
        String nameNewTag = "Race";

        testTag.addTag(nameNewTag);
    }

    @Test
    public void testUpdateTag() throws Exception{
        int id = 8;
        String nameNewTag = "Cars";

        testTag.updateTag(id, nameNewTag);
    }

    @Test
    public void testAddPost() throws Exception{
        String textPost = "Hello, world!";
        int idUser = 1;
        int idTag = 2;

        testPost.addPost(textPost, idUser, idTag);
    }

    @Test
    public void testUpdatePost() throws Exception{
        int id = 3;
        String textPost = "Hello, world!";
        int idUser = 2;
        int idTag = 1;

        testPost.updatePost(id, textPost, idUser, idTag);
    }*/
}