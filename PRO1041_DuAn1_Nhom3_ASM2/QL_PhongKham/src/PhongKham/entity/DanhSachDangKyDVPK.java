/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhongKham.entity;

import java.util.Date;

/**
 *
 * @author Nghia
 */
public class DanhSachDangKyDVPK {
    private int ID;
    private Date NgayDK;
    private String TrangThai;
    private String MaDV;
    private String MaBN;

    public DanhSachDangKyDVPK() {
    }

    public DanhSachDangKyDVPK(int ID, Date NgayDK, String TrangThai, String MaDV, String MaBN) {
        this.ID = ID;
        this.NgayDK = NgayDK;
        this.TrangThai = TrangThai;
        this.MaDV = MaDV;
        this.MaBN = MaBN;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getNgayDK() {
        return NgayDK;
    }

    public void setNgayDK(Date NgayDK) {
        this.NgayDK = NgayDK;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getMaBN() {
        return MaBN;
    }

    public void setMaBN(String MaBN) {
        this.MaBN = MaBN;
    }

    
    
    
}
