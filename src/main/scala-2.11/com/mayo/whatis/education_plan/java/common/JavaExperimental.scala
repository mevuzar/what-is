package com.mayo.whatis.education_plan.java.common

import com.mayo.whatis.education_plan.java.abstrct.{Annotation, DevelopmentTool}

/**
 * @author yoav @since 7/24/16.
 */
trait JavaExperimental extends Annotation{
  override type AbountWhat = DevelopmentTool
  override val data: List[String] = List("This tool is unsupported and experimental in nature and should be used with that in mind. " +
    "It might not be available in future JDK versions.")
}
