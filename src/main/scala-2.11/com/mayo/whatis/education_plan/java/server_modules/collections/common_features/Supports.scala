package com.mayo.whatis.education_plan.java.server_modules.collections.common_features

import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/27/16.
 */
case class Supports[T <: Feature](feature: Feature) extends Feature{
   override def toString: String = s"${feature.toString} feature is supported."
 }
