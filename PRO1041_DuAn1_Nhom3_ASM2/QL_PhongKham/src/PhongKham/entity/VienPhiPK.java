
package PhongKham.entity;


public class VienPhiPK {
    private String MaVP;
    private float GiaTien;
    private String MaDT;
    private String MaNV;
    private String MaBN;

    public VienPhiPK() {
    }

    public VienPhiPK(String MaVP, float GiaTien, String MaDT, String MaNV, String MaBN) {
        this.MaVP = MaVP;
        this.GiaTien = GiaTien;
        this.MaDT = MaDT;
        this.MaNV = MaNV;
        this.MaBN = MaBN;
    }

    public String getMaVP() {
        return MaVP;
    }

    public void setMaVP(String MaVP) {
        this.MaVP = MaVP;
    }

    public float getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(float GiaTien) {
        this.GiaTien = GiaTien;
    }

    public String getMaDT() {
        return MaDT;
    }

    public void setMaDT(String MaDT) {
        this.MaDT = MaDT;
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
