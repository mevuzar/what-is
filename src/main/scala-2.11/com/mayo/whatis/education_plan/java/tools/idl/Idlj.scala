package com.mayo.whatis.education_plan.java.tools.idl

/**
 * @author yoav @since 7/24/16.
 */
case object Idlj extends IDLTool{
  override val description: String = "Generates .java files that map an OMG IDL interface and enable an application written " +
    "in the Java programming language to use CORBA functionality."
}
