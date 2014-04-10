import org.advanced.module.MobileEleotModule
import org.advanced.router.MobileEleotRouter

import static ratpack.groovy.Groovy.groovyTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {
    modules {
        register new MobileEleotModule()
    }
  handlers  {  MobileEleotRouter mobileEleotRouter ->

    get {
      render groovyTemplate("index.html", title: "TEST")
    }

    handler("institution/:name"){
        def name = pathTokens.get("name")
        def found = mobileEleotRouter.getInstitutionByName(name)
        render groovyTemplate("index.html", title: "Institution Search", name: found)
    }

    handler("proto"){

    }
        
    assets "public"
  }

}
