package com.mayo.whatis.mean

/**
 * @author yoav @since 4/24/16.
 */
trait Activity extends Meaning{
  type ThingLike <: Thing
  type Participants <: Seq[ThingLike]
}
