package com.winter.spring.members;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.winter.spring.members.MemberDAO.";

	public int join(MemberDTO memberDTO) throws Exception {
		return sqlSession.insert(NAMESPACE + "join", memberDTO);
	}

	public MemberDTO login(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "login", memberDTO);
	}

	public List<MemberDTO> mypage(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectList(NAMESPACE + "mypage", memberDTO);
	}

	public int update(MemberDTO memberDTO) throws Exception {
		return sqlSession.update(NAMESPACE + "update", memberDTO);
	}

	public int delete(MemberDTO memberDTO) throws Exception {
		return sqlSession.delete(NAMESPACE + "delete", memberDTO);
	}

}
