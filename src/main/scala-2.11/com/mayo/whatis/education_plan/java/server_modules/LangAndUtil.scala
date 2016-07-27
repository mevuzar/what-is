package com.mayo.whatis.education_plan.java.server_modules

import com.mayo.whatis.education_plan.java.abstrct.{AbstractModule, Module}
import com.mayo.whatis.education_plan.java.server_modules.collections
import com.mayo.whatis.education_plan.java.server_modules.collections.{interfaces, Collections}

/**
 * @author yoav @since 7/25/16.
 */
object LangAndUtil extends AbstractModule {
  override val subModules: Option[scala.List[Module]] = Some(List(Math,
    Collections,
    RefObjects,
    RegularExpressions,
    Logging,
    Managements,
    Instrumentation,
    ConcurrencyUtilities,
    Reflection,
    Versioning,
    PreferencesAPI,
    Jar,
    Zip
  ))
}

object Math extends Module

object RefObjects extends Module

object RegularExpressions extends Module

object Logging extends Module

object Managements extends Module

object Instrumentation extends Module

object ConcurrencyUtilities extends Module

object Reflection extends Module

object Versioning extends Module

object PreferencesAPI extends Module

object Jar extends Module

object Zip extends Module