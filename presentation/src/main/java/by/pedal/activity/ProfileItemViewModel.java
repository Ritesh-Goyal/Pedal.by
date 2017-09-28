package by.pedal.activity;

import android.databinding.ObservableField;
import android.util.Log;

import by.domain.entity.ProfileDomain;
import by.domain.entity.ProfileId;
import by.pedal.base.BaseItemViewModel;

/**
 * Created by Home911 on 28.09.2017.
 */

public class ProfileItemViewModel extends BaseItemViewModel<ProfileDomain> {

    public ObservableField<String> name = new ObservableField<>("");
    public ObservableField<ProfileId> id = new ObservableField<>();

    @Override
    public void setItem(ProfileDomain item, int position) {
        Log.e("AAA", "ITEM " + position);
        Log.e("AAA", "ITEM name " + item.getName());
        name.set(item.getName());
        id.set(item.getProfileId());
        Log.e("AAA", id.get().getId());
    }
}
