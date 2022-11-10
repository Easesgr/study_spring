package org.springframework.module.tx.xml.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


public class BookDao {
	private JdbcTemplate jdbcTemplate;

	/**
	 * 设置jdbc模板
	 *
	 * @param jdbcTemplate jdbc模板
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 更新库存
	 *
	 * @param id id
	 */
	public void updateStock(int id){
		String sql = "update book_stock set stock = stock - 1 where id = ?";
		jdbcTemplate.update(sql,id);
	}
}
