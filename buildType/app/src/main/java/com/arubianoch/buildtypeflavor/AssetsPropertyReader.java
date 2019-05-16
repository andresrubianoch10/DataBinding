package com.arubianoch.buildtypeflavor;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Andres Rubiano Del Chiaro
 */
public class AssetsPropertyReader {

    private Context context;
    private Properties properties;

    public AssetsPropertyReader(Application application) {
        this.context = application.getApplicationContext();
        properties = new Properties();
    }

    public Properties getProperties(String fileName) {
        try {
            /**
             * getAssets() return an Assets Manager instance for your application's package. Assets Manager
             * provides access to an application's raw assets files;
             */
            AssetManager assetManager = context.getAssets();
            InputStream inputStream = assetManager.open(fileName);
            properties.load(inputStream);
        } catch (IOException e) {

        }
        return properties;
    }
}
