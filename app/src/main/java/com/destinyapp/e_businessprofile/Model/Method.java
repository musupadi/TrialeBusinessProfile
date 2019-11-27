package com.destinyapp.e_businessprofile.Model;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;

import androidx.core.content.FileProvider;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Method {
    public void copyReadAssets(Context context, String assetName) {
        AssetManager assetManager = context.getAssets();

        InputStream in;
        OutputStream out;
        File directoryFile = new File(Environment.getExternalStorageDirectory().toString() + "/faba");

        if (!directoryFile.exists()) {
            directoryFile.mkdir();
        }

        File file = new File(directoryFile, assetName);
        try {
            in = assetManager.open(assetName);
            out = new FileOutputStream(file);
            copyFile(in, out);
            in.close();
            out.flush();
            out.close();
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri fileUri = FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".provider", file);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setDataAndType(
                fileUri,
                "application/pdf");

        PackageManager pm = context.getPackageManager();
        if (intent.resolveActivity(pm) != null) {
            context.startActivity(intent);
        } else {
            String appPackage = "com.google.android.apps.pdfviewer";
            try {
                String appPackName = "market://details?id="+appPackage;
                context.startActivity(
                        new Intent(Intent.ACTION_VIEW, Uri.parse(appPackName))
                );
            } catch (ActivityNotFoundException anfe) {
                String appPackName = "https://play.google.com/store/apps/details?id="+appPackage;
                context.startActivity(
                        new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse(appPackName)
                        )
                );
            }
        }
    }


    private void copyFile(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
    }
}
