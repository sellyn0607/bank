package serviceImpl;

import java.text.SimpleDateFormat;
import java.util.*;

import domain.*;
import service.*;

public class AdminServiceImpl implements AdminService{
	private static AdminService instance=new AdminServiceImpl();
	public static AdminService getInstance() {return instance;}
	
	/*List<MemberBean> list;
	List<AccountBean> accountList;
	*/
	private AdminServiceImpl() {
	/*list = new ArrayList<>();
	accountList = new ArrayList<>();*/
	}
	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		//list.add(staff);
		
	}

	@Override
	public List<MemberBean> list() {
		return null;//list;
	}

	@Override
	public List<MemberBean> findByName(String name) {
		/*List<MemberBean> m = new ArrayList<>();
		for(MemberBean e : list) {
			if(name.equals(e.getName())) {
				m.add(e);
				
			}
		}*/
		return null;
	}

	@Override
	public MemberBean findById(MemberBean member) {
	/*	MemberBean dap = new MemberBean();
		for(MemberBean e : list) {
			if(member.getUid().equals(e.getUid())) {
				dap=e; break;
			}
		}*/
		return null;//dap;
	}

	@Override
	public List<AccountBean> accountList() {
		
		return null;//accountList;
	}

	//@Override
	public List<AccountBean> accountFindByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String accountNum() {
		String[] num = accountRandom();;
		return num[0]+"-"+num[1]+"-"+num[2];
		
	}

	@Override
	public String[] accountRandom() {
		String[] num = new String[3];
		for(int i=0;i<3;i++) {
			num[i]=String.valueOf((int)((Math.random()*900)+100));
		}
		return num;
	}

	@Override
	public String accountDate() {
		return new SimpleDateFormat("yyyy년 MM월 dd일",Locale.KOREA).format( new Date());
	}

	@Override
	public AccountBean accountFindById(AccountBean account) {
		/*AccountBean b = new AccountBean();
		for(int i=0;i<list.size();i++) {
			if(account.getUid().equals(list.get(i).getUid())) {
				b=accountList.get(i); break;
			}
		}
		return b;*/
		return null;
	}
	



}
