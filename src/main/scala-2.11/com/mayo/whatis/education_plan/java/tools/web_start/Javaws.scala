package com.mayo.whatis.education_plan.java.tools.web_start

import com.mayo.whatis.education_plan.java.common.JavaDevelopmentTool

/**
 * @author yoav @since 7/24/16.
 */
case object Javaws extends JavaDevelopmentTool {
  override val description: String = "Command line tool for launching Java Web Start and setting various options.\n" +
    "See Java Web Start Guide for more information."
}
