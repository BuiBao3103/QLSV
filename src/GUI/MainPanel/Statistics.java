/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.MainPanel;

import connectDB.ConnectionDB;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author ASUS
 */
public class Statistics extends javax.swing.JPanel {

    /**
     * Creates new form Statistics
     */
    Connection con = null;

    public Statistics() {
        initComponents();
    }

    public void showChart() throws SQLException {
        con = ConnectionDB.getConnection();
        String query = "select DiemCuoiKy,DiemQuaTrinh from KETQUA";
        CategoryDataset dataset = new JDBCCategoryDataset(con, query);
        JFreeChart chart = ChartFactory.createLineChart("Điểm trung bình của SV KHOA CNTT năm 2022", "Điểm TB", "Thang Điểm", dataset, PlotOrientation.VERTICAL, false, true, true);
        BarRenderer renderer = null;
        CategoryPlot plot = null;
        renderer = new BarRenderer();
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setVisible(true);
        statChart.add(chartPanel);
        chartPanel.setSize(statChart.getSize().width, statChart.getSize().height);
        statChart.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                chartPanel.setSize(statChart.getSize().width, statChart.getSize().height);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOptions = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        statChart = new javax.swing.JPanel();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOptionsLayout = new javax.swing.GroupLayout(panelOptions);
        panelOptions.setLayout(panelOptionsLayout);
        panelOptionsLayout.setHorizontalGroup(
            panelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOptionsLayout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jButton1)
                .addContainerGap(562, Short.MAX_VALUE))
        );
        panelOptionsLayout.setVerticalGroup(
            panelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOptionsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout statChartLayout = new javax.swing.GroupLayout(statChart);
        statChart.setLayout(statChartLayout);
        statChartLayout.setHorizontalGroup(
            statChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        statChartLayout.setVerticalGroup(
            statChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(statChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            showChart();
        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panelOptions;
    private javax.swing.JPanel statChart;
    // End of variables declaration//GEN-END:variables
}
