package com.mayo.whatis.education_plan.java.server_modules

import com.mayo.whatis.education_plan.java.abstrct.{AbstractModule, Module}
import com.mayo.whatis.education_plan.java.common.JavaModuleDeprecated
import com.mayo.whatis.education_plan.java.server_modules.collections
import com.mayo.whatis.education_plan.java.server_modules.collections.interfaces

/**
 * @author yoav @since 7/25/16.
 */
object OtherBaseLibraries extends AbstractModule {
  override val subModules: Option[scala.List[Module]] = Some(List(
    Beans,
    Security,
    Serialization,
    ExtentionMechanism,
    JMX,
    XmlJaxp,
    Networking,
    OverrideMechanism,
    JNI,
    DateAndTime,
    IO,
    Internationalization
  ))
}

object Beans extends Module

object Security extends Module

object Serialization extends Module

object ExtentionMechanism extends Module

object JMX extends Module

object XmlJaxp extends Module

object Networking extends Module

object OverrideMechanism extends Module with JavaModuleDeprecated

object JNI extends Module

object DateAndTime extends Module {
  override val subModules: Option[scala.List[Module]] = Some(List())
}

object IO extends Module

object Internationalization extends Module
