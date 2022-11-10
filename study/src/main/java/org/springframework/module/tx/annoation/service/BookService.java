package org.springframework.module.tx.annoation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.module.tx.annoation.dao.BookDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {
	@Autowired
	private BookDao bookDao;

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	/**
	 * 结帐
	 *
	 * @param id id
	 */
	@Transactional
	public void checkout(int id){
		// 扣减库存
		bookDao.updateStock(id);
		for(int i = 10; i >= 0; i--){
			int j = 10/i;
		}
	}
}
