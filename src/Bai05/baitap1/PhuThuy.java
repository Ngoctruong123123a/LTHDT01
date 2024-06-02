package Bai05.baitap1;

public class PhuThuy extends NhanVat implements KieuDichuyen{
	private boolean choi;
	private boolean stick;
	
	public PhuThuy(String ten, String id, String gioitinh, int nangluong, boolean choi, boolean stick) {
		super(ten, id, gioitinh, nangluong);
		this.choi = choi;
		this.stick = stick;
	}
	public boolean isChoi() {
		return choi;
	}
	public void setChoi(boolean choi) {
		this.choi = choi;
	}
	public boolean isStick() {
		return stick;
	}
	public void setStick(boolean stick) {
		this.stick = stick;
	}
	
	@Override
	public void hanhdong() {
		// TODO Auto-generated method stub
		System.out.println("nam cay choi");
		System.out.println("cuoi cay gay");
	}
	@Override
	public void sucmanh() {
		// TODO Auto-generated method stub
		System.out.println("fly");
	}
	 @Override
	    public void sangtrai() {
	        System.out.println("PhuThuy bay  sang trai");
	    }

	    @Override
	    public void sangphai() {
	        System.out.println("PhuThuy bay sang phai");
	    }

	    @Override
	    public void nhaylen() {
	        System.out.println("PhuThuy double jumb len");
	    }

	    @Override
	    public void bochay() {
	        System.out.println("PhuThuy bo chay");
	    }
	@Override
	public String toString() {
		return "PhuThuy [choi=" + choi + ", stick=" + stick + ", toString()=" + super.toString() + "]";
	}
	
}
