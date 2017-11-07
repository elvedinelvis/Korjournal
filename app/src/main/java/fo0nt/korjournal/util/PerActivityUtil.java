package fo0nt.korjournal.util;

import android.app.Activity;
import android.app.Fragment;

import javax.inject.Inject;
import javax.inject.Named;

import fo0nt.korjournal.inject.PerActivity;
import fo0nt.korjournal.inject.PerFragment;

/**
 * Created by Elvedin Cuskic on 2017-11-07.
 */

@PerActivity
public final class PerActivityUtil {

    private final Activity activity;

    @Inject
    PerActivityUtil(Activity activity) {
        this.activity = activity;
    }
}
