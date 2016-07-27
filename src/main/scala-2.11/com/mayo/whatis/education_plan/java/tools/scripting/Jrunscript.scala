package com.mayo.whatis.education_plan.java.tools.scripting

import com.mayo.whatis.education_plan.java.common.{JavaDevelopmentTool, JavaExperimental}

/**
 * @author yoav @since 7/24/16.
 */
case object Jrunscript extends JavaDevelopmentTool with JavaExperimental{
  override val description: String = "Script shell for Java - Runs a script. " +
    "This tool is unsupported and experimental in nature and should be used with that in mind. " +
    "It might not be available in future JDK versions."
}
