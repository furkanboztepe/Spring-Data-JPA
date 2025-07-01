package furkanboztepe.com.services;

import furkanboztepe.com.dtos.DtoUser;
import furkanboztepe.com.dtos.DtoUserIU;

import java.util.List;

public interface IUserService {
    public DtoUser saveUser(DtoUserIU user);

    public List<DtoUser> getUsers();
}
