package edu.pxu.lthdt.bai3;

public class XeBUS {

	private String hangxe;
	private int namsanxuat;
	private float dongco;
	private int soghe;
	//to string
	@Override
	public String toString() {
		return "XeBUS [hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + ", soghe=" + soghe
				+ "]";
	}
	//cons
	public XeBUS(String hangxe, int namsanxuat, float dongco, int soghe) {
		super();
		this.hangxe = hangxe;
		this.namsanxuat = namsanxuat;
		this.dongco = dongco;
		this.soghe = soghe;
	}
	// set,get
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
	public int getSoghe() {
		return soghe;
	}
	public void setSoghe(int soghe) {
		this.soghe = soghe;
	}
	
}
