/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.dao;

import PhongKham.entity.PhongPK;
import PhongKham.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhongDao extends ClinicDao<PhongPK, String>{

    @Override
    public void insert(PhongPK model) {
        String sql = "INSERT INTO PHONG (MaPhong ,TenPhong ,GiaPhong ,SoGiuong ,LoaiPhong) VALUES(?,?,?,?,?)";
        XJdbc.update(sql, 
                model.getMaPhong(),
                model.getTenPhong(),
                model.getGiaPhong(),
                model.getSoGiuong(),
                model.getLoaiPhong()
                );
    }

    @Override
    public void update(PhongPK model) {
          String sql = "UPDATE PHONG set TenPhong = ?, GiaPhong =?  ,SoGiuong = ? , LoaiPhong = ? WHERE MaPhong = ?";
         XJdbc.update(sql,                                         
                model.getTenPhong(),
                model.getGiaPhong(),
                model.getSoGiuong(),
                model.getLoaiPhong(),
                model.getMaPhong()
                );
    }

    @Override
    public void delete(String MaPhong) {
       String sql = "Delete FROM Phong WHERE MaPhong = ?";
        XJdbc.update(sql, MaPhong);
    }

    @Override
    public PhongPK selectById(String MaPhong) {
         String sql="SELECT * FROM Phong WHERE MaPhong=?";
        List<PhongPK> list = this.selectBySql(sql, MaPhong);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<PhongPK> selectAll() {
          String sql="SELECT * FROM PHONG";
        return this.selectBySql(sql);
    }

    @Override
    protected List<PhongPK> selectBySql(String sql, Object... args) {
           List<PhongPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    PhongPK entity =new PhongPK();
                    entity.setMaPhong(rs.getString("MaPhong"));
                    entity.setTenPhong(rs.getString("TenPhong"));
                     entity.setGiaPhong(rs.getFloat("GiaPhong"));
                    entity.setSoGiuong(rs.getInt("SoGiuong"));
                    entity.setLoaiPhong(rs.getString("LoaiPhong"));            
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
    
}
