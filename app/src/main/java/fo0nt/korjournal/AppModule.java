package fo0nt.korjournal;

/**
 * Created by Elvedin Cuskic on 2017-11-07.
 */

import android.app.Application;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjectionModule;

@Module(includes = AndroidInjectionModule.class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract Application application(App app);
}
