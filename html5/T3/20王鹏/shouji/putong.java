package com.qhit.shouji;

public class putong extends shouji implements bofang{
	public putong(){
		super();	
	}
	public putong(String xinxi,String dianhua){
		super(xinxi,dianhua);	
	}
	public void bo(String name){
		System.out.println("��ʼ�������֡�"+name+"��");
	}
	public void dianhua(){
		System.out.println("��ʼͨ��");
	}
	public void duan(){
		System.out.println("������Ϣ");
	}
	public void print(){
		System.out.println("����һ���ͺ�Ϊ��"+super.getXinghao()+"��"+super.getPinpai()+"�ֻ�");
	}

}
