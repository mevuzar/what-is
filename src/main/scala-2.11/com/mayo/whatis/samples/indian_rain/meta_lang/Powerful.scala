package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}

trait Powerful extends Word

object Powerful {
  def apply(word: Word): Sentence = {
    new Sentence {
      override val words: List[Word] = List(Powerful(), word)
    }
  }

  def apply(sentence: Sentence): Sentence = {
    new Sentence {
      override val words: List[Word] = List(Powerful()) ++ sentence.words
    }
  }

  def apply() = new Powerful {}
}
         