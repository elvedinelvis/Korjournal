package fo0nt.korjournal.ui.common.view;

import android.app.Fragment;
import android.app.FragmentManager;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import fo0nt.korjournal.inject.PerFragment;

/**
 * Created by Elvedin Cuskic on 2017-11-07.
 */

@Module
public abstract class BaseFragmentModule {

    public static final String FRAGMENT = "BaseFragmentModule.fragment";

    static final String CHILD_FRAGMENT_MANAGER = "BaseFragmentModule.childFragmentManager";

    @Provides
    @Named(CHILD_FRAGMENT_MANAGER)
    @PerFragment
    static FragmentManager childFragmentManager(@Named(FRAGMENT) Fragment fragment) {
        return fragment.getChildFragmentManager();
    }
}
