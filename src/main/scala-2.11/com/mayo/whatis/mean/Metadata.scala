package com.mayo.whatis.mean

/**
 * @author yoav @since 7/24/16.
 */
trait Metadata extends Meaning{
  type AbountWhat <: Meaning

  val data: List[String]
}
