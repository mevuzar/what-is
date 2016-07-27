package com.mayo.whatis.education_plan.java.abstrct

import com.mayo.whatis.mean.Meaning

/**
 * @author yoav @since 7/24/16.
 */
trait Implementation[OfWhat <: Specification] extends Meaning{
  val specification: OfWhat
}
