package com.winter.spring.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired
	private MemberDAO memberDAO;

	public int join(MemberDTO memberDTO) throws Exception {

		return memberDAO.join(memberDTO);
	}

	public MemberDTO login(MemberDTO memberDTO) throws Exception {
		MemberDTO result = memberDAO.login(memberDTO);
		// 새로 조회한게 result에 있음

		if (result != null) {
			if (result.getPw().equals(memberDTO.getPw())) {
				return result;
			}
		} else {
			return null;
		}
		return result;
	}

}
