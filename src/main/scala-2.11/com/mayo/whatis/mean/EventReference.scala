package com.mayo.whatis.mean

/**
 * @author yoav @since 4/7/16.
 */
trait EventReference extends Meaning{
  val action: Action
  val eventObject: Thing
  val time: Time

  override def toString: String = {
    s"""EventReference(
       |action: $action
       |eventObject: $eventObject
       |time: $time)
     """.stripMargin
  }
}
