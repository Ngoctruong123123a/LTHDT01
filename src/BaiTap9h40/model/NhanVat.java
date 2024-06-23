package BaiTap9h40.model;

public class NhanVat implements HanhDong {
	private String ten;
	private int id;
	private String gioitinh;
	private int namsinh;
	
	
	
	@Override
	public String toString() {
		return "NhanVat [ten=" + ten + ", id=" + id + ", gioitinh=" + gioitinh + ", namsinh=" + namsinh + "]";
	}

	
	public NhanVat(String ten, int id, String gioitinh, int namsinh) {
		super();
		this.ten = ten;
		this.id = id;
		this.gioitinh = gioitinh;
		this.namsinh = namsinh;
	}

	
	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGioitinh() {
		return gioitinh;
	}


	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}


	public int getNamsinh() {
		return namsinh;
	}


	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}


	@Override
	public void sangphai() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sangtrai() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buoclui() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tientoi() {
		// TODO Auto-generated method stub

	}

	@Override
	public void nhaylen() {
		// TODO Auto-generated method stub

	}
	

}
