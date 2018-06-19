package serviceImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import domain.*;

import service.*;

public class AccountServiceImpl implements AccountService{
	private AccountBean[] list,minuslist;
	private int minuscount,count;
	public AccountServiceImpl() {
		
		list=new AccountBean[5];
		minuslist=new AccountBean[5];
		count=0;
		minuscount=0;
	}
	@Override
	public AccountBean[] list() {
		String res="";
		for(int i=0; i<list.length;i++) {
			res+=list[i];
		}
		System.out.println(res);
		return list;
	}

	@Override
	public void addList(AccountBean account) {
		list[count++]=account;
		
	}

	@Override
	public int deposit(String money, int restMoney) {
		
		return 0;
	}

	@Override
	public int withdraw(String money, int restMoney) {
		
		return 0;
	}

	@Override
	public String createAccountNun() {
		
		int[] num=new int[3];
		for(int i=0; i<3; i++) {
			num[i]=(int)(Math.random()*900)+100;
		}
		
		return num[0]+"-"+num[1]+"-"+num[2];
	}

	@Override
	public String craeteRandom(int start, int end) {
		
		return null;
	}

	@Override
	public String createDate() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("yyyy년 MM월 dd일",Locale.KOREA).format( new Date());
	}

	
@Override
public void createAccount(AccountBean account) {
	
	account.setAccountNo(createAccountNun());
	account.setCreateDate(createDate());
	addList(account);
	if(account instanceof MinusAccountBean) {
		minuslist[minuscount++]=account;
	}
}
@Override
public AccountBean findById(AccountBean account) {
	
	AccountBean a = new AccountBean();
	for (int i =0; i<count;i++) {
		if(account.getUid().equals(list[i].getUid()) && account.getPass().equals(list[i].getPass())) {
			a=list[i];
			break;
		}
		}
	return a;
	
	//배열 List 를 looping 하면서 id가 일치하고 비번이 일치한값을 찾아서 그 객체를 리턴한다 . 일단 일치한느 값이 없는 상황은 나중에 처리
}
@Override
public AccountBean[] findByName(String name) {
	

	AccountBean[] arr = new AccountBean[countSameWord(name)];
	for (int i=0; i<count; i++) {
		if(name.equals(list[i].getName())) {
		arr[i]=list[i];
		}
	}
	return arr;
}
@Override
public int countSameWord(String word) {
	int temp=0;
	for (int i=0; i<count; i++) {
		if(word.equals(list[i].getName())) {
		
		temp++; 			
		}

	}
	return temp;
}
@Override
public AccountBean[] minuslist() {
	return minuslist;
}
@Override
public String changePass(AccountBean account) {
	String msg ="";
	String pass = account.getPass().split("/")[0];
	String newPass = account.getPass().split("/")[1];
	account.setPass(pass);
	account = findById(account);
	if(account.getUid()== null) {
		msg="아이디가 없거나 비번이 틀렸습니다";
		
	}else { 
		if(pass.equals(newPass)) {
			msg="비밀번호변경실패";
		}
		else {
			account.setPass(newPass);
			msg="비번변경 성공";
		}
			}
	return msg;
}
@Override
public String delete(AccountBean account) {
	String msg="";
	String pass = account.getPass().split("/")[0];
	String newPass = account.getPass().split("/")[1];
	account.setPass(pass);
	account = findById(account);
	if (pass.equals(newPass)) {
		for(int i =0; i<count;i++) {
			if(list[i]==account) {
				list[i]=list[--count];
				list[count]=null;
				msg="삭제되었습니다.";
			}
		}
	}else {
		msg="비밀번호가 틀렸습니다";
	}
	return msg;
}


}
