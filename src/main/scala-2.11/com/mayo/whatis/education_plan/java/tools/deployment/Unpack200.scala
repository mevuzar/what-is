package com.mayo.whatis.education_plan.java.tools.deployment

/**
 * @author yoav @since 7/24/16.
 */
case object Unpack200 extends DeploymentTool{
  override val description: String = "Transforms a packed file produced by pack200 into a JAR file."
}
