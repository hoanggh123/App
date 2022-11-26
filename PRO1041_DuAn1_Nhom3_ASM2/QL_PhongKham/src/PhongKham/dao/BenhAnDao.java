
package PhongKham.dao;
import PhongKham.entity.BenhAnPK;
import PhongKham.dao.BenhAnDao;
import PhongKham.entity.BenhNhanPK;
import PhongKham.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


public class BenhAnDao extends ClinicDao<BenhAnPK, String>{

    @Override
    public void insert(BenhAnPK model) {
         String sql = "INSERT INTO BenhAn (MaBA , NgayKham,MaNV ,MaBN,MaVP,MaLichKham,MaDT,MaPhong,DauHieuBenh ,XetNghiem , ChuanDoan) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        XJdbc.update(sql, 
                model.getMaBA(),
                model.getNgayKham(),
                model.getMaNV(),
                model.getMaBN(),
                model.getMaVP(),
                model.getMaLichKham(),
                model.getMaDT(),
                model.getMaPhong(),
                model.getDauHieuBenh(),
                model.getXetNghiem(),
                model.getChuanDoan()
                );
    }

    @Override
    public void update(BenhAnPK model) {
        String sql = "UPDATE BenhAn set  NgayKham = ? , MaNV = ? , MaBN = ? ,MaVP = ? ,MaLichKham = ? , MaDT = ? , MaPhong = ? , DauHieuBenh = ? , XetNghiem = ? ,ChuanDoan = ?  WHERE MaBA = ?";
         XJdbc.update(sql,                                         
                model.getNgayKham(),
                model.getMaNV(),
                model.getMaBN(),
                model.getMaVP(),
                model.getMaLichKham(),
                model.getMaDT(),
                model.getMaPhong(),
                model.getDauHieuBenh(),
                model.getXetNghiem(),
                model.getChuanDoan(),
                model.getMaBA()
                );
    }

    @Override
    public void delete(String MaBA) {
         String sql = "Delete FROM BenhAn WHERE MaBA = ?";
        XJdbc.update(sql, MaBA);
    }

    @Override
    public BenhAnPK selectById(String MaBA) {
         String sql="SELECT * FROM BenhAn WHERE MaBA=?";
        List<BenhAnPK> list = this.selectBySql(sql, MaBA);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<BenhAnPK> selectAll() {
         String sql="SELECT * FROM BenhAn";
        return this.selectBySql(sql);
    }

    @Override
    protected List<BenhAnPK> selectBySql(String sql, Object... args) {
         List<BenhAnPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    BenhAnPK entity =new BenhAnPK();
                    entity.setMaBA(rs.getString("MaBA"));
                    entity.setNgayKham(rs.getDate("NgayKham"));
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setMaBN(rs.getString("MaBN"));
                    entity.setMaVP(rs.getString("MaVP"));
                    entity.setMaLichKham(rs.getString("MaLichKham"));
                    entity.setMaDT(rs.getString("MaDT"));
                    entity.setMaPhong(rs.getString("MaPhong"));
                    entity.setDauHieuBenh(rs.getString("DauHieuBenh"));
                    entity.setXetNghiem(rs.getString("XetNghiem"));
                    entity.setChuanDoan(rs.getString("ChuanDoan"));
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

    public List<BenhAnPK> selectByKeyword(String keyword){
        String sql="SELECT * FROM BENHAN  WHERE MaBN LIKE ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }
    
}
