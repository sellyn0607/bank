package service;

import domain.*;

public interface MemberService {

	public void join(MemberBean member);

	public MemberBean[] list(MemberBean member);

	public void addlist(MemberBean member);
	
	public MemberBean[] staffList(MemberBean member);

	public MemberBean findById(MemberBean member);

	public MemberBean[] findByName(String name);

	public String count();

	public String update(MemberBean member);

	public String WITHDRAWAL(MemberBean member);
    
	
}
