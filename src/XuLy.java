import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử n = ");
        int n = Integer.parseInt(scan.nextLine());
        int a[] = nhapMang(n,scan);
        xuatMangForEach(a);
        float tong = tinhTongChan(a);
        System.out.println("Tổng các số chẵn mảng: " + tong);
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		System.out.println("Nhập mảng");
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static void xuatMangForI(int a[]) {
		System.out.println("Xuất mảng");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "\t");
		}
	}

	public static void xuatMangForEach(int a[]) {
		System.out.println("Xuất mảng");
		for (int pt : a) {
			System.out.println(pt + "\t");
		}
	}
	
	public static float tinhTongChan(int a[]) {
		float tong = 0;
		for(int pt: a) {
			if(pt % 2 == 0) {
				tong += pt;
			}
		}
		return tong;
	}

}
