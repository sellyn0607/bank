package service;

import domain.Account;

public interface AccountService {
	public Account[] list();
	public void addList(Account account);
	public  int deposit(String money,int restMoney);
	public  int withdraw(String money,int restMoney);
	public String createAccountNun();
	public String craeteRandom(int start,int end);
	public String createDate();
	public String showResult();
	
	public Account createAccount(String name,String uid,String pass);
	
}
