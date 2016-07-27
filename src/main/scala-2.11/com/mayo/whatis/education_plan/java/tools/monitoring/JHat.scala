package com.mayo.whatis.education_plan.java.tools.monitoring

import com.mayo.whatis.education_plan.java.common.JavaExperimental

/**
 * @author yoav @since 7/24/16.
 */
case object JHat extends MonitoringTool with JavaExperimental{
  override val description: String = "Heap Dump Browser - Starts a web server on a heap dump file (for example, " +
    "produced by jmap -dump), allowing the heap to be browsed."
}
