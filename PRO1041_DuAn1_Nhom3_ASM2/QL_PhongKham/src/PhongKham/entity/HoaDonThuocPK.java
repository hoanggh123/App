
package PhongKham.entity;

import java.util.Date;


public class HoaDonThuocPK {
    private String MaDT ;
    private String ChuanDoan;
    private Date NgayXuat;
    private String MaBN;
    private String MaNV;
    

    public HoaDonThuocPK() {
    }

    public HoaDonThuocPK(String MaDT, String ChuanDoan, Date NgayXuat, String MaBN, String MaNV) {
        this.MaDT = MaDT;
        this.ChuanDoan = ChuanDoan;
        this.NgayXuat = NgayXuat;
        this.MaBN = MaBN;
        this.MaNV = MaNV;
    }

    public String getMaDT() {
        return MaDT;
    }

    public void setMaDT(String MaDT) {
        this.MaDT = MaDT;
    }

    public String getChuanDoan() {
        return ChuanDoan;
    }

    public void setChuanDoan(String ChuanDoan) {
        this.ChuanDoan = ChuanDoan;
    }

    public Date getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(Date NgayXuat) {
        this.NgayXuat = NgayXuat;
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
