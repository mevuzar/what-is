package com.mayo.whatis.samples.indian_rain.brain

import com.mayo.whatis.lang.Word

/**
 * @author yoav @since 2/27/16.
 */
trait Thing{
  val name: String = this.getClass.getSimpleName
  val description: Seq[Word]
}
