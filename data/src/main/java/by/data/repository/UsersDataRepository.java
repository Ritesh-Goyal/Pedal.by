package by.data.repository;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import by.data.entity.ProfileData;
import by.data.repository.datasourse.UsersDataStore;
import by.data.repository.datasourse.UsersDataStoreFactory;
import io.reactivex.Observable;

/**
 * Created by Home911 on 28.09.2017.
 */

@Singleton
public class UsersDataRepository implements UsersRepository {

    private final UsersDataStoreFactory factory;

    @Inject
    public UsersDataRepository(UsersDataStoreFactory factory) {
        this.factory = factory;
    }

//    @Inject
//    public UsersDataRepository(Context context) {
//        this.context = context;
//        factory= new UsersDataStoreFactory(new Cache(context));
//    }

    @Override
    public Observable<List<ProfileData>> getProfiles() {
        UsersDataStore usersDataStore = factory.create();
        return usersDataStore.userEntityList();
    }

}
