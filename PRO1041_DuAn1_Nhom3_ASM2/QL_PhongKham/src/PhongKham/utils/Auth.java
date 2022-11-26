package PhongKham.utils;

import PhongKham.entity.TaiKhoanPK;
import PhongKham.ui.ClinicPK;

public class Auth {
    /**
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static TaiKhoanPK user = null;
    /**
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
    public static void clear() {
        Auth.user = null;
    }
    /**
     * Kiểm tra xem đăng nhập hay chưa
     */
    public static boolean isLogin() {
        return Auth.user != null;
    }
    
     /**
     * Kiểm tra xem có phải là trưởng phòng hay không
     */
    
    public static void isManager() {
        if(Auth.isLogin() && user.getChucVu().equalsIgnoreCase("Bác sĩ")) {
            ClinicPK f = new  ClinicPK();
                    f.setVisible(true);           
        }else if(Auth.isLogin() && user.getChucVu().equalsIgnoreCase("Y tá")){
            ClinicPK f = new  ClinicPK();
            f.setVisible(true);
        }else if(Auth.isLogin() && user.getChucVu().equalsIgnoreCase("Ban quản lý")){
            ClinicPK f = new  ClinicPK();
            f.setVisible(true);
        }else if(Auth.isLogin() && user.getChucVu().equalsIgnoreCase("Thu Ngân")){
            ClinicPK f = new  ClinicPK();
            f.setVisible(true);
        }else if(Auth.isLogin() && user.getChucVu().equalsIgnoreCase("Bệnh Nhân")){
            ClinicPK f = new  ClinicPK();
            f.setVisible(true);
        }
    
    };
        
}
