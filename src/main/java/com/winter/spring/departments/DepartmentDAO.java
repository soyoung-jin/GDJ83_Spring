package com.winter.spring.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.spring.util.DBConnection;

@Repository
public class DepartmentDAO {

	// (DAO는 얘 없으면 사용 못하니까 의존성 있음, 그니까 의존성 추가해주어야 함) DI, IOC(스프링 프레임워크한테 해달라고 하는 것)
	@Autowired // 주입하는 메서드
	private DBConnection dbConnection;

	public List<DepartmentDTO> getList() throws Exception {
		Connection con = dbConnection.getConnection();
		System.out.println(con);

		// SQL(Query)작성
		String sql = "SELECT * FROM DEPARTMENTS ORDER BY DEPARTMENT_ID ASC"; // 자바에서는 쿼리문 마지막에 세미콜론 안붙임

		// 작성한 쿼리문 미리 전송(미리 서버로 보내서 준비시킴)
		PreparedStatement st = con.prepareStatement(sql);

		// ? 값 세팅 과정은 지금은 건너뜀
		// 최종 전송 및 결과를 처리하는 단계
		ResultSet rs = st.executeQuery(); // st.exe가 최종 전송이고 그 결과물을 resueltset에 받겠다는 의미

		ArrayList<DepartmentDTO> ar = new ArrayList<DepartmentDTO>();
		while (rs.next()) { // 한개씩 읽으면서 꺼내줌

			DepartmentDTO departmentDTO = new DepartmentDTO();
			int id = rs.getInt("DEPARTMENT_ID");
			String name = rs.getString("DEPARTMENT_NAME");
			departmentDTO.setDepartment_id(id);
			departmentDTO.setDepartment_name(name);
			departmentDTO.setManager_id(rs.getLong("MANAGER_ID"));
			departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			// DB의 row는 자바의 dto 하나와 같다

			ar.add(departmentDTO);
		}

		// 연결한 자원 해제
		rs.close();
		st.close();
		con.close();
		return ar;

	}

	public DepartmentDTO getDetail(int num) throws Exception {
//		1. db접속 
		Connection con = dbConnection.getConnection();

//		2. sql문 작성
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
//		3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
//		4. ? 세팅
		st.setInt(1, num);

		ResultSet rs = st.executeQuery();
		DepartmentDTO departmentDTO = null;
		if (rs.next()) {
			departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt(1));
			// rs.getInt(1)
			departmentDTO.setDepartment_name(rs.getString(2));
			departmentDTO.setManager_id(rs.getLong("MANAGER_ID"));
			departmentDTO.setLocation_id(rs.getInt(4));

		}

		// 연결한 자원 해제
		rs.close();
		st.close();
		con.close();
		return departmentDTO;
	}

	// add
	public int add(DepartmentDTO departmentDTO) throws Exception {
		// 1. DB 연결
		Connection con = dbConnection.getConnection();

		// 2. Sql 생성
		String sql = "INSERT INTO DEPARTMENTS " + " (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)"
				+ " values (DEPARTMENTS_SEQ.NEXTVAL, ?, ?, ?)";

		// 3. 미리전송
		PreparedStatement st = con.prepareStatement(sql);

		// 4. ? 세팅
		st.setString(1, departmentDTO.getDepartment_name());
		st.setLong(2, departmentDTO.getManager_id());
		st.setInt(3, departmentDTO.getLocation_id());

		// 5. 최종 전송 및 결과 처리
		int result = st.executeUpdate();

		// 6. 자원 해제
		st.close();
		con.close();

		return result;
	}

	// 삭제
	// delete
	public int delete(DepartmentDTO departmentDTO) throws Exception {
		Connection con = dbConnection.getConnection();

		String sql = "DELETE DEPARTMENTS WHERE DEPARTMENT_ID=?";

		PreparedStatement st = con.prepareStatement(sql);

		st.setInt(1, departmentDTO.getDepartment_id());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	// update
	public int update(DepartmentDTO departmentDTO) throws Exception {
		int result = 0;

		Connection con = dbConnection.getConnection();

		String sql = "UPDATE DEPARTMENTS SET DEPARTMENT_NAME=?, MANAGER_ID=?, LOCATION_ID=? "
				+ " WHERE DEPARTMENT_ID=?";

		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, departmentDTO.getDepartment_name());
		st.setLong(2, departmentDTO.getManager_id());
		st.setInt(3, departmentDTO.getLocation_id());
		st.setInt(4, departmentDTO.getDepartment_id());

		result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	// 부서별 정보
	public List<Map<String, Object>> getInfo() throws Exception {
		Connection con = dbConnection.getConnection();

		String sql = "SELECT DEPARTMENT_ID, SUM(SALARY), AVG(SALARY)" + " FROM EMPLOYEES" + " GROUP BY DEPARTMENT_ID";
		PreparedStatement st = con.prepareStatement(sql);

		ResultSet rs = st.executeQuery();
		List<Map<String, Object>> ar = new ArrayList<Map<String, Object>>();

		while (rs.next()) {
			// dto에 변수가 없을 땐 map을 사용하기도 함
			Map<String, Object> map = new HashMap<String, Object>();
			int id = rs.getInt("DEPARTMENT_ID");
			int sum = rs.getInt(2);
			double avg = rs.getDouble(3); // "a"써도 됨

			map.put("id", id);
			map.put("sum", sum);
			map.put("avg", avg);

			ar.add(map);

		}

		rs.close();
		st.close();
		con.close();
		return ar;
	}

}