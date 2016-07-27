package com.mayo.whatis.education_plan.java.server_modules.collections

import com.mayo.whatis.education_plan.java.abstrct.Module
import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/27/16.
 */
trait JavaCollectionRoot extends Module{
   val use: scala.collection.immutable.List[String]
   val features: scala.collection.immutable.List[Feature]
   val description: String
   val codeSample: String
 }
