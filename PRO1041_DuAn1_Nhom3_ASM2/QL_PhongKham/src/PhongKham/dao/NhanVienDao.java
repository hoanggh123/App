
package PhongKham.dao;

import PhongKham.entity.NhanVienPK;
import PhongKham.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDao extends ClinicDao<NhanVienPK, String>{

    @Override
    public void insert(NhanVienPK model) {
       String sql = "INSERT INTO NhanVien (MaNV , HoTenNV , GioiTinh ,NgaySinh , DiaChi , Email , CMND ,ChuyenNganh , ChucVu ,TrinhDo ,HinhAnhNV , NgayVaoLam , MaKhoa,SDT ) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        XJdbc.update(sql, 
                model.getMaNV(),
                model.getHoTenNV(),
                model.getGioiTinh(),
                model.getNgaySinh(),
                model.getDiaChi(),               
                model.getEmail(),
                model.getCMND(),
                model.getChuyenNganh(),
                model.getChucVu(),
                model.getTrinhDo(),
                model.getHinhAnhNV(),
                model.getNgayVaoLam(),
                model.getMaKhoa(),
                model.getSDT()
                );
    }

    @Override
    public void update(NhanVienPK model) {
       String sql = "Update NhanVien set HoTenNV = ? , GioiTinh = ? , NgaySinh = ? , DiaChi = ? , Email = ? , CMND = ? , ChuyenNganh = ? , ChucVu = ? , TrinhDo = ? ,HinhAnhNV = ? , NgayVaoLam = ? , MaKhoa = ? , SDT = ? WHERE MaNV = ?";
         XJdbc.update(sql,       
                model.getHoTenNV(),
                model.getGioiTinh(),
                model.getNgaySinh(),
                model.getDiaChi(),               
                model.getEmail(),
                model.getCMND(),
                model.getChuyenNganh(),
                model.getChucVu(),
                model.getTrinhDo(),
                model.getHinhAnhNV(),
                model.getNgayVaoLam(),
                model.getMaKhoa(),
                model.getSDT(),
                model.getMaNV()
                );
    }

    @Override
    public void delete(String MaNV) {
        String sql = "Delete FROM NhanVien WHERE MaNV = ?";
        XJdbc.update(sql, MaNV);
    }

    @Override
    public NhanVienPK selectById(String manv) {
         String sql="SELECT * FROM NhanVien WHERE MaNV=?";
        List<NhanVienPK> list = this.selectBySql(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<NhanVienPK> selectAll() {
           String sql="SELECT * FROM NhanVien";
        return this.selectBySql(sql);
    }

    @Override
    protected List<NhanVienPK> selectBySql(String sql, Object... args) {
        List<NhanVienPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    NhanVienPK entity =new NhanVienPK();
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setHoTenNV(rs.getString("HoTenNV"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setNgaySinh(rs.getDate("NgaySinh"));
                    entity.setDiaChi(rs.getString("DiaChi"));                 
                    entity.setEmail(rs.getString("Email"));
                    entity.setCMND(rs.getString("CMND"));
                    entity.setChuyenNganh(rs.getString("ChuyenNganh"));
                    entity.setChucVu(rs.getString("ChucVu"));
                    entity.setTrinhDo(rs.getString("TrinhDo"));
                    entity.setHinhAnhNV(rs.getString("HinhAnhNV"));
                    entity.setNgayVaoLam(rs.getDate("NgayVaoLam"));
                    entity.setMaKhoa(rs.getString("MaKhoa"));
                    entity.setSDT(rs.getString("SDT"));
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
    
     public List<NhanVienPK> selectByKeyword(String keyword){
        String sql="SELECT * FROM NHANVIEN WHERE HoTenNV LIKE ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }
 }
    

