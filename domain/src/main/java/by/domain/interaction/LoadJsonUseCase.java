package by.domain.interaction;

import android.app.Activity;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

import by.domain.entity.CountryDomain;
import by.domain.interaction.base.UseCaseJson;

/**
 * Created by Home911 on 28.09.2017.
 */

public class LoadJsonUseCase implements UseCaseJson<Activity, CountryDomain> {

    @Override
    public ArrayList<CountryDomain> execute(Activity activity) {
        String json;
        try {
            InputStream is = activity.getAssets().open("countries.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        CountryDomain[] countries = new Gson().fromJson(json, CountryDomain[].class);
        return new ArrayList<>(Arrays.asList(countries));
    }

}
