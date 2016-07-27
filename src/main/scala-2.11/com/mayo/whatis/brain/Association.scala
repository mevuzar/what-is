package com.mayo.whatis.brain

import com.mayo.whatis.lang.Word
import com.mayo.whatis.mean.Meaning

import scala.collection.immutable.Seq

/**
 * @author yoav @since 3/9/16.
 */
trait Association{
  val words: Seq[Word]
  val meaning: Meaning
}

case class DynamicAssociation(words: Seq[Word], meaning: Meaning) extends Association