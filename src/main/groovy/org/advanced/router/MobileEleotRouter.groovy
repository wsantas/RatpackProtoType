package org.advanced.router

import org.advanced.service.InstitutionSearchService

/**
 * Created with IntelliJ IDEA.
 * User: wsantasiero
 * Date: 4/10/14
 * Time: 9:00 AM
 * To change this template use File | Settings | File Templates.
 */
class MobileEleotRouter {

    def InstitutionSearchService institutionSearchService = new InstitutionSearchService()

    def getInstitutionByName(name) {
        institutionSearchService.findInstitutionByName(name)
        return name;
    }


}
