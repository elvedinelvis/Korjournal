package fo0nt.korjournal.ui.main.view;

import android.app.Fragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import fo0nt.korjournal.inject.PerFragment;
import fo0nt.korjournal.ui.common.view.BaseFragmentModule;

/**
 * Created by Elvedin Cuskic on 2017-11-07.
 */

@Module(includes = BaseFragmentModule.class)
public abstract class MainFragmentModule {

    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(MainFragment mainFragment);
}
