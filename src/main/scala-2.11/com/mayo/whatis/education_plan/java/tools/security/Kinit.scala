package com.mayo.whatis.education_plan.java.tools.security

/**
 * @author yoav @since 7/24/16.
 */
case object Kinit extends SecurityTool{
  override val description: String = "Tool for obtaining Kerberos v5 tickets. " +
    "Equivalent functionality is available on the Solaris operating system via the kinit tool."
}
