package com.example.xiesj.data.more.mapper.db2;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.xiesj.data.more.entity.SysMenu;
import org.springframework.stereotype.Repository;

@Repository
@DS("db2")
public interface SysMenuMapper extends BaseMapper<SysMenu> {
}