/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class DoanhThuPK {
     private String MaDT;
    private Date Ngay;
    private float TienVienPhi;

    public DoanhThuPK() {
    }

    public DoanhThuPK(String MaDT, Date Ngay, float TienVienPhi) {
        this.MaDT = MaDT;
        this.Ngay = Ngay;
        this.TienVienPhi = TienVienPhi;
    }

    public String getMaDT() {
        return MaDT;
    }

    public void setMaDT(String MaDT) {
        this.MaDT = MaDT;
    }

    public Date getNgay() {
        return Ngay;
    }

    public void setNgay(Date Ngay) {
        this.Ngay = Ngay;
    }

    public float getTienVienPhi() {
        return TienVienPhi;
    }

    public void setTienVienPhi(float TienVienPhi) {
        this.TienVienPhi = TienVienPhi;
    }

    
    
}
