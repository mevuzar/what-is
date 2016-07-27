package com.mayo.whatis.education_plan.java.tools.idl

/**
 * @author yoav @since 7/24/16.
 */
case object Orbd extends IDLTool{
  override val description: String = "Provides support for clients to transparently locate and invoke persistent objects on " +
    "servers in the CORBA environment. ORBD is used instead of the Transient Naming Service, tnameserv. " +
    "ORBD includes both a Transient Naming Service and a Persistent Naming Service. The orbd tool incorporates the " +
    "functionality of a Server Manager, an Interoperable Naming Service, and a Bootstrap Name Server. " +
    "When used in conjunction with the servertool, the Server Manager locates, registers, and activates a server " +
    "when a client wants to access the server."
}
