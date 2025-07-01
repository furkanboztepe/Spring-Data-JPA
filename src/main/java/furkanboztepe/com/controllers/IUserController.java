package furkanboztepe.com.controllers;

import furkanboztepe.com.dtos.DtoUser;
import furkanboztepe.com.dtos.DtoUserIU;

public interface IUserController {

    public DtoUser saveUser(DtoUserIU dtoUserIU);
}
