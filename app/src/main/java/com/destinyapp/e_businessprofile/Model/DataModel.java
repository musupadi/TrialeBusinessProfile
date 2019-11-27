package com.destinyapp.e_businessprofile.Model;

public class DataModel {
    String email,password,nama,no_telpon,status;
    String id_user,nama_user;
    String log,tanggal;
    String message;
    String nama_provinsi,id_provinsi;
    String kelas_rs,jumlah_bed_rs,jumlah_tenaga_rs;
    String id_kab_kota,tipe_kab_kota,nama_kab_kota;
    String jumlah_bed,jumlah_tenaga;
    String kode_rs,tgl_registrasi_rs,nama_rs,jenis_rs,
            direktur_rs,latar_pendidikan_direktur_rs,pemilik_rs,
            alamat_rs,latitude,longitude,provinsi_rs,kabupaten_kota_rs,
            kode_pos_rs,telepon_rs,fax_rs,email_rs,telepon_humas_rs,website_rs,luas_tanah_rs,
            luas_bangunan_rs,no_surat_ijin,tgl_surat_ijin,surat_ijin_dari,sifat_surat_ijin,
            masa_berlaku_ijin,status_penyelenggara,status_akreditasi,tgl_akreditasi,berlaku_sampai_dengan,
            tgl_update,vvip_bed,vip_bed,kelas_1_bed,kelas_2_bed,kelas_3_bed,icu_bed,picu_bed,nicu_bed,tt_bayi_baru_lahir_bed,
            hcu_bed,iccu_bed,igd_bed,tt_di_ruang_operasi_bed,tt_di_ruang_isolasi_bed,dr_umum,dr_sp_og,dr_sp_pd,dr_sp_b,dr_sp_rad,
            dr_sp_rm,dr_sp_an,dr_sp_jp,dr_sp_m,dr_sp_tht,dr_sp_pk,dr_sp_paru,dr_sp_bedah_thoraks,dr_sp_bedah_anak,dr_sp_bedah_orthopedi,
            dr_sp_a,dr_sp_okupasi,dr_sp_urologi,dr_sp_orthopedi,dr_sp_kulit_dan_kelamin,dr_sp_forensik,dr_sp_psikiatri,dr_sp_ofthamologi,
            dr_sp_patologi_anatomi,dr_sp_kes_kejiwaan,dr_sp_saraf,dr_sp_lainnya,dr_sp_bedah_saraf,dr_sp_bedah_plastik,dr_sub_spesialis,dr_gigi,
            dr_gigi_sp_bedah_mulut,dr_gigi_sp_konservasi,dr_gigi_sp_penyakit_mulut,dr_gigi_sp_radiologi,dr_gigi_sp_karang_gigi,dr_gigi_sp_anak,
            dr_gigi_sp_gigi_tiruan,dr_gigi_sp_periodonsia,dr_gigi_sp_lainnya,ners,perawat_bedah,perawat_maternitas,perawat_komunitas,perawat_gigi,
            perawat_anestesi,perawat_anak,perawat_lainnya,bidan_pendidik,bidan_klinik,apoteker,analis_farmasi,radiografer,radioterapis,elektromedis,
            teknisi_gigi,analis_kesehatan,refaksionis,rekam_medik,ortotik,teknisi_transfusi_darah,teknisi_kardiovaskular,epidemiologi,promosi_kesehatan,
            perilaku,kesja,administrasi_kesehatan,biostatistik,reproduksi,informasi_kesehatan,kesmas_lainnya,sanitasi,entomologi,mikrobiologi,kesehatan_lingkungan,
            terapi_wicara,nutrisionis,dietsien,fisioterapi,terapi_okupasi,akupunturis,program_kesehatan,administrasi_keuangan,humas,perencanaan,jaminan_kesehatan,dosen,
            psikologi,pelaporan,informasi_teknologi,hukum,pekarya,perpustakaan,widyaiswara,tenaga_non_kes,meja_operasi,mesin_anestesi,ventilator,inkubator,blue_light,usg,
            x_ray,ct_scan,mri,eeg,ekg,defibrilator,autoclav,rawat_jalan,rawat_inap,igd,bor,alos,toi,ndr,gdr,layanan_unggulan,simrs,ambulan,bank_darah;

    String tgl_registrasi,jenis,
            kelas,direktur,latar_belakang,pemilik,
            alamat,kab_kota,kode_pos,
            telepon,fax,telepon_humas,website,luas_tanah,
            luas_bangunan,tanggal_surat_ijin,
            berlaku_sampai,vvip,vip,kelas_1,kelas_2,kelas_3,icu,picu,nicu,
            tt_bayi,hcu,iccu,tt_operasi,tt_isolasi,dr_og,dr_pd,dr_b,
            dr_rad,dr_rm,dr_an,dr_jp,dr_m,dr_tht,dr_pk,dr_paru_paru,dr_bedah_thoraks,
            dr_bedah_anak,dr_bedah_orthopedi,dr_a,dr_okupasi,dr_urologi,dr_kulit,
            dr_forensik,dr_psikiatri,dr_ofthalmologi,dr_anatomi,dr_jiwa,dr_saraf,dr_lainnya,
            dr_bedah_saraf,dr_bedah_plastik,dr_bedah_mulut,dr_konservasi,
            dr_penyakit_mulut,dr_radiologi,dr_karang_gigi,dr_gigi_anak,dr_gigi_tiruan,dr_periodonsia,
            dr_gigi_lainnya,bidan_pendidikan,radiografi,refraksionis,
            rekam_medis,transfusi_darah,kardiovaskular,epidemiology,prilaku,biostatik,dietisien,admin_kesehatan,bank;
    String id_berita,judul_berita,isi_berita,kategori_berita,cover_berita,tgl_upload,status_berita;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_telpon() {
        return no_telpon;
    }

    public void setNo_telpon(String no_telpon) {
        this.no_telpon = no_telpon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNama_provinsi() {
        return nama_provinsi;
    }

    public void setNama_provinsi(String nama_provinsi) {
        this.nama_provinsi = nama_provinsi;
    }

    public String getId_provinsi() {
        return id_provinsi;
    }

    public void setId_provinsi(String id_provinsi) {
        this.id_provinsi = id_provinsi;
    }

    public String getKelas_rs() {
        return kelas_rs;
    }

    public void setKelas_rs(String kelas_rs) {
        this.kelas_rs = kelas_rs;
    }

    public String getJumlah_bed_rs() {
        return jumlah_bed_rs;
    }

    public void setJumlah_bed_rs(String jumlah_bed_rs) {
        this.jumlah_bed_rs = jumlah_bed_rs;
    }

    public String getJumlah_tenaga_rs() {
        return jumlah_tenaga_rs;
    }

    public void setJumlah_tenaga_rs(String jumlah_tenaga_rs) {
        this.jumlah_tenaga_rs = jumlah_tenaga_rs;
    }

    public String getId_kab_kota() {
        return id_kab_kota;
    }

    public void setId_kab_kota(String id_kab_kota) {
        this.id_kab_kota = id_kab_kota;
    }

    public String getTipe_kab_kota() {
        return tipe_kab_kota;
    }

    public void setTipe_kab_kota(String tipe_kab_kota) {
        this.tipe_kab_kota = tipe_kab_kota;
    }

    public String getNama_kab_kota() {
        return nama_kab_kota;
    }

    public void setNama_kab_kota(String nama_kab_kota) {
        this.nama_kab_kota = nama_kab_kota;
    }

    public String getJumlah_bed() {
        return jumlah_bed;
    }

    public void setJumlah_bed(String jumlah_bed) {
        this.jumlah_bed = jumlah_bed;
    }

    public String getJumlah_tenaga() {
        return jumlah_tenaga;
    }

    public void setJumlah_tenaga(String jumlah_tenaga) {
        this.jumlah_tenaga = jumlah_tenaga;
    }

    public String getKode_rs() {
        return kode_rs;
    }

    public void setKode_rs(String kode_rs) {
        this.kode_rs = kode_rs;
    }

    public String getTgl_registrasi_rs() {
        return tgl_registrasi_rs;
    }

    public void setTgl_registrasi_rs(String tgl_registrasi_rs) {
        this.tgl_registrasi_rs = tgl_registrasi_rs;
    }

    public String getNama_rs() {
        return nama_rs;
    }

    public void setNama_rs(String nama_rs) {
        this.nama_rs = nama_rs;
    }

    public String getJenis_rs() {
        return jenis_rs;
    }

    public void setJenis_rs(String jenis_rs) {
        this.jenis_rs = jenis_rs;
    }

    public String getDirektur_rs() {
        return direktur_rs;
    }

    public void setDirektur_rs(String direktur_rs) {
        this.direktur_rs = direktur_rs;
    }

    public String getLatar_pendidikan_direktur_rs() {
        return latar_pendidikan_direktur_rs;
    }

    public void setLatar_pendidikan_direktur_rs(String latar_pendidikan_direktur_rs) {
        this.latar_pendidikan_direktur_rs = latar_pendidikan_direktur_rs;
    }

    public String getPemilik_rs() {
        return pemilik_rs;
    }

    public void setPemilik_rs(String pemilik_rs) {
        this.pemilik_rs = pemilik_rs;
    }

    public String getAlamat_rs() {
        return alamat_rs;
    }

    public void setAlamat_rs(String alamat_rs) {
        this.alamat_rs = alamat_rs;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getProvinsi_rs() {
        return provinsi_rs;
    }

    public void setProvinsi_rs(String provinsi_rs) {
        this.provinsi_rs = provinsi_rs;
    }

    public String getKabupaten_kota_rs() {
        return kabupaten_kota_rs;
    }

    public void setKabupaten_kota_rs(String kabupaten_kota_rs) {
        this.kabupaten_kota_rs = kabupaten_kota_rs;
    }

    public String getKode_pos_rs() {
        return kode_pos_rs;
    }

    public void setKode_pos_rs(String kode_pos_rs) {
        this.kode_pos_rs = kode_pos_rs;
    }

    public String getTelepon_rs() {
        return telepon_rs;
    }

    public void setTelepon_rs(String telepon_rs) {
        this.telepon_rs = telepon_rs;
    }

    public String getFax_rs() {
        return fax_rs;
    }

    public void setFax_rs(String fax_rs) {
        this.fax_rs = fax_rs;
    }

    public String getEmail_rs() {
        return email_rs;
    }

    public void setEmail_rs(String email_rs) {
        this.email_rs = email_rs;
    }

    public String getTelepon_humas_rs() {
        return telepon_humas_rs;
    }

    public void setTelepon_humas_rs(String telepon_humas_rs) {
        this.telepon_humas_rs = telepon_humas_rs;
    }

    public String getWebsite_rs() {
        return website_rs;
    }

    public void setWebsite_rs(String website_rs) {
        this.website_rs = website_rs;
    }

    public String getLuas_tanah_rs() {
        return luas_tanah_rs;
    }

    public void setLuas_tanah_rs(String luas_tanah_rs) {
        this.luas_tanah_rs = luas_tanah_rs;
    }

    public String getLuas_bangunan_rs() {
        return luas_bangunan_rs;
    }

    public void setLuas_bangunan_rs(String luas_bangunan_rs) {
        this.luas_bangunan_rs = luas_bangunan_rs;
    }

    public String getNo_surat_ijin() {
        return no_surat_ijin;
    }

    public void setNo_surat_ijin(String no_surat_ijin) {
        this.no_surat_ijin = no_surat_ijin;
    }

    public String getTgl_surat_ijin() {
        return tgl_surat_ijin;
    }

    public void setTgl_surat_ijin(String tgl_surat_ijin) {
        this.tgl_surat_ijin = tgl_surat_ijin;
    }

    public String getSurat_ijin_dari() {
        return surat_ijin_dari;
    }

    public void setSurat_ijin_dari(String surat_ijin_dari) {
        this.surat_ijin_dari = surat_ijin_dari;
    }

    public String getSifat_surat_ijin() {
        return sifat_surat_ijin;
    }

    public void setSifat_surat_ijin(String sifat_surat_ijin) {
        this.sifat_surat_ijin = sifat_surat_ijin;
    }

    public String getMasa_berlaku_ijin() {
        return masa_berlaku_ijin;
    }

    public void setMasa_berlaku_ijin(String masa_berlaku_ijin) {
        this.masa_berlaku_ijin = masa_berlaku_ijin;
    }

    public String getStatus_penyelenggara() {
        return status_penyelenggara;
    }

    public void setStatus_penyelenggara(String status_penyelenggara) {
        this.status_penyelenggara = status_penyelenggara;
    }

    public String getStatus_akreditasi() {
        return status_akreditasi;
    }

    public void setStatus_akreditasi(String status_akreditasi) {
        this.status_akreditasi = status_akreditasi;
    }

    public String getTgl_akreditasi() {
        return tgl_akreditasi;
    }

    public void setTgl_akreditasi(String tgl_akreditasi) {
        this.tgl_akreditasi = tgl_akreditasi;
    }

    public String getBerlaku_sampai_dengan() {
        return berlaku_sampai_dengan;
    }

    public void setBerlaku_sampai_dengan(String berlaku_sampai_dengan) {
        this.berlaku_sampai_dengan = berlaku_sampai_dengan;
    }

    public String getTgl_update() {
        return tgl_update;
    }

    public void setTgl_update(String tgl_update) {
        this.tgl_update = tgl_update;
    }

    public String getVvip_bed() {
        return vvip_bed;
    }

    public void setVvip_bed(String vvip_bed) {
        this.vvip_bed = vvip_bed;
    }

    public String getVip_bed() {
        return vip_bed;
    }

    public void setVip_bed(String vip_bed) {
        this.vip_bed = vip_bed;
    }

    public String getKelas_1_bed() {
        return kelas_1_bed;
    }

    public void setKelas_1_bed(String kelas_1_bed) {
        this.kelas_1_bed = kelas_1_bed;
    }

    public String getKelas_2_bed() {
        return kelas_2_bed;
    }

    public void setKelas_2_bed(String kelas_2_bed) {
        this.kelas_2_bed = kelas_2_bed;
    }

    public String getKelas_3_bed() {
        return kelas_3_bed;
    }

    public void setKelas_3_bed(String kelas_3_bed) {
        this.kelas_3_bed = kelas_3_bed;
    }

    public String getIcu_bed() {
        return icu_bed;
    }

    public void setIcu_bed(String icu_bed) {
        this.icu_bed = icu_bed;
    }

    public String getPicu_bed() {
        return picu_bed;
    }

    public void setPicu_bed(String picu_bed) {
        this.picu_bed = picu_bed;
    }

    public String getNicu_bed() {
        return nicu_bed;
    }

    public void setNicu_bed(String nicu_bed) {
        this.nicu_bed = nicu_bed;
    }

    public String getTt_bayi_baru_lahir_bed() {
        return tt_bayi_baru_lahir_bed;
    }

    public void setTt_bayi_baru_lahir_bed(String tt_bayi_baru_lahir_bed) {
        this.tt_bayi_baru_lahir_bed = tt_bayi_baru_lahir_bed;
    }

    public String getHcu_bed() {
        return hcu_bed;
    }

    public void setHcu_bed(String hcu_bed) {
        this.hcu_bed = hcu_bed;
    }

    public String getIccu_bed() {
        return iccu_bed;
    }

    public void setIccu_bed(String iccu_bed) {
        this.iccu_bed = iccu_bed;
    }

    public String getIgd_bed() {
        return igd_bed;
    }

    public void setIgd_bed(String igd_bed) {
        this.igd_bed = igd_bed;
    }

    public String getTt_di_ruang_operasi_bed() {
        return tt_di_ruang_operasi_bed;
    }

    public void setTt_di_ruang_operasi_bed(String tt_di_ruang_operasi_bed) {
        this.tt_di_ruang_operasi_bed = tt_di_ruang_operasi_bed;
    }

    public String getTt_di_ruang_isolasi_bed() {
        return tt_di_ruang_isolasi_bed;
    }

    public void setTt_di_ruang_isolasi_bed(String tt_di_ruang_isolasi_bed) {
        this.tt_di_ruang_isolasi_bed = tt_di_ruang_isolasi_bed;
    }

    public String getDr_umum() {
        return dr_umum;
    }

    public void setDr_umum(String dr_umum) {
        this.dr_umum = dr_umum;
    }

    public String getDr_sp_og() {
        return dr_sp_og;
    }

    public void setDr_sp_og(String dr_sp_og) {
        this.dr_sp_og = dr_sp_og;
    }

    public String getDr_sp_pd() {
        return dr_sp_pd;
    }

    public void setDr_sp_pd(String dr_sp_pd) {
        this.dr_sp_pd = dr_sp_pd;
    }

    public String getDr_sp_b() {
        return dr_sp_b;
    }

    public void setDr_sp_b(String dr_sp_b) {
        this.dr_sp_b = dr_sp_b;
    }

    public String getDr_sp_rad() {
        return dr_sp_rad;
    }

    public void setDr_sp_rad(String dr_sp_rad) {
        this.dr_sp_rad = dr_sp_rad;
    }

    public String getDr_sp_rm() {
        return dr_sp_rm;
    }

    public void setDr_sp_rm(String dr_sp_rm) {
        this.dr_sp_rm = dr_sp_rm;
    }

    public String getDr_sp_an() {
        return dr_sp_an;
    }

    public void setDr_sp_an(String dr_sp_an) {
        this.dr_sp_an = dr_sp_an;
    }

    public String getDr_sp_jp() {
        return dr_sp_jp;
    }

    public void setDr_sp_jp(String dr_sp_jp) {
        this.dr_sp_jp = dr_sp_jp;
    }

    public String getDr_sp_m() {
        return dr_sp_m;
    }

    public void setDr_sp_m(String dr_sp_m) {
        this.dr_sp_m = dr_sp_m;
    }

    public String getDr_sp_tht() {
        return dr_sp_tht;
    }

    public void setDr_sp_tht(String dr_sp_tht) {
        this.dr_sp_tht = dr_sp_tht;
    }

    public String getDr_sp_pk() {
        return dr_sp_pk;
    }

    public void setDr_sp_pk(String dr_sp_pk) {
        this.dr_sp_pk = dr_sp_pk;
    }

    public String getDr_sp_paru() {
        return dr_sp_paru;
    }

    public void setDr_sp_paru(String dr_sp_paru) {
        this.dr_sp_paru = dr_sp_paru;
    }

    public String getDr_sp_bedah_thoraks() {
        return dr_sp_bedah_thoraks;
    }

    public void setDr_sp_bedah_thoraks(String dr_sp_bedah_thoraks) {
        this.dr_sp_bedah_thoraks = dr_sp_bedah_thoraks;
    }

    public String getDr_sp_bedah_anak() {
        return dr_sp_bedah_anak;
    }

    public void setDr_sp_bedah_anak(String dr_sp_bedah_anak) {
        this.dr_sp_bedah_anak = dr_sp_bedah_anak;
    }

    public String getDr_sp_bedah_orthopedi() {
        return dr_sp_bedah_orthopedi;
    }

    public void setDr_sp_bedah_orthopedi(String dr_sp_bedah_orthopedi) {
        this.dr_sp_bedah_orthopedi = dr_sp_bedah_orthopedi;
    }

    public String getDr_sp_a() {
        return dr_sp_a;
    }

    public void setDr_sp_a(String dr_sp_a) {
        this.dr_sp_a = dr_sp_a;
    }

    public String getDr_sp_okupasi() {
        return dr_sp_okupasi;
    }

    public void setDr_sp_okupasi(String dr_sp_okupasi) {
        this.dr_sp_okupasi = dr_sp_okupasi;
    }

    public String getDr_sp_urologi() {
        return dr_sp_urologi;
    }

    public void setDr_sp_urologi(String dr_sp_urologi) {
        this.dr_sp_urologi = dr_sp_urologi;
    }

    public String getDr_sp_orthopedi() {
        return dr_sp_orthopedi;
    }

    public void setDr_sp_orthopedi(String dr_sp_orthopedi) {
        this.dr_sp_orthopedi = dr_sp_orthopedi;
    }

    public String getDr_sp_kulit_dan_kelamin() {
        return dr_sp_kulit_dan_kelamin;
    }

    public void setDr_sp_kulit_dan_kelamin(String dr_sp_kulit_dan_kelamin) {
        this.dr_sp_kulit_dan_kelamin = dr_sp_kulit_dan_kelamin;
    }

    public String getDr_sp_forensik() {
        return dr_sp_forensik;
    }

    public void setDr_sp_forensik(String dr_sp_forensik) {
        this.dr_sp_forensik = dr_sp_forensik;
    }

    public String getDr_sp_psikiatri() {
        return dr_sp_psikiatri;
    }

    public void setDr_sp_psikiatri(String dr_sp_psikiatri) {
        this.dr_sp_psikiatri = dr_sp_psikiatri;
    }

    public String getDr_sp_ofthamologi() {
        return dr_sp_ofthamologi;
    }

    public void setDr_sp_ofthamologi(String dr_sp_ofthamologi) {
        this.dr_sp_ofthamologi = dr_sp_ofthamologi;
    }

    public String getDr_sp_patologi_anatomi() {
        return dr_sp_patologi_anatomi;
    }

    public void setDr_sp_patologi_anatomi(String dr_sp_patologi_anatomi) {
        this.dr_sp_patologi_anatomi = dr_sp_patologi_anatomi;
    }

    public String getDr_sp_kes_kejiwaan() {
        return dr_sp_kes_kejiwaan;
    }

    public void setDr_sp_kes_kejiwaan(String dr_sp_kes_kejiwaan) {
        this.dr_sp_kes_kejiwaan = dr_sp_kes_kejiwaan;
    }

    public String getDr_sp_saraf() {
        return dr_sp_saraf;
    }

    public void setDr_sp_saraf(String dr_sp_saraf) {
        this.dr_sp_saraf = dr_sp_saraf;
    }

    public String getDr_sp_lainnya() {
        return dr_sp_lainnya;
    }

    public void setDr_sp_lainnya(String dr_sp_lainnya) {
        this.dr_sp_lainnya = dr_sp_lainnya;
    }

    public String getDr_sp_bedah_saraf() {
        return dr_sp_bedah_saraf;
    }

    public void setDr_sp_bedah_saraf(String dr_sp_bedah_saraf) {
        this.dr_sp_bedah_saraf = dr_sp_bedah_saraf;
    }

    public String getDr_sp_bedah_plastik() {
        return dr_sp_bedah_plastik;
    }

    public void setDr_sp_bedah_plastik(String dr_sp_bedah_plastik) {
        this.dr_sp_bedah_plastik = dr_sp_bedah_plastik;
    }

    public String getDr_sub_spesialis() {
        return dr_sub_spesialis;
    }

    public void setDr_sub_spesialis(String dr_sub_spesialis) {
        this.dr_sub_spesialis = dr_sub_spesialis;
    }

    public String getDr_gigi() {
        return dr_gigi;
    }

    public void setDr_gigi(String dr_gigi) {
        this.dr_gigi = dr_gigi;
    }

    public String getDr_gigi_sp_bedah_mulut() {
        return dr_gigi_sp_bedah_mulut;
    }

    public void setDr_gigi_sp_bedah_mulut(String dr_gigi_sp_bedah_mulut) {
        this.dr_gigi_sp_bedah_mulut = dr_gigi_sp_bedah_mulut;
    }

    public String getDr_gigi_sp_konservasi() {
        return dr_gigi_sp_konservasi;
    }

    public void setDr_gigi_sp_konservasi(String dr_gigi_sp_konservasi) {
        this.dr_gigi_sp_konservasi = dr_gigi_sp_konservasi;
    }

    public String getDr_gigi_sp_penyakit_mulut() {
        return dr_gigi_sp_penyakit_mulut;
    }

    public void setDr_gigi_sp_penyakit_mulut(String dr_gigi_sp_penyakit_mulut) {
        this.dr_gigi_sp_penyakit_mulut = dr_gigi_sp_penyakit_mulut;
    }

    public String getDr_gigi_sp_radiologi() {
        return dr_gigi_sp_radiologi;
    }

    public void setDr_gigi_sp_radiologi(String dr_gigi_sp_radiologi) {
        this.dr_gigi_sp_radiologi = dr_gigi_sp_radiologi;
    }

    public String getDr_gigi_sp_karang_gigi() {
        return dr_gigi_sp_karang_gigi;
    }

    public void setDr_gigi_sp_karang_gigi(String dr_gigi_sp_karang_gigi) {
        this.dr_gigi_sp_karang_gigi = dr_gigi_sp_karang_gigi;
    }

    public String getDr_gigi_sp_anak() {
        return dr_gigi_sp_anak;
    }

    public void setDr_gigi_sp_anak(String dr_gigi_sp_anak) {
        this.dr_gigi_sp_anak = dr_gigi_sp_anak;
    }

    public String getDr_gigi_sp_gigi_tiruan() {
        return dr_gigi_sp_gigi_tiruan;
    }

    public void setDr_gigi_sp_gigi_tiruan(String dr_gigi_sp_gigi_tiruan) {
        this.dr_gigi_sp_gigi_tiruan = dr_gigi_sp_gigi_tiruan;
    }

    public String getDr_gigi_sp_periodonsia() {
        return dr_gigi_sp_periodonsia;
    }

    public void setDr_gigi_sp_periodonsia(String dr_gigi_sp_periodonsia) {
        this.dr_gigi_sp_periodonsia = dr_gigi_sp_periodonsia;
    }

    public String getDr_gigi_sp_lainnya() {
        return dr_gigi_sp_lainnya;
    }

    public void setDr_gigi_sp_lainnya(String dr_gigi_sp_lainnya) {
        this.dr_gigi_sp_lainnya = dr_gigi_sp_lainnya;
    }

    public String getNers() {
        return ners;
    }

    public void setNers(String ners) {
        this.ners = ners;
    }

    public String getPerawat_bedah() {
        return perawat_bedah;
    }

    public void setPerawat_bedah(String perawat_bedah) {
        this.perawat_bedah = perawat_bedah;
    }

    public String getPerawat_maternitas() {
        return perawat_maternitas;
    }

    public void setPerawat_maternitas(String perawat_maternitas) {
        this.perawat_maternitas = perawat_maternitas;
    }

    public String getPerawat_komunitas() {
        return perawat_komunitas;
    }

    public void setPerawat_komunitas(String perawat_komunitas) {
        this.perawat_komunitas = perawat_komunitas;
    }

    public String getPerawat_gigi() {
        return perawat_gigi;
    }

    public void setPerawat_gigi(String perawat_gigi) {
        this.perawat_gigi = perawat_gigi;
    }

    public String getPerawat_anestesi() {
        return perawat_anestesi;
    }

    public void setPerawat_anestesi(String perawat_anestesi) {
        this.perawat_anestesi = perawat_anestesi;
    }

    public String getPerawat_anak() {
        return perawat_anak;
    }

    public void setPerawat_anak(String perawat_anak) {
        this.perawat_anak = perawat_anak;
    }

    public String getPerawat_lainnya() {
        return perawat_lainnya;
    }

    public void setPerawat_lainnya(String perawat_lainnya) {
        this.perawat_lainnya = perawat_lainnya;
    }

    public String getBidan_pendidik() {
        return bidan_pendidik;
    }

    public void setBidan_pendidik(String bidan_pendidik) {
        this.bidan_pendidik = bidan_pendidik;
    }

    public String getBidan_klinik() {
        return bidan_klinik;
    }

    public void setBidan_klinik(String bidan_klinik) {
        this.bidan_klinik = bidan_klinik;
    }

    public String getApoteker() {
        return apoteker;
    }

    public void setApoteker(String apoteker) {
        this.apoteker = apoteker;
    }

    public String getAnalis_farmasi() {
        return analis_farmasi;
    }

    public void setAnalis_farmasi(String analis_farmasi) {
        this.analis_farmasi = analis_farmasi;
    }

    public String getRadiografer() {
        return radiografer;
    }

    public void setRadiografer(String radiografer) {
        this.radiografer = radiografer;
    }

    public String getRadioterapis() {
        return radioterapis;
    }

    public void setRadioterapis(String radioterapis) {
        this.radioterapis = radioterapis;
    }

    public String getElektromedis() {
        return elektromedis;
    }

    public void setElektromedis(String elektromedis) {
        this.elektromedis = elektromedis;
    }

    public String getTeknisi_gigi() {
        return teknisi_gigi;
    }

    public void setTeknisi_gigi(String teknisi_gigi) {
        this.teknisi_gigi = teknisi_gigi;
    }

    public String getAnalis_kesehatan() {
        return analis_kesehatan;
    }

    public void setAnalis_kesehatan(String analis_kesehatan) {
        this.analis_kesehatan = analis_kesehatan;
    }

    public String getRefaksionis() {
        return refaksionis;
    }

    public void setRefaksionis(String refaksionis) {
        this.refaksionis = refaksionis;
    }

    public String getRekam_medik() {
        return rekam_medik;
    }

    public void setRekam_medik(String rekam_medik) {
        this.rekam_medik = rekam_medik;
    }

    public String getOrtotik() {
        return ortotik;
    }

    public void setOrtotik(String ortotik) {
        this.ortotik = ortotik;
    }

    public String getTeknisi_transfusi_darah() {
        return teknisi_transfusi_darah;
    }

    public void setTeknisi_transfusi_darah(String teknisi_transfusi_darah) {
        this.teknisi_transfusi_darah = teknisi_transfusi_darah;
    }

    public String getTeknisi_kardiovaskular() {
        return teknisi_kardiovaskular;
    }

    public void setTeknisi_kardiovaskular(String teknisi_kardiovaskular) {
        this.teknisi_kardiovaskular = teknisi_kardiovaskular;
    }

    public String getEpidemiologi() {
        return epidemiologi;
    }

    public void setEpidemiologi(String epidemiologi) {
        this.epidemiologi = epidemiologi;
    }

    public String getPromosi_kesehatan() {
        return promosi_kesehatan;
    }

    public void setPromosi_kesehatan(String promosi_kesehatan) {
        this.promosi_kesehatan = promosi_kesehatan;
    }

    public String getPerilaku() {
        return perilaku;
    }

    public void setPerilaku(String perilaku) {
        this.perilaku = perilaku;
    }

    public String getKesja() {
        return kesja;
    }

    public void setKesja(String kesja) {
        this.kesja = kesja;
    }

    public String getAdministrasi_kesehatan() {
        return administrasi_kesehatan;
    }

    public void setAdministrasi_kesehatan(String administrasi_kesehatan) {
        this.administrasi_kesehatan = administrasi_kesehatan;
    }

    public String getBiostatistik() {
        return biostatistik;
    }

    public void setBiostatistik(String biostatistik) {
        this.biostatistik = biostatistik;
    }

    public String getReproduksi() {
        return reproduksi;
    }

    public void setReproduksi(String reproduksi) {
        this.reproduksi = reproduksi;
    }

    public String getInformasi_kesehatan() {
        return informasi_kesehatan;
    }

    public void setInformasi_kesehatan(String informasi_kesehatan) {
        this.informasi_kesehatan = informasi_kesehatan;
    }

    public String getKesmas_lainnya() {
        return kesmas_lainnya;
    }

    public void setKesmas_lainnya(String kesmas_lainnya) {
        this.kesmas_lainnya = kesmas_lainnya;
    }

    public String getSanitasi() {
        return sanitasi;
    }

    public void setSanitasi(String sanitasi) {
        this.sanitasi = sanitasi;
    }

    public String getEntomologi() {
        return entomologi;
    }

    public void setEntomologi(String entomologi) {
        this.entomologi = entomologi;
    }

    public String getMikrobiologi() {
        return mikrobiologi;
    }

    public void setMikrobiologi(String mikrobiologi) {
        this.mikrobiologi = mikrobiologi;
    }

    public String getKesehatan_lingkungan() {
        return kesehatan_lingkungan;
    }

    public void setKesehatan_lingkungan(String kesehatan_lingkungan) {
        this.kesehatan_lingkungan = kesehatan_lingkungan;
    }

    public String getTerapi_wicara() {
        return terapi_wicara;
    }

    public void setTerapi_wicara(String terapi_wicara) {
        this.terapi_wicara = terapi_wicara;
    }

    public String getNutrisionis() {
        return nutrisionis;
    }

    public void setNutrisionis(String nutrisionis) {
        this.nutrisionis = nutrisionis;
    }

    public String getDietsien() {
        return dietsien;
    }

    public void setDietsien(String dietsien) {
        this.dietsien = dietsien;
    }

    public String getFisioterapi() {
        return fisioterapi;
    }

    public void setFisioterapi(String fisioterapi) {
        this.fisioterapi = fisioterapi;
    }

    public String getTerapi_okupasi() {
        return terapi_okupasi;
    }

    public void setTerapi_okupasi(String terapi_okupasi) {
        this.terapi_okupasi = terapi_okupasi;
    }

    public String getAkupunturis() {
        return akupunturis;
    }

    public void setAkupunturis(String akupunturis) {
        this.akupunturis = akupunturis;
    }

    public String getProgram_kesehatan() {
        return program_kesehatan;
    }

    public void setProgram_kesehatan(String program_kesehatan) {
        this.program_kesehatan = program_kesehatan;
    }

    public String getAdministrasi_keuangan() {
        return administrasi_keuangan;
    }

    public void setAdministrasi_keuangan(String administrasi_keuangan) {
        this.administrasi_keuangan = administrasi_keuangan;
    }

    public String getHumas() {
        return humas;
    }

    public void setHumas(String humas) {
        this.humas = humas;
    }

    public String getPerencanaan() {
        return perencanaan;
    }

    public void setPerencanaan(String perencanaan) {
        this.perencanaan = perencanaan;
    }

    public String getJaminan_kesehatan() {
        return jaminan_kesehatan;
    }

    public void setJaminan_kesehatan(String jaminan_kesehatan) {
        this.jaminan_kesehatan = jaminan_kesehatan;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getPsikologi() {
        return psikologi;
    }

    public void setPsikologi(String psikologi) {
        this.psikologi = psikologi;
    }

    public String getPelaporan() {
        return pelaporan;
    }

    public void setPelaporan(String pelaporan) {
        this.pelaporan = pelaporan;
    }

    public String getInformasi_teknologi() {
        return informasi_teknologi;
    }

    public void setInformasi_teknologi(String informasi_teknologi) {
        this.informasi_teknologi = informasi_teknologi;
    }

    public String getHukum() {
        return hukum;
    }

    public void setHukum(String hukum) {
        this.hukum = hukum;
    }

    public String getPekarya() {
        return pekarya;
    }

    public void setPekarya(String pekarya) {
        this.pekarya = pekarya;
    }

    public String getPerpustakaan() {
        return perpustakaan;
    }

    public void setPerpustakaan(String perpustakaan) {
        this.perpustakaan = perpustakaan;
    }

    public String getWidyaiswara() {
        return widyaiswara;
    }

    public void setWidyaiswara(String widyaiswara) {
        this.widyaiswara = widyaiswara;
    }

    public String getTenaga_non_kes() {
        return tenaga_non_kes;
    }

    public void setTenaga_non_kes(String tenaga_non_kes) {
        this.tenaga_non_kes = tenaga_non_kes;
    }

    public String getMeja_operasi() {
        return meja_operasi;
    }

    public void setMeja_operasi(String meja_operasi) {
        this.meja_operasi = meja_operasi;
    }

    public String getMesin_anestesi() {
        return mesin_anestesi;
    }

    public void setMesin_anestesi(String mesin_anestesi) {
        this.mesin_anestesi = mesin_anestesi;
    }

    public String getVentilator() {
        return ventilator;
    }

    public void setVentilator(String ventilator) {
        this.ventilator = ventilator;
    }

    public String getInkubator() {
        return inkubator;
    }

    public void setInkubator(String inkubator) {
        this.inkubator = inkubator;
    }

    public String getBlue_light() {
        return blue_light;
    }

    public void setBlue_light(String blue_light) {
        this.blue_light = blue_light;
    }

    public String getUsg() {
        return usg;
    }

    public void setUsg(String usg) {
        this.usg = usg;
    }

    public String getX_ray() {
        return x_ray;
    }

    public void setX_ray(String x_ray) {
        this.x_ray = x_ray;
    }

    public String getCt_scan() {
        return ct_scan;
    }

    public void setCt_scan(String ct_scan) {
        this.ct_scan = ct_scan;
    }

    public String getMri() {
        return mri;
    }

    public void setMri(String mri) {
        this.mri = mri;
    }

    public String getEeg() {
        return eeg;
    }

    public void setEeg(String eeg) {
        this.eeg = eeg;
    }

    public String getEkg() {
        return ekg;
    }

    public void setEkg(String ekg) {
        this.ekg = ekg;
    }

    public String getDefibrilator() {
        return defibrilator;
    }

    public void setDefibrilator(String defibrilator) {
        this.defibrilator = defibrilator;
    }

    public String getAutoclav() {
        return autoclav;
    }

    public void setAutoclav(String autoclav) {
        this.autoclav = autoclav;
    }

    public String getRawat_jalan() {
        return rawat_jalan;
    }

    public void setRawat_jalan(String rawat_jalan) {
        this.rawat_jalan = rawat_jalan;
    }

    public String getRawat_inap() {
        return rawat_inap;
    }

    public void setRawat_inap(String rawat_inap) {
        this.rawat_inap = rawat_inap;
    }

    public String getIgd() {
        return igd;
    }

    public void setIgd(String igd) {
        this.igd = igd;
    }

    public String getBor() {
        return bor;
    }

    public void setBor(String bor) {
        this.bor = bor;
    }

    public String getAlos() {
        return alos;
    }

    public void setAlos(String alos) {
        this.alos = alos;
    }

    public String getToi() {
        return toi;
    }

    public void setToi(String toi) {
        this.toi = toi;
    }

    public String getNdr() {
        return ndr;
    }

    public void setNdr(String ndr) {
        this.ndr = ndr;
    }

    public String getGdr() {
        return gdr;
    }

    public void setGdr(String gdr) {
        this.gdr = gdr;
    }

    public String getLayanan_unggulan() {
        return layanan_unggulan;
    }

    public void setLayanan_unggulan(String layanan_unggulan) {
        this.layanan_unggulan = layanan_unggulan;
    }

    public String getSimrs() {
        return simrs;
    }

    public void setSimrs(String simrs) {
        this.simrs = simrs;
    }

    public String getAmbulan() {
        return ambulan;
    }

    public void setAmbulan(String ambulan) {
        this.ambulan = ambulan;
    }

    public String getBank_darah() {
        return bank_darah;
    }

    public void setBank_darah(String bank_darah) {
        this.bank_darah = bank_darah;
    }

    public String getTgl_registrasi() {
        return tgl_registrasi;
    }

    public void setTgl_registrasi(String tgl_registrasi) {
        this.tgl_registrasi = tgl_registrasi;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getDirektur() {
        return direktur;
    }

    public void setDirektur(String direktur) {
        this.direktur = direktur;
    }

    public String getLatar_belakang() {
        return latar_belakang;
    }

    public void setLatar_belakang(String latar_belakang) {
        this.latar_belakang = latar_belakang;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKab_kota() {
        return kab_kota;
    }

    public void setKab_kota(String kab_kota) {
        this.kab_kota = kab_kota;
    }

    public String getKode_pos() {
        return kode_pos;
    }

    public void setKode_pos(String kode_pos) {
        this.kode_pos = kode_pos;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTelepon_humas() {
        return telepon_humas;
    }

    public void setTelepon_humas(String telepon_humas) {
        this.telepon_humas = telepon_humas;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLuas_tanah() {
        return luas_tanah;
    }

    public void setLuas_tanah(String luas_tanah) {
        this.luas_tanah = luas_tanah;
    }

    public String getLuas_bangunan() {
        return luas_bangunan;
    }

    public void setLuas_bangunan(String luas_bangunan) {
        this.luas_bangunan = luas_bangunan;
    }

    public String getTanggal_surat_ijin() {
        return tanggal_surat_ijin;
    }

    public void setTanggal_surat_ijin(String tanggal_surat_ijin) {
        this.tanggal_surat_ijin = tanggal_surat_ijin;
    }

    public String getBerlaku_sampai() {
        return berlaku_sampai;
    }

    public void setBerlaku_sampai(String berlaku_sampai) {
        this.berlaku_sampai = berlaku_sampai;
    }

    public String getVvip() {
        return vvip;
    }

    public void setVvip(String vvip) {
        this.vvip = vvip;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getKelas_1() {
        return kelas_1;
    }

    public void setKelas_1(String kelas_1) {
        this.kelas_1 = kelas_1;
    }

    public String getKelas_2() {
        return kelas_2;
    }

    public void setKelas_2(String kelas_2) {
        this.kelas_2 = kelas_2;
    }

    public String getKelas_3() {
        return kelas_3;
    }

    public void setKelas_3(String kelas_3) {
        this.kelas_3 = kelas_3;
    }

    public String getIcu() {
        return icu;
    }

    public void setIcu(String icu) {
        this.icu = icu;
    }

    public String getPicu() {
        return picu;
    }

    public void setPicu(String picu) {
        this.picu = picu;
    }

    public String getNicu() {
        return nicu;
    }

    public void setNicu(String nicu) {
        this.nicu = nicu;
    }

    public String getTt_bayi() {
        return tt_bayi;
    }

    public void setTt_bayi(String tt_bayi) {
        this.tt_bayi = tt_bayi;
    }

    public String getHcu() {
        return hcu;
    }

    public void setHcu(String hcu) {
        this.hcu = hcu;
    }

    public String getIccu() {
        return iccu;
    }

    public void setIccu(String iccu) {
        this.iccu = iccu;
    }

    public String getTt_operasi() {
        return tt_operasi;
    }

    public void setTt_operasi(String tt_operasi) {
        this.tt_operasi = tt_operasi;
    }

    public String getTt_isolasi() {
        return tt_isolasi;
    }

    public void setTt_isolasi(String tt_isolasi) {
        this.tt_isolasi = tt_isolasi;
    }

    public String getDr_og() {
        return dr_og;
    }

    public void setDr_og(String dr_og) {
        this.dr_og = dr_og;
    }

    public String getDr_pd() {
        return dr_pd;
    }

    public void setDr_pd(String dr_pd) {
        this.dr_pd = dr_pd;
    }

    public String getDr_b() {
        return dr_b;
    }

    public void setDr_b(String dr_b) {
        this.dr_b = dr_b;
    }

    public String getDr_rad() {
        return dr_rad;
    }

    public void setDr_rad(String dr_rad) {
        this.dr_rad = dr_rad;
    }

    public String getDr_rm() {
        return dr_rm;
    }

    public void setDr_rm(String dr_rm) {
        this.dr_rm = dr_rm;
    }

    public String getDr_an() {
        return dr_an;
    }

    public void setDr_an(String dr_an) {
        this.dr_an = dr_an;
    }

    public String getDr_jp() {
        return dr_jp;
    }

    public void setDr_jp(String dr_jp) {
        this.dr_jp = dr_jp;
    }

    public String getDr_m() {
        return dr_m;
    }

    public void setDr_m(String dr_m) {
        this.dr_m = dr_m;
    }

    public String getDr_tht() {
        return dr_tht;
    }

    public void setDr_tht(String dr_tht) {
        this.dr_tht = dr_tht;
    }

    public String getDr_pk() {
        return dr_pk;
    }

    public void setDr_pk(String dr_pk) {
        this.dr_pk = dr_pk;
    }

    public String getDr_paru_paru() {
        return dr_paru_paru;
    }

    public void setDr_paru_paru(String dr_paru_paru) {
        this.dr_paru_paru = dr_paru_paru;
    }

    public String getDr_bedah_thoraks() {
        return dr_bedah_thoraks;
    }

    public void setDr_bedah_thoraks(String dr_bedah_thoraks) {
        this.dr_bedah_thoraks = dr_bedah_thoraks;
    }

    public String getDr_bedah_anak() {
        return dr_bedah_anak;
    }

    public void setDr_bedah_anak(String dr_bedah_anak) {
        this.dr_bedah_anak = dr_bedah_anak;
    }

    public String getDr_bedah_orthopedi() {
        return dr_bedah_orthopedi;
    }

    public void setDr_bedah_orthopedi(String dr_bedah_orthopedi) {
        this.dr_bedah_orthopedi = dr_bedah_orthopedi;
    }

    public String getDr_a() {
        return dr_a;
    }

    public void setDr_a(String dr_a) {
        this.dr_a = dr_a;
    }

    public String getDr_okupasi() {
        return dr_okupasi;
    }

    public void setDr_okupasi(String dr_okupasi) {
        this.dr_okupasi = dr_okupasi;
    }

    public String getDr_urologi() {
        return dr_urologi;
    }

    public void setDr_urologi(String dr_urologi) {
        this.dr_urologi = dr_urologi;
    }

    public String getDr_kulit() {
        return dr_kulit;
    }

    public void setDr_kulit(String dr_kulit) {
        this.dr_kulit = dr_kulit;
    }

    public String getDr_forensik() {
        return dr_forensik;
    }

    public void setDr_forensik(String dr_forensik) {
        this.dr_forensik = dr_forensik;
    }

    public String getDr_psikiatri() {
        return dr_psikiatri;
    }

    public void setDr_psikiatri(String dr_psikiatri) {
        this.dr_psikiatri = dr_psikiatri;
    }

    public String getDr_ofthalmologi() {
        return dr_ofthalmologi;
    }

    public void setDr_ofthalmologi(String dr_ofthalmologi) {
        this.dr_ofthalmologi = dr_ofthalmologi;
    }

    public String getDr_anatomi() {
        return dr_anatomi;
    }

    public void setDr_anatomi(String dr_anatomi) {
        this.dr_anatomi = dr_anatomi;
    }

    public String getDr_jiwa() {
        return dr_jiwa;
    }

    public void setDr_jiwa(String dr_jiwa) {
        this.dr_jiwa = dr_jiwa;
    }

    public String getDr_saraf() {
        return dr_saraf;
    }

    public void setDr_saraf(String dr_saraf) {
        this.dr_saraf = dr_saraf;
    }

    public String getDr_lainnya() {
        return dr_lainnya;
    }

    public void setDr_lainnya(String dr_lainnya) {
        this.dr_lainnya = dr_lainnya;
    }

    public String getDr_bedah_saraf() {
        return dr_bedah_saraf;
    }

    public void setDr_bedah_saraf(String dr_bedah_saraf) {
        this.dr_bedah_saraf = dr_bedah_saraf;
    }

    public String getDr_bedah_plastik() {
        return dr_bedah_plastik;
    }

    public void setDr_bedah_plastik(String dr_bedah_plastik) {
        this.dr_bedah_plastik = dr_bedah_plastik;
    }

    public String getDr_bedah_mulut() {
        return dr_bedah_mulut;
    }

    public void setDr_bedah_mulut(String dr_bedah_mulut) {
        this.dr_bedah_mulut = dr_bedah_mulut;
    }

    public String getDr_konservasi() {
        return dr_konservasi;
    }

    public void setDr_konservasi(String dr_konservasi) {
        this.dr_konservasi = dr_konservasi;
    }

    public String getDr_penyakit_mulut() {
        return dr_penyakit_mulut;
    }

    public void setDr_penyakit_mulut(String dr_penyakit_mulut) {
        this.dr_penyakit_mulut = dr_penyakit_mulut;
    }

    public String getDr_radiologi() {
        return dr_radiologi;
    }

    public void setDr_radiologi(String dr_radiologi) {
        this.dr_radiologi = dr_radiologi;
    }

    public String getDr_karang_gigi() {
        return dr_karang_gigi;
    }

    public void setDr_karang_gigi(String dr_karang_gigi) {
        this.dr_karang_gigi = dr_karang_gigi;
    }

    public String getDr_gigi_anak() {
        return dr_gigi_anak;
    }

    public void setDr_gigi_anak(String dr_gigi_anak) {
        this.dr_gigi_anak = dr_gigi_anak;
    }

    public String getDr_gigi_tiruan() {
        return dr_gigi_tiruan;
    }

    public void setDr_gigi_tiruan(String dr_gigi_tiruan) {
        this.dr_gigi_tiruan = dr_gigi_tiruan;
    }

    public String getDr_periodonsia() {
        return dr_periodonsia;
    }

    public void setDr_periodonsia(String dr_periodonsia) {
        this.dr_periodonsia = dr_periodonsia;
    }

    public String getDr_gigi_lainnya() {
        return dr_gigi_lainnya;
    }

    public void setDr_gigi_lainnya(String dr_gigi_lainnya) {
        this.dr_gigi_lainnya = dr_gigi_lainnya;
    }

    public String getBidan_pendidikan() {
        return bidan_pendidikan;
    }

    public void setBidan_pendidikan(String bidan_pendidikan) {
        this.bidan_pendidikan = bidan_pendidikan;
    }

    public String getRadiografi() {
        return radiografi;
    }

    public void setRadiografi(String radiografi) {
        this.radiografi = radiografi;
    }

    public String getRefraksionis() {
        return refraksionis;
    }

    public void setRefraksionis(String refraksionis) {
        this.refraksionis = refraksionis;
    }

    public String getRekam_medis() {
        return rekam_medis;
    }

    public void setRekam_medis(String rekam_medis) {
        this.rekam_medis = rekam_medis;
    }

    public String getTransfusi_darah() {
        return transfusi_darah;
    }

    public void setTransfusi_darah(String transfusi_darah) {
        this.transfusi_darah = transfusi_darah;
    }

    public String getKardiovaskular() {
        return kardiovaskular;
    }

    public void setKardiovaskular(String kardiovaskular) {
        this.kardiovaskular = kardiovaskular;
    }

    public String getEpidemiology() {
        return epidemiology;
    }

    public void setEpidemiology(String epidemiology) {
        this.epidemiology = epidemiology;
    }

    public String getPrilaku() {
        return prilaku;
    }

    public void setPrilaku(String prilaku) {
        this.prilaku = prilaku;
    }

    public String getBiostatik() {
        return biostatik;
    }

    public void setBiostatik(String biostatik) {
        this.biostatik = biostatik;
    }

    public String getDietisien() {
        return dietisien;
    }

    public void setDietisien(String dietisien) {
        this.dietisien = dietisien;
    }

    public String getAdmin_kesehatan() {
        return admin_kesehatan;
    }

    public void setAdmin_kesehatan(String admin_kesehatan) {
        this.admin_kesehatan = admin_kesehatan;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getId_berita() {
        return id_berita;
    }

    public void setId_berita(String id_berita) {
        this.id_berita = id_berita;
    }

    public String getJudul_berita() {
        return judul_berita;
    }

    public void setJudul_berita(String judul_berita) {
        this.judul_berita = judul_berita;
    }

    public String getIsi_berita() {
        return isi_berita;
    }

    public void setIsi_berita(String isi_berita) {
        this.isi_berita = isi_berita;
    }

    public String getKategori_berita() {
        return kategori_berita;
    }

    public void setKategori_berita(String kategori_berita) {
        this.kategori_berita = kategori_berita;
    }

    public String getCover_berita() {
        return cover_berita;
    }

    public void setCover_berita(String cover_berita) {
        this.cover_berita = cover_berita;
    }

    public String getTgl_upload() {
        return tgl_upload;
    }

    public void setTgl_upload(String tgl_upload) {
        this.tgl_upload = tgl_upload;
    }

    public String getStatus_berita() {
        return status_berita;
    }

    public void setStatus_berita(String status_berita) {
        this.status_berita = status_berita;
    }
}
