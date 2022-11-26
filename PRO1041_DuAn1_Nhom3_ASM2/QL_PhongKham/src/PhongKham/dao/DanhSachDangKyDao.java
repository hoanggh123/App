/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhongKham.dao;

import PhongKham.entity.ChiTieuPK;
import PhongKham.entity.DanhSachDangKyDVPK;
import PhongKham.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Nghia
 */
public class DanhSachDangKyDao extends ClinicDao<DanhSachDangKyDVPK, String>{

    @Override
    public void insert(DanhSachDangKyDVPK model) {
          String sql = "INSERT INTO DANHSACHDICHVU (ID,NgayDK,TrangThai ,MaDV, MaBN) VALUES(?,?,?,?,?)";
         XJdbc.update(sql,
                model.getID(),
                model.getNgayDK(),
                model.getTrangThai(),
                model.getMaDV(),
                model.getMaBN());
    }

    @Override
    public void update(DanhSachDangKyDVPK model) {
      String sql = "Update DANHSACHDICHVU set NgayDK=? , TrangThai = ? ,MaDV=?, MABN=? WHERE ID = ?";
         XJdbc.update(sql,
                model.getNgayDK(),
                model.getTrangThai(),
                model.getMaDV(),
                model.getMaBN(),
                model.getID()
         );    
    }

    @Override
    public void delete(String ID) {
         String sql = "Delete FROM DANHSACHDICHVU WHERE ID = ?";
        XJdbc.update(sql, ID);
    }

    @Override
    public DanhSachDangKyDVPK selectById(String ID) {
       String sql="SELECT * FROM DANHSACHDICHVU WHERE ID=?";
        List<DanhSachDangKyDVPK> list = this.selectBySql(sql, ID);
        return list.size() > 0 ? list.get(0) : null;  }

    @Override
    public List<DanhSachDangKyDVPK> selectAll() {
        String sql="SELECT * FROM DANHSACHDICHVU";
        return this.selectBySql(sql);
    }

    @Override
    protected List<DanhSachDangKyDVPK> selectBySql(String sql, Object... args) {
    List<DanhSachDangKyDVPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    DanhSachDangKyDVPK entity =new DanhSachDangKyDVPK();
                    entity.setID(rs.getInt("ID"));
                    entity.setNgayDK(rs.getDate("NgayDK"));
                    entity.setTrangThai(rs.getString("TrangThai"));
                    entity.setMaDV(rs.getString("MaDV"));
                    entity.setMaBN(rs.getString("MaNV"));
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
