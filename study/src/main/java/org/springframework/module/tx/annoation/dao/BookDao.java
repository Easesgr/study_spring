package org.springframework.module.tx.annoation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * 设置jdbc模板
	 *
	 * @param jdbcTemplate jdbc模板
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	/**
	 * 更新库存
	 *
	 * @param id id
	 */
	@Transactional
	public void updateStock(int id){
		String sql = "update book_stock set stock = stock - 1 where id = ?";
		jdbcTemplate.update(sql,id);
		for(int i = 10; i >= 0; i--){
			int j = 10/i;
		}
	}
}
