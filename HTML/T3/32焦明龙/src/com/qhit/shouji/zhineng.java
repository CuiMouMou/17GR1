package com.qhit.shouji;

public class zhineng extends shouji implements bofang,shangwang,zhaoxiang {
	public zhineng(){
		super();
	}
	public zhineng(String xinxi,String dianhua){
		super(xinxi,dianhua);
	}
	public void duan(){
		System.out.println("������Ϣ");
	}
	public void dianhua(){
		System.out.println("��ʼ��Ƶͨ��");
	}
	public void bo(String name){
		System.out.println("��ʼ������Ƶ��"+name+"��");
	}
	public void print(){
		System.out.println("����һ���ͺ�Ϊ��"+super.getXinghao()+"��"+super.getPinpai()+"�ֻ�");
	}
	public void zhao(){
		System.out.println("���ꡣ����������ɹ�");
	}
	public void wang(){
		System.out.println("�Ѿ���������");
	}

}
