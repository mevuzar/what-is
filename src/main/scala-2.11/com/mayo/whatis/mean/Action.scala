package com.mayo.whatis.mean

/**
 * @author yoav @since 4/7/16.
 */
trait Action extends Meaning{
  type Performer <: Thing
  val when: Time
  val performer: Performer
}