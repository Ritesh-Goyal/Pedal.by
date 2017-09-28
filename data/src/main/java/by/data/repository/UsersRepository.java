package by.data.repository;

import java.util.List;

import by.data.entity.ProfileData;
import io.reactivex.Observable;

/**
 * Created by Home911 on 28.09.2017.
 */

public interface UsersRepository {

    Observable<List<ProfileData>> getProfiles();
}
