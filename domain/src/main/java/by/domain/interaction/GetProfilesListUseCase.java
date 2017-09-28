package by.domain.interaction;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import by.data.entity.ProfileData;
import by.data.repository.UsersRepository;
import by.domain.entity.ProfileDomain;
import by.domain.entity.ProfileId;
import by.domain.interaction.base.UseCase;
import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;

/**
 * Created by Home911 on 28.09.2017.
 */

public class GetProfilesListUseCase extends UseCase<Void, List<ProfileDomain>> {

    private UsersRepository repository;

    @Inject
    public GetProfilesListUseCase(UsersRepository repository) {
        this.repository = repository;
    }

    @Override
    protected Observable<List<ProfileDomain>> buildUseCase(Void aVoid) {
        return repository.getProfiles()
                .map(new Function<List<ProfileData>, List<ProfileDomain>>() {
                    @Override
                    public List<ProfileDomain> apply(@NonNull List<ProfileData> profiles) throws Exception {
                        List<ProfileDomain> list = new ArrayList<>();
                        for(ProfileData profile: profiles) {
                            list.add(convert(profile));
                        }
                        return list;
                    }
                });
    }

    private ProfileDomain convert(ProfileData dataModel) {
        ProfileDomain profileDomain = new ProfileDomain();
        profileDomain.setName(dataModel.getId());
        profileDomain.setProfileId(new ProfileId(dataModel.getId()));
        return profileDomain;
    }

}