package by.pedal.activity;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import by.domain.entity.ProfileId;
import by.pedal.details.ProfileActivity;
import by.pedal.details.ProfileViewModel;

/**
 * Created by Home911 on 28.09.2017.
 */

public class ClickHandler {private Context context;

    public ClickHandler(Context context) {
        this.context = context;
    }

    public void onItemClick(ProfileId id) {
        Log.e("AAAA", "onItemClick");
        Intent intent = new Intent(context, ProfileActivity.class);
        intent.putExtra("ID", id.getId());
        context.startActivity(intent);
    }

    public void onProfileEdit(ProfileViewModel profile) {
        profile.state.set(ProfileViewModel.STATE.EDIT);
    }

    public void onSaveProfile(ProfileViewModel profile) {
        profile.saveProfile();
    }
}