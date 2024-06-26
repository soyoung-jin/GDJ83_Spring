package com.winter.spring.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // 클래스의 객체를 만들어달라는 어노테이션
public class LocationService {
	@Autowired // 만들어진 객체의 타입을 알아서 찾아주라는 어노테이션
	private LocationDAO departmentDAO;

	public List<LocationDTO> getList() throws Exception {
		return departmentDAO.getList();
	}

	public LocationDTO getDetail(int location_id) throws Exception {
		return departmentDAO.getDetail(location_id);
	}

}