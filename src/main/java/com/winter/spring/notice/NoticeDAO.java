package com.winter.spring.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.winter.spring.notice.NoticeDAO.";

	public List<NoticeDTO> getList() throws Exception {
		return sqlSession.selectList(NAMESPACE + "getList");
	}

}
