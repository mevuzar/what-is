package com.mayo.whatis.education_plan.java.server_modules.collections.interfaces

import com.mayo.whatis.education_plan.java.server_modules.collections.features.{OrderingMechanism, FIFOAndLIFOOrdering}
import com.mayo.whatis.mean.Feature

/**
 * @author yoav @since 7/27/16.
 */
trait Deque extends JavaCollection {
   override val features: scala.List[Feature] = List(orderingMechanism)
   val orderingMechanism: OrderingMechanism with Feature = FIFOAndLIFOOrdering
   override val description: String = "Resembles queue. In a deque all new elements can be inserted, retrieved and removed at both ends."
 }
