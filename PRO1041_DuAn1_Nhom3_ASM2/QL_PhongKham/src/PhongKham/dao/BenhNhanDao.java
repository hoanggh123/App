/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.dao;

import PhongKham.entity.BenhNhanPK;
import PhongKham.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BenhNhanDao extends ClinicDao<BenhNhanPK, String>{
    @Override
    public void insert(BenhNhanPK model) {
     String sql = "INSERT INTO BENHNHAN (MaBN , HoTenBN , GioiTinh , DiaChi,CCCD ,NgaySinh ,SDTBN ,BaoHiem , NgheNghiep , DanToc ,DauHieuBenh , NgayKham ,HinhAnhBN,SDT) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        XJdbc.update(sql, 
                model.getMaBN(),
                model.getHoTenBN(),
                model.getGioiTinh(),
                model.getDiaChi(),
                model.getCCCD(),
                model.getNgaySinh(),
                model.getSDTBN(),
                model.getBaoHiem(),
                model.getNgheNghiep(),
                model.getDanToc(),
                model.getDauHieuBenh(),
                model.getNgayKham(),
                model.getHinhAnhBN(),
                model.getSDT()
        );       
    }

    @Override
    public void update(BenhNhanPK model) {
          String sql = "Update BENHNHAN set HoTenBN = ? , GioiTinh = ? ,DiaChi = ? ,CCCD = ? ,NgaySinh = ? , SDTBN = ? ,  BaoHiem = ? , NgheNghiep = ? , DanToc = ? , DauHieuBenh = ? , NgayKham = ? , HinhAnhBN = ? ,SDT = ? WHERE MaBN = ?";
         XJdbc.update(sql,
                model.getHoTenBN(),
                model.getGioiTinh(),
                model.getDiaChi(),
                model.getCCCD(),
                model.getNgaySinh(),
                model.getSDTBN(),
                model.getBaoHiem(),
                model.getNgheNghiep(),
                model.getDanToc(),
                model.getDauHieuBenh(),
                model.getNgayKham(),
                model.getHinhAnhBN(),
                model.getSDT(),
                model.getMaBN()
         );      
    }

    @Override
    public void delete(String MaBN) {
            String sql = "Delete FROM BenhNhan WHERE MaBN = ?";
        XJdbc.update(sql, MaBN);
    }

    @Override
    public BenhNhanPK selectById(String MaBN) {
      String sql="SELECT * FROM BENHNHAN WHERE MaBN=?";
        List<BenhNhanPK> list = this.selectBySql(sql, MaBN);
        return list.size() > 0 ? list.get(0) : null;      
    }

    @Override
    public List<BenhNhanPK> selectAll() {
          String sql="SELECT * FROM BenhNhan";
        return this.selectBySql(sql);
    }

    @Override
    protected List<BenhNhanPK> selectBySql(String sql, Object... args) {
         List<BenhNhanPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    BenhNhanPK entity =new BenhNhanPK();
                    entity.setMaBN(rs.getString("MaBN"));
                    entity.setHoTenBN(rs.getString("HoTenBN"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setCCCD(rs.getString("CCCD"));
                    entity.setNgaySinh(rs.getDate("NgaySinh"));
                    entity.setSDTBN(rs.getString("SDTBN"));                
                    entity.setBaoHiem(rs.getString("BaoHiem"));
                    entity.setNgheNghiep(rs.getString("NgheNghiep"));
                    entity.setDanToc(rs.getString("DanToc"));
                    entity.setDauHieuBenh(rs.getString("DauHieuBenh"));
                    entity.setNgayKham(rs.getDate("NgayKham"));
                    entity.setHinhAnhBN(rs.getString("HinhAnhBN"));
                    entity.setSDT(rs.getString("SDT"));
                    list.add(entity);
                    
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

      public List<BenhNhanPK> selectByKeyword(String keyword){
        String sql="SELECT * FROM BENHNHAN WHERE HoTenBN lIKE ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }
}
