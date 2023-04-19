/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Excel;

import backend.QLSinhVien.SinhVien;
import com.itextpdf.text.Chunk;
import connectDB.ConnectionDB;
import java.sql.Connection;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class ExportPDF {

    static Connection con = null;
    static PreparedStatement pstm = null;

    public static SinhVien getSinhVien(String MaSV) {
        con = ConnectionDB.getConnection();
        SinhVien sv = null;
        try {
            String query = "SELECT * FROM SinhVien WHERE MaSV like '%" + MaSV + "%'";
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                int trangThai = rs.getInt("TrangThai");
                String maSV = rs.getString("MaSV");
                String cmnd = rs.getString("Cmnd");
                String soDienThoai = rs.getString("SoDienThoai");
                String maLop = rs.getString("MaLop");
                String hoTen = rs.getString("HoTen");
                Date ngaySinh = rs.getDate("NgaySinh");
                String gioiTinh = rs.getString("GioiTinh");
                String diaChi = rs.getString("DiaChi");
                String danToc = rs.getString("DanToc");
                String tonGiao = rs.getString("TonGiao");
                String nienKhoa = rs.getString("NienKhoa");
                String maNganh = rs.getString("MaNganh");
                int maTK = rs.getInt("MaTK");
                sv = new SinhVien(trangThai, maSV, cmnd, soDienThoai, maLop, hoTen, ngaySinh, gioiTinh, diaChi, danToc, tonGiao, nienKhoa, maNganh, maTK);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return sv;
    }

    public static int getCurrentDay() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getDayOfMonth();
    }

    public static int getCurrentYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    public static int getCurrentMonth() {
        LocalDate now = LocalDate.now();
        return now.getMonthValue();
    }

    public static void generatePDF(String mssv, SinhVien sv) {
        BaseFont vietnameseFont = null;
        float topMargin = 10f;
        float bottomMargin = 10f;
        try {
            vietnameseFont = BaseFont.createFont("arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
            return;
        }
        Font vn = new Font(vietnameseFont, 12);
        Font top_vn = new Font(vietnameseFont, 10);
        Font title_vn = new Font(vietnameseFont, 12, Font.ITALIC);

        String fileName = "res/" + mssv + ".pdf";
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();
            PdfPTable top_table = new PdfPTable(2);
            top_table.setWidthPercentage(100);
            top_table.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);

// set the default cell properties
            top_table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            top_table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
            top_table.getDefaultCell().setBorderWidth(0);

// add the first cell
            PdfPCell top1 = new PdfPCell(new Phrase("TRƯỜNG ĐẠI HỌC MỘT MÌNH T", top_vn));
            top1.setBorderWidth(0);
            top1.setPaddingTop(topMargin);
            top1.setPaddingBottom(bottomMargin);
            top_table.addCell(top1);

// add the second cell
            PdfPCell top2 = new PdfPCell(new Phrase("Thành phố Hồ Chí Minh, ngày " + getCurrentDay() + " tháng " + getCurrentMonth() + " năm " + getCurrentYear(), top_vn));
            top2.setBorderWidth(0);
            top2.setPaddingTop(topMargin);
            top2.setPaddingBottom(bottomMargin);
            top_table.addCell(top2);

            document.add(top_table);
            // Add image to the title
            Image image = Image.getInstance("src\\images\\logologinsmaller.png");
            image.scaleAbsolute(70f, 70f);
            image.setAlignment(Element.ALIGN_CENTER);
            Paragraph title = new Paragraph();
            title.setFont(title_vn);
            title.add(image);
            title.add("\nGiấy xác nhận");
            title.add("\n(Sinh viên trong diện tạm hoãn nghĩa vụ quân sự)");

            title.setAlignment(Element.ALIGN_CENTER);
            title.setSpacingAfter(20f);
            document.add(title);

            // Add table
            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.getDefaultCell().setBorderWidth(0);
            PdfPCell cell1 = new PdfPCell(new Phrase("Họ và tên:", vn));
            cell1.setBorderWidth(0);
            cell1.setPaddingTop(topMargin);
            cell1.setPaddingBottom(bottomMargin);
            table.addCell(cell1);

            PdfPCell cell2 = new PdfPCell(new Phrase(sv.getHoTen(), vn));
            cell2.setBorderWidth(0);
            cell2.setPaddingTop(topMargin);
            cell2.setPaddingBottom(bottomMargin);
            table.addCell(cell2);

            PdfPCell cell3 = new PdfPCell(new Phrase("MSSV:", vn));
            cell3.setBorderWidth(0);
            cell3.setPaddingTop(topMargin);
            cell3.setPaddingBottom(bottomMargin);
            table.addCell(cell3);

            PdfPCell cell4 = new PdfPCell(new Phrase(sv.getMaSV(), vn));
            cell4.setBorderWidth(0);
            cell4.setPaddingTop(topMargin);
            cell4.setPaddingBottom(bottomMargin);
            table.addCell(cell4);

            PdfPCell cell5 = new PdfPCell(new Phrase("CCCD:", vn));
            cell5.setBorderWidth(0);
            cell5.setPaddingTop(topMargin);
            cell5.setPaddingBottom(bottomMargin);
            table.addCell(cell5);

            PdfPCell cell6 = new PdfPCell(new Phrase(sv.getCmnd(), vn));
            cell6.setBorderWidth(0);
            cell6.setPaddingTop(topMargin);
            cell6.setPaddingBottom(bottomMargin);
            table.addCell(cell6);

            PdfPCell cell7 = new PdfPCell(new Phrase("Số điện thoại:", vn));
            cell7.setBorderWidth(0);
            cell7.setPaddingTop(topMargin);
            cell7.setPaddingBottom(bottomMargin);
            table.addCell(cell7);

            PdfPCell cell8 = new PdfPCell(new Phrase(sv.getSoDienThoai(), vn));
            cell8.setBorderWidth(0);
            cell8.setPaddingTop(topMargin);
            cell8.setPaddingBottom(bottomMargin);
            table.addCell(cell8);

            PdfPCell cell9 = new PdfPCell(new Phrase("Niên khóa:", vn));
            cell9.setBorderWidth(0);
            cell9.setPaddingTop(topMargin);
            cell9.setPaddingBottom(bottomMargin);
            table.addCell(cell9);

            PdfPCell cell10 = new PdfPCell(new Phrase(sv.getNienKhoa(), vn));
            cell10.setBorderWidth(0);
            cell10.setPaddingTop(topMargin);
            cell10.setPaddingBottom(bottomMargin);
            table.addCell(cell10);
            document.add(table);

            Paragraph text1 = new Paragraph();
            Paragraph text2 = new Paragraph();

            text1.setFont(vn);
            text1.add("Giấy xác nhận này cấp cho sinh viên dùng để bổ túc vào hồ sơ tạm hoãn nghĩa vụ quân sự tại địa phương");
            text1.setSpacingBefore(5f);
            text1.setSpacingAfter(5f);
            document.add(text1);
            
            text2.setFont(vn);
            text2.add("Giấy này có giá trị 20 ngày kể từ ngày kí");
            text2.setSpacingBefore(5f);
            text2.setSpacingAfter(5f);
            document.add(text2);

            PdfPTable bottom_table = new PdfPTable(2);
            bottom_table.setWidthPercentage(100);
            bottom_table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            bottom_table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
            bottom_table.getDefaultCell().setBorderWidth(0);

            PdfPCell bot1 = new PdfPCell(new Phrase("", vn));
            bot1.setBorderWidth(0);
            bot1.setPaddingTop(30f);
            bot1.setPaddingBottom(3f);
            bottom_table.addCell(bot1);

            PdfPCell bot2 = new PdfPCell(new Phrase("KT. HIỆU TRƯỞNG", vn));
            bot2.setBorderWidth(0);
            bot2.setPaddingTop(30f);
            bot2.setPaddingBottom(3f);
            bot2.setHorizontalAlignment(Element.ALIGN_CENTER);
            bottom_table.addCell(bot2);

            PdfPCell bot3 = new PdfPCell(new Phrase("", vn));
            bot3.setBorderWidth(0);
            bot3.setPaddingTop(5f);
            bot3.setPaddingBottom(3f);
            bottom_table.addCell(bot3);

            PdfPCell bot4 = new PdfPCell(new Phrase("PHÓ HIỆU TRƯỞNG", vn));
            bot4.setBorderWidth(0);
            bot4.setPaddingTop(5f);
            bot4.setPaddingBottom(3f);
            bot4.setHorizontalAlignment(Element.ALIGN_CENTER);
            bottom_table.addCell(bot4);

            PdfPCell bot5 = new PdfPCell(new Phrase("", vn));
            bot5.setBorderWidth(0);
            bot5.setPaddingTop(20f);
            bot5.setPaddingBottom(3f);
            bottom_table.addCell(bot5);

            PdfPCell bot6 = new PdfPCell(new Phrase("Nguyễn Tiến Phát", vn));
            bot6.setBorderWidth(0);
            bot6.setPaddingTop(20f);
            bot6.setPaddingBottom(3f);
            bot6.setHorizontalAlignment(Element.ALIGN_CENTER);
            bottom_table.addCell(bot6);

            document.add(bottom_table);

            document.close();
            System.out.println("Created PDF file test");
        } catch (FileNotFoundException e) {
            System.err.println("File not found error: " + e.getMessage());
        } catch (DocumentException e) {
            System.err.println("Document error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }

}
