package com.mayo.whatis.education_plan.java.tools.web_service

/**
 * @author yoav @since 7/24/16.
 */
case object WSImport extends WebServiceTool{
  override val description: String = "Generates JAX-WS portable artifacts that can be packaged in a " +
    "web application archive (WAR) file and provides an Ant task."
}
