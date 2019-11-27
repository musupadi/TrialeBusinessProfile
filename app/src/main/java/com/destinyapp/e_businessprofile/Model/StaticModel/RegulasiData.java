package com.destinyapp.e_businessprofile.Model.StaticModel;

import java.util.ArrayList;

public class RegulasiData {
    public static String[][] data = new String[][]{
            {"KMK No 1981 Tahun 2010 Tentang Pedoman Akutansi BLU RS",
                    "kmk_no_1981_tahun_2010_tentang_pedoman_akutansi.pdf"
            },
            {"PMK No. 4 Tahun 2018 Tentang Pedoman Akutansi BLU RS",
                    "pmk_no4_tahun_2018_tentang _kewajiban_rumah_sakit_dan_kewajiban_pasien.pdf"
            },
            {"PMK No .24 Tahun 2016 Tentang Persyaratan Teknis Bangunan dan Prasarana Rumah Sakit",
                    "pmk_no24_tahun_2016_tentang_persyaratan_teknis_bangunan_dan_prasarana_rumah_sakit.pdf"
            },
            {"PMK No. 34 Tahun 2017 Tentang Akreditasi Rumah Sakit",
                    "PMK No. 34 Tahun 2017 tentang Akreditasi Rumah Sakit.pdf"
            },
            {"PMK No .56 Tahun 2014 Tentang Klasifikasi dan Perizinan Rumah Sakit",
                    "pmk_no56_tahun_2014_tentang_klasifikasi_dan_perizinan_rumah_sakit.pdf"
            },
            {"PMK No. 659 Tahun 2009 Tentang Rumah Sakit Indonesia Kelas Dunia",
                    "pmk_no659_tahun_2009_tentang_rumah_sakit_indonesia_kelas_dunia.pdf"
            },
            {"PP No. 93 Tahun 2015 Tentang Rumah Sakit Pendidikan",
                    "pp_no93_tahun_2015_tentang_rumah_sakit_pendidikan.pdf"
            },
            {"UU No. 44 Th 2009 Tentang Rumah Sakit",
                    "uu_no44_th_2009_tentang_rumah_sakit.pdf"
            }
    };
    public static ArrayList<EbookModel> getListData(){
        EbookModel model = null;
        ArrayList<EbookModel> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new EbookModel();
            model.setJudul(aData[0]);
            model.setPdf(aData[1]);
            list.add(model);
        }

        return list;
    }
}
