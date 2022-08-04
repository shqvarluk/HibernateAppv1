package Repos;

import DTO.DTOForTags;
import Entity.Tags;

public interface TagsRepo {

    public Tags addTag(DTOForTags dtoForTags);

    public Tags updateTag(DTOForTags dtoForTags);

    public void deleteTag(DTOForTags dtoForTags);
}
