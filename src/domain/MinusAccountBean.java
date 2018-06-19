package domain;

public class MinusAccountBean extends AccountBean {
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int limit; // 대출금
	

	public void setLimit(int limit) {
		this.limit=limit;
	}
	public int getLimit() {
		return limit;
	}
	public String getAccount_Type() {
		return ACCOUNT_TYPE;
	}
	public String toString() {
		
		return String.format("%s\n%s\n아이디 : %s\n패스워드 : %s \n계좌번호 : %s \n이름 : %s \n잔액 : %d 원 \n생성일 : %s\n대출한도 :%d ",
				BANK_NAME,ACCOUNT_TYPE,uid,pass,accountNo,name,money,createdate,limit);
	}
}
