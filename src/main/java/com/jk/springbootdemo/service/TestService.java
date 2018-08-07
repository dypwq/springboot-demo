package com.jk.springbootdemo.service;

import com.jk.springbootdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 邓尤朋
 * @Title: TestService
 * @ProjectName springboot-demo
 * @Description: ${params}
 * @date 2018/8/317:45
 */
@Service
public class TestService {

    @Autowired
    private MongoTemplate MongoTemplate;
    public List queryll() {
        return  MongoTemplate.findAll(User.class);
    }
}
