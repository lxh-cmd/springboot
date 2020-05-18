package cn.lxh.springboot.user.service;

import cn.lxh.springboot.user.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> getAll(Map map);

    void delById(Integer id);

    void save(User user);
}
