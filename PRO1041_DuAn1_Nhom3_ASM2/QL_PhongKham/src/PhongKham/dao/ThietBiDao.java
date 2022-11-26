/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.dao;

import PhongKham.entity.ThietBiPK;
import PhongKham.utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ThietBiDao extends ClinicDao<ThietBiPK, String>{

    @Override
    public void insert(ThietBiPK model) {
        String sql = "INSERT INTO THIETBI (MaTB , TenTB , NgayNhap ,GiaTB  , HSD  , MaPhong,MaNCC,MaLoaiTB) VALUES(?,?,?,?,?,?,?,?)";
        XJdbc.update(sql, 
                model.getMaTB(),
                model.getTenTB(),
                model.getNgayNhap(),
                model.getGiaTB(),
                model.getHSD(),    
                model.getMaPhong(),
                model.getMaNCC(),                        
                model.getMaLoaiTB()
                );
    }

    @Override
    public void update(ThietBiPK model) {
        String sql = "UPDATE THIETBI set TenTB = ? , NgayNhap = ? , GiaTB = ? , HSD = ? , MaPhong = ? ,MaNCC = ? , MaLoaiTB = ? WHERE MaTB = ?";
         XJdbc.update(sql,               
                model.getTenTB(),
                model.getNgayNhap(),
                model.getGiaTB(),
                model.getHSD(),           
                model.getMaPhong(),
                model.getMaNCC(),                        
                model.getMaLoaiTB(),
                model.getMaTB() 
                );
    }

    @Override
    public void delete(String MaTB) {
         String sql = "Delete FROM THIETBI WHERE MaTB = ?";
        XJdbc.update(sql, MaTB);
    }

    @Override
    public ThietBiPK selectById(String matb) {
       String sql="SELECT * FROM THIETBI WHERE MaTB=?";
        List<ThietBiPK> list = this.selectBySql(sql, matb);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<ThietBiPK> selectAll() {
          String sql="SELECT * FROM THIETBI";
        return this.selectBySql(sql);
    }

    @Override
    protected List<ThietBiPK> selectBySql(String sql, Object... args) {
           List<ThietBiPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    ThietBiPK entity =new ThietBiPK();
                    entity.setMaTB(rs.getString("MaTB"));
                    entity.setTenTB(rs.getString("TenTB"));
                    entity.setNgayNhap(rs.getDate("NgayNhap"));
                    entity.setGiaTB(rs.getFloat("GiaTB"));
                    entity.setHSD(rs.getDate("HSD"));                 
                    entity.setMaPhong(rs.getString("MaPhong"));
                    entity.setMaNCC(rs.getString("MaNCC"));
                    entity.setMaLoaiTB(rs.getString("MaLoaiTB"));                 
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
    
     public List<ThietBiPK> selectByKeyword(String keyword){
        String sql="select * from ThietBi where TenTB LIKE ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }
     
     
     public List<Integer> selectMonth() {
        String sql="SELECT DISTINCT Month(NgayNhap) and YEAR( NgayNhap) Month FROM ThietBi ORDER BY Month DESC";
        List<Integer> list=new ArrayList<>();
        try {
           ResultSet rs = XJdbc.query(sql);
           while(rs.next()){
                 list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
