/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhongKham.dao;

import PhongKham.entity.TaiKhoanPK;
import PhongKham.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Nghia
 */
public class TaiKhoanDao extends ClinicDao<TaiKhoanPK, String>{

  
    
    @Override
    public void insert(TaiKhoanPK model) {
          String sql = "INSERT INTO TaiKhoan ( SDT ,MatKhau ,ChucVu ,GhiNhoMK,QRCode) VALUES(?,?,?,?,?)";
        XJdbc.update(sql, 
                model.getSDT(),
                model.getMatKhau(),
                model.getChucVu(),
                model.getGhiNhoMK(),
                model.getQRCode()
                );
    }

    @Override
    public void update(TaiKhoanPK model) {
        String sql = "UPDATE TaiKhoan set MatKhau = ?, ChucVu =?  ,GhiNhoMK = ? , QRCode = ? WHERE SDT = ?";
         XJdbc.update(sql,                                         
                model.getMatKhau(),
                model.getChucVu(),
                model.getGhiNhoMK(),
                model.getQRCode(),
                model.getSDT()
                );
    }

    @Override
    public void delete(String SDT) {
        String sql = "Delete FROM TaiKhoan WHERE SDT = ?";
        XJdbc.update(sql, SDT); 
    }

    @Override
    public TaiKhoanPK selectById(String SDT) {
       String sql="SELECT * FROM TaiKhoan WHERE SDT=?";
        List<TaiKhoanPK> list = this.selectBySql(sql, SDT);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<TaiKhoanPK> selectAll() {
         String sql="SELECT * FROM TaiKhoan";
        return this.selectBySql(sql); 
    }

    @Override
    protected List<TaiKhoanPK> selectBySql(String sql, Object... args) {
           List<TaiKhoanPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    TaiKhoanPK entity =new TaiKhoanPK();
                    entity.setSDT(rs.getString("SDT"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setChucVu(rs.getString("ChucVu"));
                    entity.setGhiNhoMK(rs.getString("GhiNhoMK"));
                    entity.setQRCode(rs.getString("QRCode"));            
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
    public List<TaiKhoanPK > selectByKeyword(String keyword){
        String sql="SELECT * FROM TaiKhoan WHERE SDT LIKE ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }
}
