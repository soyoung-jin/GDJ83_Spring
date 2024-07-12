package com.winter.spring.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {

	@Autowired
	private NoticeDAO noticeDAO;

	public List<NoticeDTO> getList() throws Exception {
		return noticeDAO.getList();
	}

}
