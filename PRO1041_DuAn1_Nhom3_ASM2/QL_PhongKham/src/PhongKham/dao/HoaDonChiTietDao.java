/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.dao;

import PhongKham.entity.HoaDonChiTietPK;
import PhongKham.dao.HoaDonChiTietDao;
import PhongKham.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonChiTietDao extends ClinicDao<HoaDonChiTietPK, String>{

    @Override
    public void insert(HoaDonChiTietPK model) {
         String sql = "INSERT INTO HoaDonChiTiet (MaHDCT , SoLuong , LieuDung , MaThuoc , MaDT) VALUES(?,?,?,?,?)";
        XJdbc.update(sql, 
                model.getMaHDCT(),
                model.getSoLuong(),
                model.getLieuDung(),
                model.getMaThuoc(),
                model.getMaDT()
                );
    }

    @Override
    public void update(HoaDonChiTietPK model) {
        String sql = "UPDATE HoaDonChiTiet set SoLuong = ? , LieuDung = ? , MaThuoc = ? , MaDT = ?  WHERE MaHDCT = ?";
         XJdbc.update(sql,                                         
                model.getSoLuong(),
                model.getLieuDung(),
                model.getMaThuoc(),
                model.getMaDT(),
                model.getMaHDCT()
                );
    }

    @Override
    public void delete(String MaHDCT) {
         String sql = "Delete FROM HoaDonChiTiet WHERE MaHDCT = ?";
        XJdbc.update(sql, MaHDCT);
    }

    @Override
    public HoaDonChiTietPK selectById(String MaHDCT) {
         String sql="SELECT * FROM HoaDonChiTiet WHERE MaHDCT = ?";
        List<HoaDonChiTietPK> list = this.selectBySql(sql, MaHDCT);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<HoaDonChiTietPK> selectAll() {
        String sql="SELECT * FROM HoaDonChiTiet";
        return this.selectBySql(sql);
    }

    @Override
    protected List<HoaDonChiTietPK> selectBySql(String sql, Object... args) {
         List<HoaDonChiTietPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    HoaDonChiTietPK entity =new HoaDonChiTietPK();
                    entity.setMaHDCT(rs.getString("MaHDCT"));
                    entity.setSoLuong(rs.getInt("SoLuong"));
                    entity.setLieuDung(rs.getString("LieuDung"));
                    entity.setMaThuoc(rs.getString("MaThuoc"));
                    entity.setMaDT(rs.getString("MaDT"));            
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
    public List<HoaDonChiTietPK> selectByThuoc(String tenthuoc){
        String sql="SELECT * FROM HoaDonChiTiet HDCT INNER join thuoc THUOC ON  HDCT.MaThuoc = THUOC.MaThuoc WHERE TenThuoc LIKE ?";
        return this.selectBySql(sql, tenthuoc);
    }
}
