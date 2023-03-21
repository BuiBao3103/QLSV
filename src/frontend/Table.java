/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.KetQua.KetQuaBUS;
import backend.QLSinhVien.*;
import backend.QLTaiKhoan.TaiKhoanBUS;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.*;
import java.awt.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class Table extends javax.swing.JFrame implements Runnable {

    private int widthBar = 221;
    private int heightBar = this.getHeight();
    private String[] arrays = {"javax.swing.plaf.metal.MetalLookAndFeel",
        "javax.swing.plaf.nimbus.NimbusLookAndFeel",
        "com.sun.java.swing.plaf.motif.MotifLookAndFeel",
        "com.sun.java.swing.plaf.windows.WindowsLookAndFeel",
        "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"};

    /**
     * Creates new form TableInside
     */
    public Table() {
        Thread t = new Thread(this);
        t.start();
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftBar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        btnInformation = new javax.swing.JButton();
        btnSubjectRegistration = new javax.swing.JButton();
        btnSchedule = new javax.swing.JButton();
        btnScore = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        inputPoint = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        studentList = new javax.swing.JButton();
        group = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        btnTool = new javax.swing.JButton();
        btnScholastic = new javax.swing.JButton();
        btnAccountList = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        btnChangePassword = new javax.swing.JButton();
        realTime = new javax.swing.JLabel();
        btnHeader = new javax.swing.JPanel();
        openMenu = new javax.swing.JButton();
        closeMenu = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        schedule = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        score = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        personalInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        detailInformation = new javax.swing.JPanel();
        fullName = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        idUniversity = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        address = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        classID = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        major = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        major1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        subjectRegistration = new javax.swing.JPanel();
        studentinfo = new javax.swing.JPanel();
        pninfo = new javax.swing.JPanel();
        btnThemSinhVien = new javax.swing.JButton();
        btnTimKiemSinhVien = new javax.swing.JButton();
        scpStudentList = new javax.swing.JScrollPane();
        tblStudentList = new javax.swing.JTable();
        pnMoreInfo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtDiaChiSinhVien = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNganhSinhVien = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtHoTenSinhVien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMSSinhVien = new javax.swing.JTextField();
        txtCMNDSinhVien = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNgaySinhSinhVien = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMaTKSinhVien = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTonGiaoSinhVien = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDanTocSinhVien = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtSoDTSinhVien = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtGioiTinhSinhVien = new javax.swing.JTextField();
        btnSuaSinhVien = new javax.swing.JButton();
        btnLuuSinhVien = new javax.swing.JButton();
        btnXoaSinhVien = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtNienKhoaSinhVien = new javax.swing.JTextField();
        btnDongSinhVien = new javax.swing.JButton();
        txtTimKiemSinhVien = new javax.swing.JTextField();
        settings = new javax.swing.JPanel();
        changeFrame = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnMetal = new javax.swing.JRadioButton();
        btnWindow = new javax.swing.JRadioButton();
        btnWindowClassic = new javax.swing.JRadioButton();
        btnMotif = new javax.swing.JRadioButton();
        btnNimbus = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello");
        setBackground(new java.awt.Color(255, 255, 255));

        leftBar.setBackground(new java.awt.Color(204, 153, 255));
        leftBar.setMaximumSize(new java.awt.Dimension(32767, 600));
        leftBar.setOpaque(false);
        leftBar.setPreferredSize(new java.awt.Dimension(220, 450));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setColumnHeaderView(null);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(32767, 700));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(226, 600));
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        btnInformation.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInformation.setText("Thông tin cá nhân");
        btnInformation.setPreferredSize(new java.awt.Dimension(190, 50));
        btnInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformationActionPerformed(evt);
            }
        });

        btnSubjectRegistration.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSubjectRegistration.setText("Đăng kí môn học");
        btnSubjectRegistration.setPreferredSize(new java.awt.Dimension(190, 50));
        btnSubjectRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubjectRegistrationActionPerformed(evt);
            }
        });

        btnSchedule.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSchedule.setText("Xem TKB");
        btnSchedule.setPreferredSize(new java.awt.Dimension(190, 50));
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });

        btnScore.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnScore.setText("Xem Điểm");
        btnScore.setPreferredSize(new java.awt.Dimension(190, 50));
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });

        jPanel4.setOpaque(false);

        inputPoint.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputPoint.setText("Nhập điểm");
        inputPoint.setPreferredSize(new java.awt.Dimension(200, 50));

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton7.setText("jButton7");
        jButton7.setPreferredSize(new java.awt.Dimension(190, 50));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton8.setText("jButton8");
        jButton8.setPreferredSize(new java.awt.Dimension(190, 50));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton9.setText("jButton9");
        jButton9.setPreferredSize(new java.awt.Dimension(190, 50));

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator3)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inputPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 0));
        jSeparator1.setOpaque(true);

        studentList.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        studentList.setText("Danh sách sinh viên");
        studentList.setPreferredSize(new java.awt.Dimension(190, 50));
        studentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentListActionPerformed(evt);
            }
        });

        group.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        group.setText("Nhóm môn học");
        group.setPreferredSize(new java.awt.Dimension(190, 50));

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton12.setText("jButton12");
        jButton12.setPreferredSize(new java.awt.Dimension(190, 50));

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton13.setText("jButton13");
        jButton13.setPreferredSize(new java.awt.Dimension(190, 50));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(group, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(studentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(group, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setOpaque(true);

        jPanel6.setOpaque(false);

        btnTool.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnTool.setText("Công cụ");
        btnTool.setPreferredSize(new java.awt.Dimension(202, 50));

        btnScholastic.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnScholastic.setText("Quản lí năm học");
        btnScholastic.setPreferredSize(new java.awt.Dimension(202, 50));

        btnAccountList.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAccountList.setText("Quản lí tài khoản");
        btnAccountList.setToolTipText("");
        btnAccountList.setPreferredSize(new java.awt.Dimension(202, 50));
        btnAccountList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountListActionPerformed(evt);
            }
        });

        btnSetting.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSetting.setText("Cài đặt");
        btnSetting.setPreferredSize(new java.awt.Dimension(202, 50));
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnScholastic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAccountList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnAccountList, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnScholastic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTool, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 591, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInformation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(btnSubjectRegistration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSchedule, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnScore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSubjectRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout leftBarLayout = new javax.swing.GroupLayout(leftBar);
        leftBar.setLayout(leftBarLayout);
        leftBarLayout.setHorizontalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        leftBarLayout.setVerticalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
        );

        getContentPane().add(leftBar, java.awt.BorderLayout.LINE_START);

        header.setBackground(new java.awt.Color(204, 204, 204));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setPreferredSize(new java.awt.Dimension(1025, 60));
        header.setRequestFocusEnabled(false);
        header.setLayout(new java.awt.BorderLayout(10, 0));

        btnChangePassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnChangePassword.setText("Đăng xuất");
        btnChangePassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChangePassword.setMaximumSize(new java.awt.Dimension(150, 40));
        btnChangePassword.setMinimumSize(new java.awt.Dimension(80, 60));
        btnChangePassword.setName(""); // NOI18N
        btnChangePassword.setPreferredSize(new java.awt.Dimension(100, 50));
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        header.add(btnChangePassword, java.awt.BorderLayout.LINE_END);

        realTime.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        realTime.setForeground(new java.awt.Color(255, 0, 51));
        realTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        header.add(realTime, java.awt.BorderLayout.CENTER);

        btnHeader.setOpaque(false);
        btnHeader.setPreferredSize(new java.awt.Dimension(60, 60));
        btnHeader.setLayout(new java.awt.CardLayout());

        openMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-menu-30.png"))); // NOI18N
        openMenu.setPreferredSize(new java.awt.Dimension(60, 60));
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        btnHeader.add(openMenu, "card2");

        closeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-30.png"))); // NOI18N
        closeMenu.setPreferredSize(new java.awt.Dimension(60, 60));
        closeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenuActionPerformed(evt);
            }
        });
        btnHeader.add(closeMenu, "card2");

        header.add(btnHeader, java.awt.BorderLayout.LINE_START);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        mainPanel.setPreferredSize(new java.awt.Dimension(873, 606));
        mainPanel.setLayout(new java.awt.CardLayout());

        schedule.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(841107), "Lập Trình Java", "09",  new Integer(4),  new Integer(4), "Hai",  new Integer(1),  new Integer(3), "C.A105", "DSSV"},
                { new Integer(841048), "	P/tích thiết kế hệ thống thông tin", "04",  new Integer(4),  new Integer(4), "Sáu",  new Integer(1),  new Integer(5), "C.A106", "DSSV"},
                { new Integer(841058), "	Hệ điều hành mã nguồn mở", "02",  new Integer(3),  new Integer(3), "Tư",  new Integer(3),  new Integer(4), "C.E403", "DSSV"},
                { new Integer(861303), "Chủ nghĩa xã hội khoa học", "07",  new Integer(2),  new Integer(2), "Tư",  new Integer(1),  new Integer(2), "C.B107", "DSSV"},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã MH", "Tên Môn Học", "NMH", "STC", "STCHP", "Thứ", "Tiết BĐ", "Tiết KT", "Phòng", "DSSV"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowHeight(35);
        jTable1.setRowMargin(10);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", 0, 16));
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.CENTER);
        ((DefaultTableCellRenderer)jTable1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < jTable1.getColumnCount(); i++)
        {

            if(i != 1){
                jTable1.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
            }else{
                continue;
            }
        }
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(1).setMinWidth(300);
            jTable1.getColumnModel().getColumn(2).setMinWidth(30);
            jTable1.getColumnModel().getColumn(3).setMinWidth(30);
            jTable1.getColumnModel().getColumn(4).setMinWidth(30);
            jTable1.getColumnModel().getColumn(5).setMinWidth(40);
            jTable1.getColumnModel().getColumn(6).setMinWidth(30);
            jTable1.getColumnModel().getColumn(7).setMinWidth(30);
            jTable1.getColumnModel().getColumn(8).setMinWidth(50);
            jTable1.getColumnModel().getColumn(9).setMinWidth(50);
        }

        javax.swing.GroupLayout scheduleLayout = new javax.swing.GroupLayout(schedule);
        schedule.setLayout(scheduleLayout);
        scheduleLayout.setHorizontalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        scheduleLayout.setVerticalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        mainPanel.add(schedule, "card4");

        score.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Môn", "Tên Môn", "TC", "% KT", "% Thi", "Kiểm Tra", "Điểm thi", "Điểm TK", "ĐTK(4)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setRowHeight(35);
        jTable2.setRowMargin(10);
        jTable2.getTableHeader().setFont(new Font("Segoe UI", 0, 16));
        leftRenderer.setHorizontalAlignment(JLabel.CENTER);
        ((DefaultTableCellRenderer)jTable2.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < jTable2.getColumnCount(); i++)
        {

            if(i != 2){
                jTable2.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
            }else{
                continue;
            }
        }
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(3);
            jTable2.getColumnModel().getColumn(1).setMinWidth(40);
            jTable2.getColumnModel().getColumn(2).setMinWidth(250);
            jTable2.getColumnModel().getColumn(3).setMinWidth(30);
            jTable2.getColumnModel().getColumn(4).setMinWidth(30);
            jTable2.getColumnModel().getColumn(5).setMinWidth(30);
            jTable2.getColumnModel().getColumn(6).setMinWidth(30);
            jTable2.getColumnModel().getColumn(7).setMinWidth(30);
            jTable2.getColumnModel().getColumn(8).setMinWidth(30);
        }

        javax.swing.GroupLayout scoreLayout = new javax.swing.GroupLayout(score);
        score.setLayout(scoreLayout);
        scoreLayout.setHorizontalGroup(
            scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        scoreLayout.setVerticalGroup(
            scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        mainPanel.add(score, "card5");

        personalInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 204, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logologinsmaller.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);

        detailInformation.setOpaque(false);
        detailInformation.setPreferredSize(new java.awt.Dimension(600, 417));
        detailInformation.setRequestFocusEnabled(false);
        detailInformation.setLayout(new javax.swing.BoxLayout(detailInformation, javax.swing.BoxLayout.Y_AXIS));

        fullName.setOpaque(false);
        fullName.setPreferredSize(new java.awt.Dimension(700, 69));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Họ và tên:");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField1.setText("Họ và tên");

        javax.swing.GroupLayout fullNameLayout = new javax.swing.GroupLayout(fullName);
        fullName.setLayout(fullNameLayout);
        fullNameLayout.setHorizontalGroup(
            fullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullNameLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );
        fullNameLayout.setVerticalGroup(
            fullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullNameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(fullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        detailInformation.add(fullName);

        idUniversity.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("MSSV:");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField2.setText("Mã số sinh viên");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout idUniversityLayout = new javax.swing.GroupLayout(idUniversity);
        idUniversity.setLayout(idUniversityLayout);
        idUniversityLayout.setHorizontalGroup(
            idUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idUniversityLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );
        idUniversityLayout.setVerticalGroup(
            idUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idUniversityLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(idUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        detailInformation.add(idUniversity);

        address.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Lớp:");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField3.setText("DCT12111");

        javax.swing.GroupLayout addressLayout = new javax.swing.GroupLayout(address);
        address.setLayout(addressLayout);
        addressLayout.setHorizontalGroup(
            addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );
        addressLayout.setVerticalGroup(
            addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        detailInformation.add(address);

        classID.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Nơi sinh:");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField4.setText("Sài Gòn");

        javax.swing.GroupLayout classIDLayout = new javax.swing.GroupLayout(classID);
        classID.setLayout(classIDLayout);
        classIDLayout.setHorizontalGroup(
            classIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classIDLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );
        classIDLayout.setVerticalGroup(
            classIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classIDLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(classIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        detailInformation.add(classID);

        major.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Ngành:");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField5.setText("Công nghệ thông tin");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout majorLayout = new javax.swing.GroupLayout(major);
        major.setLayout(majorLayout);
        majorLayout.setHorizontalGroup(
            majorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(majorLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );
        majorLayout.setVerticalGroup(
            majorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(majorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(majorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        detailInformation.add(major);

        major1.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Khóa học:");

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField6.setText("2022-2026");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout major1Layout = new javax.swing.GroupLayout(major1);
        major1.setLayout(major1Layout);
        major1Layout.setHorizontalGroup(
            major1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(major1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );
        major1Layout.setVerticalGroup(
            major1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(major1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(major1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        detailInformation.add(major1);

        javax.swing.GroupLayout personalInfoLayout = new javax.swing.GroupLayout(personalInfo);
        personalInfo.setLayout(personalInfoLayout);
        personalInfoLayout.setHorizontalGroup(
            personalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInfoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(detailInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addGap(284, 284, 284))
        );
        personalInfoLayout.setVerticalGroup(
            personalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInfoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(personalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        mainPanel.add(personalInfo, "card2");

        subjectRegistration.setBackground(new java.awt.Color(204, 102, 255));

        javax.swing.GroupLayout subjectRegistrationLayout = new javax.swing.GroupLayout(subjectRegistration);
        subjectRegistration.setLayout(subjectRegistrationLayout);
        subjectRegistrationLayout.setHorizontalGroup(
            subjectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 913, Short.MAX_VALUE)
        );
        subjectRegistrationLayout.setVerticalGroup(
            subjectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        mainPanel.add(subjectRegistration, "card3");

        btnThemSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemSinhVien.setText("Thêm");
        btnThemSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSinhVienActionPerformed(evt);
            }
        });

        btnTimKiemSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiemSinhVien.setText("Tìm");
        btnTimKiemSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemSinhVienActionPerformed(evt);
            }
        });

        tblStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MSSV", "Họ Tên", "Ngành", "Niên Khóa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudentList.getColumn("MSSV").setMinWidth(150);
        tblStudentList.getColumn("MSSV").setMaxWidth(150);
        tblStudentList.getColumn("Ngành").setMaxWidth(350);
        tblStudentList.getColumn("Ngành").setMinWidth(350);
        tblStudentList.getColumn("Niên Khóa").setMaxWidth(100);
        tblStudentList.getColumn("Niên Khóa").setMinWidth(100);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer(); // Căn Giữa cho các cột kiểu String
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tblStudentList.setDefaultRenderer(String.class, centerRenderer);
        tblStudentList.getColumn("MSSV").setCellRenderer(centerRenderer);
        tblStudentList.getColumn("Niên Khóa").setCellRenderer(centerRenderer);
        tblStudentList.getColumn("Họ Tên").setCellRenderer(centerRenderer);
        tblStudentList.getColumn("Ngành").setCellRenderer(centerRenderer);
        tblStudentList.getTableHeader().setDefaultRenderer(centerRenderer);
        tblStudentList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblStudentList.setRowHeight(35);
        tblStudentList.setRowMargin(10);
        tblStudentList.setFont(new java.awt.Font("Segoe UI", 0, 16));
        tblStudentList.getTableHeader().setFont(new Font("Segoe UI", 0, 16));
        tblStudentList.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblStudentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentListMouseClicked(evt);
            }
        });
        scpStudentList.setViewportView(tblStudentList);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Số Điện Thoại:");

        txtDiaChiSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDiaChiSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiaChiSinhVien.setEnabled(false);
        txtDiaChiSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDiaChiSinhVienCaretUpdate(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mã Tài Khoản:");

        txtNganhSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNganhSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNganhSinhVien.setEnabled(false);
        txtNganhSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNganhSinhVienCaretUpdate(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Họ Tên:");

        txtHoTenSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHoTenSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoTenSinhVien.setEnabled(false);
        txtHoTenSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtHoTenSinhVienCaretUpdate(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mã Số Sinh Viên:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Chứng Minh Nhân Dân:");

        txtMSSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMSSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMSSinhVien.setEnabled(false);
        txtMSSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMSSinhVienCaretUpdate(evt);
            }
        });

        txtCMNDSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCMNDSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCMNDSinhVien.setEnabled(false);
        txtCMNDSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCMNDSinhVienCaretUpdate(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Giới Tính: ");

        txtNgaySinhSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgaySinhSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNgaySinhSinhVien.setEnabled(false);
        txtNgaySinhSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNgaySinhSinhVienCaretUpdate(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Tôn Giáo:");

        txtMaTKSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaTKSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaTKSinhVien.setEnabled(false);
        txtMaTKSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMaTKSinhVienCaretUpdate(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ngành:");

        txtTonGiaoSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTonGiaoSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTonGiaoSinhVien.setEnabled(false);
        txtTonGiaoSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTonGiaoSinhVienCaretUpdate(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Địa Chỉ:");

        txtDanTocSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDanTocSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDanTocSinhVien.setEnabled(false);
        txtDanTocSinhVien.setMaximumSize(new java.awt.Dimension(64, 26));
        txtDanTocSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDanTocSinhVienCaretUpdate(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Dân Tộc:");

        txtSoDTSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoDTSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoDTSinhVien.setEnabled(false);
        txtSoDTSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSoDTSinhVienCaretUpdate(evt);
            }
        });
        txtSoDTSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDTSinhVienActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Ngày Sinh:");

        txtGioiTinhSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGioiTinhSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGioiTinhSinhVien.setEnabled(false);
        txtGioiTinhSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtGioiTinhSinhVienCaretUpdate(evt);
            }
        });
        txtGioiTinhSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGioiTinhSinhVienActionPerformed(evt);
            }
        });

        btnSuaSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaSinhVien.setText("Sửa");
        btnSuaSinhVien.setDefaultCapable(false);
        btnSuaSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSinhVienActionPerformed(evt);
            }
        });

        btnLuuSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuuSinhVien.setText("Lưu");
        btnLuuSinhVien.setDefaultCapable(false);
        btnLuuSinhVien.setEnabled(false);
        btnLuuSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuSinhVienActionPerformed(evt);
            }
        });

        btnXoaSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaSinhVien.setText("Xóa");
        btnXoaSinhVien.setDefaultCapable(false);
        btnXoaSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSinhVienActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Niên Khóa:");

        txtNienKhoaSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNienKhoaSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNienKhoaSinhVien.setEnabled(false);
        txtNienKhoaSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNienKhoaSinhVienCaretUpdate(evt);
            }
        });
        txtNienKhoaSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNienKhoaSinhVienActionPerformed(evt);
            }
        });

        btnDongSinhVien.setText("X");
        btnDongSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongSinhVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMoreInfoLayout = new javax.swing.GroupLayout(pnMoreInfo);
        pnMoreInfo.setLayout(pnMoreInfoLayout);
        pnMoreInfoLayout.setHorizontalGroup(
            pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNganhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(txtMSSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCMNDSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMoreInfoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(txtHoTenSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23)))
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                .addComponent(txtGioiTinhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addComponent(txtNgaySinhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoDTSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(14, 14, 14))
                                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(8, 8, 8)))
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNienKhoaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaChiSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                        .addComponent(txtDanTocSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                        .addComponent(btnSuaSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLuuSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(5, 5, 5)))
                                .addGap(18, 18, 18)
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                        .addComponent(txtTonGiaoSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                        .addComponent(btnXoaSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(15, 15, 15))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMoreInfoLayout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(btnDongSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(txtMaTKSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        pnMoreInfoLayout.setVerticalGroup(
            pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                .addComponent(btnDongSinhVien)
                .addGap(7, 7, 7)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHoTenSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtNgaySinhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtDiaChiSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMSSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoDTSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel20)
                    .addComponent(txtNienKhoaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCMNDSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtDanTocSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtTonGiaoSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtGioiTinhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNganhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtMaTKSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLuuSinhVien)
                    .addComponent(btnXoaSinhVien))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        //PromptSupport.setPrompt("Gợi ý ngắn", txtTimKiemSinhVien);
        txtTimKiemSinhVien.setText("vd: 312141, Anh, Sư Phạm, ...");
        txtTimKiemSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimKiemSinhVienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pninfoLayout = new javax.swing.GroupLayout(pninfo);
        pninfo.setLayout(pninfoLayout);
        pninfoLayout.setHorizontalGroup(
            pninfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pninfoLayout.createSequentialGroup()
                .addGap(631, 631, 631)
                .addComponent(btnThemSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiemSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiemSinhVien)
                .addGap(12, 12, 12))
            .addComponent(scpStudentList, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnMoreInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pninfoLayout.setVerticalGroup(
            pninfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pninfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pninfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTimKiemSinhVien, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTimKiemSinhVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThemSinhVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpStudentList, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMoreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout studentinfoLayout = new javax.swing.GroupLayout(studentinfo);
        studentinfo.setLayout(studentinfoLayout);
        studentinfoLayout.setHorizontalGroup(
            studentinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pninfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        studentinfoLayout.setVerticalGroup(
            studentinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pninfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(studentinfo, "card6");

        changeFrame.setBackground(new java.awt.Color(255, 255, 255));

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(btnMetal);
        btnGroup.add(btnNimbus);
        btnGroup.add(btnMotif);
        btnGroup.add(btnWindow);
        btnGroup.add(btnWindowClassic);
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        btnMetal.setBackground(new java.awt.Color(255, 255, 255));
        btnMetal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMetal.setText("Metal");
        btnMetal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetalActionPerformed(evt);
            }
        });

        btnWindow.setBackground(new java.awt.Color(255, 255, 255));
        btnWindow.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnWindow.setSelected(true);
        btnWindow.setText("Window");
        btnWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWindowActionPerformed(evt);
            }
        });

        btnWindowClassic.setBackground(new java.awt.Color(255, 255, 255));
        btnWindowClassic.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnWindowClassic.setText("WindowClassic");
        btnWindowClassic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWindowClassicActionPerformed(evt);
            }
        });

        btnMotif.setBackground(new java.awt.Color(255, 255, 255));
        btnMotif.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMotif.setText("Motif");
        btnMotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotifActionPerformed(evt);
            }
        });

        btnNimbus.setBackground(new java.awt.Color(255, 255, 255));
        btnNimbus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnNimbus.setText("Nimbus");
        btnNimbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNimbusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWindow)
                    .addComponent(btnNimbus)
                    .addComponent(btnMotif)
                    .addComponent(btnWindowClassic)
                    .addComponent(btnMetal))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnMetal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNimbus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMotif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWindow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWindowClassic)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel21.setText("Thay đổi giao diện");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setText("Thay đổi mật khẩu");

        jPanel8.setOpaque(false);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel22.setText("Nhập mật khẩu cũ");

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField7.setText("jTextField7");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTextField7)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel10.setOpaque(false);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel24.setText("Nhập mật khẩu mới");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField9.setText("jTextField7");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTextField9)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel9.setOpaque(false);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel23.setText("Xác nhận lại mật khẩu mới");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField8.setText("jTextField7");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23)
            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout changeFrameLayout = new javax.swing.GroupLayout(changeFrame);
        changeFrame.setLayout(changeFrameLayout);
        changeFrameLayout.setHorizontalGroup(
            changeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeFrameLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        changeFrameLayout.setVerticalGroup(
            changeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout settingsLayout = new javax.swing.GroupLayout(settings);
        settings.setLayout(settingsLayout);
        settingsLayout.setHorizontalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addComponent(changeFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        settingsLayout.setVerticalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(changeFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(settings, "card7");

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1147, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInformationActionPerformed
        mainPanel.removeAll();
        mainPanel.add(personalInfo);
        mainPanel.repaint();
        mainPanel.revalidate();
    }// GEN-LAST:event_btnInformationActionPerformed

    private void btnSubjectRegistrationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSubjectRegistrationActionPerformed
        mainPanel.removeAll();
        mainPanel.add(subjectRegistration);
        mainPanel.repaint();
        mainPanel.revalidate();
    }// GEN-LAST:event_btnSubjectRegistrationActionPerformed

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnScheduleActionPerformed
        mainPanel.removeAll();
        mainPanel.add(schedule);
        mainPanel.repaint();
        mainPanel.revalidate();
    }// GEN-LAST:event_btnScheduleActionPerformed

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnScoreActionPerformed
        // TODO add your handling code here:
        // Loại bỏ tất cả components trong container mainPanel
        mainPanel.removeAll();
        // Thêm component liên quan đến btnScore button
        mainPanel.add(score);
        // Không thể bị Override
        // Đơn giản là nó yêu cầu một thành phần (ở đây nó là component score) vẽ đi vẽ
        // lại như 1 chu trình vòng lặp
        mainPanel.repaint();
        // Thông thường hàm revalidate sẽ được sử dụng trên 1 container nào đó khi mà m
        // thêm 1 component mới hoặc xóa component cũ
        // và nó sẽ gọi thèn layout parent tính toán lại kích thước
        // Có lẽ sẽ phù hợp cho responsive

        mainPanel.revalidate();
        new KetQuaBUS().addRowData(jTable2);

    }// GEN-LAST:event_btnScoreActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton7ActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn đăng xuất không");
        if (choice == 0) {
            dispose();
            new Login().setVisible(true);
        }
    }// GEN-LAST:event_btnChangePasswordActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField6ActionPerformed


    private void studentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentListActionPerformed

        mainPanel.removeAll(); // xóa hết nội dung vùng content
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(studentinfo);
        SinhVienBUS.showStudentList(tblStudentList); // dòng này bị lag nè
        closeMenuActionPerformed(null); //tắt cái menu khu bấm zo nút
        btnDongSinhVienActionPerformed(null);
        mainPanel.repaint();
        mainPanel.revalidate();

    }//GEN-LAST:event_studentListActionPerformed

    private void btnSuaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSinhVienActionPerformed
        if (tblStudentList.getSelectedRow() != -1) {
            svCu = SinhVienBUS.getSinhVienFromMoreInfo(this);
            SinhVienBUS.updateSinhVien(this);
        }
    }//GEN-LAST:event_btnSuaSinhVienActionPerformed

    private void btnLuuSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuSinhVienActionPerformed
        SinhVien svMoi = SinhVienBUS.getSinhVienFromMoreInfo(this);
        if (SinhVienBUS.checkAllInfo(svMoi)) {
            if (btnSuaSinhVien.isVisible()) {   // cái này là lưu khi sinh viên được sửa
                SinhVienBUS.updateSinhVienToServer(this, svCu, svMoi);
            } else {           // cái này lưu khi sinh viên được thêm
                SinhVienBUS.addSinhVienToServer(this, svMoi);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Thông tin không hợp lệ !");
        }
    }//GEN-LAST:event_btnLuuSinhVienActionPerformed

    private void btnXoaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSinhVienActionPerformed

        int a = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa sinh viên này ?", "Xóa Sinh Viên", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            new SinhVienDAO().delete(SinhVienBUS.StudentinTable(tblStudentList, tblStudentList.getSelectedRow()).getMaSV());
            btnDongSinhVienActionPerformed(null);
        }

    }//GEN-LAST:event_btnXoaSinhVienActionPerformed

    private void tblStudentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentListMouseClicked

        btnDongSinhVienActionPerformed(null);
        pnMoreInfo.setVisible(true);
        SinhVienBUS.showMoreInfoStudent(this, SinhVienBUS.StudentinTable(tblStudentList, tblStudentList.getSelectedRow()));
    }//GEN-LAST:event_tblStudentListMouseClicked

    private void btnDongSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongSinhVienActionPerformed
        SinhVienBUS.resetJPanelMoreInfo(this);
    }//GEN-LAST:event_btnDongSinhVienActionPerformed

    private void txtNienKhoaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNienKhoaSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNienKhoaSinhVienActionPerformed

    private void txtGioiTinhSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGioiTinhSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGioiTinhSinhVienActionPerformed

    private void txtSoDTSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDTSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoDTSinhVienActionPerformed

    private void btnMetalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetalActionPerformed
        changeTheme(btnMetal, arrays[0]);

    }//GEN-LAST:event_btnMetalActionPerformed

    private void btnMotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotifActionPerformed
        changeTheme(btnMotif, arrays[2]);

    }//GEN-LAST:event_btnMotifActionPerformed

    private void btnNimbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNimbusActionPerformed
        changeTheme(btnNimbus, arrays[1]);

    }//GEN-LAST:event_btnNimbusActionPerformed

    private void btnWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWindowActionPerformed
        changeTheme(btnWindow, arrays[3]);

    }//GEN-LAST:event_btnWindowActionPerformed

    private void btnWindowClassicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWindowClassicActionPerformed
        changeTheme(btnWindowClassic, arrays[4]);

    }//GEN-LAST:event_btnWindowClassicActionPerformed

    private void btnAccountListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountListActionPerformed

    }//GEN-LAST:event_btnAccountListActionPerformed

    private void jPanel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel2AncestorAdded

    }//GEN-LAST:event_jPanel2AncestorAdded

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

    }//GEN-LAST:event_jPanel2MouseClicked
    //-------------------------------các hàm này kiểm tra đầu vào khi ta muốn sửa hoặc thêm sinh viên -------------------------------------------------
    private void txtHoTenSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtHoTenSinhVienCaretUpdate
        if (!SinhVienBUS.checkHoTen(txtHoTenSinhVien.getText())) {
            txtHoTenSinhVien.setBorder(new LineBorder(Color.red, 2)); // tạo màu cho khung độ rộng 2
        } else {
            txtHoTenSinhVien.setBorder(new LineBorder(Color.gray, 1));
        }
    }//GEN-LAST:event_txtHoTenSinhVienCaretUpdate

    private void txtMSSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMSSinhVienCaretUpdate
        if (!SinhVienBUS.checkMSSV(txtMSSinhVien.getText())) {
            txtMSSinhVien.setBorder(new LineBorder(Color.red, 2)); // tạo màu cho khung độ rộng 2
        } else {
            txtMSSinhVien.setBorder(new LineBorder(Color.gray, 1));
        }
    }//GEN-LAST:event_txtMSSinhVienCaretUpdate

    private void txtCMNDSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCMNDSinhVienCaretUpdate
        if (!SinhVienBUS.checkCMND(txtCMNDSinhVien.getText())) {
            txtCMNDSinhVien.setBorder(new LineBorder(Color.red, 2)); // tạo màu cho khung độ rộng 2
        } else {
            txtCMNDSinhVien.setBorder(new LineBorder(Color.gray, 1));
        }
    }//GEN-LAST:event_txtCMNDSinhVienCaretUpdate

    private void txtNganhSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNganhSinhVienCaretUpdate
        if (!SinhVienBUS.checkNganh(txtNganhSinhVien.getText())) {
            txtNganhSinhVien.setBorder(new LineBorder(Color.red, 2)); // tạo màu cho khung độ rộng 2
        } else {
            txtNganhSinhVien.setBorder(new LineBorder(Color.gray, 1));
        }
    }//GEN-LAST:event_txtNganhSinhVienCaretUpdate

    private void txtNgaySinhSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNgaySinhSinhVienCaretUpdate
        if (!SinhVienBUS.checkNgaySinh(txtNgaySinhSinhVien.getText())) {
            txtNgaySinhSinhVien.setBorder(new LineBorder(Color.red, 2)); // tạo màu cho khung độ rộng 2
        } else {
            txtNgaySinhSinhVien.setBorder(new LineBorder(Color.gray, 1));
        }
    }//GEN-LAST:event_txtNgaySinhSinhVienCaretUpdate

    private void txtSoDTSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSoDTSinhVienCaretUpdate
        if (!SinhVienBUS.checkSoDienThoai(txtSoDTSinhVien.getText())) {
            txtSoDTSinhVien.setBorder(new LineBorder(Color.red, 2)); // tạo màu cho khung độ rộng 2
        } else {
            txtSoDTSinhVien.setBorder(new LineBorder(Color.gray, 1));
        }
    }//GEN-LAST:event_txtSoDTSinhVienCaretUpdate

    private void txtGioiTinhSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtGioiTinhSinhVienCaretUpdate
        if (!SinhVienBUS.checkGioiTinh(txtGioiTinhSinhVien.getText())) {
            txtGioiTinhSinhVien.setBorder(new LineBorder(Color.red, 2)); // tạo màu cho khung độ rộng 2
        } else {
            txtGioiTinhSinhVien.setBorder(new LineBorder(Color.gray, 1));
        }
    }//GEN-LAST:event_txtGioiTinhSinhVienCaretUpdate

    private void txtMaTKSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMaTKSinhVienCaretUpdate
        if (!SinhVienBUS.checkMaTaiKhoan(txtMaTKSinhVien.getText())) {
            txtMaTKSinhVien.setBorder(new LineBorder(Color.red, 2)); // tạo màu cho khung độ rộng 2
        } else {
            txtMaTKSinhVien.setBorder(new LineBorder(Color.gray, 1));
        }
    }//GEN-LAST:event_txtMaTKSinhVienCaretUpdate

    private void txtDiaChiSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDiaChiSinhVienCaretUpdate
        if (!SinhVienBUS.checkDiaChi(txtDiaChiSinhVien.getText())) {
            txtDiaChiSinhVien.setBorder(new LineBorder(Color.red, 2)); // tạo màu cho khung độ rộng 2
        } else {
            txtDiaChiSinhVien.setBorder(new LineBorder(Color.gray, 1));
        }
    }//GEN-LAST:event_txtDiaChiSinhVienCaretUpdate

    private void txtNienKhoaSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNienKhoaSinhVienCaretUpdate
        if (!SinhVienBUS.checkNienKhoa(txtNienKhoaSinhVien.getText())) {
            txtNienKhoaSinhVien.setBorder(new LineBorder(Color.red, 2)); // tạo màu cho khung độ rộng 2
        } else {
            txtNienKhoaSinhVien.setBorder(new LineBorder(Color.gray, 1));
        }
    }//GEN-LAST:event_txtNienKhoaSinhVienCaretUpdate

    private void txtDanTocSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDanTocSinhVienCaretUpdate
        if (!SinhVienBUS.checkDanToc(txtDanTocSinhVien.getText())) {
            txtDanTocSinhVien.setBorder(new LineBorder(Color.red, 2)); // tạo màu cho khung độ rộng 2
        } else {
            txtDanTocSinhVien.setBorder(new LineBorder(Color.gray, 1));
        }
    }//GEN-LAST:event_txtDanTocSinhVienCaretUpdate

    private void txtTonGiaoSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTonGiaoSinhVienCaretUpdate
        if (!SinhVienBUS.checkTonGiao(txtTonGiaoSinhVien.getText())) {
            txtTonGiaoSinhVien.setBorder(new LineBorder(Color.red, 2)); // tạo màu cho khung độ rộng 2
        } else {
            txtTonGiaoSinhVien.setBorder(new LineBorder(Color.gray, 1));
        }
    }//GEN-LAST:event_txtTonGiaoSinhVienCaretUpdate

    private void btnTimKiemSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemSinhVienActionPerformed
        String condition = txtTimKiemSinhVien.getText();
        if (!condition.equals("") && !condition.equals("vd: 312141, Anh, Sư Phạm, ...")) {
            SinhVienBUS.showStudentListWithCondition(tblStudentList, condition);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập nội dung tìm kiếm\n Tên, Ngành, MSSV");
        }
    }//GEN-LAST:event_btnTimKiemSinhVienActionPerformed

    private void txtTimKiemSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemSinhVienMouseClicked
        txtTimKiemSinhVien.setText("");
    }//GEN-LAST:event_txtTimKiemSinhVienMouseClicked

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        mainPanel.removeAll();
        mainPanel.add(settings);
        mainPanel.repaint();
        mainPanel.validate();
    }//GEN-LAST:event_btnSettingActionPerformed

    private void btnThemSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSinhVienActionPerformed
        SinhVienBUS.addSinhVien(this);

    }//GEN-LAST:event_btnThemSinhVienActionPerformed
    // ------------------------------------------------------------------------------------------------------------------------------

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseClicked

    }// GEN-LAST:event_jTable1MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton8ActionPerformed

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_openMenuActionPerformed
        btnHeader.removeAll();
        btnHeader.add(closeMenu);
        btnHeader.repaint();
        btnHeader.revalidate();
        leftBar.setPreferredSize(new Dimension(widthBar, heightBar));

//        System.out.println(UIManager.getSystemLookAndFeelClassName());
    }

    private void closeMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_closeMenuActionPerformed
        btnHeader.removeAll();
        btnHeader.add(openMenu);
        btnHeader.repaint();
        btnHeader.revalidate();
        leftBar.setPreferredSize(new Dimension(0, heightBar));
        openMenu.updateUI();
    }

    private void changeTheme(JRadioButton btn, String themeText) {
        String text = UIManager.getSystemLookAndFeelClassName();
        if (text.equals(themeText)) {
            btn.setSelected(true);
        } else {
            btn.setSelected(true);
        }
        if (btn.isSelected()) {
            try {
                UIManager.setLookAndFeel(themeText);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException
                    | UnsupportedLookAndFeelException ignored) {
            }
        } else {

        }
        SwingUtilities.updateComponentTreeUI(this);
        this.invalidate();
        this.validate();
        this.repaint();
        schedule.repaint();
        schedule.validate();
    }

    public static void main(String args[]) {
//        javax.swing.plaf.nimbus.NimbusLookAndFeel
//com.sun.java.swing.plaf.windows.WindowsLookAndFeel
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException
                | UnsupportedLookAndFeelException ignored) {
        }
        new Table().setVisible(true);
    }

    public JPanel getPnMoreInfo() {
        return pnMoreInfo;
    }

    public void setPnMoreInfo(JPanel pnMoreInfo) {
        this.pnMoreInfo = pnMoreInfo;
    }

    public JButton getBtnDongSinhVien() {
        return btnDongSinhVien;
    }

    public JButton getBtnLuuSinhVien() {
        return btnLuuSinhVien;
    }

    public JButton getBtnSuaSinhVien() {
        return btnSuaSinhVien;
    }

    public JButton getBtnThemSinhVien() {
        return btnThemSinhVien;
    }

    public JButton getBtnTimSinhVien() {
        return btnTimKiemSinhVien;
    }

    public JButton getBtnXoaSinhVien() {
        return btnXoaSinhVien;
    }

    public JTextField getTxtNienKhoaSinhVien() {
        return txtNienKhoaSinhVien;
    }

//    JTable studentTable = new JTable();
    public void setTxtNienKhoaSinhVien(String txtNienKhoaSinhVien) {
        this.txtNienKhoaSinhVien.setText(txtNienKhoaSinhVien);
    }

    public JTextField getTxtCMNDSinhVien() {
        return txtCMNDSinhVien;
    }

    public void setTxtCMNDSinhVien(String txtCMNDSinhVien) {
        this.txtCMNDSinhVien.setText(txtCMNDSinhVien);
    }

    public JTextField getTxtDanTocSinhVien() {
        return txtDanTocSinhVien;
    }

    public void setTxtDanTocSinhVien(String txtDanTocSinhVien) {
        this.txtDanTocSinhVien.setText(txtDanTocSinhVien);
    }

    public JTextField getTxtDiaChiSinhVien() {
        return txtDiaChiSinhVien;
    }

    public void setTxtDiaChiSinhVien(String txtDiaChiSinhVien) {
        this.txtDiaChiSinhVien.setText(txtDiaChiSinhVien);
    }

    public JTextField getTxtGioiTinhSinhVien() {
        return txtGioiTinhSinhVien;
    }

    public void setTxtGioiTinhSinhVien(String txtGioiTinhSinhVien) {
        this.txtGioiTinhSinhVien.setText(txtGioiTinhSinhVien);
    }

    public JTextField getTxtHoTenSinhVien() {
        return txtHoTenSinhVien;
    }

    public void setTxtHoTenSinhVien(String txtHoTenSinhVien) {
        this.txtHoTenSinhVien.setText(txtHoTenSinhVien);
    }

    public JTextField getTxtMSSinhVien() {
        return txtMSSinhVien;
    }

    public void setTxtMSSinhVien(String txtMSSinhVien) {
        this.txtMSSinhVien.setText(txtMSSinhVien);
    }

    public JTextField getTxtMaTKSinhVien() {
        return txtMaTKSinhVien;
    }

    public void setTxtMaTKSinhVien(String txtMaTKSinhVien) {
        this.txtMaTKSinhVien.setText(txtMaTKSinhVien);
    }

    public JTextField getTxtNganhSinhVien() {
        return txtNganhSinhVien;
    }

    public void setTxtNganhSinhVien(String txtNganhSinhVien) {
        this.txtNganhSinhVien.setText(txtNganhSinhVien);
    }

    public JTextField getTxtNgaySinhSinhVien() {
        return txtNgaySinhSinhVien;
    }

    public void setTxtNgaySinhSinhVien(String txtNgaySinhSinhVien) {
        this.txtNgaySinhSinhVien.setText(txtNgaySinhSinhVien);
    }

    public JTextField getTxtSoDTSinhVien() {
        return txtSoDTSinhVien;
    }

    public void setTxtSoDTSinhVien(String txtSoDTSinhVien) {
        this.txtSoDTSinhVien.setText(txtSoDTSinhVien);
    }

    public JTextField getTxtTonGiaoSinhVien() {
        return txtTonGiaoSinhVien;
    }

    public void setTxtTonGiaoSinhVien(String txtTonGiaoSinhVien) {
        this.txtTonGiaoSinhVien.setText(txtTonGiaoSinhVien);
    }
    SinhVien svCu = new SinhVien();
    //    StudentInfo info = new StudentInfo();

    public JButton getBtnInformation() {
        return btnInformation;
    }

    public JButton getBtnSchedule() {
        return btnSchedule;
    }

    public JButton getBtnScore() {
        return btnScore;
    }

    public JButton getBtnSubjectRegistration() {
        return btnSubjectRegistration;
    }

    public JButton getGroup() {
        return group;
    }

    public JButton getInputPoint() {
        return inputPoint;
    }

    public JButton getjButton12() {
        return jButton12;
    }

    public JButton getjButton13() {
        return jButton13;
    }

    public JButton getjButton7() {
        return jButton7;
    }

    public JButton getjButton8() {
        return jButton8;
    }

    public JButton getjButton9() {
        return jButton9;
    }

    public JButton getStudentList() {
        return studentList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel address;
    private javax.swing.JButton btnAccountList;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnDongSinhVien;
    private javax.swing.JPanel btnHeader;
    private javax.swing.JButton btnInformation;
    private javax.swing.JButton btnLuuSinhVien;
    private javax.swing.JRadioButton btnMetal;
    private javax.swing.JRadioButton btnMotif;
    private javax.swing.JRadioButton btnNimbus;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JButton btnScholastic;
    private javax.swing.JButton btnScore;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnSuaSinhVien;
    private javax.swing.JButton btnSubjectRegistration;
    private javax.swing.JButton btnThemSinhVien;
    private javax.swing.JButton btnTimKiemSinhVien;
    private javax.swing.JButton btnTool;
    private javax.swing.JRadioButton btnWindow;
    private javax.swing.JRadioButton btnWindowClassic;
    private javax.swing.JButton btnXoaSinhVien;
    private javax.swing.JPanel changeFrame;
    private javax.swing.JPanel classID;
    private javax.swing.JButton closeMenu;
    private javax.swing.JPanel detailInformation;
    private javax.swing.JPanel fullName;
    private javax.swing.JButton group;
    private javax.swing.JPanel header;
    private javax.swing.JPanel idUniversity;
    private javax.swing.JButton inputPoint;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel leftBar;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel major;
    private javax.swing.JPanel major1;
    private javax.swing.JButton openMenu;
    private javax.swing.JPanel personalInfo;
    private javax.swing.JPanel pnMoreInfo;
    private javax.swing.JPanel pninfo;
    private javax.swing.JLabel realTime;
    private javax.swing.JPanel schedule;
    private javax.swing.JPanel score;
    private javax.swing.JScrollPane scpStudentList;
    private javax.swing.JPanel settings;
    private javax.swing.JButton studentList;
    private javax.swing.JPanel studentinfo;
    private javax.swing.JPanel subjectRegistration;
    private javax.swing.JTable tblStudentList;
    private javax.swing.JTextField txtCMNDSinhVien;
    private javax.swing.JTextField txtDanTocSinhVien;
    private javax.swing.JTextField txtDiaChiSinhVien;
    private javax.swing.JTextField txtGioiTinhSinhVien;
    private javax.swing.JTextField txtHoTenSinhVien;
    private javax.swing.JTextField txtMSSinhVien;
    private javax.swing.JTextField txtMaTKSinhVien;
    private javax.swing.JTextField txtNganhSinhVien;
    private javax.swing.JTextField txtNgaySinhSinhVien;
    private javax.swing.JTextField txtNienKhoaSinhVien;
    private javax.swing.JTextField txtSoDTSinhVien;
    private javax.swing.JTextField txtTimKiemSinhVien;
    private javax.swing.JTextField txtTonGiaoSinhVien;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            try {
                int hour, minutes, second;
                Calendar cal = Calendar.getInstance();
                hour = cal.get(Calendar.HOUR_OF_DAY);
                minutes = cal.get(Calendar.MINUTE);
                second = cal.get(Calendar.SECOND);
                SimpleDateFormat timeRun = new SimpleDateFormat("HH:mm:ss aa");
                Date date = cal.getTime();
                String text = timeRun.format(date);
                realTime.setText(text);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
