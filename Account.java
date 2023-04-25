
package Lap2b1;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    public long soTK;
    public String tenTK;
    public double soTien;
    public String TrangThai;
    public double laiSuat;

        
    public Account () {
        this.soTK = 999999;
        this.tenTK = "Chưa xác định";
        this.soTien = soTien;
    }
    
    public Account(long soTK, String tenTK, double soTien) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTien = soTien;
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        if(soTK > 0 && soTK != 999999){
            this.soTK = soTK;
        }                
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        if(!tenTK.isEmpty()){
            this.tenTK = tenTK;
        }
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        if(soTien >= 50){
            this.soTien = soTien;
        }
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }
    

    @Override
    public String toString() {
        Locale local = new Locale("vi", "vn");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        return "Account{" + "soTK=" + soTK + ", tenTK=" + tenTK + ", soTien=" + soTien + ", TrangThai=" + TrangThai + '}';
    }
    
    public double napTien(double tienNap){
        if(tienNap > 0){
            double tienSauNap = soTien + tienNap;
        }
        return soTien;
    }
    
    public double rutTien(double tienRut){
        if(tienRut < soTien){
            double tienSauRut = soTien - tienRut;
        }
        return soTien;
    }
    
    public void chuyenTien(double tienChuyen){
        if(tienChuyen < soTien){
            double chuyenKhoan = soTien - tienChuyen;
        }
        
    }
    
    public double DaoHan(double soDu){
        soDu = soTien;
        soDu = soDu + soDu*laiSuat; 
        return soTien;
    }

    
    
}
