package fo0nt.korjournal.ui.main.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import fo0nt.korjournal.R;
import fo0nt.korjournal.ui.common.view.BaseFragment;

/**
 * Created by Elvedin Cuskic on 2017-11-07.
 */

public final class MainFragment extends BaseFragment {

    @Inject
    MainFragmentListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }
}
