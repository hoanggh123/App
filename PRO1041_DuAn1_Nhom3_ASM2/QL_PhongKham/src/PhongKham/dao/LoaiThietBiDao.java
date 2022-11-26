/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.dao;

import PhongKham.dao.LoaiThietBiDao;
import PhongKham.entity.LoaiThietBiPK;
import PhongKham.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LoaiThietBiDao extends ClinicDao<LoaiThietBiPK, String>{

    @Override
    public void insert(LoaiThietBiPK model) {
         String sql = "INSERT INTO LOAITHIETBI (MaLoaiTB , SoLuong , TenLoaiThietBi ,MaNV) VALUES(?,?,?,?)";
        XJdbc.update(sql, 
                model.getMaLoaiTB(),
                model.getSoLuong(),              
                model.getTenLoaiThietBi(),
                model.getMaNV()
                );
    }

    @Override
    public void update(LoaiThietBiPK model) {
         String sql = "UPDATE LOAITHIETBI set SoLuong = ? , TenLoaiThietBi = ? , MaNV = ? WHERE MaLoaiTB = ?";
         XJdbc.update(sql,                                         
                model.getSoLuong(),              
                model.getTenLoaiThietBi(),
                model.getMaNV(),
                model.getMaLoaiTB()
                );
    }

    @Override
    public void delete(String MaLoaiTB) {
        String sql = "Delete FROM LOAITHIETBI WHERE MaLoaiTB = ?";
        XJdbc.update(sql, MaLoaiTB);
    }

    @Override
    public LoaiThietBiPK selectById(String MaLoaiTB) {
          String sql="SELECT * FROM LOAITHIETBI WHERE MaLoaiTB = ?";
        List<LoaiThietBiPK> list = this.selectBySql(sql, MaLoaiTB);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<LoaiThietBiPK> selectAll() {
           String sql="SELECT * FROM LOAITHIETBI";
        return this.selectBySql(sql);
    }

    @Override
    protected List<LoaiThietBiPK> selectBySql(String sql, Object... args) {
          List<LoaiThietBiPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    LoaiThietBiPK entity =new LoaiThietBiPK();
                    entity.setMaLoaiTB(rs.getString("MaLoaiTB"));
                    entity.setSoLuong(rs.getInt("SoLuong"));
                     entity.setTenLoaiThietBi(rs.getString("TenLoaiThietBi"));
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
        return list;
    }
    
}
