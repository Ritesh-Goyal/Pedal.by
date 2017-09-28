package by.pedal.di;

import javax.inject.Singleton;

import by.pedal.activity.MainActivity;
import by.pedal.details.ProfileActivity;
import dagger.Component;

/**
 * Created by Home911 on 27.09.2017.
 */


@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    public void inject(MainActivity mainActivity);
    public void inject(ProfileActivity profileActivity);
}
