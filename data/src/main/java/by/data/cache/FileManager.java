package by.data.cache;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import by.data.entity.ProfileData;

/**
 * Created by Home911 on 28.09.2017.
 */

@Singleton
public class FileManager {

    @Inject
    FileManager() {}

    private Realm realm;

    void saveUsers(final List<ProfileData> dataList) {
        realm = Realm.getDefaultInstance();
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
//                deleteAll();
//                RealmList<ProfileData> realmList = new RealmList<>();
//                realmList.addAll(dataList);
                realm.copyToRealmOrUpdate(dataList);
                Log.e("PATH", "path: " + realm.getPath());
                Log.e("saveUsers", "saveUsers");
            }
        });
        realm.close();
    }

    List<ProfileData> getUsers() {
        realm = Realm.getDefaultInstance();
        RealmResults<ProfileData> results = realm.where(ProfileData.class).findAll();
        List<ProfileData> list = realm.copyFromRealm(results);
        realm.close();
        Log.e("getUsers", "getUsers");
        Log.e("User", list.get(1).getName());
        return list;
    }

    void deleteAll() {
        realm = Realm.getDefaultInstance();
        RealmResults<ProfileData> results = realm.where(ProfileData.class).findAll();
        realm.beginTransaction();
        results.deleteAllFromRealm();
        realm.commitTransaction();
        realm.close();
    }

    void writeToPreferences(Context context, String preferenceFileName, String key, long value) {

        final SharedPreferences sharedPreferences = context.getSharedPreferences(preferenceFileName,
                Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    long getFromPreferences(Context context, String preferenceFileName, String key) {

        final SharedPreferences sharedPreferences = context.getSharedPreferences(preferenceFileName,
                Context.MODE_PRIVATE);
        return sharedPreferences.getLong(key, 0);
    }


}

