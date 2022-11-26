
package PhongKham.entity;

import java.util.Date;


public class BenhNhanPK {
    private String MaBN;
    private String HoTenBN;
    private boolean GioiTinh;
    private String DiaChi;
    private String CCCD;
    private Date NgaySinh;
    private String SDTBN;
    private String BaoHiem;
    private String NgheNghiep;
    private String DanToc;
    private String DauHieuBenh;
    private Date NgayKham;
    private String HinhAnhBN;
    private String SDT;

    public BenhNhanPK() {
    }

    public BenhNhanPK(String MaBN, String HoTenBN, boolean GioiTinh, String DiaChi, String CCCD, Date NgaySinh, String SDTBN, String BaoHiem, String NgheNghiep, String DanToc, String DauHieuBenh, Date NgayKham, String HinhAnhBN, String SDT) {
        this.MaBN = MaBN;
        this.HoTenBN = HoTenBN;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.CCCD = CCCD;
        this.NgaySinh = NgaySinh;
        this.SDTBN = SDTBN;
        this.BaoHiem = BaoHiem;
        this.NgheNghiep = NgheNghiep;
        this.DanToc = DanToc;
        this.DauHieuBenh = DauHieuBenh;
        this.NgayKham = NgayKham;
        this.HinhAnhBN = HinhAnhBN;
        this.SDT = SDT;
    }

    public String getMaBN() {
        return MaBN;
    }

    public void setMaBN(String MaBN) {
        this.MaBN = MaBN;
    }

    public String getHoTenBN() {
        return HoTenBN;
    }

    public void setHoTenBN(String HoTenBN) {
        this.HoTenBN = HoTenBN;
    }

    public boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSDTBN() {
        return SDTBN;
    }

    public void setSDTBN(String SDTBN) {
        this.SDTBN = SDTBN;
    }

    public String getBaoHiem() {
        return BaoHiem;
    }

    public void setBaoHiem(String BaoHiem) {
        this.BaoHiem = BaoHiem;
    }

    public String getNgheNghiep() {
        return NgheNghiep;
    }

    public void setNgheNghiep(String NgheNghiep) {
        this.NgheNghiep = NgheNghiep;
    }

    public String getDanToc() {
        return DanToc;
    }

    public void setDanToc(String DanToc) {
        this.DanToc = DanToc;
    }

    public String getDauHieuBenh() {
        return DauHieuBenh;
    }

    public void setDauHieuBenh(String DauHieuBenh) {
        this.DauHieuBenh = DauHieuBenh;
    }

    public Date getNgayKham() {
        return NgayKham;
    }

    public void setNgayKham(Date NgayKham) {
        this.NgayKham = NgayKham;
    }

    public String getHinhAnhBN() {
        return HinhAnhBN;
    }

    public void setHinhAnhBN(String HinhAnhBN) {
        this.HinhAnhBN = HinhAnhBN;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    
    
    
}
