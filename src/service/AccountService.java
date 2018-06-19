package service;

import domain.*;


public interface AccountService {
	public AccountBean[] list();
	public AccountBean[] minuslist();
	public void addList(AccountBean account);
	public  int deposit(String money,int restMoney);
	public  int withdraw(String money,int restMoney);
	public String createAccountNun();
	public String craeteRandom(int start,int end);
	public String createDate();
	
	public void createAccount(AccountBean account);
	public AccountBean findById(AccountBean account);
	public AccountBean[] findByName(String showInputDialog);
	public int countSameWord(String word);
	public String changePass(AccountBean account);
	public String delete(AccountBean account);
}
