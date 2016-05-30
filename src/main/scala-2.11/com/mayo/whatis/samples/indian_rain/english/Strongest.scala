package com.mayo.whatis.samples.indian_rain.english

import com.mayo.whatis.lang.{Sentence, Word}
import com.mayo.whatis.samples.indian_rain.brain.Title

/**
 * @author yoav @since 2/27/16.
 */
trait Strongest extends Word with Title

object Strongest {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Strongest(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Strongest()) ++ sentence.words
    }
  }

  def apply() = new Strongest{}
}
