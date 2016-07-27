package com.mayo.whatis.education_plan.java.tools.monitoring

/**
 * @author yoav @since 7/24/16.
 */
case object JVisualVM extends MonitoringTool{
  override val description: String = "A graphical tool that provides detailed information about the Java technology-based " +
    "applications (Java applications) while they are running in a Java Virtual Machine. " +
    "Java VisualVM provides memory and CPU profiling, heap dump analysis, memory leak detection, access to MBeans, and " +
    "garbage collection. See Java VisualVM for more information."
}
