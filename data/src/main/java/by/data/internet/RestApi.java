package by.data.internet;

import java.util.List;

import by.data.entity.ProfileData;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Home911 on 21.09.2017.
 */

public interface RestApi {
    @GET("/api/v1/adverts/part/filter")
    Observable<List<ProfileData>> getFilterAPIProfiles();

}
