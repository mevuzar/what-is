package com.mayo.whatis.education_plan.java.server_modules.collections.interfaces

import com.mayo.whatis.education_plan.java.server_modules.collections.common_features.Ascending
import com.mayo.whatis.mean.Feature

import scala.List

/**
 * @author yoav @since 7/27/16.
 */
trait SortedSet extends Set {
  override def features: scala.List[Feature] = super.features ::: List(Ascending)
  override val description: String = " a Set that maintains its elements in ascending order. " +
    "Several additional operations are provided to take advantage of the ordering. " +
    "Sorted sets are used for naturally ordered sets, such as word lists and membership rolls."
}
