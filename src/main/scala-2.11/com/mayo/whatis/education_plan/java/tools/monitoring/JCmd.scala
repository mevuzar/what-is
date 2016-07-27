package com.mayo.whatis.education_plan.java.tools.monitoring

/**
 * @author yoav @since 7/24/16.
 */
case object JCmd extends MonitoringTool{
  override val description: String = "JVM Diagnostic Commands tool - Sends diagnostic command requests to a running " +
    "Java Virtual Machine."
}
