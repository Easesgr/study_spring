package org.springframework.module.tx.annoation.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.module.tx.annoation.dao.BookDao;
import org.springframework.module.tx.xml.service.BookService;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = {"org.springframework.module.tx.annoation"})
@EnableTransactionManagement
public class SpringTxConfig {
	@Value("${prop.driverClass}")
	private String driverClassname;
	@Value("${prop.url}")
	private String url;
	@Value("${prop.userName}")
	private String userName;
	@Value("${prop.password}")
	private String password;
	@Bean
	public DataSource dataSource(){
		DruidDataSource data = new DruidDataSource();
		data.setDriverClassName(driverClassname);
		data.setUrl(url);
		data.setPassword(password);
		data.setUsername(userName);
		return data;
	}
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource){
		return new DataSourceTransactionManager(dataSource);
	}
}
