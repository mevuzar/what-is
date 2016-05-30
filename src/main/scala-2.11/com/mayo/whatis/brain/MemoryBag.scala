package com.mayo.whatis.brain

import com.mayo.whatis.mean.Meaning
import com.mayo.whatis.lang.Word

import scala.collection.immutable.Seq
import scala.collection.mutable
import scala.util.Try

/**
 * @author yoav @since 4/6/16.
 */
object MemoryBag extends mutable.HashMap[String, Association] {
  def addAssociation[TWord <: Word](words: Seq[Word], meaning: Meaning): Try[Unit] = {
    Try {
      val association = DynamicAssociation(words, meaning)
      this.+=((words.map(_.toString).mkString(" "), association))
    }
  }

  def addAssociation[TWord <: Word](words: Seq[Word], meaning: Meaning*): Try[Unit] = {
    Try {
      meaning.foreach(addAssociation(words, _))
      //      val association = DynamicAssociation(words, meaning)
      //      this.+=((words.map(_.toString).mkString(" "), association))
    }
  }

}
