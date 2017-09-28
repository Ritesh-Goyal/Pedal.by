package by.data.repository.datasourse;

import java.util.List;

import javax.inject.Inject;

import by.data.entity.ProfileData;
import by.data.internet.RestService;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * Created by Home911 on 28.09.2017.
 */

public class CloudUsersDataStore implements UsersDataStore {

    private final Cache cache;
    private final RestService restService;

    @Inject
    public CloudUsersDataStore(Cache cache, RestService restService) {
        this.cache = cache;
        this.restService = restService;
    }

    @Override
    public Observable<List<ProfileData>> userEntityList() {
        return restService.getProfiles()
                .doOnNext(new Consumer<List<ProfileData>>() {
                    @Override
                    public void accept(List<ProfileData> profileDatas) throws Exception {
                        cache.put(profileDatas);
                    }
                });
    }

}
