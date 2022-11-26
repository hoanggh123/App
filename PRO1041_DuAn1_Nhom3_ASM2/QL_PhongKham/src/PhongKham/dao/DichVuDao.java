/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhongKham.dao;
import PhongKham.entity.ChiTieuPK;
import PhongKham.entity.DichVuPK;
import PhongKham.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Nghia
 */
public class DichVuDao extends ClinicDao<DichVuPK, String>{

 @Override
    public void insert(DichVuPK model) {
      String sql = "INSERT INTO DICHVU (MaDV ,TenDV, PhiDV, MaNV, TrangThaiDV) VALUES(?,?,?,?,?)";
        XJdbc.update(sql,
                model.getMaDV(),
                model.getTenDV(),
                model.getPhiDV(),            
                model.getMaNV(),
                model.getTrangThaiDV());
    }

    @Override
    public void update(DichVuPK model) {
        String sql = "Update DICHVU set TenDV=?,PhiDV=?, MaNV=? , TrangThaiDV= ? WHERE MaDV = ?";
         XJdbc.update(sql,
                model.getTenDV(),
                model.getPhiDV(),          
                model.getMaNV(),
                model.getTrangThaiDV(),
                model.getMaDV()
         ); 
    }

    @Override
    public void delete(String MaDV) {
          String sql = "Delete FROM DICHVU WHERE MaDV = ?";
        XJdbc.update(sql, MaDV);
    }

    @Override
    public DichVuPK selectById(String MaDV) {
         String sql="SELECT * FROM DICHVU WHERE MaDV=?";
        List<DichVuPK> list = this.selectBySql(sql, MaDV);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<DichVuPK> selectAll() {
        String sql="SELECT * FROM DICHVU";
        return this.selectBySql(sql);
    }

    @Override
    protected List<DichVuPK> selectBySql(String sql, Object... args) {
        List<DichVuPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    DichVuPK entity =new DichVuPK();
                    entity.setMaDV(rs.getString("MaDV"));
                    entity.setTenDV(rs.getString("TenDV"));
                    entity.setPhiDV(rs.getFloat("PhiDV"));                 
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setTrangThaiDV(rs.getString("TrangThaiDV"));
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
