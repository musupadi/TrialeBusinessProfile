package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness.AnalisisKinerjaRS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.destinyapp.e_businessprofile.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class GraphLineActivity extends AppCompatActivity {
    LineChart chart;
    TextView staticText,skor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_line);

        chart = findViewById(R.id.chart);
        staticText = findViewById(R.id.tvStaticText);
        skor = findViewById(R.id.tvSkor);
        //GET INTENT DATA
        Intent data = getIntent();
        String JAN = data.getStringExtra("JAN");
        String FEB = data.getStringExtra("FEB");
        String MAR = data.getStringExtra("MAR");
        String APR = data.getStringExtra("APR");
        String MEI = data.getStringExtra("MEI");
        String JUN = data.getStringExtra("JUN");
        String JUL = data.getStringExtra("JUL");
        String AGS = data.getStringExtra("AGS");
        String SEP = data.getStringExtra("SEP");
        String OKT = data.getStringExtra("OKT");
        String NOV = data.getStringExtra("NOV");
        String DES = data.getStringExtra("DES");
        String TITTLE = data.getStringExtra("TITTLE");

        chart.setDragEnabled(true);
        chart.setScaleEnabled(true);

        //EPISODE 2
//        LimitLine upper_limit = new LimitLine(80f,"Ideal");
//        upper_limit.setLineWidth(4f);
//        upper_limit.enableDashedLine(10f,10f,0f);
//        upper_limit.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_BOTTOM);
//        upper_limit.setTextSize(15f);
//        LimitLine lower_limit = new LimitLine(60f,"TEST");
//        if (TITTLE.equals("BOR")){
//            lower_limit = new LimitLine(60f,"Presentasi BOR tidak Efektif");
//        }
//        lower_limit.setLineWidth(4f);
//        lower_limit.enableDashedLine(10f,10f,0f);
//        lower_limit.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_TOP);
//        lower_limit.setTextSize(15f);


        YAxis leftAxis = chart.getAxisLeft();
        leftAxis.removeAllLimitLines();
//        leftAxis.addLimitLine(upper_limit);
//        leftAxis.addLimitLine(lower_limit);


        leftAxis.setAxisMinimum(0f);
        leftAxis.enableGridDashedLine(10f,10f,0);
        leftAxis.setDrawLimitLinesBehindData(true);

        chart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        chart.getAxisRight().setEnabled(false);
        //DONE
        chart.animateY(1000);
        chart.setVisibleXRangeMaximum(20); // allow 20 values to be displayed at once on the x-axis, not more
        chart.moveViewToX(10);


        IFELSES(JAN,FEB,MAR,APR,MEI,JUN,JUL,AGS,SEP,OKT,NOV,DES,TITTLE);
        Hitung(JAN,FEB,MAR,APR,MEI,JUN,JUL,AGS,SEP,OKT,NOV,DES,TITTLE);
    }

    public class MyXAxisValueFormater implements IAxisValueFormatter {
        private String[] mValues;

        public MyXAxisValueFormater(String[] values) {
            this.mValues=values;
        }

        @Override
        public String getFormattedValue(float value, AxisBase axis) {
            return mValues[(int)value];
        }
    }
    private void Hitung(String Jan,String Feb,String Mar,String Apr,String Mei,String Jun,String Jul,String Ags,String Sep,String Okt,String Nov,String Des,String datasets){
        int size = 0;
        if (!Jan.equals("0")){
            size = size+1;
        }
        if (!Feb.equals("0")){
            size = size+1;
        }
        if (!Mar.equals("0")){
            size = size+1;
        }
        if (!Apr.equals("0")){
            size = size+1;
        }
        if (!Mei.equals("0")){
            size = size+1;
        }
        if (!Jun.equals("0")){
            size = size+1;
        }
        if (!Jul.equals("0")){
            size = size+1;
        }
        if (!Ags.equals("0")){
            size = size+1;
        }
        if (!Sep.equals("0")){
            size = size+1;
        }
        if (!Okt.equals("0")){
            size = size+1;
        }
        if (!Nov.equals("0")){
            size = size+1;
        }
        if (!Des.equals("0")){
            size = size+1;
        }
        int TotalSkor = 0;
        int rata2 = 0;
        if(size > 1){
            TotalSkor = Integer.parseInt(Jan)
                    +Integer.parseInt(Feb)
                    +Integer.parseInt(Mar)
                    +Integer.parseInt(Apr)
                    +Integer.parseInt(Mei)
                    +Integer.parseInt(Jun)
                    +Integer.parseInt(Jul)
                    +Integer.parseInt(Ags)
                    +Integer.parseInt(Sep)
                    +Integer.parseInt(Okt)
                    +Integer.parseInt(Nov)
                    +Integer.parseInt(Des);
            rata2 = TotalSkor/size;
        }else{
            rata2 = Integer.parseInt(Jan)
                    +Integer.parseInt(Feb)
                    +Integer.parseInt(Mar)
                    +Integer.parseInt(Apr)
                    +Integer.parseInt(Mei)
                    +Integer.parseInt(Jun)
                    +Integer.parseInt(Jul)
                    +Integer.parseInt(Ags)
                    +Integer.parseInt(Sep)
                    +Integer.parseInt(Okt)
                    +Integer.parseInt(Nov)
                    +Integer.parseInt(Des);
        }

        if (datasets.equals("BOR")){
            skor.setText("Skor Nilai BOR : "+rata2+"%");
            staticText.setText("Standar Nilai Rujukan BOR yang baik Kemenkes : 60-85 %\n" +
                    "Grafik Barber Johnson : 75 - 85 %\n" +
                    "Expertise FABA : 60 - 80 %");
        }else if(datasets.equals("AVLOS-BEDAH")){
            skor.setText("Skor Nilai AvLOS-BEDAH : "+rata2+"%");
            staticText.setText("Standar Nilai Rujukan AvLOS-BEDAH yang baik Kemenkes : 6-9 Hari %\n" +
                    "Grafik Barber Johnson : 3 - 12 %\n" +
                    "Expertise FABA : 4 - 7 %");
        }else if(datasets.equals("AVLOS-NON-BEDAH")){
            skor.setText("Skor Nilai AvLOS-NON-BEDAH : "+rata2+"%");
            staticText.setText("Standar Nilai Rujukan AvLOS-NON-BEDAH yang baik Kemenkes : 6-9 %\n" +
                    "Grafik Barber Johnson : 3 - 12 %\n" +
                    "Expertise FABA : 3 - 15 %");
        }else if(datasets.equals("BTO")){
            skor.setText("Skor Nilai BTO : "+rata2+" Kali Per Tahun");
            staticText.setText("Standar Nilai Rujukan BTO yang baik Kemenkes : 30-50 Kali\n" +
                    "Grafik Barber Johnson : Lebih dari 30 Kali\n" +
                    "Expertise FABA : 40 - 50 Kali");
        }else if(datasets.equals("TOI")){
            skor.setText("Skor Nilai TOI : "+rata2+" Hari");
            staticText.setText("Standar Nilai Rujukan TOI yang baik Kemenkes : 1-3 Hari %\n" +
                    "Grafik Barber Johnson : 1 - 3 Hari\n" +
                    "Expertise FABA : 1 - 3 Hari");
        }else if(datasets.equals("NDR")){
            skor.setText("Skor Nilai NDR : "+rata2+" Penderita/Pasien");
            staticText.setText("Standar Nilai Rujukan GDR yang baik Kemenkes : Kurang dari 25/1000 Penderita/Pasien Keluar\n" +
                    "Grafik Barber Johnson : Kurang dari 25/1000 Penderita/Pasien Keluar\n" +
                    "Expertise FABA : Kurang Dari 25/1000 Penderita/Pasien Keluar");
        }
        else if(datasets.equals("GDR")){
            skor.setText("Skor Nilai GDR : "+rata2+" Penderita/Pasien");
            staticText.setText("Standar Nilai Rujukan GDR yang baik Kemenkes : Kurang dari 45/1000 Penderita/Pasien Keluar\n" +
                    "Grafik Barber Johnson : Kurang dari 45/1000 Penderita/Pasien Keluar\n" +
                    "Expertise FABA : Kurang Dari 45/1000 Penderita/Pasien Keluar");
        }

    }

    private void IFELSES(String Jan,String Feb,String Mar,String Apr,String Mei,String Jun,String Jul,String Ags,String Sep,String Okt,String Nov,String Des,String datasets){
        ArrayList<Entry> yValue = new ArrayList<>();
        if (!Jan.equals("0")){
            yValue.add(new Entry(0,Float.parseFloat(Jan+"f")));
        }
        if (!Feb.equals("0")){
            yValue.add(new Entry(1,Float.parseFloat(Feb+"f")));
        }
        if (!Mar.equals("0")){
            yValue.add(new Entry(2,Float.parseFloat(Mar+"f")));
        }
        if (!Apr.equals("0")){
            yValue.add(new Entry(3,Float.parseFloat(Apr+"f")));
        }
        if (!Mei.equals("0")){
            yValue.add(new Entry(4,Float.parseFloat(Mei+"f")));
        }
        if (!Jun.equals("0")){
            yValue.add(new Entry(5,Float.parseFloat(Jun+"f")));
        }
        if (!Jul.equals("0")){
            yValue.add(new Entry(6,Float.parseFloat(Jul+"f")));
        }
        if (!Ags.equals("0")){
            yValue.add(new Entry(7,Float.parseFloat(Ags+"f")));
        }
        if (!Sep.equals("0")){
            yValue.add(new Entry(8,Float.parseFloat(Sep+"f")));
        }
        if (!Okt.equals("0")){
            yValue.add(new Entry(9,Float.parseFloat(Okt+"f")));
        }
        if (!Nov.equals("0")){
            yValue.add(new Entry(10,Float.parseFloat(Nov+"f")));
        }
        if (!Des.equals("0")){
            yValue.add(new Entry(11,Float.parseFloat(Des+"f")));
        }

        LineDataSet set1 = new LineDataSet(yValue,datasets);
        set1.setColor(Color.rgb(37,197,223));
        set1.setLineWidth(5f);
        set1.setFillAlpha(110);
        set1.setValueTextSize(10);
        set1.setCircleColorHole(Color.WHITE);
        set1.setCircleRadius(5);
        set1.setCircleColorHole(4);

        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);

        LineData data = new LineData(dataSets);
        chart.setData(data);

        String[] values = new String[]{"JAN","FEB","MAR","APR","MEI","JUN","JUL","AGS","SEP","OKT","NOV","DES"};
        XAxis xAxis = chart.getXAxis();
        xAxis.setValueFormatter(new MyXAxisValueFormater(values));
        xAxis.setGranularity(1);
    }
}
