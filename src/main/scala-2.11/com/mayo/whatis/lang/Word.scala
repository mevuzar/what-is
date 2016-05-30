package com.mayo.whatis.lang

/**
 * @author yoav @since 4/6/16.
 */
object Word {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(word)
    }
  }
}

/**
 * @author yoav @since 2/25/16.
 */
trait Word{
  override def toString(): String = {
    this.getClass.getName.split('.').last.split('$')(0).toLowerCase
  }

  val language: String = "english"
  val originalWriting: Option[String] = None
}