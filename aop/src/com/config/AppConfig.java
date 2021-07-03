package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.7.2
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
@ComponentScan("com")
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
}
