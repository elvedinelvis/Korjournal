package fo0nt.korjournal.util;

import android.app.Application;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Elvedin Cuskic on 2017-11-07.
 */

@Singleton
public final class SingletonUtil {

    private final Application application;

    @Inject
    SingletonUtil(Application application) {
        this.application = application;
    }
}
