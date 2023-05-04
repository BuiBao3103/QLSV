/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.MainPanel;

import backend.Excel.IOExcel;
import BUS.NhomBUS;
import java.awt.Font;
import javax.swing.table.*;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class Schedule extends javax.swing.JPanel {

    /**
     * Creates new form Schedule
     */
    public Schedule() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSapXep = new javax.swing.ButtonGroup();
        schedule = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSchedule = new javax.swing.JTable();
        cbChonHocKy = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnSapXepTheoMon = new javax.swing.JRadioButton();
        btnSapXepTheoThuTiet = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        btnXemDSSV = new javax.swing.JButton();
        scpDSSV = new javax.swing.JScrollPane();
        tblDSSV = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 153, 204));

        schedule.setBackground(new java.awt.Color(255, 255, 255));

        tblSchedule.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tblSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(841107), "Lập Trình Java", "09",  new Integer(4), "Hai",  new Integer(1),  new Integer(3), "C.A105"},
                { new Integer(841048), "	P/tích thiết kế hệ thống thông tin", "04",  new Integer(4), "Sáu",  new Integer(1),  new Integer(5), "C.A106"},
                { new Integer(841058), "	Hệ điều hành mã nguồn mở", "02",  new Integer(3), "Tư",  new Integer(3),  new Integer(4), "C.E403"},
                { new Integer(861303), "Chủ nghĩa xã hội khoa học", "07",  new Integer(2), "Tư",  new Integer(1),  new Integer(2), "C.B107"}
            },
            new String [] {
                "Mã MH", "Tên Môn Học", "NMH", "STC", "Thứ", "Tiết BĐ", "Số Tiết", "Phòng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSchedule.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblSchedule.setRowHeight(35);
        tblSchedule.setRowMargin(10);
        tblSchedule.getTableHeader().setFont(new Font("Segoe UI", 0, 16));
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.CENTER);
        ((DefaultTableCellRenderer)tblSchedule.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < tblSchedule.getColumnCount(); i++)
        {

            if(i != 1){
                tblSchedule.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
            }else{
                continue;
            }
        }
        tblSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblScheduleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSchedule);
        if (tblSchedule.getColumnModel().getColumnCount() > 0) {
            tblSchedule.getColumnModel().getColumn(0).setMinWidth(70);
            tblSchedule.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblSchedule.getColumnModel().getColumn(0).setMaxWidth(70);
            tblSchedule.getColumnModel().getColumn(2).setMinWidth(60);
            tblSchedule.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblSchedule.getColumnModel().getColumn(2).setMaxWidth(60);
            tblSchedule.getColumnModel().getColumn(3).setMinWidth(45);
            tblSchedule.getColumnModel().getColumn(3).setPreferredWidth(45);
            tblSchedule.getColumnModel().getColumn(3).setMaxWidth(45);
            tblSchedule.getColumnModel().getColumn(4).setMinWidth(65);
            tblSchedule.getColumnModel().getColumn(4).setPreferredWidth(65);
            tblSchedule.getColumnModel().getColumn(4).setMaxWidth(65);
            tblSchedule.getColumnModel().getColumn(5).setMinWidth(60);
            tblSchedule.getColumnModel().getColumn(5).setPreferredWidth(60);
            tblSchedule.getColumnModel().getColumn(5).setMaxWidth(60);
            tblSchedule.getColumnModel().getColumn(6).setMinWidth(60);
            tblSchedule.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblSchedule.getColumnModel().getColumn(6).setMaxWidth(60);
            tblSchedule.getColumnModel().getColumn(7).setMinWidth(65);
            tblSchedule.getColumnModel().getColumn(7).setPreferredWidth(65);
            tblSchedule.getColumnModel().getColumn(7).setMaxWidth(65);
        }

        cbChonHocKy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbChonHocKyItemStateChanged(evt);
            }
        });
        cbChonHocKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChonHocKyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Chọn học kỳ xem thời khóa biểu");

        btgSapXep.add(btnSapXepTheoMon);
        btnSapXepTheoMon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSapXepTheoMon.setSelected(true);
        btnSapXepTheoMon.setText("Sắp xếp theo môn");
        btnSapXepTheoMon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSapXepTheoMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepTheoMonActionPerformed(evt);
            }
        });

        btgSapXep.add(btnSapXepTheoThuTiet);
        btnSapXepTheoThuTiet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSapXepTheoThuTiet.setText("Sắp xếp theo thứ tiết");
        btnSapXepTheoThuTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSapXepTheoThuTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepTheoThuTietActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 158, 248));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-schedule-25.png"))); // NOI18N
        jButton1.setText("In TKB");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnXemDSSV.setText("DSSV");
        btnXemDSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDSSVActionPerformed(evt);
            }
        });

        tblDSSV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tblDSSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "3121410502", "Phan Huỳnh Minh Tiến", "Công Nghệ Thông Tin (DCT)", "DCT1213"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "MSSV", "Tên", "Ngành", "Lớp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDSSV.setRowHeight(35);
        tblDSSV.setRowMargin(10);
        tblDSSV.getTableHeader().setFont(new Font("Segoe UI", 0, 16));
        leftRenderer.setHorizontalAlignment(JLabel.CENTER);
        ((DefaultTableCellRenderer)tblDSSV.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < tblDSSV.getColumnCount(); i++)
        {

            if(i != 2){
                tblSchedule.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
            }else{
                continue;
            }
        }
        scpDSSV.setViewportView(tblDSSV);
        if (tblDSSV.getColumnModel().getColumnCount() > 0) {
            tblDSSV.getColumnModel().getColumn(0).setMinWidth(40);
            tblDSSV.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblDSSV.getColumnModel().getColumn(0).setMaxWidth(40);
            tblDSSV.getColumnModel().getColumn(1).setMinWidth(100);
            tblDSSV.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblDSSV.getColumnModel().getColumn(1).setMaxWidth(100);
            tblDSSV.getColumnModel().getColumn(4).setMinWidth(80);
            tblDSSV.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblDSSV.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        javax.swing.GroupLayout scheduleLayout = new javax.swing.GroupLayout(schedule);
        schedule.setLayout(scheduleLayout);
        scheduleLayout.setHorizontalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scheduleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpDSSV, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scheduleLayout.createSequentialGroup()
                        .addComponent(btnSapXepTheoMon, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnSapXepTheoThuTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnXemDSSV))
                    .addGroup(scheduleLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbChonHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        scheduleLayout.setVerticalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scheduleLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbChonHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(7, 7, 7)
                .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSapXepTheoMon)
                    .addComponent(btnSapXepTheoThuTiet)
                    .addComponent(btnXemDSSV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpDSSV, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(schedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(schedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JRadioButton getBtnSapXepTheoMon() {
        return btnSapXepTheoMon;
    }

    public void setBtnSapXepTheoMon(JRadioButton btnSapXepTheoMon) {
        this.btnSapXepTheoMon = btnSapXepTheoMon;
    }

    public JRadioButton getBtnSapXepTheoThuTiet() {
        return btnSapXepTheoThuTiet;
    }

    public void setBtnSapXepTheoThuTiet(JRadioButton btnSapXepTheoThuTiet) {
        this.btnSapXepTheoThuTiet = btnSapXepTheoThuTiet;
    }

    public JButton getBtnXemDSSV() {
        return btnXemDSSV;
    }

    public void setBtnXemDSSV(JButton btnXemDSSV) {
        this.btnXemDSSV = btnXemDSSV;
    }

    public JScrollPane getScpDSSV() {
        return scpDSSV;
    }

    public void setScpDSSV(JScrollPane scpDSSV) {
        this.scpDSSV = scpDSSV;
    }

    public JTable getTblDSSV() {
        return tblDSSV;
    }

    public void setTblDSSV(JTable tblDSSV) {
        this.tblDSSV = tblDSSV;
    }
    
    public JComboBox<String> getCbChonHocKy() {
        return cbChonHocKy;
    }

    public void setCbChonHocKy(JComboBox<String> cbChonHocKy) {
        this.cbChonHocKy = cbChonHocKy;
    }

    public JTable getTblSchedule() {
        return tblSchedule;
    }

    public void setTblSchedule(JTable tblSchedule) {
        this.tblSchedule = tblSchedule;
    }

    private void tblScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblScheduleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblScheduleMouseClicked

    private void cbChonHocKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChonHocKyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChonHocKyActionPerformed

    private void btnSapXepTheoMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepTheoMonActionPerformed
        NhomBUS.showTKB(this);
    }//GEN-LAST:event_btnSapXepTheoMonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IOExcel.writeExcel(tblSchedule, "Thời khóa biểu","tkb");

//        try {
//            JFileChooser jFileChooser = new JFileChooser();
//            jFileChooser.showSaveDialog(this);
//            File savefile = jFileChooser.getSelectedFile();
//            if (savefile != null) {
//                savefile = new File(savefile.toString() + ".xlsx");
//                XSSFWorkbook wb = new XSSFWorkbook();
//                XSSFSheet sheet = wb.createSheet("dssv");
//                Row rowCol = sheet.createRow(0);
//
//                // Set title
//                CellStyle titleStyle = wb.createCellStyle();
//                titleStyle.setAlignment(HorizontalAlignment.CENTER);
//                XSSFFont font = wb.createFont();
//                font.setBold(true);
//                font.setFontHeightInPoints((short) 16);
//                titleStyle.setFont(font);
//                Cell titleCell = rowCol.createCell(0);
//                titleCell.setCellValue("Schedule");
//                titleCell.setCellStyle(titleStyle);
//                sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, jTable1.getColumnCount() - 1));
//
//                // Set header
//                CellStyle headerStyle = wb.createCellStyle();
//                headerStyle.setAlignment(HorizontalAlignment.CENTER);
//                Row rowHeader = sheet.createRow(1);
//                for (int i = 0; i < jTable1.getColumnCount(); i++) {
//                    Cell cell = rowHeader.createCell(i);
//                    cell.setCellValue(jTable1.getColumnName(i));
//                    cell.setCellStyle(headerStyle);
//                    if (i == 1) {
//                        sheet.setColumnWidth(i, 9000);
//                    } else {
//                        sheet.setColumnWidth(i, 3000);
//
//                    }
//                }
//
//                // Set data
//                CellStyle dataStyle = wb.createCellStyle();
//                dataStyle.setAlignment(HorizontalAlignment.CENTER);
//                for (int j = 0; j < jTable1.getRowCount(); j++) {
//                    Row row = sheet.createRow(j + 2);
//                    for (int k = 0; k < jTable1.getColumnCount(); k++) {
//                        Cell cell = row.createCell(k);
//                        if (jTable1.getValueAt(j, k) != null) {
//                            cell.setCellValue(jTable1.getValueAt(j, k).toString());
//                        }
//                        cell.setCellStyle(dataStyle);
//                    }
//                }
//                FileOutputStream out = new FileOutputStream(new File(savefile.toString()));
//                wb.write(out);
//                out.close();
//                JOptionPane.showMessageDialog(jComboBox1, "Xuất File Excel thành công");
//
//            } else {
//                JOptionPane.showMessageDialog(jComboBox1, "Xuất File Excel thất bại");
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        } catch (IOException ex) {
//            Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnXemDSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDSSVActionPerformed
        NhomBUS.showDSSV(this);
    }//GEN-LAST:event_btnXemDSSVActionPerformed

    private void cbChonHocKyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbChonHocKyItemStateChanged
        NhomBUS.showTKB(this);
    }//GEN-LAST:event_cbChonHocKyItemStateChanged

    private void btnSapXepTheoThuTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepTheoThuTietActionPerformed
        NhomBUS.showTKB(this);
    }//GEN-LAST:event_btnSapXepTheoThuTietActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgSapXep;
    private javax.swing.JRadioButton btnSapXepTheoMon;
    private javax.swing.JRadioButton btnSapXepTheoThuTiet;
    private javax.swing.JButton btnXemDSSV;
    private javax.swing.JComboBox<String> cbChonHocKy;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel schedule;
    private javax.swing.JScrollPane scpDSSV;
    private javax.swing.JTable tblDSSV;
    private javax.swing.JTable tblSchedule;
    // End of variables declaration//GEN-END:variables
}
