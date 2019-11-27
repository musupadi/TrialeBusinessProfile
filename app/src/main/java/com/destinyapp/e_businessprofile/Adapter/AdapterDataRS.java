package com.destinyapp.e_businessprofile.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.destinyapp.e_businessprofile.API.ApiRequestFajar;
import com.destinyapp.e_businessprofile.API.RetroServerFajar;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.Ecosystem.ListOfHospital.DetailHospitalActivity;
import com.destinyapp.e_businessprofile.Model.DataModel;
import com.destinyapp.e_businessprofile.Model.ResponseModel;
import com.destinyapp.e_businessprofile.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdapterDataRS extends RecyclerView.Adapter<AdapterDataRS.HolderData> {
    private List<DataModel> mList;
    private Context ctx;
    Dialog myDialog;
    public AdapterDataRS(Context ctx, List<DataModel> mList){
        this.ctx = ctx;
        this.mList = mList;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_data_rs,viewGroup,false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDataRS.HolderData holderData, int posistion) {
        final DataModel dm = mList.get(posistion);
        holderData.nama_rs.setText(dm.getNama_rs());
        holderData.kelas.setText(dm.getKelas_rs());
//        int total = Integer.parseInt(dm.getDr_umum())
//                +Integer.parseInt(dm.getDr_pd())
//                +Integer.parseInt(dm.getDr_b())
//                +Integer.parseInt(dm.getDr_rad())
//                +Integer.parseInt(dm.getDr_rm())
//                +Integer.parseInt(dm.getDr_an())
//                +Integer.parseInt(dm.getDr_jp())
//                +Integer.parseInt(dm.getDr_m())
//                +Integer.parseInt(dm.getDr_tht())
//                +Integer.parseInt(dm.getDr_pk())
//                +Integer.parseInt(dm.getDr_paru_paru())
//                +Integer.parseInt(dm.getDr_bedah_thoraks())
//                +Integer.parseInt(dm.getDr_bedah_anak())
//                +Integer.parseInt(dm.getDr_bedah_orthopedi())
//                +Integer.parseInt(dm.getDr_a())
//                +Integer.parseInt(dm.getDr_okupasi())
//                +Integer.parseInt(dm.getDr_urologi())
//                +Integer.parseInt(dm.getDr_bedah_orthopedi())
//                +Integer.parseInt(dm.getDr_kulit())
//                +Integer.parseInt(dm.getDr_forensik())
//                +Integer.parseInt(dm.getDr_psikiatri())
//                +Integer.parseInt(dm.getDr_ofthalmologi())
//                +Integer.parseInt(dm.getDr_anatomi())
//                +Integer.parseInt(dm.getDr_jiwa())
//                +Integer.parseInt(dm.getDr_saraf())
//                +Integer.parseInt(dm.getDr_lainnya())
//                +Integer.parseInt(dm.getDr_bedah_saraf())
//                +Integer.parseInt(dm.getDr_bedah_plastik())
//                +Integer.parseInt(dm.getDr_sub_spesialis())
//                +Integer.parseInt(dm.getDr_gigi())
//                +Integer.parseInt(dm.getDr_bedah_mulut())
//                +Integer.parseInt(dm.getDr_konservasi())
//                +Integer.parseInt(dm.getDr_penyakit_mulut())
//                +Integer.parseInt(dm.getDr_radiologi())
//                +Integer.parseInt(dm.getDr_karang_gigi())
//                +Integer.parseInt(dm.getDr_gigi_anak())
//                +Integer.parseInt(dm.getDr_gigi_tiruan())
//                +Integer.parseInt(dm.getDr_periodonsia())
//                +Integer.parseInt(dm.getDr_lainnya())
//                +Integer.parseInt(dm.getNers())
//                +Integer.parseInt(dm.getPerawat_bedah())
//                +Integer.parseInt(dm.getPerawat_maternitas())
//                +Integer.parseInt(dm.getPerawat_komunitas())
//                +Integer.parseInt(dm.getPerawat_gigi())
//                +Integer.parseInt(dm.getPerawat_anestesi())
//                +Integer.parseInt(dm.getPerawat_anak())
//                +Integer.parseInt(dm.getPerawat_lainnya())
//                +Integer.parseInt(dm.getBidan_pendidikan())
//                +Integer.parseInt(dm.getBidan_klinik())
//                +Integer.parseInt(dm.getApoteker())
//                +Integer.parseInt(dm.getAnalis_farmasi())
//                +Integer.parseInt(dm.getRadiografi())
//                +Integer.parseInt(dm.getRadioterapis())
//                +Integer.parseInt(dm.getElektromedis())
//                +Integer.parseInt(dm.getTeknisi_gigi())
//                +Integer.parseInt(dm.getAnalis_kesehatan())
//                +Integer.parseInt(dm.getRefraksionis())
//                +Integer.parseInt(dm.getRekam_medis())
//                +Integer.parseInt(dm.getOrtotik())
//                +Integer.parseInt(dm.getTransfusi_darah())
//                +Integer.parseInt(dm.getKardiovaskular())
//                +Integer.parseInt(dm.getEpidemiology())
//                +Integer.parseInt(dm.getPromosi_kesehatan())
//                +Integer.parseInt(dm.getPrilaku())
//                +Integer.parseInt(dm.getKesja())
//                +Integer.parseInt(dm.getAdministrasi_kesehatan())
//                +Integer.parseInt(dm.getBiostatik())
//                +Integer.parseInt(dm.getReproduksi())
//                +Integer.parseInt(dm.getInformasi_kesehatan())
//                +Integer.parseInt(dm.getKesmas_lainnya())
//                +Integer.parseInt(dm.getSanitasi())
//                +Integer.parseInt(dm.getEntomologi())
//                +Integer.parseInt(dm.getMikrobiologi())
//                +Integer.parseInt(dm.getKesehatan_lingkungan())
//                +Integer.parseInt(dm.getTerapi_wicara())
//                +Integer.parseInt(dm.getNutrisionis())
//                +Integer.parseInt(dm.getDietisien())
//                +Integer.parseInt(dm.getFisioterapi())
//                +Integer.parseInt(dm.getTerapi_okupasi())
//                +Integer.parseInt(dm.getAkupunturis())
//                +Integer.parseInt(dm.getProgram_kesehatan())
//                +Integer.parseInt(dm.getAdmin_kesehatan())
//                +Integer.parseInt(dm.getHumas())
//                +Integer.parseInt(dm.getPerencanaan())
//                +Integer.parseInt(dm.getJaminan_kesehatan())
//                +Integer.parseInt(dm.getDosen())
//                +Integer.parseInt(dm.getPsikologi())
//                +Integer.parseInt(dm.getPelaporan())
//                +Integer.parseInt(dm.getInformasi_teknologi())
//                +Integer.parseInt(dm.getHukum())
//                +Integer.parseInt(dm.getPekarya())
//                +Integer.parseInt(dm.getPerpustakaan())
//                +Integer.parseInt(dm.getWidyaiswara())
//                +Integer.parseInt(dm.getNon_kers()
//        );
//        int totalBed = Integer.parseInt(dm.getVvip())
//                        +Integer.parseInt(dm.getVip())
//                        +Integer.parseInt(dm.getKelas_1())
//                        +Integer.parseInt(dm.getKelas_2())
//                        +Integer.parseInt(dm.getKelas_3())
//                        +Integer.parseInt(dm.getIcu())
//                        +Integer.parseInt(dm.getPicu())
//                        +Integer.parseInt(dm.getNicu())
//                        +Integer.parseInt(dm.getTt_bayi())
//                        +Integer.parseInt(dm.getHcu())
//                        +Integer.parseInt(dm.getIccu())
//                        +Integer.parseInt(dm.getIgd())
//                        +Integer.parseInt(dm.getTt_operasi())
//                        +Integer.parseInt(dm.getTt_isolasi());
        holderData.pekerja.setText(String.valueOf(dm.getJumlah_tenaga_rs()));
        holderData.tempattidur.setText(String.valueOf(dm.getJumlah_bed_rs()));
        holderData.list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logic(dm.getKode_rs());
            }
        });
        holderData.dm=dm;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class HolderData extends RecyclerView.ViewHolder{
        TextView nama_rs,jenis,kelas,direktur,pemilik,pekerja,tempattidur,tanggal_update;
        LinearLayout list;
        DataModel dm;
        HolderData(View v){
            super(v);
            nama_rs = v.findViewById(R.id.tvNamaRS);

            kelas = v.findViewById(R.id.tvKelas);

            pemilik = v.findViewById(R.id.tvPemilik);
            pekerja = v.findViewById(R.id.tvPekerja);
            tempattidur = v.findViewById(R.id.tvTotalJumlahBed);

            list = v.findViewById(R.id.List);
        }
    }



    private void Logic(String kode){
        ApiRequestFajar api = RetroServerFajar.getClient().create(ApiRequestFajar.class);
        Call<ResponseModel> DetailRS = api.detailHospital(kode);
        DetailRS.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                if (response.isSuccessful()){
                    Intent goInput = new Intent(ctx, DetailHospitalActivity.class);
                    goInput.putExtra("Kode",response.body().getKode_rs());
                    goInput.putExtra("Registrasi",response.body().getTgl_registrasi_rs());
                    goInput.putExtra("NamaRS",response.body().getNama_rs());
                    goInput.putExtra("Jenis",response.body().getJenis_rs());
                    goInput.putExtra("KlsRS",response.body().getKelas_rs());
                    goInput.putExtra("DirekturRS",response.body().getDirektur_rs());
                    goInput.putExtra("LatarBelakangPendidikan",response.body().getLatar_pendidikan_direktur_rs());
                    goInput.putExtra("Pemilik",response.body().getPemilik_rs());
                    goInput.putExtra("Alamat",response.body().getAlamat_rs());
                    goInput.putExtra("Kota",response.body().getNama_kab_kota());
                    goInput.putExtra("KodePos",response.body().getKode_pos_rs());
                    goInput.putExtra("Telepon",response.body().getTelepon_rs());
                    goInput.putExtra("Fax",response.body().getFax_rs());
                    goInput.putExtra("Email",response.body().getEmail_rs());
                    goInput.putExtra("TeleponHumas",response.body().getTelepon_humas_rs());
                    goInput.putExtra("Website",response.body().getWebsite_rs());
                    goInput.putExtra("LuasTanah",response.body().getLuas_tanah_rs());
                    goInput.putExtra("LuasBangunan",response.body().getLuas_bangunan_rs());
                    goInput.putExtra("NoSuratIzin",response.body().getNo_surat_ijin());
                    goInput.putExtra("TanggalSuratIzin",response.body().getTanggal_surat_ijin());
                    goInput.putExtra("SuratIzinDari",response.body().getSurat_ijin_dari());
                    goInput.putExtra("SifatSuratIjin",response.body().getSifat_surat_ijin());
                    goInput.putExtra("MasaBerlakuSuratIjin",response.body().getMasa_berlaku_ijin());
                    goInput.putExtra("StatusPenyelenggara",response.body().getStatus_penyelenggara());
                    goInput.putExtra("StatusAkreditasi",response.body().getStatus_akreditasi());
                    goInput.putExtra("TglAkreditasi",response.body().getTgl_akreditasi());
                    goInput.putExtra("BerlakuSampai",response.body().getBerlaku_sampai_dengan());
                    goInput.putExtra("VVIP",response.body().getVvip_bed());
                    goInput.putExtra("VIP",response.body().getVip_bed());
                    goInput.putExtra("Kelas1",response.body().getKelas_1_bed());
                    goInput.putExtra("Kelas2",response.body().getKelas_2_bed());
                    goInput.putExtra("Kelas3",response.body().getKelas_3_bed());
                    goInput.putExtra("ICU",response.body().getIcu_bed());
                    goInput.putExtra("PICU",response.body().getPicu_bed());
                    goInput.putExtra("NICU",response.body().getNicu_bed());
                    goInput.putExtra("TTBayiBaru",response.body().getTt_bayi_baru_lahir_bed());
                    goInput.putExtra("HCU",response.body().getHcu_bed());
                    goInput.putExtra("ICCU",response.body().getIccu_bed());
                    goInput.putExtra("IGD",response.body().getIgd_bed());
                    goInput.putExtra("TTRuangOperasi",response.body().getTt_di_ruang_operasi_bed());
                    goInput.putExtra("TTRuangIsolasi",response.body().getTt_di_ruang_operasi_bed());
                    goInput.putExtra("DrUmum",response.body().getDr_umum());
                    goInput.putExtra("DrOG",response.body().getDr_sp_og());
                    goInput.putExtra("DrPD",response.body().getDr_sp_pd());
                    goInput.putExtra("DrB",response.body().getDr_sp_b());
                    goInput.putExtra("DrRad",response.body().getDr_sp_rad());
                    goInput.putExtra("DrRM",response.body().getDr_sp_rm());
                    goInput.putExtra("DrAn",response.body().getDr_an());
                    goInput.putExtra("DrJp",response.body().getDr_sp_jp());
                    goInput.putExtra("DrM",response.body().getDr_sp_m());
                    goInput.putExtra("DrTHT",response.body().getDr_sp_tht());
                    goInput.putExtra("DrPK",response.body().getDr_sp_pk());
                    goInput.putExtra("DrParu",response.body().getDr_sp_paru());
                    goInput.putExtra("DrBedahThoraks",response.body().getDr_sp_bedah_thoraks());
                    goInput.putExtra("DrBedahAnak",response.body().getDr_sp_bedah_anak());
                    goInput.putExtra("DrBedahOrhopedi",response.body().getDr_sp_bedah_orthopedi());
                    goInput.putExtra("DrA",response.body().getDr_sp_a());
                    goInput.putExtra("DrOkupasi",response.body().getDr_sp_okupasi());
                    goInput.putExtra("DrUrologi",response.body().getDr_sp_urologi());
                    goInput.putExtra("DrOrthopedi",response.body().getDr_sp_orthopedi());
                    goInput.putExtra("DrKulit",response.body().getDr_sp_kulit_dan_kelamin());
                    goInput.putExtra("DrForensik",response.body().getDr_sp_forensik());
                    goInput.putExtra("DrPsikiatri",response.body().getDr_sp_psikiatri());
                    goInput.putExtra("DrOfthalmologi",response.body().getDr_sp_ofthamologi());
                    goInput.putExtra("DrAnatomi",response.body().getDr_sp_patologi_anatomi());
                    goInput.putExtra("DrJiwa",response.body().getDr_jiwa());
                    goInput.putExtra("DrSaraf",response.body().getDr_sp_saraf());
                    goInput.putExtra("DrLainnya",response.body().getDr_sp_lainnya());
                    goInput.putExtra("DrBedahSaraf",response.body().getDr_sp_bedah_saraf());
                    goInput.putExtra("DrBedahPlastik",response.body().getDr_sp_bedah_plastik());
                    goInput.putExtra("DrSubSpesialis",response.body().getDr_sub_spesialis());
                    goInput.putExtra("DrGigi",response.body().getDr_gigi());
                    goInput.putExtra("DrBedahMulut",response.body().getDr_gigi_sp_bedah_mulut());
                    goInput.putExtra("DrKonservasi",response.body().getDr_gigi_sp_konservasi());
                    goInput.putExtra("DrPenyakitMulut",response.body().getDr_gigi_sp_penyakit_mulut());
                    goInput.putExtra("DrRadiologi",response.body().getDr_gigi_sp_radiologi());
                    goInput.putExtra("DrKarangGigi",response.body().getDr_gigi_sp_karang_gigi());
                    goInput.putExtra("DrGigiAnak",response.body().getDr_gigi_sp_anak());
                    goInput.putExtra("DrGigiTiruan",response.body().getDr_gigi_sp_gigi_tiruan());
                    goInput.putExtra("DrPeriodonsia",response.body().getDr_gigi_sp_periodonsia());
                    goInput.putExtra("DrGigiLainnya",response.body().getDr_gigi_sp_lainnya());
                    goInput.putExtra("BidanPendidik",response.body().getBidan_pendidik());
                    goInput.putExtra("BidanKlinik",response.body().getBidan_klinik());
                    goInput.putExtra("Apoteker",response.body().getApoteker());
                    goInput.putExtra("AnalisFarmasi",response.body().getAnalis_farmasi());
                    goInput.putExtra("Radiografer",response.body().getRadiografer());
                    goInput.putExtra("Radioterapis",response.body().getRadioterapis());
                    goInput.putExtra("Elektromedis",response.body().getElektromedis());
                    goInput.putExtra("TeknisiGigi",response.body().getTeknisi_gigi());
                    goInput.putExtra("AnalisKesehataan",response.body().getAnalis_kesehatan());
                    goInput.putExtra("Refraksionis",response.body().getRefraksionis());
                    goInput.putExtra("RekamMedik",response.body().getRekam_medik());
                    goInput.putExtra("Ortotik",response.body().getOrtotik());
                    goInput.putExtra("TransfusiDarah",response.body().getTeknisi_transfusi_darah());
                    goInput.putExtra("Kardiovaskular",response.body().getTeknisi_kardiovaskular());
                    goInput.putExtra("Epidemiologi",response.body().getEpidemiologi());
                    goInput.putExtra("PromosiKesehatan",response.body().getPromosi_kesehatan());
                    goInput.putExtra("Perilaku",response.body().getPerilaku());
                    goInput.putExtra("Kesja",response.body().getKesja());
                    goInput.putExtra("AdministrasiKesehatan",response.body().getAdministrasi_kesehatan());
                    goInput.putExtra("Biostatik",response.body().getBiostatik());
                    goInput.putExtra("Reproduksi",response.body().getReproduksi());
                    goInput.putExtra("InformasiKesehatan",response.body().getInformasi_kesehatan());
                    goInput.putExtra("KesmasLainnya",response.body().getKesmas_lainnya());
                    //Tenaga Kesehatan Lainnya
                    goInput.putExtra("Sanitasi",response.body().getSanitasi());
                    goInput.putExtra("Entomologi",response.body().getEntomologi());
                    goInput.putExtra("Mikrobiologi",response.body().getMikrobiologi());
                    goInput.putExtra("KesehatanLingkungan",response.body().getKesehatan_lingkungan());
                    goInput.putExtra("TerapiWicara",response.body().getTerapi_wicara());
                    goInput.putExtra("Nutrisionis",response.body().getNutrisionis());
                    goInput.putExtra("Dietsien",response.body().getDietsien());
                    goInput.putExtra("Fisioterapi",response.body().getFisioterapi());
                    goInput.putExtra("TerapiOkupasi",response.body().getTerapi_okupasi());
                    goInput.putExtra("Akupunturis",response.body().getAkupunturis());
                    //Tenaga Non Kesehatan
                    goInput.putExtra("ProgramKesehatan",response.body().getProgram_kesehatan());
                    goInput.putExtra("Administrasikeuangan",response.body().getAdministrasi_keuangan());
                    goInput.putExtra("Humas",response.body().getHumas());
                    goInput.putExtra("Perencanaan",response.body().getPerencanaan());
                    goInput.putExtra("JaminanKesehatan",response.body().getJaminan_kesehatan());
                    goInput.putExtra("Dosen",response.body().getDosen());
                    goInput.putExtra("Psikologi",response.body().getPsikologi());
                    goInput.putExtra("Pelaporan",response.body().getPelaporan());
                    goInput.putExtra("InformasiTeknologi",response.body().getInformasi_teknologi());
                    goInput.putExtra("Hukum",response.body().getHukum());
                    goInput.putExtra("Pekarya",response.body().getPekarya());
                    goInput.putExtra("Perpustakaan",response.body().getPerpustakaan());
                    goInput.putExtra("Widyaswara",response.body().getWidyaiswara());
                    goInput.putExtra("TenagaNonKers",response.body().getTenaga_non_kes());
                    //Data Peralatan Di Rumah Sakit
                    goInput.putExtra("MejaOperasi",response.body().getMeja_operasi());
                    goInput.putExtra("MesinAnestesi",response.body().getMesin_anestesi());
                    goInput.putExtra("Ventilator",response.body().getVentilator());
                    goInput.putExtra("Inkubator",response.body().getInkubator());
                    goInput.putExtra("BlueLight",response.body().getBlue_light());
                    goInput.putExtra("U_S_G",response.body().getUsg());
                    goInput.putExtra("XRay",response.body().getX_ray());
                    goInput.putExtra("CTScan",response.body().getCt_scan());
                    goInput.putExtra("MRI",response.body().getMri());
                    goInput.putExtra("EEG",response.body().getEeg());
                    goInput.putExtra("EKG",response.body().getEkg());
                    goInput.putExtra("Defibrilator",response.body().getDefibrilator());
                    goInput.putExtra("Autoclav",response.body().getAutoclav());
                    goInput.putExtra("RawatJalan",response.body().getRawat_jalan());
                    goInput.putExtra("RawatInap",response.body().getRawat_inap());
                    goInput.putExtra("I_G_D",response.body().getI_g_dbank());
                    goInput.putExtra("BOR",response.body().getBor());
                    goInput.putExtra("ALOS",response.body().getAlos());
                    goInput.putExtra("TOI",response.body().getToi());
                    goInput.putExtra("NDR",response.body().getNdr());
                    goInput.putExtra("GDR",response.body().getGdr());
                    goInput.putExtra("LayananUnggulan",response.body().getLayanan_unggulan());
                    goInput.putExtra("SIMRS",response.body().getSimrs());
                    goInput.putExtra("Ambulan",response.body().getAmbulan());
                    goInput.putExtra("BankDarah",response.body().getBank_darah());
                    goInput.putExtra("TanggalUpdate",response.body().getTgl_update());
                    ctx.startActivities(new Intent[]{goInput});
                }else{

                }
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Toast.makeText(ctx, "Koneksi Gagal", Toast.LENGTH_SHORT).show();
            }
        });




    }
}
