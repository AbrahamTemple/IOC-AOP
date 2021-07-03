package com;

import com.config.AppConfig;
import com.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.7.2
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserDao bean = ac.getBean(UserDao.class);
        bean.query();
    }
}
