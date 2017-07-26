package service;

import dao.mapper.UserMapper;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cdn on 17/7/25.
 */
@Service
public class UserServiceImpl {
    @Autowired
    UserMapper userMapper;

    public User selectById(int id){
        return userMapper.selectByPrimaryKey(id);
    }

}
