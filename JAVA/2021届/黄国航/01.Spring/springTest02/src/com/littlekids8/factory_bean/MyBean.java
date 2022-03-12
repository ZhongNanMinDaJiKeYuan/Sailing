package com.littlekids8.factory_bean;

import com.littlekids8.collection_type.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {

    // 定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setcName("Eng");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
