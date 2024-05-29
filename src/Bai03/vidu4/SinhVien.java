package Bai03.vidu4;

public class SinhVien {
	private String hoten;
	private int namsinh;
	private String sdt;
	
	//constructor
	public SinhVien(String hoten, int namsinh, String sdt) {
		super();
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.sdt = sdt;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
		if(namsinh <=1990) {
			System.out.println("NamSinh:"+ namsinh +"khong hop le");
		}
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@Override
	public String toString() {
		return "SinhVien [hoten=" + hoten + ", namsinh=" + namsinh + ", sdt=" + sdt + "]";
	}
	
	

}
