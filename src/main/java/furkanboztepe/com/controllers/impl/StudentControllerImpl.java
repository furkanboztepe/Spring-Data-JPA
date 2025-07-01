package furkanboztepe.com.controllers.impl;

import furkanboztepe.com.controllers.IUserController;
import furkanboztepe.com.dtos.DtoUser;
import furkanboztepe.com.dtos.DtoUserIU;
import furkanboztepe.com.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/user")
public class StudentControllerImpl implements IUserController {

    @Autowired
    private IUserService userService;

    @PostMapping(path = "/save")
    @Override
    public DtoUser saveUser(@RequestBody DtoUserIU dtoUserIU) {
        return userService.saveUser(dtoUserIU);
    }

    @GetMapping(path = "/list")
    @Override
    public List<DtoUser> getUsers() {
        return userService.getUsers();
    }
}
