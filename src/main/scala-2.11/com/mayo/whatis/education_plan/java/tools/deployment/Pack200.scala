package com.mayo.whatis.education_plan.java.tools.deployment

/**
 * @author yoav @since 7/24/16.
 */
case object Pack200 extends DeploymentTool{
  override val description: String = "Transforms a JAR file into a compressed pack200 file using the Java gzip compressor. " +
    "The compressed packed files are highly compressed JARs, which can be directly deployed, " +
    "saving bandwidth and reducing download time."
}
