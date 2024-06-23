package BaiTap9h40.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class RUN {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		VuKhi vk1 = new CungTen(15.7, 10);
		VuKhi vk2 = new Choi(20.5, 50);
		List<VuKhi> vk = new ArrayList<VuKhi>();
		List<NhanVat> dsnv = new ArrayList<NhanVat>();
		
		
		PhuThuy pt1 = new PhuThuy(null, 1, null, 5, false, false);
		PhuThuy pt2 = new PhuThuy(null, 0, null, 5, false, false);
		dsnv.add(pt1);
		dsnv.add(pt2);
		//
		KyBinh kb1 = new KyBinh(null, 3, null, 5, false, false, false, false);
		KyBinh kb2 = new KyBinh(null, 0, null, 0, false, false, false, false);
		dsnv.add(kb1);
		dsnv.add(kb2);
		// in danh sach nhan vat
		System.out.println("danh sach nhan vat");
		for (NhanVat nv : dsnv) {
			System.out.println(nv);
		}
		//
		Collections.sort(dsnv, new Comparator<NhanVat>() {

			@Override
			public int compare(NhanVat o1, NhanVat o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		System.out.println("===========================");
		//in danh sach nhan vat theo level
		System.out.println("danh sach nhan vat theo level");
		for (NhanVat nvlv : dsnv) {
			System.out.println(nvlv);
		}
		//in danh sach nhan vat theo ten
		Collections.sort(dsnv, new Comparator<NhanVat>() {

			@Override
			public int compare(NhanVat o1, NhanVat o2) {
				// TODO Auto-generated method stub
				return o1.getTen().compareTo(o2.getTen());
			}
		});
		System.out.println("=========================");
		System.out.println("so sanh theo ten");
		for (NhanVat sstt : dsnv) {
			System.out.println(sstt);
		}
		// predicate lietke tuoi
		Predicate<NhanVat> dk_nv = new Predicate<NhanVat>() {
			
			@Override
			public boolean test(NhanVat t) {
				// TODO Auto-generated method stub
				return t.getNamsinh()<=15 && t.getNamsinh()>=3;
			}
		};
		List<NhanVat> LKnv = dsnv.stream()
				.filter(dk_nv)
				.toList();
		System.out.println("=============");
		System.out.println("liet ke nhan vat tuoi (3 -> 15)");
		for (NhanVat nhanVat : LKnv) {
			System.out.println(nhanVat);
		}
		//
		BinhDoan bd1 = new BinhDoan("hehe", 50);
		BinhDoan bd2 = new BinhDoan("haha", 55);
		kb1.add(bd1);
		kb2.add(bd2);
		System.out.println("======================");
		System.out.println("binhdoan");
		for (NhanVat bd : LKnv) {
			System.out.println(bd);
			
		}
		//
		System.out.println("===============");
		DoiQuan dq = new DoiQuan("yamato", 1000, "dangcap");
		dq.add(bd1);
		dq.add(bd2);
		System.out.println(dq);
	}
	
}
