package fo0nt.korjournal.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import fo0nt.korjournal.R;
import fo0nt.korjournal.ui.common.BaseActivity;
import fo0nt.korjournal.ui.main.view.MainFragment;
import fo0nt.korjournal.ui.main.view.MainFragmentListener;

/**
 * Created by Elvedin Cuskic on 2017-11-07.
 */

public final class MainActivity extends BaseActivity implements MainFragmentListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, new MainFragment());
        }
    }
}
