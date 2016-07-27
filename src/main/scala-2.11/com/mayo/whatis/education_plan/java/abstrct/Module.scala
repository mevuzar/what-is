package com.mayo.whatis.education_plan.java.abstrct

import com.mayo.whatis.mean.Thing

/**
 * @author yoav @since 7/25/16.
 */
trait Module extends Thing{
  val subModules: Option[List[Module]] = None
}
