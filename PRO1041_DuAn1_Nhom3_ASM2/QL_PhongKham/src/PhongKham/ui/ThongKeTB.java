/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.ui;

import PhongKham.dao.ThietBiDao;
import PhongKham.dao.ThongKePKDao;
import PhongKham.entity.ThietBiPK;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ThongKeTB extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeTB
     */
    public ThongKeTB() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKeTB = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongKeTBNV = new javax.swing.JTable();
        cboThang = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboThang1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(93, 167, 219));
        setPreferredSize(new java.awt.Dimension(1600, 900));

        tblThongKeTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Loại", "Tên Loại", "Số Lượng"
            }
        ));
        jScrollPane1.setViewportView(tblThongKeTB);

        tblThongKeTBNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Loại", "Tên Loại", "Số Lượng", "Ngày Nhập"
            }
        ));
        jScrollPane2.setViewportView(tblThongKeTBNV);
        if (tblThongKeTBNV.getColumnModel().getColumnCount() > 0) {
            tblThongKeTBNV.getColumnModel().getColumn(3).setHeaderValue("Ngày Nhập");
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Tháng");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Năm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)
                        .addGap(55, 55, 55)
                        .addComponent(cboThang1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboThang1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
                .addContainerGap(292, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JComboBox<String> cboThang1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblThongKeTB;
    private javax.swing.JTable tblThongKeTBNV;
    // End of variables declaration//GEN-END:variables
     ThongKePKDao dao = new ThongKePKDao();
     ThietBiDao daodao = new ThietBiDao();
    private void init() {
//        this.fillComboBoxThang();
        this.fillTableThongKeSoLuongTB();
//        fillTableThongKeSoLuongTBNV();
    }
    void fillComboBoxThang(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboThang.getModel();
        model.removeAllElements();
        List<Integer> list = daodao.selectMonth();
        for(Integer year : list){
            model.addElement(year);
        }
    }
    void fillTableThongKeSoLuongTB(){
        DefaultTableModel model = (DefaultTableModel) tblThongKeTB.getModel();
        model.setRowCount(0);       
        List<Object[]> list = dao.getSoLuongTB();
        for(Object[] row : list){
            model.addRow(row);
        }
    }
    
    void fillTableThongKeSoLuongTBNV(){
        DefaultTableModel model = (DefaultTableModel) tblThongKeTBNV.getModel();
        model.setRowCount(0);  
        int thang = (Integer)cboThang.getSelectedItem();
        List<Object[]> list = dao.getSoLuongTBNV(thang);
        for(Object[] row : list){
            model.addRow(row);
        }
    }

}
