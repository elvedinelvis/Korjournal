package fo0nt.korjournal.inject;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Elvedin Cuskic on 2017-11-07.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerChildFragment {
}
