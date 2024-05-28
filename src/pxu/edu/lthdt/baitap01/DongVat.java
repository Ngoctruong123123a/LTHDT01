package pxu.edu.lthdt.baitap01;

import java.time.LocalDate;

public class DongVat {

    private String ten;
    private int namsinh;
    private String gioitinh;

    public DongVat(String ten, int namsinh, String gioitinh) {
        this.ten = ten;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        LocalDate ngayhientai = LocalDate.now();
        int namhientai = ngayhientai.getYear();
        if(namsinh>namhientai && namsinh<1950){
            System.out.println("Nam sinh khong phu hop");
        }else {
            this.namsinh = namsinh;
        }        
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "Động vật{" +
                "ten='" + ten + '\'' +
                ", namsinh=" + namsinh +
                ", gioitinh='" + gioitinh + '\'' +
                '}';
    }
}
