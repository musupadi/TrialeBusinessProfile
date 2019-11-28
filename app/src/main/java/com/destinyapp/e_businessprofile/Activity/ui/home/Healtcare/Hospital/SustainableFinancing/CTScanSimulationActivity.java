package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.SustainableFinancing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.destinyapp.e_businessprofile.R;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

public class CTScanSimulationActivity extends AppCompatActivity {
    EditText Investasi,bpjs,pribadi,totalcogs,operationalprofit,paybackperiod;
    Button hitung;
    private File pdfFile;
    private static final String TAG = "PdfCreatorActivity";
    final private int REQUEST_CODE_ASK_PERMISSIONS = 111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctscan_simulation);
        Investasi = findViewById(R.id.etNilaiInvestasi);
        bpjs = findViewById(R.id.etBPJS);
        pribadi = findViewById(R.id.etPribadiUmum);
        totalcogs = findViewById(R.id.etTotalCOGS);
        operationalprofit = findViewById(R.id.etOprationalProfit);
        paybackperiod = findViewById(R.id.etPaybackPeriod);
        hitung = findViewById(R.id.btnHitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Investasi.getText().toString().isEmpty()){
                    Toast.makeText(CTScanSimulationActivity.this, "Investati Kosong", Toast.LENGTH_SHORT).show();
                } else if(bpjs.getText().toString().isEmpty()){
                    Toast.makeText(CTScanSimulationActivity.this, "BPJS Kosong", Toast.LENGTH_SHORT).show();
                }else if(pribadi.getText().toString().isEmpty()){
                    Toast.makeText(CTScanSimulationActivity.this, "Umum Kosong", Toast.LENGTH_SHORT).show();
                }else if(totalcogs.getText().toString().isEmpty()){
                    Toast.makeText(CTScanSimulationActivity.this, "Total COGS Kosong", Toast.LENGTH_SHORT).show();
                }else{
                    int INVESTASI = Integer.parseInt(Investasi.getText().toString());
                    int BPJS = Integer.parseInt(bpjs.getText().toString());
                    int PRIBADI = Integer.parseInt(pribadi.getText().toString());
                    int TOTALCOGS = Integer.parseInt(totalcogs.getText().toString());

                    int profit = (BPJS+PRIBADI) - TOTALCOGS;
                    int PP = INVESTASI+profit;
                    operationalprofit.setText(String.valueOf(PP));
                    paybackperiod.setText(String.valueOf(profit));
                }

            }
        });
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.print){
//            try {
//                createPdfWrapper();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (DocumentException e) {
//                e.printStackTrace();
//            }
        }
        return super.onOptionsItemSelected(item);
    }

    private void createPdfWrapper() throws FileNotFoundException, DocumentException {

        int hasWriteStoragePermission = ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (hasWriteStoragePermission != PackageManager.PERMISSION_GRANTED) {

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (!shouldShowRequestPermissionRationale(Manifest.permission.WRITE_CONTACTS)) {
                    showMessageOKCancel("You need to allow access to Storage",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                        requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                                                REQUEST_CODE_ASK_PERMISSIONS);
                                    }
                                }
                            });
                    return;
                }
                requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        REQUEST_CODE_ASK_PERMISSIONS);
            }
            return;
        } else {
            createPdf();
        }
    }

    private void showMessageOKCancel(String message, DialogInterface.OnClickListener okListener) {
        new AlertDialog.Builder(this)
                .setMessage(message)
                .setPositiveButton("OK", okListener)
                .setNegativeButton("Cancel", null)
                .create()
                .show();
    }

    //Method Membuat PDF
    private void createPdf() throws FileNotFoundException, DocumentException {
        File docsFolder = new File(Environment.getExternalStorageDirectory() + "/Documents");
        if (!docsFolder.exists()) {
            docsFolder.mkdir();
            Log.i(TAG, "Created a new directory for PDF");
        }
        String pdfname = "Laporan Penilaian Investasi Peralatan.pdf";
        pdfFile = new File(docsFolder.getAbsolutePath(), pdfname);
        OutputStream output = new FileOutputStream(pdfFile);
        Document document = new Document(PageSize.A4);
        PdfPTable table = new PdfPTable(new float[]{3, 3, 3});
        table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
        table.getDefaultCell().setFixedHeight(50);
        table.setTotalWidth(PageSize.A4.getWidth());
        table.setWidthPercentage(100);
        table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
        table.addCell("1");
        table.addCell("Nilai Investasi Peralatan");
        table.addCell(Investasi.getText().toString());
        table.setHeaderRows(1);
//        PdfPCell[] cells = table.getRow(0).getCells();
//        for (int j = 0; j < cells.length; j++) {
//            cells[j].setBackgroundColor(BaseColor.GRAY);
//        }
//        for (int i = 0; i < MyList1.size(); i++) {
//            deskripsi = MyList1.get(i);
//            tanggal = MyList1.get(i);
//            tipe = MyList1.get(i);
//            kategori = MyList1.get(i);
//            jumlah = MyList1.get(i);
//            jenis = MyList1.get(i);
//            keterangan = MyList1.get(i);
//            String deskripsin = deskripsi.getDeskripsi();
//            String tanggaln = tanggal.getTanggal();
//            String tipen = tipe.getTipe();
//            String kategorin = kategori.getKategori();
//            String jumlahn = jumlah.getJumlah();
//            String jenisn = jenis.getJenis();
//            String keterangann = keterangan.getKeterangan();
//
//            table.addCell(String.valueOf(deskripsin));
//            table.addCell(String.valueOf(tanggaln));
//            table.addCell(String.valueOf(tipen));
//            table.addCell(String.valueOf(kategorin));
//            table.addCell(String.valueOf(jumlahn));
//            table.addCell(String.valueOf(jenisn));
//            table.addCell(String.valueOf(keterangann));
//        }


        PdfWriter.getInstance(document, output);
        document.open();
        Font f = new Font(Font.FontFamily.TIMES_ROMAN, 30.0f, Font.UNDERLINE, BaseColor.BLUE);
        Font g = new Font(Font.FontFamily.TIMES_ROMAN, 20.0f, Font.BOLD, BaseColor.BLUE);
        document.add(new Paragraph("LAPORAN PENIALAN INVESTASASI PERALATAN \n", g));
//        document.add(new Paragraph("Untuk Mahasiswa \n\n\n", g));
        document.add(table);

        document.close();
        previewPdf();
    }

    private void previewPdf() {
        PackageManager packageManager = this.getPackageManager();
        Intent testIntent = new Intent(Intent.ACTION_VIEW);
        testIntent.setType("application/pdf");
        List list = packageManager.queryIntentActivities(testIntent, PackageManager.MATCH_DEFAULT_ONLY);
        if (list.size() > 0) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            Uri uri = Uri.fromFile(pdfFile);
            Toast.makeText(this, "Laporan di Save dalam document/Laporan Penilaian Investasi Peralatan.pdf", Toast.LENGTH_SHORT).show();
//            intent.setDataAndType(uri, "application/pdf");
//            this.startActivity(intent);
        } else {
            Toast.makeText(this, "Download a PDF Viewer to see the generated PDF", Toast.LENGTH_SHORT).show();
        }
    }
}
