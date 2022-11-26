
package PhongKham.entity;

import java.util.Date;


public class LichKhamPK {
    private String MaLichKham;
    private Date LichHen;
    private String HoTen;
    private int Tuoi;
    private boolean GioiTinh;
    private String SDT;
    private String LyDoKham;
    private String LoaiHen;
    private String GhiChu;
    private String TinhTrang;
    private String MaNV;
    private String MaBN;

    public LichKhamPK() {
    }

    public LichKhamPK(String MaLichKham, Date LichHen, String HoTen, int Tuoi, boolean GioiTinh, String SDT, String LyDoKham, String LoaiHen, String GhiChu, String TinhTrang, String MaNV, String MaBN) {
        this.MaLichKham = MaLichKham;
        this.LichHen = LichHen;
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.LyDoKham = LyDoKham;
        this.LoaiHen = LoaiHen;
        this.GhiChu = GhiChu;
        this.TinhTrang = TinhTrang;
        this.MaNV = MaNV;
        this.MaBN = MaBN;
    }

    public String getMaLichKham() {
        return MaLichKham;
    }

    public void setMaLichKham(String MaLichKham) {
        this.MaLichKham = MaLichKham;
    }

    public Date getLichHen() {
        return LichHen;
    }

    public void setLichHen(Date LichHen) {
        this.LichHen = LichHen;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getLyDoKham() {
        return LyDoKham;
    }

    public void setLyDoKham(String LyDoKham) {
        this.LyDoKham = LyDoKham;
    }

    public String getLoaiHen() {
        return LoaiHen;
    }

    public void setLoaiHen(String LoaiHen) {
        this.LoaiHen = LoaiHen;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
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

   
   
}
