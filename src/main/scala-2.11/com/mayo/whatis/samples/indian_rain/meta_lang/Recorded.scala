package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}

trait Recorded extends Word
object Recorded {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Recorded(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Recorded()) ++ sentence.words
    }
  }

  def apply() = new Recorded{}
}
         