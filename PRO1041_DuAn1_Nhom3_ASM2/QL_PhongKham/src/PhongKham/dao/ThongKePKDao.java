/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhongKham.dao;

import PhongKham.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nghia
 */
public class ThongKePKDao {
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
   
       public List<Object[]> getSoLuongTB(){
        String sql = "{CALL SP_ThongKe_ThietBi_LoaiTB}";
        String[] cols = {"MaLoaiTB", "TenLoaiThietBi", "SoLuong"};
        return this.getListOfArray(sql, cols);
    }
       
        public List<Object[]> getSoLuongTBNV(int NgayNhap ){
        String sql = "{CALL SP_ThongKe_ThietBi_NhapVe (?)}";
        String[] cols = {"MaLoaiTB", "TenLoaiThietBi", "SoLuong","NgayNhap"};
        return this.getListOfArray(sql, cols, NgayNhap);
    }
        
                public List<Object[]> getSoLuongThuocDB(int thang , int nam){
        String sql = "{EXEC SP_ThongKe_LuongThuoc_DaBan (?),(?)}";
        String[] cols = {"MaThuoc", "TenThuoc", "SoLuong","NgayBan"};
        return this.getListOfArray(sql, cols, thang , nam);
    }    
        
             public List<Object[]> getLuongThuocConLai(){
        String sql = "{CALL SP_ThongKe_LuongThuoc_ConLai}";
        String[] cols = {"MaThuoc", "TenThuoc", "SoLuong","DonVi"};
        return this.getListOfArray(sql, cols);
    }     
             
              public List<Object[]> getTKChiTieu(Date Ngay){
        String sql = "{CALL SP_ThongKe_ChiTieu (?)}";
        String[] cols = {"LoaiChi", "SoTien", "NgayChi"};
        return this.getListOfArray(sql, cols, Ngay);
    }     
              
        public List<Object[]> getTKDoanhThu (Date Ngay){
        String sql = "{CALL SP_ThongKe_Doanh Thu (?)}";
        String[] cols = {"LoaiThu", "TienThu", "NgayThu"};
        return this.getListOfArray(sql, cols, Ngay);
    } 
                    
        public List<Object[]> getTKDangKyDV(Date Ngay){
        String sql = "{CALL SP_ThongKe_DangKyDichVu}";
        String[] cols = {"MaDV", "TenDV", "SoLuong_DangKy"};
        return this.getListOfArray(sql, cols,Ngay);
    } 
        
        public List<Object[]> getTKNVChucVu(){
        String sql = "{CALL SP_ThongKe_NhanVien_ChucVu}";
        String[] cols = {"ChucVu", "SOLUONG"};
        return this.getListOfArray(sql, cols);
    }  
         
               public List<Object[]> getTKNVKhoa(){
        String sql = "{CALL SP_ThongKe_NhanVien_ChuyenKhoa}";
        String[] cols = {"TenKhoa", "SOLUONG"};
        return this.getListOfArray(sql, cols);
}


}
