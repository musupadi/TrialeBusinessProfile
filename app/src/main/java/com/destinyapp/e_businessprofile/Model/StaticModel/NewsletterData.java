package com.destinyapp.e_businessprofile.Model.StaticModel;

import java.util.ArrayList;

public class NewsletterData {
    public static String[][] data = new String[][]{
            {"Newsletter Januari",
                    "01020",
                    "https://fabamandiri.000webhostapp.com/API/Materi%20Highligt%20e-Book.pdf"
            }
    };
    public static ArrayList<NewsletterModel> getListData(){
        NewsletterModel model = null;
        ArrayList<NewsletterModel> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new NewsletterModel();
            model.setNewsletter(aData[0]);
            model.setVersion(aData[1]);
            model.setDownload(aData[2]);
            list.add(model);
        }

        return list;
    }
}
