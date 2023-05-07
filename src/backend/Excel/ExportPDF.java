/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Excel;

import BUS.SinhVienBUS;
import DTO.SinhVienDTO;
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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ExportPDF {

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

    public static PdfPCell createCell(String text, Font font) {
        PdfPCell cell = new PdfPCell(new Phrase(text, font));
        cell.setBorderWidth(0);
        cell.setPaddingTop(7f);
        cell.setPaddingBottom(7f);
        return cell;
    }

    public static void addTextToParagraph(Document document, String text, Font font) throws DocumentException {
        Paragraph paragraph = new Paragraph(text, font);
        paragraph.setSpacingBefore(5f);
        paragraph.setSpacingAfter(5f);
        document.add(paragraph);
    }

    public static void generatePDF(String mssv) {
        BaseFont vietnameseFont = null;
        float topMargin = 10f;
        float bottomMargin = 10f;
        SinhVienDTO sv = SinhVienBUS.getPDF(mssv);
        System.out.println(sv.getHoTen());
//        System.out.println(sv.getMaSV());
        try {
            vietnameseFont = BaseFont.createFont("/resource/arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
            return;
        }
        Font vn = new Font(vietnameseFont, 12);
        Font top_vn = new Font(vietnameseFont, 10);
        Font title_vn = new Font(vietnameseFont, 12, Font.ITALIC);

        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.showSaveDialog(null);
        File savefile = jFileChooser.getSelectedFile();
        if (savefile != null) {
            savefile = new File(savefile.toString() + ".pdf");
        } else {
            JOptionPane.showMessageDialog(null, "File không được tạo");
        }
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(savefile.getPath()));
            document.open();
            PdfPTable top_table = new PdfPTable(2);
            top_table.setWidthPercentage(100);
            top_table.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);

// set the default cell properties
            top_table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            top_table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
            top_table.getDefaultCell().setBorderWidth(0);

// add the first cell
            PdfPCell top1 = new PdfPCell(new Phrase("TRƯỜNG ĐẠI HỌC SÀI GÒN", top_vn));
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
            Image image = Image.getInstance("src\\resource\\images\\logologinsmaller.png");
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
            table.addCell(createCell("Họ và tên:", vn));
            table.addCell(createCell(sv.getHoTen(), vn));
            table.addCell(createCell("MSSV:", vn));
            table.addCell(createCell(sv.getMaSV(), vn));
            table.addCell(createCell("CCCD:", vn));
            table.addCell(createCell(sv.getCmnd(), vn));
            table.addCell(createCell("Số điện thoại:", vn));
            table.addCell(createCell(sv.getSoDienThoai(), vn));
            table.addCell(createCell("Niên khóa:", vn));
            table.addCell(createCell(sv.getNienKhoa(), vn));
            document.add(table);

            addTextToParagraph(document, "Giấy xác nhận này cấp cho sinh viên dùng để bổ túc vào hồ sơ tạm hoãn nghĩa vụ quân sự tại địa phương", vn);
            addTextToParagraph(document, "Giấy này có giá trị 20 ngày kể từ ngày kí", vn);

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

            PdfPCell bot6 = new PdfPCell(new Phrase("Nguyễn Thị Hồng Anh", vn));
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
