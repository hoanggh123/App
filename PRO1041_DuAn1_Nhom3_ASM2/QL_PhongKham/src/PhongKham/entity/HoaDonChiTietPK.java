
package PhongKham.entity;


public class HoaDonChiTietPK {
    private String MaHDCT;
    private int SoLuong;
    private String LieuDung;
    private String MaThuoc;
    private String MaDT;

    public HoaDonChiTietPK() {
    }

    public HoaDonChiTietPK(String MaHDCT, int SoLuong, String LieuDung, String MaThuoc, String MaDT) {
        this.MaHDCT = MaHDCT;
        this.SoLuong = SoLuong;
        this.LieuDung = LieuDung;
        this.MaThuoc = MaThuoc;
        this.MaDT = MaDT;
    }

    public String getMaHDCT() {
        return MaHDCT;
    }

    public void setMaHDCT(String MaHDCT) {
        this.MaHDCT = MaHDCT;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getLieuDung() {
        return LieuDung;
    }

    public void setLieuDung(String LieuDung) {
        this.LieuDung = LieuDung;
    }

    public String getMaThuoc() {
        return MaThuoc;
    }

    public void setMaThuoc(String MaThuoc) {
        this.MaThuoc = MaThuoc;
    }

    public String getMaDT() {
        return MaDT;
    }

    public void setMaDT(String MaDT) {
        this.MaDT = MaDT;
    }
    
    
}
