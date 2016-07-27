package com.mayo.whatis.education_plan.java.tools.monitoring

import com.mayo.whatis.education_plan.java.common.JavaExperimental

/**
 * @author yoav @since 7/24/16.
 */
case object JMap extends MonitoringTool with JavaExperimental{
  override val description: String = "Memory Map for Java - Prints shared object memory maps or heap memory details of a " +
    "given process or core file or a remote debug server."
}
