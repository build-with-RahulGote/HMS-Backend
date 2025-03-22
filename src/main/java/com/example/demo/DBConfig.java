package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import jakarta.activation.DataSource;

@Configuration
public class DBConfig {

	@Bean(name="jdbctemplate")
	public JdbcTemplate jdbctemplate( javax.sql.DataSource dataSource)
	{
		return new JdbcTemplate(dataSource);
	}



}
