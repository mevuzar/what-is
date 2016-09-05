package com.mayo.whatis.mean

/**
 * @author yoav @since 9/5/16.
 */
trait Set{
  type What <: Meaning
  val objects: Map[String, What]
}