package Bai05.baitap1;

public class KyBinh extends NhanVat implements KieuDichuyen ,KieuTanCong {
	private boolean guom;
	private boolean giao;
	private boolean cung;
	private boolean ngua;
	
	public KyBinh(String ten, String id, String gioitinh, int nangluong, boolean guom, boolean giao, boolean cung,
			boolean ngua) {
		super(ten, id, gioitinh, nangluong);
		this.guom = guom;
		this.giao = giao;
		this.cung = cung;
		this.ngua = ngua;
	}
	public boolean isGuom() {
		return guom;
	}
	public void setGuom(boolean guom) {
		this.guom = guom;
	}
	public boolean isGiao() {
		return giao;
	}
	public void setGiao(boolean giao) {
		this.giao = giao;
	}
	public boolean isCung() {
		return cung;
	}
	public void setCung(boolean cung) {
		this.cung = cung;
	}
	public boolean isNgua() {
		return ngua;
	}
	public void setNgua(boolean ngua) {
		this.ngua = ngua;
	}
	
	@Override
	public void hanhdong() {
		System.out.println("cuoi ngua dung giao dung ten");
	}
	
	@Override
	public void sucmanh() {
		System.out.println("provip");
	}
	 @Override
	    public void sangtrai() {
	        System.out.println("KyBinh di chuyen sang trai");
	    }

	    @Override
	    public void sangphai() {
	        System.out.println("KyBinh di chuyen sang phai");
	    }

	    @Override
	    public void nhaylen() {
	        System.out.println("KyBinh nhay len");
	    }

	    @Override
	    public void bochay() {
	        System.out.println("KyBinh bo chay");
	    }
	    
	@Override
		public void tancongkhongvukhi() {
			// TODO Auto-generated method stub
			System.out.println(" dùng trang bị hiện có tấn công");
		}
		@Override
		public void tancongcovukhi() {
			// TODO Auto-generated method stub
			System.out.println("đánh tay ");
		}
	@Override
	public String toString() {
		return "KyBinh [guom=" + guom + ", giao=" + giao + ", cung=" + cung + ", ngua=" + ngua + ", toString()="
				+ super.toString() + "]";
	}
	
}
