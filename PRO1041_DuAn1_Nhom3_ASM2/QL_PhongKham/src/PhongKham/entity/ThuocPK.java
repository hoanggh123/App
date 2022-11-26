/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class ThuocPK {
    private String MaThuoc;
    private String TenThuoc;
    private String CachDung;
    private String LoaiThuoc;
    private int SoLuong;
    private String DonVi;
    private float DonGia;
    private Date NgayNhap;
    private Date NgaySX;
    private Date HSD;
    private String MaNV;

    public ThuocPK() {
    }

    public ThuocPK(String MaThuoc, String TenThuoc, String CachDung, String LoaiThuoc, int SoLuong, String DonVi, float DonGia, Date NgayNhap, Date NgaySX, Date HSD, String MaNV) {
        this.MaThuoc = MaThuoc;
        this.TenThuoc = TenThuoc;
        this.CachDung = CachDung;
        this.LoaiThuoc = LoaiThuoc;
        this.SoLuong = SoLuong;
        this.DonVi = DonVi;
        this.DonGia = DonGia;
        this.NgayNhap = NgayNhap;
        this.NgaySX = NgaySX;
        this.HSD = HSD;
        this.MaNV = MaNV;
    }

    public String getMaThuoc() {
        return MaThuoc;
    }

    public void setMaThuoc(String MaThuoc) {
        this.MaThuoc = MaThuoc;
    }

    public String getTenThuoc() {
        return TenThuoc;
    }

    public void setTenThuoc(String TenThuoc) {
        this.TenThuoc = TenThuoc;
    }

    public String getCachDung() {
        return CachDung;
    }

    public void setCachDung(String CachDung) {
        this.CachDung = CachDung;
    }

    public String getLoaiThuoc() {
        return LoaiThuoc;
    }

    public void setLoaiThuoc(String LoaiThuoc) {
        this.LoaiThuoc = LoaiThuoc;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public Date getNgaySX() {
        return NgaySX;
    }

    public void setNgaySX(Date NgaySX) {
        this.NgaySX = NgaySX;
    }

    public Date getHSD() {
        return HSD;
    }

    public void setHSD(Date HSD) {
        this.HSD = HSD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    

   
    
}
