/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.KetQua.KetQuaBUS;
import backend.Nhom.NhomBUS;
import backend.QLSinhVien.*;
import frontend.mainPanel.SubjectRegistration;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import java.awt.*;

public class Table extends javax.swing.JFrame implements Runnable {

    private Schedule schedule = new Schedule();
    private Score score = new Score();
    private StudentInfor studentInfor = new StudentInfor();
    private PersonalInfo personalInfo = new PersonalInfo();
    private SubjectRegistration subjectRegistration = new SubjectRegistration();
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
        initComponents();
        t.start();
        leftBar.setPreferredSize(new Dimension(0, heightBar));

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
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        btnAccountList = new javax.swing.JButton();
        btnScholastic = new javax.swing.JButton();
        btnTool = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        inputPoint = new javax.swing.JButton();
        studentList = new javax.swing.JButton();
        group = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        btnChangePassword = new javax.swing.JButton();
        realTime = new javax.swing.JLabel();
        btnHeader = new javax.swing.JPanel();
        openMenu = new javax.swing.JButton();
        closeMenu = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
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

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 0));
        jSeparator1.setOpaque(true);

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setOpaque(true);

        btnAccountList.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAccountList.setText("Quản lí tài khoản");
        btnAccountList.setToolTipText("");
        btnAccountList.setPreferredSize(new java.awt.Dimension(202, 50));
        btnAccountList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountListActionPerformed(evt);
            }
        });

        btnScholastic.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnScholastic.setText("Quản lí năm học");
        btnScholastic.setPreferredSize(new java.awt.Dimension(202, 50));

        btnTool.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnTool.setText("Công cụ");
        btnTool.setPreferredSize(new java.awt.Dimension(202, 50));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnAccountList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnScholastic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAccountList, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnScholastic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTool, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        inputPoint.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputPoint.setText("Nhập điểm");
        inputPoint.setPreferredSize(new java.awt.Dimension(200, 50));

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

        btnSetting.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSetting.setText("Cài đặt");
        btnSetting.setPreferredSize(new java.awt.Dimension(202, 50));
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInformation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSubjectRegistration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSchedule, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnScore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studentList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(group, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 0, 0))
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
                .addComponent(inputPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(studentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(group, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
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
        btnChangePassword.setPreferredSize(new java.awt.Dimension(150, 50));
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
                .addGap(0, 62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
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
            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
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

        setSize(new java.awt.Dimension(1147, 544));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInformationActionPerformed
        mainPanel.removeAll();
        mainPanel.add(personalInfo);
        mainPanel.repaint();
        mainPanel.revalidate();
        SinhVienBUS sv = new SinhVienBUS();
        sv.pesronnalInfor(personalInfo);
        
    }// GEN-LAST:event_btnInformationActionPerformed

    private void btnSubjectRegistrationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSubjectRegistrationActionPerformed
        mainPanel.removeAll();
        mainPanel.add(subjectRegistration);
        mainPanel.repaint();
        mainPanel.revalidate();
        NhomBUS.showGroupSuggestions(subjectRegistration.getTblNhomMonHoc());
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
        new KetQuaBUS().addRowData(score.getjTable2());

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
        mainPanel.add(studentInfor);
        SinhVienBUS.showStudentList(studentInfor, 1); //hiện 20 sinh viên trang 1
        closeMenuActionPerformed(null); //tắt cái menu khu bấm zo nút
        SinhVienBUS.setCbNganhSinhVien(studentInfor); // cái này nó thêm mấy cái lựa chọn cho cái ngành sinh viên
        studentInfor.btnDongSinhVienActionPerformed(null);
        studentInfor.getBtnKhoiPhucSinhVien().setVisible(false); // ẩn cái nút khôi phục sinh viên
        mainPanel.repaint();
        mainPanel.revalidate();

    }//GEN-LAST:event_studentListActionPerformed

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

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        mainPanel.removeAll();
        mainPanel.add(settings);
        mainPanel.repaint();
        mainPanel.validate();
    }//GEN-LAST:event_btnSettingActionPerformed
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

//    public void setCbNganhSinhVien(ArrayList<String> dsTenNganh) {
//        cbNganhSinhVien.removeAllItems();
//        for (String i : dsTenNganh) {
//            cbNganhSinhVien.addItem(i);
//        }
//    }
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

    public JButton getStudentList() {
        return studentList;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccountList;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JPanel btnHeader;
    private javax.swing.JButton btnInformation;
    private javax.swing.JRadioButton btnMetal;
    private javax.swing.JRadioButton btnMotif;
    private javax.swing.JRadioButton btnNimbus;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JButton btnScholastic;
    private javax.swing.JButton btnScore;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnSubjectRegistration;
    private javax.swing.JButton btnTool;
    private javax.swing.JRadioButton btnWindow;
    private javax.swing.JRadioButton btnWindowClassic;
    private javax.swing.JPanel changeFrame;
    private javax.swing.JButton closeMenu;
    private javax.swing.JButton group;
    private javax.swing.JPanel header;
    private javax.swing.JButton inputPoint;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel leftBar;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton openMenu;
    private javax.swing.JLabel realTime;
    private javax.swing.JPanel settings;
    private javax.swing.JButton studentList;
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
