package service;

import java.util.*;

import domain.*;


public interface AccountService {
	public void createAccount(AccountBean account);
	public AccountBean findById(AccountBean account);
	public String update(AccountBean account);
	public String delete(AccountBean account);
	
	
	}
	

