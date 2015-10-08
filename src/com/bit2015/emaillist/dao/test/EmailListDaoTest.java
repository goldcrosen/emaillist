package com.bit2015.emaillist.dao.test;

import java.util.List;

import com.bit2015.emaillist.dao.EmailListDao;
import com.bit2015.emaillist.vo.EmailListVo;

public class EmailListDaoTest {

	public static void main(String[] args) {
		// getList test
		getListTest();
		
		// insert test
		
	}

	public static void getListTest() {
		EmailListDao dao = new EmailListDao();
		List<EmailListVo> list = dao.getList();
		for( EmailListVo vo : list ) {
			System.out.println( vo );
		}
	}
}
