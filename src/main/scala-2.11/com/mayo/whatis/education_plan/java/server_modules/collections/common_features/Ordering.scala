package com.mayo.whatis.education_plan.java.server_modules.collections.common_features

import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/27/16.
 */
trait Ordering

case object LIFO extends Ordering with Feature
case object FIFO extends Ordering with Feature
object Ascending extends Ordering with Feature
object Descending extends Ordering with Feature
