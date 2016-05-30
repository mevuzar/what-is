package com.mayo.whatis.mean

/**
 * @author yoav @since 4/7/16.
 */
trait Someone extends Person{
  override val name: String = "someone"
}

case object Someone extends Someone
