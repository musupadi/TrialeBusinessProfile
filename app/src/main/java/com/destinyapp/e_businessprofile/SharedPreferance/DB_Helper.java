package com.destinyapp.e_businessprofile.SharedPreferance;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_Helper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "session.db";
    private static final int DATABASE_VERSION = 3;
    public static final String TABLE_NAME = "session";
    public static final String COLUMN_USERNME = "username";
    public static final String COLUMN_PERSON = "person";
    public static final String COLUMN_ID = "id";
    public static final String TABLE_NAME_BIODATA = "biodata";
    public static final String COLUMN_NAMA = "nama";
    public static final String COLUMN_REMARKS = "remarks";
    public static final String COLUMN_PHOTO = "photo";
    public static final String COLUMN_DETAIL = "detail";
    public static final String COLUMN_LAHIR = "lahir";
    public static final String COLUMN_WAFAT = "wafat";
    public static final String COLUMN_LANG = "langitude";
    public static final String COLUMN_LONG = "longitude";
    public static final String TABLE_ANALISIS = "tableanalis";
    public static final String COLUMN_KE = "kolumke";
    public static final String COLUMN_ROI = "roi";
    public static final String COLUMN_RATIO_KAS = "rasiokas";
    public static final String COLUMN_CURRENT_RATIO = "currentratio";
    public static final String COLUMN_CP = "cp";
    public static final String COLUMN_PP = "pp";
    public static final String COLUMN_TATO = "tato";
    public static final String COLUMN_AKTIVA_BERSIH = "aktivabersih";

    public DB_Helper(Context context){super(
            context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME_BIODATA+" (" +
                COLUMN_NAMA+" TEXT NOT NULL, "+
                COLUMN_REMARKS+" TEXT NOT NULL,"+
                COLUMN_PHOTO+" TEXT NOT NULL,"+
                COLUMN_DETAIL+" TEXT NOT NULL,"+
                COLUMN_LAHIR+" TEXT NOT NULL,"+
                COLUMN_WAFAT+" TEXT NOT NULL,"+
                COLUMN_LANG+" TEXT NOT NULL,"+
                COLUMN_LONG+" TEXT NOT NULL);"
        );
        db.execSQL("CREATE TABLE "+TABLE_NAME+" (" +
                COLUMN_USERNME+" TEXT PRIMARY KEY, "+
                COLUMN_PERSON+" TEXT NOT NULL, "+
                COLUMN_ID+" TEXT NOT NULL);"
        );
        db.execSQL("CREATE TABLE "+TABLE_ANALISIS+" (" +
                COLUMN_KE+" TEXT NOT NULL, "+
                COLUMN_ROI+" TEXT NOT NULL, "+
                COLUMN_RATIO_KAS+" TEXT NOT NULL, "+
                COLUMN_CURRENT_RATIO+" TEXT NOT NULL, "+
                COLUMN_CP+" TEXT NOT NULL, "+
                COLUMN_PP+" TEXT NOT NULL, "+
                COLUMN_TATO+" TEXT NOT NULL, "+
                COLUMN_AKTIVA_BERSIH+" TEXT NOT NULL);"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_BIODATA);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ANALISIS);
        this.onCreate(db);
    }
    public void saveSession(User user){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_USERNME, user.getUsername());
        values.put(COLUMN_PERSON,user.getPerson());
        values.put(COLUMN_ID,user.getId());

        db.insert(TABLE_NAME,null,values);
        db.close();
    }

    public Cursor checkAnalis(String kolum){
        SQLiteDatabase db = this.getWritableDatabase();
        String query ="SELECT * FROM "+TABLE_ANALISIS+" WHERE "+COLUMN_KE+" = '"+kolum+"'";
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }
    public void InputData(AnalisisInput analisisInput){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_KE, analisisInput.getKolumKe());
        values.put(COLUMN_ROI,analisisInput.getROI());
        values.put(COLUMN_RATIO_KAS,analisisInput.getCashRatio());
        values.put(COLUMN_CURRENT_RATIO,analisisInput.getCurrentRatio());
        values.put(COLUMN_CP,analisisInput.getColectivePeriod());
        values.put(COLUMN_PP,analisisInput.getPP());
        values.put(COLUMN_TATO,analisisInput.getTATO());
        values.put(COLUMN_AKTIVA_BERSIH,analisisInput.getAktivaBersih());

        db.insert(TABLE_ANALISIS,null,values);
        db.close();
    }



    public void Hitung(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM "+TABLE_ANALISIS+"");
    }

    public void userLogout(String username, Context context){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM "+TABLE_NAME+"");
    }
    public Cursor checkSession(){
        SQLiteDatabase db = this.getWritableDatabase();
        String query ="SELECT * FROM "+TABLE_NAME+"";
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }
}

