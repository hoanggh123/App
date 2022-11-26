/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.dao;

import PhongKham.entity.HoaDonThuocPK;
import PhongKham.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class HoaDonThuocDao extends ClinicDao<HoaDonThuocPK, Object>{

@Override
    public void insert(HoaDonThuocPK model) {
        String sql = "INSERT INTO HoaDonThuoc (MaDT ,ChuanDoan ,NgayXuat,MaBN , MaNV) VALUES(?,?,?,?,?)";
        XJdbc.update(sql, 
                model.getMaDT(),
                model.getChuanDoan(),
                model.getNgayXuat(),
                model.getMaBN(),
                model.getMaNV()
                );
    }

    @Override
    public void update(HoaDonThuocPK model) {
         String sql = "UPDATE HoaDonThuoc set ChuanDoan = ?, NgayXuat = ?,MaBN = ? , MaNV = ?  WHERE MaDT = ?";
         XJdbc.update(sql,                                         
                model.getChuanDoan(),
                model.getNgayXuat(),
                model.getMaBN(),
                model.getMaNV(),
                model.getMaDT()
                );
    }

    @Override
    public void delete(Object MaDT) {
           String sql = "Delete FROM HoaDonThuoc WHERE MaDT = ?";
        XJdbc.update(sql, MaDT);
    }

    @Override
    public HoaDonThuocPK selectById(Object MaDT) {
          String sql="SELECT * FROM HoaDonThuoc WHERE MaDT=?";
        List<HoaDonThuocPK> list = this.selectBySql(sql, MaDT);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<HoaDonThuocPK> selectAll() {
         String sql="SELECT * FROM HoaDonThuoc";
        return this.selectBySql(sql);
    }

    @Override
    protected List<HoaDonThuocPK> selectBySql(String sql, Object... args) {
         List<HoaDonThuocPK> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    HoaDonThuocPK entity =new HoaDonThuocPK();
                    entity.setMaDT(rs.getString("MaDT"));
                    entity.setChuanDoan(rs.getString("ChuanDoan"));
                    entity.setNgayXuat(rs.getDate("NgayXuat"));
                      entity.setMaBN(rs.getString("MaBN")); 
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
//     public List<HoaDonThuocPK> TinhTienThuoc(float ){
//        String sql="SELECT * FROM HOADONTHUOC WHERE MaDT LIKE ?";
//        return this.selectBySql(sql, "%"+keyword+"%");
//    }
     public List<HoaDonThuocPK> selectByKeyword(String keyword){
        String sql="SELECT * FROM HoaDonThuoc WHERE MaDT lIKE ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }
       private List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]> list=new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i=0; i<cols.length; i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
       
      
   
       public List<Object[]> getHDCT(String MaDT){
        String sql = "{CALL VIEHDCT(?)}";
        String[] cols = {"MaHDCT","MaDT","TenThuoc","SoLuong","DonGia","Tien"};
        return this.getListOfArray(sql, cols,MaDT);
    }
       
        public List<Object[]> getTT(String MaDT){
        String sql = "{CALL FUNC_TIENTHUOC(?)}";
        String[] cols = {"Gía"};
        return this.getListOfArray(sql,cols,MaDT);
    }
        
//            public HoaDonThuocPK selectById(Object MaDT) {
//          String sql="{CALL FUNC_TIENTHUOC(?)}";
//        List<HoaDonThuocPK> list = this.selectBySql(sql, MaDT);
//        return list.size() > 0 ? list.get(0) : null;
//    }
        
         public  List<HoaDonThuocPK> searchtable(String str){         
         String sql="SELECT * FROM HoaDonThuoc ";
            return this.selectBySql(sql,"%"+str+"%");
            }
}
