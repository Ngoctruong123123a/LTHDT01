package BaiTap9h40.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BinhDoan implements Comparator<KyBinh> {
	private String ten;
	private int soluong;
	List<VuKhi> vk = new ArrayList<VuKhi>();
	
	@Override
	public int compare(KyBinh o1, KyBinh o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public BinhDoan(String ten, int soluong) {
		super();
		this.ten = ten;
		this.soluong = soluong;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public List<VuKhi> getVk() {
		return vk;
	}

	public void setVk(List<VuKhi> vk) {
		this.vk = vk;
	}

	@Override
	public String toString() {
		return "BinhDoan [ten=" + ten + ", soluong=" + soluong + ", vk=" + vk + ", toString()=" + super.toString()
				+ "]";
	}
	

}
