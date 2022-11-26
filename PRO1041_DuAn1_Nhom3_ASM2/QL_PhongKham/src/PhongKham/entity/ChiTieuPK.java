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
public class ChiTieuPK {
        private String MaCT;
        private float NguonTien;
        private float SoTienChiRa;
        private Date Ngay;
        private String MaNV;
        private String MaTB;

    public ChiTieuPK() {
    }

    public ChiTieuPK(String MaCT, float NguonTien, float SoTienChiRa, Date Ngay, String MaNV, String MaTB) {
        this.MaCT = MaCT;
        this.NguonTien = NguonTien;
        this.SoTienChiRa = SoTienChiRa;
        this.Ngay = Ngay;
        this.MaNV = MaNV;
        this.MaTB = MaTB;
    }

    public String getMaCT() {
        return MaCT;
    }

    public void setMaCT(String MaCT) {
        this.MaCT = MaCT;
    }

    public float getNguonTien() {
        return NguonTien;
    }

    public void setNguonTien(float NguonTien) {
        this.NguonTien = NguonTien;
    }

    public float getSoTienChiRa() {
        return SoTienChiRa;
    }

    public void setSoTienChiRa(float SoTienChiRa) {
        this.SoTienChiRa = SoTienChiRa;
    }

    public Date getNgay() {
        return Ngay;
    }

    public void setNgay(Date Ngay) {
        this.Ngay = Ngay;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaTB() {
        return MaTB;
    }

    public void setMaTB(String MaTB) {
        this.MaTB = MaTB;
    }

   
        
}
