package com.mayo.whatis.education_plan.java.server_modules.collections.interfaces

import com.mayo.whatis.education_plan.java.server_modules.collections.common_features.Ascending
import com.mayo.whatis.mean.Feature

import scala.List

/**
 * @author yoav @since 7/27/16.
 */
trait SortedMap extends JavaMap {
  override def features: scala.List[Feature] = super.features.:::(List(Ascending))
  override val description: String = "a Map that maintains its mappings in ascending key order. " +
    "This is the Map analog of SortedSet. " +
    "Sorted maps are used for naturally ordered collections of key/value pairs, such as " +
    "dictionaries and telephone directories. "
}
