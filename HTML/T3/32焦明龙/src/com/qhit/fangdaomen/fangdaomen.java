package com.qhit.fangdaomen;

public class fangdaomen extends door implements locker,zhaoxiang{

	public String lock() {
		return "������";
	}
	public String unlock() {
		return "��������";
	}
	public String zhao(){
		return "���ꡣ����������ɹ�";
	}

	public static void main(String[] args){
		fangdaomen fdm = new fangdaomen();
		System.out.println( fdm.close());
		
		System.out.println(fdm.lock());
		System.out.println(fdm.zhao());
		
		System.out.println(fdm.unlock());
		System.out.println(fdm.open());
		
		
		
		
	}
	

	
	
	
	
	
}