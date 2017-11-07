package fo0nt.korjournal.util;

import android.app.Fragment;

import javax.inject.Inject;
import javax.inject.Named;

import fo0nt.korjournal.inject.PerFragment;
import fo0nt.korjournal.ui.common.view.BaseFragmentModule;

/**
 * Created by Elvedin Cuskic on 2017-11-07.
 */

@PerFragment
public final class PerFragmentUtil {

    private final Fragment fragment;

    @Inject
    PerFragmentUtil(@Named(BaseFragmentModule.FRAGMENT) Fragment fragment) {
        this.fragment = fragment;
    }
}
