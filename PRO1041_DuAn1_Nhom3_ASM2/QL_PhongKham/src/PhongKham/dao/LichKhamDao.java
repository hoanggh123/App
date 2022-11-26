    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.dao;

import PhongKham.entity.LichKhamPK;

import PhongKham.utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class LichKhamDao extends ClinicDao<LichKhamPK, String>{

    @Override
    public void insert(LichKhamPK model) {
         String sql = "INSERT INTO LichKham (MaLichKham , LichHen , HoTen ,Tuoi , GioiTinh ,SDT ,LyDoKham , LoaiHen , GhiChu ,TinhTrang,MaNV,MaBN) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        XJdbc.update(sql, 
                model.getMaLichKham(),
                model.getLichHen(),
                model.getHoTen(),
                model.getTuoi(),
                model.getGioiTinh(),
                model.getSDT(),
                model.getLyDoKham(),
                model.getLoaiHen(),
                model.getGhiChu(),
                model.getTinhTrang(),           
                model.getMaNV(),                        
                model.getMaBN());    
    }

    @Override
    public void update(LichKhamPK model) {
         String sql = "Update LichKham set LichHen = ? , HoTen = ? , Tuoi= ? ,GioiTinh = ? , SDT = ? ,LyDoKham = ? , LoaiHen = ? ,GhiChu = ?,TinhTrang = ? , MaNV = ? , MaBN = ? WHERE MaLichKham = ?";
         XJdbc.update(sql,
                model.getLichHen(),
                model.getHoTen(),
                model.getTuoi(),
                model.getGioiTinh(),
                model.getSDT(),
                model.getLyDoKham(),
                model.getLoaiHen(),
                model.getGhiChu(),
                model.getTinhTrang(),           
                model.getMaNV(),                        
                model.getMaBN(), 
                model.getMaLichKham());
    }

    @Override
    public void delete(String MaLichKham ) {
         String sql = "Delete FROM LichKham WHERE MaLichKham = ?";
        XJdbc.update(sql, MaLichKham );
    }

    @Override
    public LichKhamPK selectById(String MaLichKham ) {
         String sql="SELECT * FROM LichKham WHERE MaLichKham=?";
        List<LichKhamPK> list = this.selectBySql(sql,MaLichKham );
        return list.size() > 0 ? list.get(0) : null;    
    }

    @Override
    public List<LichKhamPK> selectAll() {
         String sql="SELECT * FROM LichKham";
        return this.selectBySql(sql);
    }

    @Override
    protected List<LichKhamPK> selectBySql(String sql, Object... args) {
              List<LichKhamPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    LichKhamPK entity =new LichKhamPK();
                    entity.setMaLichKham(rs.getString("MaLichKham"));
                    entity.setLichHen(rs.getDate("LichHen"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setTuoi(rs.getInt("Tuoi"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setSDT(rs.getString("SDT"));
                    entity.setLyDoKham(rs.getString("LyDoKham"));
                    entity.setLoaiHen(rs.getString("LoaiHen"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                    entity.setTinhTrang(rs.getString("TinhTrang"));  
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setMaBN(rs.getString("MaBN"));
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
