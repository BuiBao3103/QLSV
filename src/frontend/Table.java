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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Table extends javax.swing.JFrame implements Runnable {

    private Color yellow = new Color(255, 188, 0);
    private Color lightBlue = new Color(0, 158, 248);
    private Color darkBlue = new Color(0, 158, 248);
    private ArrayList<JButton> allBtnLeftBar = new ArrayList<>();
    private JButton currentBtn = null;
    private Schedule schedule = new Schedule();
    private Score score = new Score();
    private StudentInfor studentInfor = new StudentInfor();
    private PersonalInfo personalInfo = new PersonalInfo();
    private SubjectRegistration subjectRegistration = new SubjectRegistration();
    private int widthBar = 226;
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
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logologinsmaller.png")));
        t.start();
        leftBar.setPreferredSize(new Dimension(0, heightBar));
        allBtnLeftBar.addAll(Arrays.asList(btnInformation, btnSubjectRegistration, btnSchedule, btnScore,
                btnInputPoint, btnStudentList, btnGroup, btnSetting, btnAccountList, btnScholastic, btnTool));
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
        btnInputPoint = new javax.swing.JButton();
        btnStudentList = new javax.swing.JButton();
        btnGroup = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        btnAccountList = new javax.swing.JButton();
        btnScholastic = new javax.swing.JButton();
        btnTool = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        realTime = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnChangePassword = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
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
        setTitle("Student Manager");
        setBackground(new java.awt.Color(255, 255, 255));

        leftBar.setBackground(new java.awt.Color(204, 153, 255));
        leftBar.setMaximumSize(new java.awt.Dimension(32767, 600));
        leftBar.setOpaque(false);
        leftBar.setPreferredSize(new java.awt.Dimension(225, 450));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setColumnHeaderView(null);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(32767, 700));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(226, 600));
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);

        jPanel3.setBackground(new java.awt.Color(0, 158, 248));
        jPanel3.setPreferredSize(new java.awt.Dimension(225, 601));

        btnInformation.setBackground(new java.awt.Color(0, 158, 248));
        btnInformation.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInformation.setForeground(new java.awt.Color(255, 255, 255));
        btnInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/personalInfo.png"))); // NOI18N
        btnInformation.setText("Thông tin cá nhân");
        btnInformation.setAlignmentX(1.0F);
        btnInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        btnInformation.setContentAreaFilled(false);
        btnInformation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInformation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInformation.setOpaque(true);
        btnInformation.setPreferredSize(new java.awt.Dimension(190, 50));
        btnInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInformationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInformationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInformationMouseExited(evt);
            }
        });
        btnInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformationActionPerformed(evt);
            }
        });

        btnSubjectRegistration.setBackground(new java.awt.Color(0, 158, 248));
        btnSubjectRegistration.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSubjectRegistration.setForeground(new java.awt.Color(255, 255, 255));
        btnSubjectRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-book-and-pencil-30.png"))); // NOI18N
        btnSubjectRegistration.setText("Đăng kí môn học");
        btnSubjectRegistration.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        btnSubjectRegistration.setContentAreaFilled(false);
        btnSubjectRegistration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubjectRegistration.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSubjectRegistration.setOpaque(true);
        btnSubjectRegistration.setPreferredSize(new java.awt.Dimension(190, 50));
        btnSubjectRegistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubjectRegistrationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubjectRegistrationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubjectRegistrationMouseExited(evt);
            }
        });
        btnSubjectRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubjectRegistrationActionPerformed(evt);
            }
        });

        btnSchedule.setBackground(new java.awt.Color(0, 158, 248));
        btnSchedule.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSchedule.setForeground(new java.awt.Color(255, 255, 255));
        btnSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-calendar-30.png"))); // NOI18N
        btnSchedule.setText("Xem TKB");
        btnSchedule.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        btnSchedule.setContentAreaFilled(false);
        btnSchedule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSchedule.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSchedule.setOpaque(true);
        btnSchedule.setPreferredSize(new java.awt.Dimension(190, 50));
        btnSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnScheduleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnScheduleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnScheduleMouseExited(evt);
            }
        });
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });

        btnScore.setBackground(new java.awt.Color(0, 158, 248));
        btnScore.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnScore.setForeground(new java.awt.Color(255, 255, 255));
        btnScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-scorecard-30.png"))); // NOI18N
        btnScore.setText("Xem Điểm");
        btnScore.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        btnScore.setContentAreaFilled(false);
        btnScore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnScore.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnScore.setOpaque(true);
        btnScore.setPreferredSize(new java.awt.Dimension(190, 50));
        btnScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnScoreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnScoreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnScoreMouseExited(evt);
            }
        });
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });

        btnInputPoint.setBackground(new java.awt.Color(0, 158, 248));
        btnInputPoint.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInputPoint.setForeground(new java.awt.Color(255, 255, 255));
        btnInputPoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-database-import-30.png"))); // NOI18N
        btnInputPoint.setText("Nhập điểm");
        btnInputPoint.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        btnInputPoint.setContentAreaFilled(false);
        btnInputPoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInputPoint.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInputPoint.setOpaque(true);
        btnInputPoint.setPreferredSize(new java.awt.Dimension(200, 50));
        btnInputPoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInputPointMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInputPointMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInputPointMouseExited(evt);
            }
        });

        btnStudentList.setBackground(new java.awt.Color(0, 158, 248));
        btnStudentList.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnStudentList.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-user-groups-30.png"))); // NOI18N
        btnStudentList.setText("Danh sách sinh viên");
        btnStudentList.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        btnStudentList.setContentAreaFilled(false);
        btnStudentList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudentList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnStudentList.setOpaque(true);
        btnStudentList.setPreferredSize(new java.awt.Dimension(190, 50));
        btnStudentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStudentListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStudentListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStudentListMouseExited(evt);
            }
        });
        btnStudentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentListActionPerformed(evt);
            }
        });

        btnGroup.setBackground(new java.awt.Color(0, 158, 248));
        btnGroup.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnGroup.setForeground(new java.awt.Color(255, 255, 255));
        btnGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-google-classroom-30.png"))); // NOI18N
        btnGroup.setText("Nhóm môn học");
        btnGroup.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        btnGroup.setContentAreaFilled(false);
        btnGroup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGroup.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGroup.setOpaque(true);
        btnGroup.setPreferredSize(new java.awt.Dimension(190, 50));
        btnGroup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGroupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGroupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGroupMouseExited(evt);
            }
        });

        btnSetting.setBackground(new java.awt.Color(0, 158, 248));
        btnSetting.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSetting.setForeground(new java.awt.Color(255, 255, 255));
        btnSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-open-end-wrench-30.png"))); // NOI18N
        btnSetting.setText("Cài đặt");
        btnSetting.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        btnSetting.setContentAreaFilled(false);
        btnSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSetting.setOpaque(true);
        btnSetting.setPreferredSize(new java.awt.Dimension(202, 50));
        btnSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSettingMouseExited(evt);
            }
        });
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });

        btnAccountList.setBackground(new java.awt.Color(0, 158, 248));
        btnAccountList.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAccountList.setForeground(new java.awt.Color(255, 255, 255));
        btnAccountList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-user-menu-male-30.png"))); // NOI18N
        btnAccountList.setText("Quản lí tài khoản");
        btnAccountList.setToolTipText("");
        btnAccountList.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        btnAccountList.setContentAreaFilled(false);
        btnAccountList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccountList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAccountList.setOpaque(true);
        btnAccountList.setPreferredSize(new java.awt.Dimension(202, 50));
        btnAccountList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAccountListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAccountListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAccountListMouseExited(evt);
            }
        });
        btnAccountList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountListActionPerformed(evt);
            }
        });

        btnScholastic.setBackground(new java.awt.Color(0, 158, 248));
        btnScholastic.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnScholastic.setForeground(new java.awt.Color(255, 255, 255));
        btnScholastic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-cat-30.png"))); // NOI18N
        btnScholastic.setText("Quản lí năm học");
        btnScholastic.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        btnScholastic.setContentAreaFilled(false);
        btnScholastic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnScholastic.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnScholastic.setOpaque(true);
        btnScholastic.setPreferredSize(new java.awt.Dimension(202, 50));
        btnScholastic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnScholasticMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnScholasticMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnScholasticMouseExited(evt);
            }
        });

        btnTool.setBackground(new java.awt.Color(0, 158, 248));
        btnTool.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnTool.setForeground(new java.awt.Color(255, 255, 255));
        btnTool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-tools-30.png"))); // NOI18N
        btnTool.setText("Công cụ");
        btnTool.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        btnTool.setContentAreaFilled(false);
        btnTool.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTool.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTool.setOpaque(true);
        btnTool.setPreferredSize(new java.awt.Dimension(202, 50));
        btnTool.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToolMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnToolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnToolMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAccountList, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
            .addComponent(btnScholastic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSubjectRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInputPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnStudentList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSetting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnInputPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnStudentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAccountList, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnScholastic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTool, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 164, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout leftBarLayout = new javax.swing.GroupLayout(leftBar);
        leftBar.setLayout(leftBarLayout);
        leftBarLayout.setHorizontalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );
        leftBarLayout.setVerticalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE))
        );

        getContentPane().add(leftBar, java.awt.BorderLayout.LINE_START);

        header.setBackground(new java.awt.Color(0, 128, 215));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setPreferredSize(new java.awt.Dimension(1025, 60));
        header.setRequestFocusEnabled(false);

        realTime.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        realTime.setForeground(new java.awt.Color(255, 255, 255));
        realTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jPanel4.setBackground(new java.awt.Color(0, 128, 215));

        btnChangePassword.setBackground(new java.awt.Color(0, 128, 215));
        btnChangePassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/logout.png"))); // NOI18N
        btnChangePassword.setText("Đăng xuất");
        btnChangePassword.setToolTipText("");
        btnChangePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnChangePassword.setContentAreaFilled(false);
        btnChangePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangePassword.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnChangePassword.setMaximumSize(new java.awt.Dimension(150, 40));
        btnChangePassword.setMinimumSize(new java.awt.Dimension(80, 60));
        btnChangePassword.setName(""); // NOI18N
        btnChangePassword.setPreferredSize(new java.awt.Dimension(150, 50));
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 128, 215));

        btnHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnHeader.setOpaque(false);
        btnHeader.setPreferredSize(new java.awt.Dimension(60, 60));
        btnHeader.setLayout(new java.awt.CardLayout());

        openMenu.setBackground(new java.awt.Color(0, 128, 215));
        openMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-menu-30.png"))); // NOI18N
        openMenu.setBorder(null);
        openMenu.setContentAreaFilled(false);
        openMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openMenu.setOpaque(true);
        openMenu.setPreferredSize(new java.awt.Dimension(60, 60));
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        btnHeader.add(openMenu, "card2");

        closeMenu.setBackground(new java.awt.Color(0, 128, 215));
        closeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-30.png"))); // NOI18N
        closeMenu.setBorder(null);
        closeMenu.setContentAreaFilled(false);
        closeMenu.setOpaque(true);
        closeMenu.setPreferredSize(new java.awt.Dimension(60, 60));
        closeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenuActionPerformed(evt);
            }
        });
        btnHeader.add(closeMenu, "card2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(btnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(realTime, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(realTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        jPanel2 = new RoundedPanel(15);
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
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWindowClassic)
                    .addComponent(btnNimbus)
                    .addComponent(btnMetal)
                    .addComponent(btnMotif)
                    .addComponent(btnWindow))
                .addGap(0, 175, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMetal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNimbus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMotif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWindow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWindowClassic)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel21.setText("Thay đổi giao diện");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
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
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
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
                .addGap(0, 413, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(1147, 793));
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

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn đăng xuất không", "Đăng xuất", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == 0) {
            dispose();
            new Login().setVisible(true);
        }
    }// GEN-LAST:event_btnChangePasswordActionPerformed


    private void btnStudentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentListActionPerformed

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
    }//GEN-LAST:event_btnStudentListActionPerformed

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
        btnSetting.setBackground(yellow);
        currentBtn = btnSetting;
    }//GEN-LAST:event_btnSettingActionPerformed

    private void btnSubjectRegistrationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubjectRegistrationMouseEntered
        hoverButton(btnSubjectRegistration, yellow);
    }//GEN-LAST:event_btnSubjectRegistrationMouseEntered

    private void btnScheduleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScheduleMouseEntered
        hoverButton(btnSchedule, yellow);

    }//GEN-LAST:event_btnScheduleMouseEntered

    private void btnScoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScoreMouseEntered
        hoverButton(btnScore, yellow);

    }//GEN-LAST:event_btnScoreMouseEntered

    private void btnStudentListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentListMouseEntered
        hoverButton(btnStudentList, yellow);

    }//GEN-LAST:event_btnStudentListMouseEntered

    private void btnAccountListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccountListMouseEntered
        hoverButton(btnAccountList, yellow);

    }//GEN-LAST:event_btnAccountListMouseEntered

    private void btnScholasticMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScholasticMouseEntered
        hoverButton(btnScholastic, yellow);

    }//GEN-LAST:event_btnScholasticMouseEntered

    private void btnToolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToolMouseEntered
        hoverButton(btnTool, yellow);

    }//GEN-LAST:event_btnToolMouseEntered

    private void btnSettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseEntered
        hoverButton(btnSetting, yellow);

    }//GEN-LAST:event_btnSettingMouseEntered

    private void btnSubjectRegistrationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubjectRegistrationMouseExited
        if (btnSubjectRegistration != currentBtn) {
            hoverButton(btnSubjectRegistration, lightBlue);
        }

    }//GEN-LAST:event_btnSubjectRegistrationMouseExited

    private void btnScheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScheduleMouseExited
        if (btnSchedule != currentBtn) {
            hoverButton(btnSchedule, lightBlue);
        }

    }//GEN-LAST:event_btnScheduleMouseExited

    private void btnScoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScoreMouseExited
        if (btnScore != currentBtn) {
            hoverButton(btnScore, lightBlue);
        }

    }//GEN-LAST:event_btnScoreMouseExited

    private void btnStudentListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentListMouseExited
        if (btnStudentList != currentBtn) {
            hoverButton(btnStudentList, lightBlue);
        }

    }//GEN-LAST:event_btnStudentListMouseExited

    private void btnGroupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGroupMouseEntered
        hoverButton(btnGroup, yellow);

    }//GEN-LAST:event_btnGroupMouseEntered

    private void btnGroupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGroupMouseExited
        if (btnGroup != currentBtn) {
            hoverButton(btnGroup, lightBlue);
        }

    }//GEN-LAST:event_btnGroupMouseExited

    private void btnAccountListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccountListMouseExited
        if (btnAccountList != currentBtn) {
            hoverButton(btnAccountList, lightBlue);
        }

    }//GEN-LAST:event_btnAccountListMouseExited

    private void btnScholasticMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScholasticMouseExited
        if (btnScholastic != currentBtn) {
            hoverButton(btnScholastic, lightBlue);
        }

    }//GEN-LAST:event_btnScholasticMouseExited

    private void btnToolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToolMouseExited
        if (btnTool != currentBtn) {
            hoverButton(btnTool, lightBlue);
        }

    }//GEN-LAST:event_btnToolMouseExited

    private void btnSettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseExited
        if (btnSetting != currentBtn) {
            hoverButton(btnSetting, lightBlue);
        }
    }//GEN-LAST:event_btnSettingMouseExited

    private void btnInputPointMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputPointMouseEntered
        hoverButton(btnInputPoint, yellow);

    }//GEN-LAST:event_btnInputPointMouseEntered

    private void btnInputPointMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputPointMouseExited
        if (btnInputPoint != currentBtn) {
            hoverButton(btnInputPoint, lightBlue);
        }
    }//GEN-LAST:event_btnInputPointMouseExited

    private void btnInformationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformationMouseExited
        if (currentBtn != btnInformation) {
            hoverButton(btnInformation, lightBlue);
        }
    }//GEN-LAST:event_btnInformationMouseExited

    private void btnInformationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformationMouseEntered
        // TODO add your handling code here:        
        hoverButton(btnInformation, yellow);

    }//GEN-LAST:event_btnInformationMouseEntered

    private void btnInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformationMouseClicked
        setBackgroundDefaultAllButton();
        btnInformation.setBackground(yellow);
        currentBtn = btnInformation;
    }//GEN-LAST:event_btnInformationMouseClicked

    private void btnSubjectRegistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubjectRegistrationMouseClicked
        setBackgroundDefaultAllButton();
        btnSubjectRegistration.setBackground(yellow);
        currentBtn = btnSubjectRegistration;
    }//GEN-LAST:event_btnSubjectRegistrationMouseClicked

    private void btnScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScheduleMouseClicked
        setBackgroundDefaultAllButton();
        btnSchedule.setBackground(yellow);
        currentBtn = btnSchedule;
    }//GEN-LAST:event_btnScheduleMouseClicked

    private void btnScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScoreMouseClicked
        setBackgroundDefaultAllButton();
        btnScore.setBackground(yellow);
        currentBtn = btnScore;
    }//GEN-LAST:event_btnScoreMouseClicked

    private void btnInputPointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInputPointMouseClicked
        setBackgroundDefaultAllButton();
        btnInputPoint.setBackground(yellow);
        currentBtn = btnInputPoint;
    }//GEN-LAST:event_btnInputPointMouseClicked

    private void btnStudentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentListMouseClicked
        setBackgroundDefaultAllButton();
        btnStudentList.setBackground(yellow);
        currentBtn = btnStudentList;
    }//GEN-LAST:event_btnStudentListMouseClicked

    private void btnGroupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGroupMouseClicked
        setBackgroundDefaultAllButton();
        btnGroup.setBackground(yellow);
        currentBtn = btnGroup;
    }//GEN-LAST:event_btnGroupMouseClicked

    private void btnAccountListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccountListMouseClicked
        setBackgroundDefaultAllButton();
        btnAccountList.setBackground(yellow);
        currentBtn = btnAccountList;
    }//GEN-LAST:event_btnAccountListMouseClicked

    private void btnScholasticMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScholasticMouseClicked
        setBackgroundDefaultAllButton();
        btnScholastic.setBackground(yellow);
        currentBtn = btnScholastic;
    }//GEN-LAST:event_btnScholasticMouseClicked

    private void btnToolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToolMouseClicked
        setBackgroundDefaultAllButton();
        btnTool.setBackground(yellow);
        currentBtn = btnTool;
    }//GEN-LAST:event_btnToolMouseClicked

    private void btnSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseClicked
        setBackgroundDefaultAllButton();
        btnSetting.setBackground(yellow);
        currentBtn = btnSetting;
    }//GEN-LAST:event_btnSettingMouseClicked
    // ------------------------------------------------------------------------------------------------------------------------------

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_openMenuActionPerformed
        btnHeader.removeAll();
        btnHeader.add(closeMenu);
        btnHeader.repaint();
        btnHeader.revalidate();
        openMenu();
//        System.out.println(UIManager.getSystemLookAndFeelClassName());
    }

    public void openMenu() {
        int initialWidth = leftBar.getPreferredSize().width;
        int steps = 100 / 10; // 10 ms interval between each step
        int stepWidth = widthBar / steps;

        Timer timer = new Timer(10, new ActionListener() {
            int currentWidth = initialWidth;

            @Override
            public void actionPerformed(ActionEvent e) {
                currentWidth += stepWidth;
                if (currentWidth >= widthBar) {
                    currentWidth = widthBar;
                    ((Timer) e.getSource()).stop();
                }
                Dimension newPreferredSize = new Dimension(currentWidth, leftBar.getPreferredSize().height);
                leftBar.setPreferredSize(newPreferredSize);
                leftBar.revalidate();
            }
        });
        timer.start();
    }

    private void closeMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_closeMenuActionPerformed
        btnHeader.removeAll();
        btnHeader.add(openMenu);
        btnHeader.repaint();
        btnHeader.revalidate();
        closeMenu();
        openMenu.updateUI();
    }

    public void closeMenu() {
        int initialWidth = leftBar.getPreferredSize().width;
        int steps = 100 / 10; // 10 ms interval between each step
        int stepWidth = initialWidth / steps;

        Timer timer = new Timer(10, new ActionListener() {
            int currentWidth = initialWidth;

            @Override
            public void actionPerformed(ActionEvent e) {
                currentWidth -= stepWidth;
                if (currentWidth <= 0) {
                    currentWidth = 0;
                    ((Timer) e.getSource()).stop();
                }
                Dimension newPreferredSize = new Dimension(currentWidth, leftBar.getPreferredSize().height);
                leftBar.setPreferredSize(newPreferredSize);
                leftBar.revalidate();
            }
        });
        timer.start();
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

    private void hoverButton(JButton button, Color color) {
        button.setBackground(color);
    }

    private void clickBgButton(JButton button, JPanel panel) {
        button.setBackground(yellow);
        Component[] components = panel.getComponents();
        for (Component component : components) {
            // check if the component is a JButton
            if (component instanceof JButton) {
                JButton btn = (JButton) component;
//                if(btn.getBackground() == new Color(255,188,0)){
//                    System.out.println(btn.getIcon());
//                }
            }
        }
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
        return btnGroup;
    }

    public JButton getInputPoint() {
        return btnInputPoint;
    }

    public JButton getStudentList() {
        return btnStudentList;
    }

    class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint border
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccountList;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnGroup;
    private javax.swing.JPanel btnHeader;
    private javax.swing.JButton btnInformation;
    private javax.swing.JButton btnInputPoint;
    private javax.swing.JRadioButton btnMetal;
    private javax.swing.JRadioButton btnMotif;
    private javax.swing.JRadioButton btnNimbus;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JButton btnScholastic;
    private javax.swing.JButton btnScore;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnStudentList;
    private javax.swing.JButton btnSubjectRegistration;
    private javax.swing.JButton btnTool;
    private javax.swing.JRadioButton btnWindow;
    private javax.swing.JRadioButton btnWindowClassic;
    private javax.swing.JPanel changeFrame;
    private javax.swing.JButton closeMenu;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel leftBar;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton openMenu;
    private javax.swing.JLabel realTime;
    private javax.swing.JPanel settings;
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

    public void setBackgroundDefaultAllButton() {
        for (JButton btn : allBtnLeftBar) {
            btn.setBackground(lightBlue);
        }
    }

}
