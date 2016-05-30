package com.mayo.whatis.mean

import scala.util.Random

/**
 * @author yoav @since 4/18/16.
 */
case object SomePeople extends Seq[Someone] {
  override def length: Int = new Random().nextInt

  override def iterator: Iterator[Someone] = Range(0, length).map(i => List(new Someone{})).flatten.iterator

  def apply() = iterator.toList

  override def apply(idx: Int): Someone = Someone
}
