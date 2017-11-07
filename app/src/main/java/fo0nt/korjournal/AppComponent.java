package fo0nt.korjournal;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

/**
 * Created by Elvedin Cuskic on 2017-11-07.
 */

@Singleton
@Component(modules = AppModule.class)
interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {
    }
}
