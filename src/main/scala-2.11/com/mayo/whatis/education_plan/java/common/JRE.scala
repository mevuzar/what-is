package com.mayo.whatis.education_plan.java.common

import com.mayo.whatis.education_plan.java.abstrct.{AbstractModule, Implementation, RuntimeEnvironment}

/**
 * @author yoav @since 7/24/16.
 */
trait JRE extends RuntimeEnvironment{
  val jvm: Implementation[JVM]
  val libraries:List[JarFile]
  val modules: List[AbstractModule]
}
