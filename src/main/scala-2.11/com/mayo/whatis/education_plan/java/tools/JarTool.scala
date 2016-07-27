package com.mayo.whatis.education_plan.java.tools

import com.mayo.whatis.education_plan.java.common.JavaDevelopmentTool

/**
 * @author yoav @since 7/24/16.
 */
case object JarTool extends JavaDevelopmentTool {
  override val description: String = "Create and manage Java Archive (JAR) files.\n" +
    "See Java Archive Files page for the JAR specification."
}

