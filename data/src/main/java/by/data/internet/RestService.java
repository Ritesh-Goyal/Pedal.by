package by.data.internet;

import java.util.List;

import javax.inject.Inject;

import by.data.entity.ProfileData;
import io.reactivex.Observable;

/**
 * Created by Home911 on 21.09.2017.
 */

public class RestService {

    private RestApi restApi;

    @Inject
    public RestService(RestApi restApi){
        this.restApi = restApi;
    }

    public Observable<List<ProfileData>> getProfiles() {
        return restApi.getFilterAPIProfiles();
    }

}

