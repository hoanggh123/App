
package PhongKham.entity;

import java.util.Date;


public class BenhAnPK {
    private String MaBA;
    private Date NgayKham;
    private String MaNV;
    private String MaBN;
    private String MaVP;
    private String MaLichKham;
    private String MaDT;
    private String MaPhong;
    private String DauHieuBenh;
    private String XetNghiem;
    private String ChuanDoan;

    public BenhAnPK() {
    }

    public BenhAnPK(String MaBA, Date NgayKham, String MaNV, String MaBN, String MaVP, String MaLichKham, String MaDT, String MaPhong, String DauHieuBenh, String XetNghiem, String ChuanDoan) {
        this.MaBA = MaBA;
        this.NgayKham = NgayKham;
        this.MaNV = MaNV;
        this.MaBN = MaBN;
        this.MaVP = MaVP;
        this.MaLichKham = MaLichKham;
        this.MaDT = MaDT;
        this.MaPhong = MaPhong;
        this.DauHieuBenh = DauHieuBenh;
        this.XetNghiem = XetNghiem;
        this.ChuanDoan = ChuanDoan;
    }

    public String getMaBA() {
        return MaBA;
    }

    public void setMaBA(String MaBA) {
        this.MaBA = MaBA;
    }

    public Date getNgayKham() {
        return NgayKham;
    }

    public void setNgayKham(Date NgayKham) {
        this.NgayKham = NgayKham;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaBN() {
        return MaBN;
    }

    public void setMaBN(String MaBN) {
        this.MaBN = MaBN;
    }

    public String getMaVP() {
        return MaVP;
    }

    public void setMaVP(String MaVP) {
        this.MaVP = MaVP;
    }

    public String getMaLichKham() {
        return MaLichKham;
    }

    public void setMaLichKham(String MaLichKham) {
        this.MaLichKham = MaLichKham;
    }

    public String getMaDT() {
        return MaDT;
    }

    public void setMaDT(String MaDT) {
        this.MaDT = MaDT;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getDauHieuBenh() {
        return DauHieuBenh;
    }

    public void setDauHieuBenh(String DauHieuBenh) {
        this.DauHieuBenh = DauHieuBenh;
    }

    public String getXetNghiem() {
        return XetNghiem;
    }

    public void setXetNghiem(String XetNghiem) {
        this.XetNghiem = XetNghiem;
    }

    public String getChuanDoan() {
        return ChuanDoan;
    }

    public void setChuanDoan(String ChuanDoan) {
        this.ChuanDoan = ChuanDoan;
    }

    
    
}
