package in.fine.artist.home.views.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.fine.artist.home.R;
import in.fine.artist.home.views.activities.UserTestActivity;

/**
 * Created by apoorvarora on 19/08/17.
 */
public class SexInputFragment extends BaseFragment {
    private LayoutInflater inflater;
    private Activity mActivity;
    private View getView;
    private boolean destroyed;

    public SexInputFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sex_input, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        destroyed = false;
        getView = getView();
        mActivity = getActivity();
        inflater = LayoutInflater.from(mActivity);

        setListeners();
    }

    private void setListeners() {
        getView.findViewById(R.id.right_tick_container).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // move to the next fragment
                Intent intent = new Intent(mActivity, UserTestActivity.class);
                mActivity.startActivity(intent);
            }
        });
    }

    @Override
    public void onDestroyView() {
        destroyed = true;
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        destroyed = true;
        super.onDestroy();
    }

}

