package com.mayo.whatis.education_plan.java.app

import com.mayo.whatis.education_plan.java.abstrct.{AbstractModule, Implementation}
import com.mayo.whatis.education_plan.java.common.{JRE, JVM, JarFile}
import com.mayo.whatis.education_plan.java.server_modules.{LangAndUtil, OtherBaseLibraries}
import com.mayo.whatis.mean.Functionality

/**
 * @author yoav @since 7/25/16.
 */
object JRE8 extends JRE {
  override val jvm: Implementation[JVM] = JavaHotSpotClientServer8
  override val libraries: List[JarFile] = ???
  override val modules: List[AbstractModule] = List(
    LangAndUtil,
    OtherBaseLibraries
  )
}

object JavaHotSpotClientServer8 extends Implementation[JVM] {
  override val specification: JVM = JVM8
}

object JVM8 extends JVM {
  override val functionalities: List[Functionality] = ???
}
