package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}

trait Strongest extends Word
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
         