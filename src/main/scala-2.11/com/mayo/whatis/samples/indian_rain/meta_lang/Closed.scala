package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}
import com.mayo.whatis.samples.indian_rain.brain.PastAction

trait Closed extends Word with PastAction
object Closed {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Closed(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Closed()) ++ sentence.words
    }
  }

  def apply() = new Closed{}
}




