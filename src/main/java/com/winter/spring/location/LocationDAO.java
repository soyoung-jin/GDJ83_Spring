package com.winter.spring.location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.spring.util.DBConnection;

@Repository
public class LocationDAO {

	// (DAO는 얘 없으면 사용 못하니까 의존성 있음, 그니까 의존성 추가해주어야 함) DI, IOC(스프링 프레임워크한테 해달라고 하는 것)
	@Autowired // 주입하는 메서드
	private DBConnection dbConnection;

	public List<LocationDTO> getList() throws Exception {
		Connection con = dbConnection.getConnection();
		System.out.println(con);

		// SQL(Query)작성
		String sql = "SELECT * FROM LOCATIONS ORDER BY LOCATION_ID ASC"; // 자바에서는 쿼리문 마지막에 세미콜론 안붙임

		// 작성한 쿼리문 미리 전송(미리 서버로 보내서 준비시킴)
		PreparedStatement st = con.prepareStatement(sql);

		// ? 값 세팅 과정은 지금은 건너뜀
		// 최종 전송 및 결과를 처리하는 단계
		ResultSet rs = st.executeQuery(); // st.exe가 최종 전송이고 그 결과물을 resueltset에 받겠다는 의미

		ArrayList<LocationDTO> ar = new ArrayList<LocationDTO>();
		while (rs.next()) { // 한개씩 읽으면서 꺼내줌

			LocationDTO locationDTO = new LocationDTO();
			long id = rs.getLong("LOCATION_ID");
			String name = rs.getString("STREET_ADDRESS");
			locationDTO.setLocation_id(id);
			locationDTO.setStreet_address(name);
			locationDTO.setPostal_code(rs.getLong("POSTAL_CODE"));
			locationDTO.setCity(rs.getString("CITY"));
			locationDTO.setState_province(rs.getString("STATE_PROVINCE"));
			locationDTO.setCountry_id(rs.getString("COUNTRY_ID"));
			// DB의 row는 자바의 dto 하나와 같다

			ar.add(locationDTO);
		}

		// 연결한 자원 해제
		rs.close();
		st.close();
		con.close();
		return ar;

	}

	public LocationDTO getDetail(int num) throws Exception {
//		1. db접속 
		Connection con = dbConnection.getConnection();

//		2. sql문 작성
		String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID = ?";
//		3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
//		4. ? 세팅
		st.setInt(1, num);

		ResultSet rs = st.executeQuery();
		LocationDTO locationDTO = null;
		if (rs.next()) {
			locationDTO = new LocationDTO();
			locationDTO.setLocation_id(rs.getLong(1));
			locationDTO.setStreet_address(rs.getString(2));
			locationDTO.setPostal_code(rs.getLong("POSTAL_CODE"));
			locationDTO.setCity(rs.getString("CITY"));
			locationDTO.setState_province(rs.getString("STATE_PROVINCE"));
			locationDTO.setCountry_id(rs.getString("COUNTRY_ID"));

		}

		// 연결한 자원 해제
		rs.close();
		st.close();
		con.close();
		return locationDTO;
	}

	public void add() throws Exception {
		Connection con = dbConnection.getConnection();
		System.out.println(con);

		// SQL(Query)작성
		String sql = "SELECT * FROM LOCATIONS ORDER BY LOCATION_ID ASC";
	}

}