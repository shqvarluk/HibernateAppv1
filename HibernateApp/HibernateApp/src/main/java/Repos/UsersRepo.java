package Repos;

import DTO.DTOForUser;
import Entity.Users;

public interface UsersRepo {

    public Users addUser(DTOForUser dtoForUser);

    public Users updateUser(DTOForUser dtoForUser);

    public void deleteUser(DTOForUser dtoForUser);
}
