package com.mayo.whatis.education_plan.java.server_modules.collections.interfaces

import com.mayo.whatis.education_plan.java.server_modules.collections.JavaCollectionRoot
import com.mayo.whatis.education_plan.java.server_modules.collections.common_features.{DuplicateKeys, Unsupported}
import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/27/16.
 */
trait JavaMap extends JavaCollectionRoot {
   override def features: scala.List[Feature] = List(Unsupported(DuplicateKeys))
   override val description: String = "an object that maps keys to values"
 }
