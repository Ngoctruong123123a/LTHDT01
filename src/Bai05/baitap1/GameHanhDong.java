package Bai05.baitap1;
import Bai05.baitap1.*;
import java.util.*;
public class GameHanhDong{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//bobinh
		BoBinh bb = new BoBinh("truong2", "123", "nam", 50, false, true, true, false);
		System.out.println(bb);
		bb.hanhdong();
		bb.sucmanh();
		System.out.println("===kieu di chuyen cua bo binh===");
		bb.bochay();
		bb.sangphai();
		bb.sangtrai();
		bb.nhaylen();
		
		
		
		System.out.println("==========");
		//KiemKhach
		KiemKhach kk = new KiemKhach("truong3", "1234", "nam", 70, 1, true);
		System.out.println(kk);
		kk.hanhdong();
		kk.sucmanh();
		System.out.println("===kieu di chuyen cua kiem khach===");
		kk.bochay();
		kk.sangphai();
		kk.sangtrai();
		kk.nhaylen();
		System.out.println("==========");
		//PhuThuy
		PhuThuy pt = new PhuThuy("truong4", "12345", "nam", 40, true, true);
		System.out.println(pt);
		pt.hanhdong();
		pt.sucmanh();
		System.out.println("===kieu di chuyen cua Phu Thuy===");
		pt.bochay();
		pt.sangphai();
		pt.sangtrai();
		pt.nhaylen();
		System.out.println("==========");
		//kybinh
		KyBinh kb = new KyBinh("truong", "ITA032", "nam", 50, false, true, false, true);
		System.out.println(kb);
		kb.sucmanh();
		kb.hanhdong();
		System.out.println("===kieu di chuyen cua ky binh===");
		kb.bochay();
		kb.sangphai();
		kb.sangtrai();
		kb.nhaylen();
		
	}


}
