package com.example.jumak.mybatis;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {

    private final ApplicationContext applicationContext;

<<<<<<< HEAD
    //    이 어노테이션은 외부파일의 설정 값들을 자바 객체로 가져올때 사용한다.
//    스프링부트에서는 application.properties라는 파일에 설정값을 작성하므로 해당 파일에서 특정 속성을 가져올 때 사용한다.
//    prefix는 어노테이션의 설정이다.
//    접두사를 설정할 때 사용하는 설정이며 "spring.datasource.hikari"로 시작하는 설정값을 전부 가져오라는 의미이다.
//    가져온 값을 new HikariConfig()로 만든 객체의 필드에 바인딩한다.
=======

>>>>>>> dd49270a2f40d7cb92671bccbf30497ce9956736
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public HikariConfig hikariConfig(){
        return new HikariConfig();
    }

    @Bean
    public DataSource dataSource(){
        return new HikariDataSource(hikariConfig());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());

<<<<<<< HEAD
        /*
        매퍼파일들의 경로를 알려주기 위해 설한다.
        applicationContext 객체는 현재 프로젝트의 설정, 파일 경로 등을 알고 있다.
        classpath*는 java 디렉터리와 resources디렉터리 에서 검색을하여 일치하는 모든 파일을 찾아낸다.(여러 파일)
        해당 패턴으로 검색된 파일들의 경로를 sqlSessionFactoryBean에 저장한다.
         */
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath*:/mapper/**/*.xml"));
//        config.xml파일의 경로를 알려준다.
//        classpath는 하나의 파일만 검색하여 찾는다.
=======
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath*:/mapper/**/*.xml"));
>>>>>>> dd49270a2f40d7cb92671bccbf30497ce9956736
        sqlSessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:/config/config.xml"));

        try {
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
            sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);
            return sqlSessionFactory;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}