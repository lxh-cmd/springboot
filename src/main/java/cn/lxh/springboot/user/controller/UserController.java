package cn.lxh.springboot.user.controller;

import cn.lxh.springboot.user.entity.User;
import cn.lxh.springboot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<User> getAll(Map map) {
        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id){
        userService.delById(id);
        return  "redirect:/index.html";
    }
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody User user){
        userService.save(user);
        return "success";
    }
    //根据用户id查询数据
    @RequestMapping("/findById")
    @ResponseBody
    public User findById(Integer id){
        return userService.findById(id);
    }
}
