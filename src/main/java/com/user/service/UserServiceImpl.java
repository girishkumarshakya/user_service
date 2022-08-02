package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //Create the user list
    List<User> list = List.of(
            new User(2001L,"GIRISH","6546545656"),
            new User(2002L,"ASHISH","5546545657"),
            new User(2003L,"LAVIT","4546545658"),
            new User(2004L,"SHIVA","3546545659")
    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
