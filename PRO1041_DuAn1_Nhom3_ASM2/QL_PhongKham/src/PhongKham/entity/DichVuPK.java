/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.entity;

/**
 *
 * @author Admin
 */
public class DichVuPK {
    private String MaDV;
    private String TenDV;
    private float PhiDV;
    private String MaNV;
    private String TrangThaiDV;
    

    public DichVuPK() {
    }

    public DichVuPK(String MaDV, String TenDV, float PhiDV, String MaNV, String TrangThaiDV) {
        this.MaDV = MaDV;
        this.TenDV = TenDV;
        this.PhiDV = PhiDV;
        this.MaNV = MaNV;
        this.TrangThaiDV = TrangThaiDV;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public float getPhiDV() {
        return PhiDV;
    }

    public void setPhiDV(float PhiDV) {
        this.PhiDV = PhiDV;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTrangThaiDV() {
        return TrangThaiDV;
    }

    public void setTrangThaiDV(String TrangThaiDV) {
        this.TrangThaiDV = TrangThaiDV;
    }

    
}
