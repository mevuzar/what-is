package com.mayo.whatis.education_plan.java.tools.monitoring

/**
 * @author yoav @since 7/24/16.
 */
case object JConsol extends MonitoringTool{
  override val description: String = "A JMX-compliant graphical tool for monitoring a Java virtual machine. It can monitor both local and remote JVMs. It can also monitor and manage an application.\n" +
    "See Monitoring and Management for the Java Platform for more information."
}
