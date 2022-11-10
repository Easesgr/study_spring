package org.springframework.module.tx.xml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.module.tx.xml.dao.BookDao;
import org.springframework.stereotype.Service;


public class BookService {
	public BookDao getBookDao() {
		return bookDao;
	}

	@Autowired
	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	/**
	 * 结帐
	 *
	 * @param id id
	 */
	public void checkout(int id){
		// 扣减库存
		bookDao.updateStock(id);
		for(int i =10; i>= 0; i--){
			int j = 10/i;
		}
	}
}
