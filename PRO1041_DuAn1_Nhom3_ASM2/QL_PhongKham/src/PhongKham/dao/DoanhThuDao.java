/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.dao;

import PhongKham.entity.DoanhThuPK;
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
public class DoanhThuDao extends ClinicDao<DoanhThuPK, String>{

    
    @Override
    public void insert(DoanhThuPK model) {
           String sql = "INSERT INTO DOANHTHU (MaDT,Ngay,TienVienPhi) VALUES(?,?,?)";
        XJdbc.update(sql,
                model.getMaDT(),
                model.getNgay(),
                model.getTienVienPhi());
    }

    @Override
    public void update(DoanhThuPK model) {
        String sql = "Update DOANHTHU set Ngay = ? , TienVienPhi = ?  WHERE MaDT = ?";
         XJdbc.update(sql,         
                model.getNgay(),
                model.getTienVienPhi(),
                model.getMaDT());
    }

    @Override
    public void delete(String MaDT) {
       String sql = "Delete FROM DOANHTHU WHERE MaDT = ?";
        XJdbc.update(sql, MaDT);
    }

    @Override
    public DoanhThuPK selectById(String MaDT) {
        String sql="SELECT * FROM DOANHTHU WHERE MaDT=?";
        List<DoanhThuPK> list = this.selectBySql(sql, MaDT);
        return list.size() > 0 ? list.get(0) : null; 
    }

    @Override
    public List<DoanhThuPK> selectAll() {
          String sql="SELECT * FROM DOANHTHU";
        return this.selectBySql(sql);
    }

    @Override
    protected List<DoanhThuPK> selectBySql(String sql, Object... args) {
        List<DoanhThuPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    DoanhThuPK entity =new DoanhThuPK();
                    entity.setMaDT(rs.getString("MaDT"));
                    entity.setNgay(rs.getDate("Ngay"));
                    entity.setTienVienPhi(rs.getFloat("TienVienPhi"));
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
