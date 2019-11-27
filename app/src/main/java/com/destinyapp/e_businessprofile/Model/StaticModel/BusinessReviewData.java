package com.destinyapp.e_businessprofile.Model.StaticModel;

import java.util.ArrayList;

public class BusinessReviewData {
    public static String[][] data = new String[][]{
            {"Business Review Quartal 1",
                    "010320",
                    "https://fabamandiri.000webhostapp.com/API/Materi%20Highligt%20e-Book.pdf"
            }
    };
    public static ArrayList<BusinessReviewModel> getListData(){
        BusinessReviewModel model = null;
        ArrayList<BusinessReviewModel> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new BusinessReviewModel();
            model.setBusinessreview(aData[0]);
            model.setVersion(aData[1]);
            model.setDownload(aData[2]);
            list.add(model);
        }

        return list;
    }
}
