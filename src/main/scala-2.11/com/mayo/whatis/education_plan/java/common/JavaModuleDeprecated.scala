package com.mayo.whatis.education_plan.java.common

import com.mayo.whatis.education_plan.java.abstrct.Module

/**
 * @author yoav @since 7/26/16.
 */
trait JavaModuleDeprecated extends JavaDeprecated {
  override type AbountWhat = Module
  override val data: List[String] = List("This module is deprecated and will be removed in a future release.")
}
