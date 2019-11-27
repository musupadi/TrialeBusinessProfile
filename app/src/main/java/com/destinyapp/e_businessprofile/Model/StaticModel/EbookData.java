package com.destinyapp.e_businessprofile.Model.StaticModel;

import java.util.ArrayList;

public class EbookData {
    public static String[][] data = new String[][]{
            {"Profile Bisnis Sektor Rumah Sakit",
                    "e_bisnis_profile_rs_1.pdf"
            },
            {"Overview Bisnis",
                    "e_bisnis_profile_rs_2.pdf"
            },
            {"Kebijakan Dan Peraturan",
                    "e_bisnis_profile_rs_3.pdf"
            },
            {"Karakteristik Bisnis",
                    "e_bisnis_profile_rs_4.pdf"
            },
            {"Pasar &amp; Pemasaran",
                    "e_bisnis_profile_rs_5.pdf"
            },
            {"Titik Resiko Usaha",
                    "e_bisnis_profile_rs_6.pdf"
            },
            {"Analisis Pembiayaan",
                    "e_bisnis_profile_rs_7.pdf"
            },
            {"Peluang Pembiayaan Industri Bisnis Rumah Sakit",
                    "e_bisnis_profile_rs_8.pdf"
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
