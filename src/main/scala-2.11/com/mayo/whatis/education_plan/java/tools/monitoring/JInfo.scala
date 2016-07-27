package com.mayo.whatis.education_plan.java.tools.monitoring

import com.mayo.whatis.education_plan.java.common.JavaExperimental

/**
 * @author yoav @since 7/24/16.
 */
case object JInfo extends MonitoringTool with JavaExperimental{
  override val description: String = " Configuration Info for Java - Prints configuration information for a " +
    "given process or core file or a remote debug server."
}
