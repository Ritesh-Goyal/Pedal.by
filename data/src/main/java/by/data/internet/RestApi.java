package by.data.internet;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import by.data.entity.ProfileData;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by Home911 on 21.09.2017.
 */

public interface RestApi {
    @GET("data/profile")
    Observable<List<ProfileData>> getProfiles();

    @GET("data/profile/{id}")
    Observable<ProfileData> getProfile(@Path("id") String id);

    @POST("data/profile")
    Observable<Void> saveProfile(@Body ProfileData profile);

    @PUT("data/profile/{id}")
    Observable<ProfileData> overwriteProfile(@Body ProfileData profile, @Path("id") String id);
}
