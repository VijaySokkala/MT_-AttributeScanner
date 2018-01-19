package com.net.common;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.net.common.InputElements;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class JavaPdf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
	}
	

	public void pdfmethod(String result) {
		// TODO Auto-generated method stub
		
		Document document = new Document();
		try {
			Font font1 = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLD);// font
																			// style
																			// for
																			// head
			Font font2 = new Font(Font.FontFamily.HELVETICA, 7, Font.BOLD);// font
																			// style
																			// for
																			// data
			PdfWriter writer = PdfWriter
					.getInstance(
							document,
							new FileOutputStream(
									"C:/Users/vijayks/Desktop/Attributes_Scanner_Tool_All_Files/Result_Jsons/AttributeScanner.pdf"));
			document.open();
			// creating Table 1 code
			PdfPTable table1 = new PdfPTable(3); // 3 columns
			// Table1 width
			table1.setWidthPercentage(100);
			// table1 spacing before after
			table1.setSpacingBefore(10f);
			table1.setSpacingAfter(10f);
			// creating default settings for Table1
			PdfPCell defaultCell = table1.getDefaultCell();
			defaultCell.setBorder(PdfPCell.NO_BORDER);
			table1.addCell(new Paragraph("REPORT", font1));
			defaultCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			defaultCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			table1.addCell(new Paragraph(""));
			table1.addCell(new Paragraph("APPLICATION ATTRIBUTE SCANNER", font1));
			document.add(table1);
			document.add(new Paragraph(
					"", font2));
			// Creating Table2
			PdfPTable table2 = new PdfPTable(2);
			table2.setWidthPercentage(80);
			table2.setSpacingBefore(10f);
			table2.setSpacingAfter(10f);
			document.add(new Paragraph(result));

			document.close();
			writer.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}


	public void pdfmethodmeta(String result1) {
		// TODO Auto-generated method stub
	// TODO Auto-generated method stub
		
		Document document = new Document();
		try {
			Font font1 = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLD);// font
																			// style
																			// for
																			// head
			Font font2 = new Font(Font.FontFamily.HELVETICA, 7, Font.BOLD);// font
																			// style
																			// for
																			// data
			PdfWriter writer = PdfWriter
					.getInstance(
							document,
							new FileOutputStream(
									"C:/Users/vijayks/Desktop/Attributes_Scanner_Tool_All_Files/Result_Jsons/SeoSpider.pdf"));
			document.open();
			// creating Table 1 code
			PdfPTable table1 = new PdfPTable(3); // 3 columns
			// Table1 width
			table1.setWidthPercentage(100);
			// table1 spacing before after
			table1.setSpacingBefore(10f);
			table1.setSpacingAfter(10f);
			// creating default settings for Table1
			PdfPCell defaultCell = table1.getDefaultCell();
			defaultCell.setBorder(PdfPCell.NO_BORDER);
			table1.addCell(new Paragraph("REPORT", font1));
			defaultCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			defaultCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			table1.addCell(new Paragraph(""));
			table1.addCell(new Paragraph("APPLICATION SEO SPIDER", font1));
			document.add(table1);
			document.add(new Paragraph(
					"", font2));
			// Creating Table2
			PdfPTable table2 = new PdfPTable(2);
			table2.setWidthPercentage(80);
			table2.setSpacingBefore(10f);
			table2.setSpacingAfter(10f);
			document.add(new Paragraph(result1));

			document.close();
			writer.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
}