package com.mayo.whatis.education_plan.java.abstrct

import com.mayo.whatis.mean.Meaning

/**
 * @author yoav @since 7/24/16.
 */
trait Tool extends Meaning{
  def name = this.toString
  val description: String
}
