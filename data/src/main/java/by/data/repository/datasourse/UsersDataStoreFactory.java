package by.data.repository.datasourse;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Home911 on 28.09.2017.
 */

@Singleton
public class UsersDataStoreFactory {

    private Cache cache;
    private CloudUsersDataStore cloudUsersDataStore;

    @Inject
    public UsersDataStoreFactory(Cache cache, CloudUsersDataStore cloudUsersDataStore) {
        this.cache = cache;
        this.cloudUsersDataStore = cloudUsersDataStore;
    }

    public UsersDataStore create() {

        UsersDataStore usersDataStore;

        if (!cache.isThereInternetConnection() && !cache.isExpired()) {
            Log.e("create", "DiskUsersDataStore");
            usersDataStore = new DiskUsersDataStore(cache);
        } else {
            Log.e("create", "CloudUsersDataStore");
            usersDataStore = cloudUsersDataStore;
        }
        return usersDataStore;
    }

}

