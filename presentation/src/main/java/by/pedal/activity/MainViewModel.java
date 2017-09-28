package by.pedal.activity;

import android.databinding.ObservableField;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;

import by.domain.entity.ProfileDomain;
import by.domain.interaction.GetProfilesListUseCase;
import by.pedal.base.BaseViewModel;
import io.reactivex.observers.DisposableObserver;

/**
 * Created by Home911 on 28.09.2017.
 */

public class MainViewModel implements BaseViewModel {

    public enum STATE {PROGRESS, DATA}
    public ObservableField<STATE> state = new ObservableField<>(STATE.PROGRESS);

    private GetProfilesListUseCase getProfileListUseCase;
    public ProfileAdapter adapter = new ProfileAdapter();

    @Inject
    public Dz11ViewModel(GetProfilesListUseCase getProfileListUseCase) {
        this.getProfileListUseCase = getProfileListUseCase;
    }

    @Override
    public void init() {
    }

    @Override
    public void resume() {

        getProfileListUseCase.execute
                (null, new DisposableObserver<List<ProfileDomain>>(){

                    @Override
                    public void onNext(List<ProfileDomain> profileModels) {
                        adapter.setItems(profileModels);
                        state.set(STATE.DATA);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("onError = ", e.toString());
                    }

                    @Override
                    public void onComplete() {
                        Log.e("onComplete", "onComplete");
                    }
                });
    }

    @Override
    public void pause() {
        getProfileListUseCase.dispose();
    }

    @Override
    public void release() {
    }
}
