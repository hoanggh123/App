
package PhongKham.entity;

import java.util.Date;


public class ThietBiPK {
    private String MaTB;
    private String TenTB;
    private Date NgayNhap;
    private float GiaTB;
    private Date HSD;
    private String MaPhong;
    private String MaNCC;
    private String MaLoaiTB; 

    public ThietBiPK() {
    }

    public ThietBiPK(String MaTB, String TenTB, Date NgayNhap, float GiaTB, Date HSD, String MaPhong, String MaNCC, String MaLoaiTB) {
        this.MaTB = MaTB;
        this.TenTB = TenTB;
        this.NgayNhap = NgayNhap;
        this.GiaTB = GiaTB;
        this.HSD = HSD;
        this.MaPhong = MaPhong;
        this.MaNCC = MaNCC;
        this.MaLoaiTB = MaLoaiTB;
    }

    public String getMaTB() {
        return MaTB;
    }

    public void setMaTB(String MaTB) {
        this.MaTB = MaTB;
    }

    public String getTenTB() {
        return TenTB;
    }

    public void setTenTB(String TenTB) {
        this.TenTB = TenTB;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public float getGiaTB() {
        return GiaTB;
    }

    public void setGiaTB(float GiaTB) {
        this.GiaTB = GiaTB;
    }

    public Date getHSD() {
        return HSD;
    }

    public void setHSD(Date HSD) {
        this.HSD = HSD;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getMaLoaiTB() {
        return MaLoaiTB;
    }

    public void setMaLoaiTB(String MaLoaiTB) {
        this.MaLoaiTB = MaLoaiTB;
    }

    

  
}
