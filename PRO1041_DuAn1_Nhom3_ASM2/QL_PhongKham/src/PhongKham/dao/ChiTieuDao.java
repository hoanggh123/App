/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.dao;


import PhongKham.entity.ChiTieuPK;
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
public class ChiTieuDao extends ClinicDao<ChiTieuPK, String>{
	
    @Override
    public void insert(ChiTieuPK model) {
         String sql = "INSERT INTO ChiTieu (MaCT ,NguonTien , SoTienChiRa, Ngay, MaNV,MaTB) VALUES(?,?,?,?,?,?)";
        XJdbc.update(sql,
                model.getMaCT(),
                model.getNguonTien(),
                model.getSoTienChiRa(),
                model.getNgay(),
                model.getMaNV(),
                model.getMaTB());
    }

    @Override
    public void update(ChiTieuPK model) {
        String sql = "Update CHITIEU set NguonTien = ? , SoTienChiRa=?, Ngay=?, MaNV=?,MaTB=? WHERE MaCT = ?";
         XJdbc.update(sql,  
                model.getNguonTien(),
                model.getSoTienChiRa(),
                model.getNgay(),
                model.getMaNV(),
                model.getMaTB(),
                model.getMaCT()); 
    }

    @Override
    public void delete(String MaCT) {
             String sql = "Delete FROM CHITIEU WHERE MaCT = ?";
        XJdbc.update(sql, MaCT);
    }

    @Override
    public ChiTieuPK selectById(String MaCT) {
   String sql="SELECT * FROM CHITIEU WHERE MaCT=?";
        List<ChiTieuPK> list = this.selectBySql(sql, MaCT);
        return list.size() > 0 ? list.get(0) : null; 
    }

    @Override
    public List<ChiTieuPK> selectAll() {
      String sql="SELECT * FROM CHITIEU";
        return this.selectBySql(sql);
    }

    @Override
    protected List<ChiTieuPK> selectBySql(String sql, Object... args) {
    List<ChiTieuPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    ChiTieuPK entity =new ChiTieuPK();
                    entity.setMaCT(rs.getString("MaCT"));
                    entity.setNguonTien(rs.getFloat("NguonTien"));
                    entity.setSoTienChiRa(rs.getFloat("SoTienChiRa"));
                    entity.setNgay(rs.getDate("Ngay"));
                    entity.setMaNV(rs.getString("MaNV"));
                     entity.setMaTB(rs.getString("MaTB"));
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
