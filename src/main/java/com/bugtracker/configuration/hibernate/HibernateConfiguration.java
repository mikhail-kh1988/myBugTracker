package com.bugtracker.configuration.hibernate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {

    private Properties properties = new Properties();

    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setPackagesToScan("com.bugtracker");
        sessionFactoryBean.setHibernateProperties(hibernateProperties());
        return sessionFactoryBean;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(hibernateProperties().getProperty("hibernate.connection.driver_class"));
        dataSource.setUrl(hibernateProperties().getProperty("hibernate.connection.url"));
        dataSource.setUsername(hibernateProperties().getProperty("hibernate.connection.username"));
        dataSource.setPassword(hibernateProperties().getProperty("hibernate.connection.password"));
        return dataSource;
    }

    @Bean
    public Properties hibernateProperties(){
        properties.setProperty("hibernate.connection.autocommit", "true");
        properties.setProperty("hibernate.hbm2ddl.create_namespaces", "true");
        properties.setProperty("hibernate.hbm2ddl.auto", "create");
        properties.setProperty("hibernate.connection.url","jdbc:postgresql://localhost:5432/bug_tracker");
        properties.setProperty("hibernate.connection.username", "admin");
        properties.setProperty("hibernate.connection.password", "admin");
        properties.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL10Dialect");
        properties.setProperty("hibernate.show_sql", "true");
        return properties;
    }

    @Bean
    public PlatformTransactionManager hibernateTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }

}
