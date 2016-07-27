package com.mayo.whatis.education_plan.java.tools.monitoring

import com.mayo.whatis.education_plan.java.common.JavaExperimental

/**
 * @author yoav @since 7/24/16.
 */
case object JsaDebugD extends MonitoringTool with JavaExperimental{
  override val description: String = "Serviceability Agent Debug Daemon for Java - " +
    "Attaches to a process or core file and acts as a debug server."
}
