package cn.lxh.springboot.user.dao;

import cn.lxh.springboot.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    List<User> getAll(@Param("content") Map map);

    void delById(Integer id);

    void save(User user);
}
