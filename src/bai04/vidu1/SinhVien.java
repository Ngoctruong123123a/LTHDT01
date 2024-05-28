package bai04.vidu1;

public class SinhVien {
    private String ten;
    private int namSinh;
    private String maSinhVien;
    private String chuyenNganh;

    public SinhVien(String ten, int namSinh, String maSinhVien, String chuyenNganh) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.maSinhVien = maSinhVien;
        this.chuyenNganh = chuyenNganh;
    }

    // Getter và Setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", namSinh=" + namSinh +
                ", maSinhVien='" + maSinhVien + '\'' +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}