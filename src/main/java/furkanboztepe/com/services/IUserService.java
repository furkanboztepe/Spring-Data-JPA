package furkanboztepe.com.services;

import furkanboztepe.com.dtos.DtoUser;
import furkanboztepe.com.dtos.DtoUserIU;

public interface IUserService {
    public DtoUser saveUser(DtoUserIU user);
}
