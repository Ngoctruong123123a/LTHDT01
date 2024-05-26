package edu.pxu.lthdt.bai3;

public class XeOTO {
	//khai bao set,get
	private String hangxe;
	private int namsanxuat;
	private float dongco;
	
	//to String
	@Override
	public String toString() {
		return "XeOTO [hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + "]";
	}
	//constructer cho truong hop rong
	public XeOTO() {
		super();
	}
	//constructer 
	public XeOTO(String hangxe, int namsanxuat, float dongco) {
		super();
		this.hangxe = hangxe;
		this.namsanxuat = namsanxuat;
		this.dongco = dongco;
	}
	//setters/getter
	public String getHangxe() {
		return hangxe;
	}
	public void setHangxe(String hangxe) {
		this.hangxe = hangxe;
	}
	public int getNamsanxuat() {
		return namsanxuat;
	}
	public void setNamsanxuat(int namsanxuat) {
		this.namsanxuat = namsanxuat;
	}
	public float getDongco() {
		return dongco;
	}
	public void setDongco(float dongco) {
		this.dongco = dongco;
	}
	
	
}
