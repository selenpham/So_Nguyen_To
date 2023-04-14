//Bài 3. Thực hành với vòng lặp for
//Viết chương trình nhập vào một số nguyên dương N từ bàn phím.
//Đếm và In ra màn hình tất cả các số nguyên tố từ 1 đến N.

package LAB2;

import java.util.Scanner;


public class Thuchanh3_So_Nguyen_To {
	public static boolean kiemtraSoNguyenTo(int n) {
		if(n <=1) {
			return false;
		}
		for(int i=2;i<= Math.sqrt(n);i++) {
			if(n % i == 0) {
				return false;
				}
			}
		return true;
	}

	public static void main (String[]args) {	
		Scanner scanner = new Scanner(System.in);
	   	System.out.println("Nhap so N>0: ");
    	int N = scanner.nextInt();

    	int countSoNguyen = 0;
		System.out.print("Cac so nguyen to tu 1 den " + N + " la: ");
    	for(int i=2;i<=N;i++){ 
    		if (kiemtraSoNguyenTo(i)){
    			countSoNguyen ++; 
	   			System.out.print(i + " ");
    		}
	   	}
    	System.out.println();
        System.out.println("Tong cac so nguyen to từ 1 den " + N + ": " + countSoNguyen);
     }
	
}
