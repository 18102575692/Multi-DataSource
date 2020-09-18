package com.example.xiesj.data.more;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.example.xiesj.data.more.entity.SysMenu;
import com.example.xiesj.data.more.entity.User;
import com.example.xiesj.data.more.mapper.db1.UserMapper;
import com.example.xiesj.data.more.mapper.db2.SysMenuMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MoreApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    UserMapper userMapper;
    @Autowired
    SysMenuMapper sysMenuMapper;

    @Test
    public void user(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(o->{
            System.out.println(o.toString());
        });
    }
    @Test
    public void men(){
        QueryWrapper<SysMenu> sysMenuQueryWrapper = new QueryWrapper<>();
        List<SysMenu> users = this.sysMenuMapper.selectList(sysMenuQueryWrapper);
        users.forEach(o->{
            System.out.println(o.toString());
        });
    }


}
