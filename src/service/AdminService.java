package service;

import java.util.List;
import domain.*;

public interface AdminService {
	//public void createUser(UserBean user);
	public void createStaff(StaffBean staff);
	public List<MemberBean> list();
	public List<MemberBean> findByName(String name);
	public MemberBean findById(MemberBean member);
	
	
	public List<AccountBean> accountList();
	public List<AccountBean> accountFindByName(String name);
	public String accountNum();
	public String[] accountRandom();
	public String accountDate();
	public AccountBean accountFindById(AccountBean account);
}
