package by.pedal;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import by.pedal.di.AppComponent;
import by.pedal.di.AppModule;
import by.pedal.di.DaggerAppComponent;
import io.fabric.sdk.android.Fabric;
import io.realm.Realm;

/**
 * Created by Home911 on 27.09.2017.
 */

public class PedalApplication extends Application {

    private AppComponent appComponent;

    public AppComponent getAppComponent(){
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
        Realm.init(this);
        initializeInjector();

    }

    private void initializeInjector(){
        this.appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}
