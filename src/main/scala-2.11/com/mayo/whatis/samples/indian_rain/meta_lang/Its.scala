package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}

trait Its extends Word
object Its {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Its(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Its()) ++ sentence.words
    }
  }

  def apply() = new Its{}
}
         