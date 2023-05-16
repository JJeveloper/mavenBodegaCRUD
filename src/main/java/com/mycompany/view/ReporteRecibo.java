package com.mycompany.view;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Date;
import javax.swing.JTable;

/**
 *
 * @author JJAB
 */
public class ReporteRecibo {

    Document documento;
    FileOutputStream fileOutputStream;

    // fuentes de Titulo y párrafo
    Font fuenteTitulo = FontFactory.getFont(FontFactory.TIMES_ROMAN, 18);
    Font fuenteParrafo = FontFactory.getFont(FontFactory.HELVETICA, 12);
    Font fuenteFecha = FontFactory.getFont(FontFactory.HELVETICA, 8);

    public void crearDocumento(Date fecha, String nombreProveedor, JTable t) throws FileNotFoundException, DocumentException {

        // creación del documento con sus márgenes
        documento = new Document(PageSize.A4, 35, 30, 50, 50);

        // archivo pdf que vamos a generar
        String ruta = System.getProperty("user.home");
        fileOutputStream = new FileOutputStream(ruta + "/Desktop/reporteReciboJava.pdf");

        // obtener la instancia del PdfWriter
        PdfWriter.getInstance(documento, fileOutputStream);

        //Abrir documento
        documento.open();

        //Agregar Fecha
        PdfPTable fch = new PdfPTable(1);
        PdfPCell celdaf = new PdfPCell(new Phrase(fecha + "", fuenteFecha));
        celdaf.setColspan(5);
        celdaf.setBorderColor(BaseColor.WHITE);
        celdaf.setHorizontalAlignment(Element.ALIGN_RIGHT);
        fch.addCell(celdaf);
        documento.add(fch);

        //Agregar titulo
        PdfPTable tabla = new PdfPTable(1);
        PdfPCell celda = new PdfPCell(new Phrase("Reporte Recibo", fuenteTitulo));
        celda.setColspan(5);
        celda.setBorderColor(BaseColor.WHITE);
        celda.setHorizontalAlignment(Element.ALIGN_CENTER);
        tabla.addCell(celda);
        documento.add(tabla);

        agregarSaltosDeLinea();

        //Agregar subtitulo
        Paragraph subtitulo = new Paragraph();
        subtitulo.add(new Phrase("Informacion ", fuenteParrafo));
        documento.add(subtitulo);

        agregarSaltosDeLinea();

        //Agregar tabla
        PdfPTable tablaF = new PdfPTable(5);
        tablaF.addCell("Codigo producto");
        tablaF.addCell("Tipo producto");
        tablaF.addCell("Nombre");
        tablaF.addCell("Cantidad");
        tablaF.addCell("Precio");
        for (int i = 0; i < t.getRowCount(); i++) {
            tablaF.addCell((String) t.getValueAt(i, 0));
            tablaF.addCell((String) t.getValueAt(i, 1));
            tablaF.addCell((String) t.getValueAt(i, 2));
            tablaF.addCell((String) t.getValueAt(i, 3));
            tablaF.addCell((String) t.getValueAt(i, 6));
        }

        documento.add(tablaF);

        agregarSaltosDeLinea();

        agregarSaltosDeLinea();

        //Datos proveedor
        Paragraph proveedor = new Paragraph();
        proveedor.add(new Phrase(nombreProveedor, fuenteParrafo));
        documento.add(proveedor);

        documento.close();

    }

    public void agregarSaltosDeLinea() throws DocumentException {
        Paragraph saltosdelinea = new Paragraph();
        saltosdelinea.add(new Phrase(Chunk.NEWLINE));
        saltosdelinea.add(new Phrase(Chunk.NEWLINE));
        documento.add(saltosdelinea);
    }

}
