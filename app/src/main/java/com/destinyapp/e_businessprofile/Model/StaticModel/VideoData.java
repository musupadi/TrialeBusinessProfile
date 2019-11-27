package com.destinyapp.e_businessprofile.Model.StaticModel;

import java.util.ArrayList;

public class VideoData {
    public static String[][] data = new String[][]{
            {"Video 1",
                    "https://www.youtube.com/embed/04F4xlWSFh0",
                    "https://fabamandiri.000webhostapp.com/API/Materi%20Highligt%20e-Book.pdf"
            },
    };
    public static ArrayList<VideoModel> getListData(){
        VideoModel model = null;
        ArrayList<VideoModel> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new VideoModel();
            model.setTittle(aData[0]);
            model.setTumbnail(aData[1]);
            model.setVideo(aData[2]);
            list.add(model);
        }

        return list;
    }

}
