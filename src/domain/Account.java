package domain;

import serviceImpl.AccountServiceImpl;

public class Account {
	public final static String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="기본통장";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money;
	protected String uid,accountType,name,pass,accountNo,createdate;
	
	public String toString() {
		
		return String.format("%s\n%s\n아이디 : %s\n패스워드 : %s \n계좌번호 : %s \n이름 : %s \n잔액 : %d 원 \n생성일 : %s ",
				BANK_NAME,ACCOUNT_TYPE,uid,pass,accountNo,name,money,createdate);
	}
	public Account(String name, String uid, String pass) {
		
		this.name=name;
		this.uid=uid;
		this.pass=pass;
	}
	
	public void setMoney(int money) {
		this.money=money;
	}
	public void setUid(String uid) {
		this.uid=uid;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPass(String pass) {
		this.pass=pass;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo=accountNo;
	}
	public void setCreateDate(String createdate) {
		this.createdate=createdate;
	}
	public int getMoney() {
		return money;
	}
	public String getUid() {
		return uid;
	}
	public String getName() {
		return name;
	}
	public String getPass() {
		return pass;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getCreateDate() {
		return createdate;
	}
}