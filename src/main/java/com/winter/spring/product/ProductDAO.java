package com.winter.spring.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.spring.util.DBConnection;

@Repository
public class ProductDAO {

	// DI, IOC
	@Autowired
	private DBConnection dbConnection;

	public List<ProductDTO> getList() throws Exception {
		Connection con = dbConnection.getConnection();

		// SQL(Query)문 작성
		String sql = "SELECT * FROM PRODUCTS";

		// 미리 전송
		PreparedStatement st = con.prepareStatement(sql);

		// ? 값 세팅

		// 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();

		ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();

		while (rs.next()) {
			ProductDTO productDTO = new ProductDTO();

			productDTO.setP_code(rs.getString("P_CODE"));
			productDTO.setAc_num(rs.getString("AC_NUM"));
			productDTO.setAc_name(rs.getString("AC_NAME"));
			productDTO.setInterest(rs.getDouble("INTEREST"));
			productDTO.setScript(rs.getString("SCRIPT"));

			ar.add(productDTO);
		}

		// 자원 해제
		rs.close();
		st.close();
		con.close();

		return ar;
	}

}
