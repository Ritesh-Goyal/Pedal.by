package by.pedal.activity;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import by.domain.entity.ProfileDomain;
import by.pedal.base.BaseAdapter;

/**
 * Created by Home911 on 28.09.2017.
 */

public class ProfileAdapter  extends BaseAdapter<ProfileDomain, ProfileItemViewModel> {

    @Override
    public ProfileItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ProfileItemViewModel itemViewModel = new ProfileItemViewModel();
        return ProfileItemViewHolder.create(LayoutInflater.from(parent.getContext()),
                parent, itemViewModel);
    }
}