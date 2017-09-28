package by.data.repository.datasourse;

import java.util.List;

import by.data.entity.ProfileData;
import io.reactivex.Observable;

/**
 * Created by Home911 on 28.09.2017.
 */

public class DiskUsersDataStore implements UsersDataStore {

    private final Cache cache;

    DiskUsersDataStore(Cache cache) {
        this.cache = cache;
    }

    @Override
    public Observable<List<ProfileData>> userEntityList() {
        List<ProfileData> list = cache.get();
        return Observable.just(list);
    }

}
