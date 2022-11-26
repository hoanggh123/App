
package PhongKham.dao;

import PhongKham.entity.ThuocPK;
import PhongKham.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ThuocDao extends ClinicDao<ThuocPK, String>{

    @Override
    public void insert(ThuocPK model) {
          String sql = "INSERT INTO Thuoc (MaThuoc ,TenThuoc ,CachDung ,LoaiThuoc ,SoLuong ,DonVi ,DonGia ,NgayNhap,NgaySX ,HSD ,MaNV) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        XJdbc.update(sql, 
                model.getMaThuoc(),
                model.getTenThuoc(),
                model.getCachDung(),
                model.getLoaiThuoc(),
                model.getSoLuong(),
                model.getDonVi(),
                model.getDonGia(),
                model.getNgayNhap(),
                model.getNgaySX(),
                model.getHSD(),
                model.getMaNV()            
                );
    }

    @Override
    public void update(ThuocPK model) {
          String sql = "UPDATE Thuoc set TenThuoc = ? ,CachDung = ?  ,LoaiThuoc = ? ,SoLuong= ? ,DonVi = ? ,DonGia = ? ,NgayNhap = ?,NgaySX = ? ,HSD = ? ,MaNV = ? WHERE MaThuoc = ?";
         XJdbc.update(sql,                                         
                model.getTenThuoc(),
                model.getCachDung(),
                model.getLoaiThuoc(),
                model.getSoLuong(),
                model.getDonVi(),
                model.getDonGia(),
                model.getNgayNhap(),
                model.getNgaySX(),
                model.getHSD(),
                model.getMaNV(),
                model.getMaThuoc()
                );
    }

    @Override
    public void delete(String MaThuoc) {
        String sql = "Delete FROM Thuoc WHERE MaThuoc = ?";
        XJdbc.update(sql, MaThuoc);
    }

    @Override
    public ThuocPK selectById(String MaThuoc) {
          String sql="SELECT * FROM Thuoc WHERE MaThuoc=?";
        List<ThuocPK> list = this.selectBySql(sql, MaThuoc);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<ThuocPK> selectAll() {
        String sql="SELECT * FROM Thuoc";
        return this.selectBySql(sql);
    }

    @Override
    protected List<ThuocPK> selectBySql(String sql, Object... args) {
         List<ThuocPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    ThuocPK entity =new ThuocPK();
                    entity.setMaThuoc(rs.getString("MaThuoc"));
                    entity.setTenThuoc(rs.getString("TenThuoc"));
                    entity.setCachDung(rs.getString("CachDung"));
                    entity.setLoaiThuoc(rs.getString("LoaiThuoc"));
                    entity.setSoLuong(rs.getInt("SoLuong"));  
                    entity.setDonVi(rs.getString("DonVi"));   
                    entity.setDonGia(rs.getFloat("DonGia"));   
                    entity.setNgayNhap(rs.getDate("NgayNhap"));   
                    entity.setNgaySX(rs.getDate("NgaySX"));   
                    entity.setHSD(rs.getDate("HSD"));   
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
    
     public List<ThuocPK> selectByKeyword(String keyword){
        String sql="SELECT * FROM Thuoc WHERE TenThuoc LIKE ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }
}
