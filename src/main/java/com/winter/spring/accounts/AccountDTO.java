package com.winter.spring.accounts;

public class AccountDTO {
	private Long ac_Num;
	private String id;
	private Long a_Balance;
	private String p_code;

	public String getP_code() {
		return p_code;
	}

	public void setP_code(String p_code) {
		this.p_code = p_code;
	}

	public Long getAc_Num() {
		return ac_Num;
	}

	public void setAc_Num(Long ac_Num) {
		this.ac_Num = ac_Num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getA_Balance() {
		return a_Balance;
	}

	public void setA_Balance(Long a_Balance) {
		this.a_Balance = a_Balance;
	}

}
