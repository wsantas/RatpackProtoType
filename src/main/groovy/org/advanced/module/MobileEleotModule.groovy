package org.advanced.module

import com.google.inject.AbstractModule
import com.google.inject.Scopes
import org.advanced.router.MobileEleotRouter
import org.advanced.service.InstitutionSearchService

/**
 * Created with IntelliJ IDEA.
 * User: wsantasiero
 * Date: 4/10/14
 * Time: 9:07 AM
 * To change this template use File | Settings | File Templates.
 */
class MobileEleotModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MobileEleotRouter.class).in(Scopes.SINGLETON);
        bind(InstitutionSearchService.class)
    }
}

