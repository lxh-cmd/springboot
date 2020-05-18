package cn.lxh.springboot.user.service;

import cn.lxh.springboot.user.dao.UserDao;
import cn.lxh.springboot.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    @Override
    public List<User> getAll(Map map) {
        return userDao.getAll(map);
    }

    @Override
    public void delById(Integer id) {
        userDao.delById(id);
    }

    @Override
    public void save(User user) {
        user.setCreatetime(new Date());
        user.setStatus(1);
        userDao.save(user);
    }

}
