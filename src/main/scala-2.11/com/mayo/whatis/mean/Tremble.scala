package com.mayo.whatis.mean

/**
 * @author yoav @since 4/7/16.
 */
trait Tremble extends Action

case object Tremble extends Tremble {
  override val when: Time = Sometime
  override type Performer = Thing
  override val performer: Tremble.Performer = Anything
}


