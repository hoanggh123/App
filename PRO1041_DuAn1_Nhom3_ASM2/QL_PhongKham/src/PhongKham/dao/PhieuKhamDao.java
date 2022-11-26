/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.dao;

import PhongKham.entity.PhieuKhamPK;
import PhongKham.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhieuKhamDao extends ClinicDao<PhieuKhamPK, String>{
       @Override
    public void insert(PhieuKhamPK model) {
     String sql = "INSERT INTO PhieuKham (MaPK , NgayKham , LyDoKham ,GioKham , MaPhong ,MaBN ,MaNV) VALUES(?,?,?,?,?,?,?)";
        XJdbc.update(sql, 
                model.getMaPK(),
                model.getNgayKham(),
                model.getLyDoKham(),
                model.getGioKham(),
                model.getMaPhong(),
                model.getMaNV(),                        
                model.getMaBN());  
    }

    @Override
    public void update(PhieuKhamPK model) {
        String sql = "Update PhieuKham set NgayKham = ? , LyDoKham = ? , GioKham= ? ,MaPhong = ? , MaBN = ? , MaNV = ? WHERE MaPK = ?";
         XJdbc.update(sql,
                model.getNgayKham(),
                model.getLyDoKham(),
                model.getGioKham(),
                model.getMaPhong(),
                model.getMaBN(),
                model.getMaNV(),                        
                model.getMaPK());
    }

    @Override
    public void delete(String MaPK) {
        String sql = "Delete FROM PhieuKham WHERE MaPK = ?";
        XJdbc.update(sql, MaPK );
    }

    @Override
    public PhieuKhamPK selectById(String MaPK)  {
         String sql="SELECT * FROM PhieuKham WHERE MaPK=?";
        List<PhieuKhamPK> list = this.selectBySql(sql,MaPK );
        return list.size() > 0 ? list.get(0) : null;  }

    @Override
    public List<PhieuKhamPK> selectAll() {
             String sql="SELECT * FROM PhieuKham";
        return this.selectBySql(sql);
    }

    @Override
    protected List<PhieuKhamPK> selectBySql(String sql, Object... args) {
              List<PhieuKhamPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    PhieuKhamPK entity =new PhieuKhamPK();
                    entity.setMaPK(rs.getString("MaPK"));
                    entity.setNgayKham(rs.getDate("NgayKham"));
                    entity.setLyDoKham(rs.getString("LyDoKham"));
                    entity.setGioKham(rs.getString("GioKham"));
                    entity.setMaPhong(rs.getString("MaPhong")); 
                    entity.setMaBN(rs.getString("MaBN"));
                    entity.setMaNV(rs.getString("MaNV"));
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
        return list; }
}
