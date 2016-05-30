package com.mayo.whatis.mean

/**
 * @author yoav @since 4/18/16.
 */
trait Scene extends Meaning{
  val identifyingEvent: EventReference
  val sceneEvents: Seq[EventReference]
}
