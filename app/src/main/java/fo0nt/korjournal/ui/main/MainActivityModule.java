package fo0nt.korjournal.ui.main;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import fo0nt.korjournal.inject.PerActivity;
import fo0nt.korjournal.inject.PerFragment;
import fo0nt.korjournal.ui.common.BaseActivityModule;
import fo0nt.korjournal.ui.main.view.MainFragment;
import fo0nt.korjournal.ui.main.view.MainFragmentListener;
import fo0nt.korjournal.ui.main.view.MainFragmentModule;

/**
 * Created by Elvedin Cuskic on 2017-11-07.
 */

@Module(includes = BaseActivityModule.class)
public abstract class MainActivityModule {

    @PerFragment
    @ContributesAndroidInjector(modules = MainFragmentModule.class)
    abstract MainFragment mainFragmentInjector();

    @Binds
    @PerActivity
    abstract Activity activity(MainActivity mainActivity);

    @Binds
    @PerActivity
    abstract MainFragmentListener mainFragmentListener(MainActivity mainActivity);

}
