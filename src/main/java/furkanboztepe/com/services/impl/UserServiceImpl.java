package furkanboztepe.com.services.impl;

import furkanboztepe.com.dtos.DtoUser;
import furkanboztepe.com.dtos.DtoUserIU;
import furkanboztepe.com.entities.User;
import furkanboztepe.com.repositories.UserRepository;
import furkanboztepe.com.services.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public DtoUser saveUser(DtoUserIU dtoUserIU) {
        DtoUser response = new DtoUser();
        User user = new User();
        BeanUtils.copyProperties(dtoUserIU, user);

        User dbUser = userRepository.save(user);
        BeanUtils.copyProperties(dbUser, response);
        return response;
    }

    @Override
    public List<DtoUser> getUsers() {
        List<DtoUser> dtoList = new ArrayList<>();

        List<User> userList = userRepository.findAllUsers();
        for (User user : userList) {
            DtoUser dto = new DtoUser();
            BeanUtils.copyProperties(user, dto);

            dtoList.add(dto);
        }
        return dtoList;
    }

}
