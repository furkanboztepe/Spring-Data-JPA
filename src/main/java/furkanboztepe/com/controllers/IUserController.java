package furkanboztepe.com.controllers;

import furkanboztepe.com.dtos.DtoUser;
import furkanboztepe.com.dtos.DtoUserIU;

import java.util.List;

public interface IUserController {

    public DtoUser saveUser(DtoUserIU dtoUserIU);

    public List<DtoUser> getUsers();
}
