package Repos;

import DTO.DTOForPosts;
import DTO.DTOForUser;
import Entity.Posts;

public interface PostsRepo {

    public Posts addPost(DTOForPosts dtoForPosts);

    public Posts updatePost(DTOForPosts dtoForPosts);

    public void deleteUser(DTOForPosts dtoForPosts);
}
