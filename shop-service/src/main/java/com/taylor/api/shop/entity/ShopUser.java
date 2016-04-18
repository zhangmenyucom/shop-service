package com.taylor.api.shop.entity;

import java.io.Serializable;

/**
 * @notes:用户信息表实体类
 *
 * @author taylor
 *
 * @date  2016-04-18 00:52:13	Email:516195940@qq.com
 */
public class ShopUser implements Serializable {

	private static final long serialVersionUID = 201604180052133L;
	
    private Integer id;
    
    private String name;
    
    private Integer age;
    
    private Integer sex;
    
    private String school;
    

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
    
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
    
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    
}