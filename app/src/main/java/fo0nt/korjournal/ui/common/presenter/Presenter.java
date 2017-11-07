package fo0nt.korjournal.ui.common.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Elvedin Cuskic on 2017-11-07.
 */

public interface Presenter {

    void onStart(@Nullable Bundle savedInstanceState);

    void onResume();

    void onPause();

    void onSaveInstanceState(Bundle outState);

    void onEnd();
}
