package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}

trait Capital extends Word
object Capital {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Capital(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Capital()) ++ sentence.words
    }
  }

  def apply() = new Capital{}
}



