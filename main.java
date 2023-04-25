
package Lap2b1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        AccountList list = new AccountList();
        Scanner sc = new Scanner(System.in);
        int chon;
        do{
            System.out.println("Menu");
            System.out.println("1. Them tai khoan");
            System.out.println("2. So tai koan");
            System.out.println("3. Thong tin tai khoan");
            System.out.println("4. Nap tien");
            System.out.println("5. Rut tien");
            System.out.println("6. Chuyen tien");
            System.out.println("0. Thoat");
            System.out.println("Chon 1-6 lua chon tren");
            chon = sc.nextInt();
            
            switch(chon){
                case 1:
                    System.out.println("Nhập số tài khoản: ");
                    int soTK = sc.nextInt();
                    System.out.println("Nhập tên tài khoản");
                    String tenTK = sc.nextLine();
                    System.out.println("Nhập Số tiền");
                    double soTien = sc.nextDouble();
                    Account account = new Account(soTK, tenTK, soTien);
                    boolean result = list.addAcccount(account);
                    if(result){
                        System.out.println("Thêm tài khoản thành công!");
                    }else{
                        System.out.println("Thêm tài khoản thất bại. Danh sách đã đầy");
                    }
                    break;
                    
                case 2:
                    int soTKHienCo = list.getCount();
                    System.out.println("Số tài khoản hiện có: " + soTKHienCo);
                    break;
                    
                case 3:
                    list.printAccount();
                    break;
                 
                case 4:
                    System.out.println("Nhap số TK: ");
                    int soTKNapTien = sc.nextInt();
                    System.out.print("Nhập số tiền cần nạp: ");
                    double soTienNap = sc.nextDouble();
                    Account accountNapTien = list.findAccount(soTKNapTien);
                    if (accountNapTien != null) {
                        accountNapTien.napTien(soTienNap);
                        System.out.println("Nạp tiền thành công!");
                    } else {
                        System.out.println("Không tìm thấy tài khoản với số TK đã nhập!");
                    }
                    break;
				
                case 5:
                    System.out.print("Nhập số TK: ");
                    int soTKRut = sc.nextInt();
                    System.out.print("Nhập số tiền cần rút: ");
                    double soTienRut = sc.nextDouble();
                    Account accountRut = list.findAccount(soTKRut);
                    if (accountRut != null) {
			accountRut.rutTien(soTienRut);
                    } else {
                        System.out.println("Không tìm thấy tài khoản với số TK đã nhập!");
                    }
                    break;
                    
		case 6:
                    System.out.print("Nhập số TK nguồn: ");
                    int soTKNguon = sc.nextInt();
                    System.out.print("Nhập số TK đích: ");
		    int soTKDich = sc.nextInt();
		    System.out.print("Nhập số tiền cần chuyển: ");
		    double tienChuyen = sc.nextDouble();
		    Account accountNguon = list.findAccount(soTKNguon);
		    Account accountDich = list.findAccount(soTKDich);
		    if (accountNguon != null && accountDich != null) {
		        accountNguon.chuyenTien(accountDich, tienChuyen);
		    } else {
		        System.out.println("Không tìm thấy tài khoản với số TK đã nhập!");
		    }
		    break;            
            }
        }while (chon != 0);
    
        
    }   
}
