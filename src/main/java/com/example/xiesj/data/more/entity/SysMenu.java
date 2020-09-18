package com.example.xiesj.data.more.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

/**
 * sys_menu
 * @author 
 */
public class SysMenu implements Serializable {
    /**
     * id
     */
    private Integer id;

    private String name;

    /**
     * 父级菜单ID
     */
    private Integer parentId;

    /**
     * 接口
     */
    private String url;
    /**
     * 请求方式
     */
    private String action;

    /**
     * 前端vue的组件名称
     */
    private String component;

    /**
     * 序号 从小到大
     */
    @TableField("`index`")
    private Integer index;

    /**
     * 图标
     */
    @TableField("`icon`")
    private String icon;

    /**
     * 0：不显示 1：显示
     */
    @TableField("`is_show`")
    private Integer isShow;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }


    @Override
    public String toString() {
        return "SysMenu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", url='" + url + '\'' +
                ", action='" + action + '\'' +
                ", component='" + component + '\'' +
                ", index=" + index +
                ", icon='" + icon + '\'' +
                ", isShow=" + isShow +
                '}';
    }
}