/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhongKham.entity;

import PhongKham.utils.XDate;
import java.util.Date;

/**
 *
 * @author Nghia
 */
public class PhieuKhamPK {
    private String MaPK;
    private Date NgayKham;
    private String LyDoKham;
    private String GioKham;
    private String MaPhong;
    private String MaBN;
    private String MaNV;

    public PhieuKhamPK() {
    }

    public PhieuKhamPK(String MaPK, Date NgayKham, String LyDoKham, String GioKham, String MaPhong, String MaBN, String MaNV) {
        this.MaPK = MaPK;
        this.NgayKham = NgayKham;
        this.LyDoKham = LyDoKham;
        this.GioKham = GioKham;
        this.MaPhong = MaPhong;
        this.MaBN = MaBN;
        this.MaNV = MaNV;
    }



    public String getMaPK() {
        return MaPK;
    }

    public void setMaPK(String MaPK) {
        this.MaPK = MaPK;
    }

    public Date getNgayKham() {
        return NgayKham;
    }

    public void setNgayKham(Date NgayKham) {
        this.NgayKham = NgayKham;
    }

    public String getLyDoKham() {
        return LyDoKham;
    }

    public void setLyDoKham(String LyDoKham) {
        this.LyDoKham = LyDoKham;
    }

    public String getGioKham() {
        return GioKham;
    }

    public void setGioKham(String GioKham) {
        this.GioKham = GioKham;
    }

  

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getMaBN() {
        return MaBN;
    }

    public void setMaBN(String MaBN) {
        this.MaBN = MaBN;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    
}
