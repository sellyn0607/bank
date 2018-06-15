package serviceImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import domain.Account;
import service.*;

public class AccountServiceImpl implements AccountService{
	Account[] list;
	int count;
	public AccountServiceImpl() {
		
		list=new Account[10];
		count=0;
	}
	@Override
	public Account[] list() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void addList(Account account) {
		list[count++]=account;
		
	}

	@Override
	public int deposit(String money, int restMoney) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdraw(String money, int restMoney) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String createAccountNun() {
		String can="";
		int[] num=new int[3];
		for(int i=0; i<3; i++) {
			num[i]=(int)(Math.random()*900)+100;
		}
		can=num[0]+"-"+num[1]+"-"+num[2];
		return can;
	}

	@Override
	public String craeteRandom(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createDate() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("yyyy년 MM월 dd일",Locale.KOREA).format( new Date());
	}

	@Override
	public String showResult() {
		String result="";
		for(int i=0; i<count;i++) {
			result+=list()[i].toString()+"\n\n";
		}
		return result;
	}

	@Override
	public Account createAccount(String name, String uid, String pass) {
		Account a= new Account(name,uid,pass);
		a.setAccountNo(createAccountNun());
		a.setCreateDate(createDate());
		return a;
	}

}
