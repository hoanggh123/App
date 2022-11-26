/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhongKham.entity;

/**
 *
 * @author Nghia
 */
public class LoaiThietBiPK {
    private String MaLoaiTB;   
    private int SoLuong;
    private String TenLoaiThietBi;
    private String MaNV;

    public LoaiThietBiPK() {
    }

    public LoaiThietBiPK(String MaLoaiTB, int SoLuong, String TenLoaiThietBi, String MaNV) {
        this.MaLoaiTB = MaLoaiTB;
        this.SoLuong = SoLuong;
        this.TenLoaiThietBi = TenLoaiThietBi;
        this.MaNV = MaNV;
    }

    public String getMaLoaiTB() {
        return MaLoaiTB;
    }

    public void setMaLoaiTB(String MaLoaiTB) {
        this.MaLoaiTB = MaLoaiTB;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getTenLoaiThietBi() {
        return TenLoaiThietBi;
    }

    public void setTenLoaiThietBi(String TenLoaiThietBi) {
        this.TenLoaiThietBi = TenLoaiThietBi;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    
    
}
