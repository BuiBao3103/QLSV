/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.GiangVienBUS;
import BUS.SinhVienBUS;
import BUS.KetQuaBUS;
import BUS.NhomBUS;
import BUS.NienHocBUS;
import BUS.TaiKhoanBUS;
import GUI.MainPanel.ManagerYear;
import GUI.MainPanel.PersonalInfo;
import GUI.MainPanel.Schedule;
import GUI.MainPanel.Score;
import GUI.MainPanel.Settings;
import GUI.MainPanel.Statistics;
import GUI.MainPanel.StudentInfor;
import GUI.MainPanel.SubjectRegistration;
import GUI.MainPanel.Tool;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;

public class Table extends javax.swing.JFrame implements Runnable {

    private final Color yellow = new Color(255, 188, 0);
    private final Color lightBlue = new Color(0, 158, 248);
    private final Color darkBlue = new Color(0, 158, 248);
    private final ArrayList<JButton> allBtnLeftBar = new ArrayList<>();
    private JButton currentBtn = null;
    private final Settings settings = new Settings();
    private final Schedule schedule = new Schedule();
    private final Score score = new Score();
    private final StudentInfor studentInfor = new StudentInfor();
    private final PersonalInfo personalInfo = new PersonalInfo();
    private final SubjectRegistration subjectRegistration = new SubjectRegistration();
    private final Statistics statistics = new Statistics();
    private final ManagerYear managerYear = new ManagerYear();
    private final Tool tool = new Tool();
    private final int widthBar = 226;
    private final int heightBar = this.getHeight();

    /**
     * Creates new form TableInside
     */
    public Table() {
        Thread t = new Thread(this);
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resource/images/logologinsmaller.png")));
        t.start();
        leftBar.setPreferredSize(new Dimension(0, heightBar));
        allBtnLeftBar.addAll(Arrays.asList(btnInformation, btnSubjectRegistration, btnSchedule, btnScore,
                btnInputPoint, btnStudentList, btnGroup, btnSetting, btnAccountList, btnStatistics, btnTool));
        this.greeting();
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
        btnStatistics = new javax.swing.JButton();
        btnTool = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        realTime = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnHeader = new javax.swing.JPanel();
        openMenu = new javax.swing.JButton();
        closeMenu = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        greeting = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblQuote = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();

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
        btnInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/personalInfo.png"))); // NOI18N
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
        btnSubjectRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-book-and-pencil-30.png"))); // NOI18N
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
        btnSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-calendar-30.png"))); // NOI18N
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
        btnScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-scorecard-30.png"))); // NOI18N
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
        btnInputPoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-database-import-30.png"))); // NOI18N
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
        btnStudentList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-user-groups-30.png"))); // NOI18N
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
        btnGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-google-classroom-30.png"))); // NOI18N
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
        btnSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-open-end-wrench-30.png"))); // NOI18N
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
        btnAccountList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-cat-30.png"))); // NOI18N
        btnAccountList.setText("Quản lí năm học");
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

        btnStatistics.setBackground(new java.awt.Color(0, 158, 248));
        btnStatistics.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnStatistics.setForeground(new java.awt.Color(255, 255, 255));
        btnStatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-signal-30.png"))); // NOI18N
        btnStatistics.setText("Thống kê");
        btnStatistics.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        btnStatistics.setContentAreaFilled(false);
        btnStatistics.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStatistics.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnStatistics.setOpaque(true);
        btnStatistics.setPreferredSize(new java.awt.Dimension(202, 50));
        btnStatistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatisticsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStatisticsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStatisticsMouseExited(evt);
            }
        });
        btnStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatisticsActionPerformed(evt);
            }
        });

        btnTool.setBackground(new java.awt.Color(0, 158, 248));
        btnTool.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnTool.setForeground(new java.awt.Color(255, 255, 255));
        btnTool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-tools-30.png"))); // NOI18N
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
        btnTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAccountList, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
            .addComponent(btnStatistics, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTool, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
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

        btnLogout.setBackground(new java.awt.Color(0, 128, 215));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-import-30.png"))); // NOI18N
        btnLogout.setText("Đăng xuất");
        btnLogout.setToolTipText("");
        btnLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLogout.setMaximumSize(new java.awt.Dimension(150, 40));
        btnLogout.setMinimumSize(new java.awt.Dimension(80, 60));
        btnLogout.setName(""); // NOI18N
        btnLogout.setPreferredSize(new java.awt.Dimension(150, 50));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 128, 215));

        btnHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnHeader.setOpaque(false);
        btnHeader.setPreferredSize(new java.awt.Dimension(60, 60));
        btnHeader.setLayout(new java.awt.CardLayout());

        openMenu.setBackground(new java.awt.Color(0, 128, 215));
        openMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/icons8-menu-30.png"))); // NOI18N
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
        closeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/icons8-close-30.png"))); // NOI18N
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

        greeting.add(lblImg);

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblName.setText("Xin chào:");

        lblDate.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblDate.setText("Hôm nay là:");

        lblQuote.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblQuote.setText("Trích dẫn");

        lblAuthor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblAuthor.setText("Tác giả");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQuote, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQuote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAuthor)
                .addGap(16, 16, 16))
        );

        greeting.add(jPanel1);

        mainPanel.add(greeting, "card7");

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1147, 573));
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
        NhomBUS.showGroupRegistration(subjectRegistration.getTblNhomDangKy(), subjectRegistration.getLblTongTinChi());
        if (!NhomBUS.dangkyMon) {
            subjectRegistration.getAdd_btn().setVisible(false);
            subjectRegistration.getBtnXoa().setVisible(false);
        }

    }// GEN-LAST:event_btnSubjectRegistrationActionPerformed

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnScheduleActionPerformed
        mainPanel.removeAll();
        mainPanel.add(schedule);
        NhomBUS.addItemToCbChonHocKy(schedule); // dựa vào tài khoản đăng nhập mà thêm vào số học kì tương ứng
        schedule.getCbChonHocKy().setSelectedIndex(0); // chọn học kì về học kì hiện tại
        NhomBUS.showTKB(schedule);
        schedule.getScpDSSV().setVisible(false);

        closeMenuActionPerformed(null);
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
        KetQuaBUS kq = new KetQuaBUS();
        int hkHienTai = NienHocBUS.getCurrentNienHoc().getHocKi();
        int namHienTai = NienHocBUS.getCurrentNienHoc().getNam();
        kq.addRowData(score, namHienTai, hkHienTai);
        kq.ShowTichLuy(score);

    }// GEN-LAST:event_btnScoreActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnChangePasswordActionPerformed
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

    private void btnAccountListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountListActionPerformed
        mainPanel.removeAll(); // xóa hết nội dung vùng content
        mainPanel.add(managerYear);
        mainPanel.repaint();
        mainPanel.revalidate();
        TaiKhoanBUS.configManagerYear(managerYear);
    }//GEN-LAST:event_btnAccountListActionPerformed

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

    private void btnStatisticsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatisticsMouseEntered
        hoverButton(btnStatistics, yellow);

    }//GEN-LAST:event_btnStatisticsMouseEntered

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

    private void btnStatisticsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatisticsMouseExited
        if (btnStatistics != currentBtn) {
            hoverButton(btnStatistics, lightBlue);
        }

    }//GEN-LAST:event_btnStatisticsMouseExited

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

    private void btnStatisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatisticsMouseClicked
        setBackgroundDefaultAllButton();
        btnStatistics.setBackground(yellow);
        currentBtn = btnStatistics;
    }//GEN-LAST:event_btnStatisticsMouseClicked

    private void btnSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseClicked
        setBackgroundDefaultAllButton();
        btnSetting.setBackground(yellow);
        currentBtn = btnSetting;
    }//GEN-LAST:event_btnSettingMouseClicked

    private void btnStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatisticsActionPerformed
        mainPanel.removeAll();
        mainPanel.add(statistics);
        mainPanel.repaint();
        mainPanel.revalidate();
        statistics.getComboBoxMenu(statistics.getColumnChartOption());
        statistics.drawPieChart(statistics.getPieChart());
    }//GEN-LAST:event_btnStatisticsActionPerformed

    private void btnToolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToolMouseExited
        if (btnTool != currentBtn) {
            hoverButton(btnTool, lightBlue);
        }
    }//GEN-LAST:event_btnToolMouseExited

    private void btnToolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToolMouseEntered
        hoverButton(btnTool, yellow);
    }//GEN-LAST:event_btnToolMouseEntered

    private void btnToolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToolMouseClicked
        setBackgroundDefaultAllButton();
        btnTool.setBackground(yellow);
        currentBtn = btnTool;
    }//GEN-LAST:event_btnToolMouseClicked

    private void btnToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToolActionPerformed
        mainPanel.removeAll();
        mainPanel.add(tool);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnToolActionPerformed
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

//    public static void main(String args[]) {
////        javax.swing.plaf.nimbus.NimbusLookAndFeel
////com.sun.java.swing.plaf.windows.WindowsLookAndFeel
//        try {
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException
//                | UnsupportedLookAndFeelException ignored) {
//        }
//        new Table().setVisible(true);
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
        return btnGroup;
    }

    public JButton getBtnAccountList() {
        return btnAccountList;
    }

    public JButton getInputPoint() {
        return btnInputPoint;
    }

    public JButton getStudentList() {
        return btnStudentList;
    }

    public JButton getBtnTool() {
        return btnTool;
    }

    public JButton getBtnStatistics() {
        return btnStatistics;
    }

    public JButton getBtnSetting() {
        return btnSetting;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccountList;
    private javax.swing.JButton btnGroup;
    private javax.swing.JPanel btnHeader;
    private javax.swing.JButton btnInformation;
    private javax.swing.JButton btnInputPoint;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JButton btnScore;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnStatistics;
    private javax.swing.JButton btnStudentList;
    private javax.swing.JButton btnSubjectRegistration;
    private javax.swing.JButton btnTool;
    private javax.swing.JButton closeMenu;
    private javax.swing.JPanel greeting;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQuote;
    private javax.swing.JPanel leftBar;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton openMenu;
    private javax.swing.JLabel realTime;
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

    public void greeting() {
        try {
            //get quote
            URL url = new URL("https://api.quotable.io/random?tags=education");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);
            int status = con.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();
            JSONObject json = new JSONObject(content.toString());

            String quote = json.getString("content");
            String author = json.getString("author");

            //getDate
            LocalDate today = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE 'ngày' dd 'tháng' MM 'năm' yyyy", new Locale("vi", "VN"));
            String formattedDate = today.format(formatter);

            //getName
            String nhomQuyen = TaiKhoanBUS.curentLogin.getMaNhomQuyen();
            String id = TaiKhoanBUS.curentLogin.getTenTaiKhoan();
            String name = "";
            switch (nhomQuyen) {
                case "Q1" -> {
                    name = "Admin";
                }
                case "Q2" -> {
                    name = "Giáo vụ khoa " + TaiKhoanBUS.curentLogin.getTenTaiKhoan();
                }
                case "Q3" -> {
                    name = GiangVienBUS.getGVnameByGVid(id).getTenGV();
                }
                case "Q4" -> {
                    name = SinhVienBUS.getSvByID(id).getHoTen();
                }
            }
            //setText
            lblAuthor.setText("-" + author + "-");
            lblQuote.setText("\"" + quote + "\"");
            lblDate.setText("Hôm nay là: " + formattedDate);
            lblName.setText("Xin chào: " + name);

            //set Img
            Calendar calendar = Calendar.getInstance();
            int currentHour = calendar.get(Calendar.HOUR_OF_DAY);
            ImageIcon icon = null;
            if (currentHour >= 6 && currentHour < 18) {
                icon = new ImageIcon(getClass().getResource("/resource/images/day.gif"));
                Image img = icon.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_DEFAULT);
                icon = new ImageIcon(img);
            } else {
                icon = new ImageIcon(getClass().getResource("/resource/images/moon.gif"));
                Image img = icon.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_DEFAULT);
                icon = new ImageIcon(img);
            }
            lblImg.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setBackgroundDefaultAllButton() {
        for (JButton btn : allBtnLeftBar) {
            btn.setBackground(lightBlue);
        }
    }

}
