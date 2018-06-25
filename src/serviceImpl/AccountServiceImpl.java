package serviceImpl;
import java.text.SimpleDateFormat;
import java.util.*;

import domain.*;
import repositoryImpl.AccountDAOImpl;
import repositoryImpl.MemberDAOImpl;
import service.*;

public class AccountServiceImpl implements AccountService{
	/*List<AccountBean> list;*/
	private static AccountService instance = new AccountServiceImpl();
	public static AccountService getInstance() {return instance;}
	private AccountServiceImpl() {}

	

	@Override
	public AccountBean findById(AccountBean account) {
		//return map.get(account.getUid());
		return null;
	}
	@Override
	public String update(AccountBean account) {
		/*String msg="";
		if(account.getPass().split("/")[0].equals(findById(account).getPass())) {
			list.get(list.indexOf(findById(account))).setPass(account.getPass().split("/")[1]);
			msg="비밀번호가 변경되었습니다.";
		}else {
			msg="비밀번호나 아이디가 틀리셨습니다.";
		}
		return msg;*/
		return null;
	}
	@Override
	public String delete(AccountBean account) {
	/*	String msg="";
		if(account.getPass().equals(findById(account).getPass())) {
		list.remove(list.indexOf(findById(account)));
		msg="삭제되었습니다.";}
		else {
			msg="비밀번호가 틀리셨습니다";
		}
		return msg;
	}*/
	return null;
}
	@Override
	public void createAccount(AccountBean account) {
		
		
		System.out.println("컨트롤러에서 넘어온 객체 :"+account);
		AccountDAOImpl.getInstance().insertAccount(account);
		
	}
}

