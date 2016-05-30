package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}

trait Of extends Word
object Of {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Of(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Of()) ++ sentence.words
    }
  }

  def apply() = new Of{}
}
         