
package PhongKham.entity;


public class PhongPK {
    private String MaPhong;
    private String TenPhong;
    private float GiaPhong;
    private int SoGiuong;
    private String LoaiPhong;
    

    public PhongPK() {
    }

    public PhongPK(String MaPhong, String TenPhong, float GiaPhong, int SoGiuong, String LoaiPhong) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.GiaPhong = GiaPhong;
        this.SoGiuong = SoGiuong;
        this.LoaiPhong = LoaiPhong;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public float getGiaPhong() {
        return GiaPhong;
    }

    public void setGiaPhong(float GiaPhong) {
        this.GiaPhong = GiaPhong;
    }

    public int getSoGiuong() {
        return SoGiuong;
    }

    public void setSoGiuong(int SoGiuong) {
        this.SoGiuong = SoGiuong;
    }

    public String getLoaiPhong() {
        return LoaiPhong;
    }

    public void setLoaiPhong(String LoaiPhong) {
        this.LoaiPhong = LoaiPhong;
    }

   
}
