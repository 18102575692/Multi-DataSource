package com.example.xiesj.data.more.enums;

/**
 * @Author xiesj
 * @Date 2020/9/17
 * @description 数据源类型
 **/
public enum DBTypeEnum {
    /**
     * 数据源1
     */
    db1("db1"),
    /**
     * 数据源2
     */
    db2("db2");

    private String value;

    DBTypeEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
