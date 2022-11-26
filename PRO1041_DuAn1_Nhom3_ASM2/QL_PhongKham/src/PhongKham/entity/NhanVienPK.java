    
package PhongKham.entity;

import PhongKham.utils.XDate;
import java.util.Date;


public class NhanVienPK {
    private String MaNV ;
    private String HoTenNV;
    private boolean GioiTinh;
    private Date NgaySinh ;
    private String DiaChi;
    private String Email;
    private String CMND;
    private String ChuyenNganh ;
    private String ChucVu;
    private String TrinhDo;
    private String HinhAnhNV;
    private Date NgayVaoLam  ;
    private String MaKhoa ; 
    private String SDT;

    
    public NhanVienPK() {
    }

    public NhanVienPK(String MaNV, String HoTenNV, boolean GioiTinh, String DiaChi, String Email, String CMND, String ChuyenNganh, String ChucVu, String TrinhDo, String HinhAnhNV, String MaKhoa, String SDT) {
        this.MaNV = MaNV;
        this.HoTenNV = HoTenNV;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.CMND = CMND;
        this.ChuyenNganh = ChuyenNganh;
        this.ChucVu = ChucVu;
        this.TrinhDo = TrinhDo;
        this.HinhAnhNV = HinhAnhNV;
        this.MaKhoa = MaKhoa;
        this.SDT = SDT;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTenNV() {
        return HoTenNV;
    }

    public void setHoTenNV(String HoTenNV) {
        this.HoTenNV = HoTenNV;
    }

    public boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getChuyenNganh() {
        return ChuyenNganh;
    }

    public void setChuyenNganh(String ChuyenNganh) {
        this.ChuyenNganh = ChuyenNganh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }

    public String getHinhAnhNV() {
        return HinhAnhNV;
    }

    public void setHinhAnhNV(String HinhAnhNV) {
        this.HinhAnhNV = HinhAnhNV;
    }

    public Date getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(Date NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

 
   
    
}
