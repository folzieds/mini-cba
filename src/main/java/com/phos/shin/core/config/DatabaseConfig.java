package com.phos.seatarrangement.core.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

    @Value("${phos.datasource.url}")
    private String url;

    @Value("${phos.datasource.username}")
    private String username;

    @Value("${phos.datasource.password}")
    private String password;

    @Value("${phos.datasource.driver-class-name}")
    private String driver;

    @Bean
    public DataSource datasource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();

        dataSourceBuilder.driverClassName(driver);
        dataSourceBuilder.url(url);
        dataSourceBuilder.username(username);
        dataSourceBuilder.password(password);

        return dataSourceBuilder.build();
    }
}