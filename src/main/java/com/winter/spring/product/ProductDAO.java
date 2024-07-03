package com.winter.spring.product;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

//	// DI, IOC
//	@Autowired
//	private DBConnection dbConnection;
//
//	public List<ProductDTO> getList() throws Exception {
//		Connection con = dbConnection.getConnection();
//
//		// SQL(Query)문 작성
//		String sql = "SELECT * FROM PRODUCTS";
//
//		// 미리 전송
//		PreparedStatement st = con.prepareStatement(sql);
//
//		// ? 값 세팅
//
//		// 최종 전송 및 결과 처리
//		ResultSet rs = st.executeQuery();
//
//		ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();
//
//		while (rs.next()) {
//			ProductDTO productDTO = new ProductDTO();
//
//			productDTO.setP_code(rs.getString("P_CODE"));
//			productDTO.setAc_num(rs.getString("AC_NUM"));
//			productDTO.setAc_name(rs.getString("AC_NAME"));
//			productDTO.setInterest(rs.getDouble("INTEREST"));
//			productDTO.setScript(rs.getString("SCRIPT"));
//
//			ar.add(productDTO);
//		}
//
//		// 자원 해제
//		rs.close();
//		st.close();
//		con.close();
//
//		return ar;
//	}
//
//	public DepartmentDTO getDetail(int num) throws Exception {
//		// 1. DB접속
//		Connection con = dbConnection.getConnection();
//
//		// 2. Sql문작성
//		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID=?";
//
//		// 3. 미리 전송
//		PreparedStatement st = con.prepareStatement(sql);
//
//		// 4. ? 세팅
//		st.setInt(1, num);
//
//		// 5. 최종 전송 및 결과 처리
//		ResultSet rs = st.executeQuery();
//		DepartmentDTO departmentDTO = null;
//		if (rs.next()) {
//			departmentDTO = new DepartmentDTO();
//			departmentDTO.setDepartment_id(rs.getInt(1));
//			departmentDTO.setLocation_id(rs.getInt(4));
//			departmentDTO.setDepartment_name(rs.getString(2));
//			departmentDTO.setManager_id(rs.getLong(3));
//		}
//
//		// 6. 자원 해제
//		rs.close();
//		st.close();
//		con.close();
//
//		return departmentDTO;
//	}
//
//	// add
//	public int add(DepartmentDTO departmentDTO) throws Exception {
//		// 1. DB 연결
//		Connection con = dbConnection.getConnection();
//
//		// 2. Sql 생성
//		String sql = "INSERT INTO DEPARTMENTS " + " (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)"
//				+ " values (DEPARTMENTS_SEQ.NEXTVAL, ?, ?, ?)";
//
//		// 3. 미리전송
//		PreparedStatement st = con.prepareStatement(sql);
//
//		// 4. ? 세팅
//		st.setString(1, departmentDTO.getDepartment_name());
//		st.setLong(2, departmentDTO.getManager_id());
//		st.setInt(3, departmentDTO.getLocation_id());
//
//		// 5. 최종 전송 및 결과 처리
//		int result = st.executeUpdate();
//
//		// 6. 자원 해제
//		st.close();
//		con.close();
//
//		return result;
//	}

}
