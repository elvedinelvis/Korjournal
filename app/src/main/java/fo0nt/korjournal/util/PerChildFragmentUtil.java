package fo0nt.korjournal.util;

import android.app.Fragment;

import javax.inject.Inject;
import javax.inject.Named;

import fo0nt.korjournal.inject.PerChildFragment;
import fo0nt.korjournal.ui.common.view.BaseChildFragmentModule;

/**
 * Created by Elvedin Cuskic on 2017-11-07.
 */

@PerChildFragment
public final class PerChildFragmentUtil {

    private final Fragment childFragment;

    @Inject
    PerChildFragmentUtil(@Named(BaseChildFragmentModule.CHILD_FRAGMENT) Fragment childFragment) {
        this.childFragment = childFragment;
    }
}
