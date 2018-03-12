package com.vebinar.config;

import com.vebinar.dao.UserDao;
import com.vebinar.dao.UserDaoImpl;
import com.vebinar.service.TestBean;
import com.vebinar.service.UserServices;
import com.vebinar.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.vebinar.service", "com.vebinar.dao"})
public class SpringConfig {
    /*@Bean
    public TestBean getTestBean() {
        return new TestBean("hello!");
    }*/
    //@ComponentScan сам їх підтягне
    /*@Bean
    public UserServices getUserServices() {
        return new UserServiceImpl();
    }*/
   /* @Bean
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }*/
    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return  new JdbcTemplate(getDataSource());
    }
    @Bean
    public DataSource getDataSource() {
        final DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/vebinar?useSSL=false");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root1234");
        return driverManagerDataSource;
    }
}
