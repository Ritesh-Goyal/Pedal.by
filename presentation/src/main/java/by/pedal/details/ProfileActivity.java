package by.pedal.details;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import javax.inject.Inject;

import by.pedal.R;
import by.pedal.base.BaseActivity;

/**
 * Created by Home911 on 28.09.2017.
 */

public class ProfileActivity extends BaseActivity {

    @Inject
    GetProfileUseCase getProfile;
    @Inject
    OverwriteProfileUseCase overwriteProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ((TestApplication)getApplication()).getAppComponent().inject(this);

        String id = getIntent().getStringExtra("ID");
        ProfileViewModel viewModel = new ProfileViewModel(id, getProfile, overwriteProfile);

        this.viewModel = viewModel;

        ActivityDz11ProfileBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_dz11_profile);
        binding.setProfile(viewModel);
        binding.setHandler(new ClickHandler(ProfileActivity.this));

        super.onCreate(savedInstanceState);
    }
}
