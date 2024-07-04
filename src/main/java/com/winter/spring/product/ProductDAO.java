package com.winter.spring.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	// 의존성 주입
	@Autowired
	private SqlSession sqlSession;

	private final String NAMESPACE = "com.winter.spring.product.ProductDAO.";

	// 리스트
	public List<ProductDTO> getList() throws Exception {
		return sqlSession.selectList(NAMESPACE + "getList");
		// list로 select ?값으로 보내줄 거 없음

	}

	// 상세디테일
	public ProductDTO getDetail(ProductDTO productdto) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "getDetail", productdto);
		// 물음표 때문에 값을 더 보내줘야 하면 쉼표 하고 보낼 값하나 정해주면 됨
		// 하나만 select

	}

	// 추가
	public int add(ProductDTO productdto) throws Exception {
		return sqlSession.insert(NAMESPACE + "add", productdto);
	}

	public int update(ProductDTO productdto) throws Exception {
		return sqlSession.delete(NAMESPACE + "update", productdto);
	}

	public int delete(ProductDTO productdto) throws Exception {
		return sqlSession.delete(NAMESPACE + "delete", productdto);
	}
}
