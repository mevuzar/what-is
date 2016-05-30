package com.mayo.whatis.samples.when_you_called.french

import com.mayo.whatis.lang.{Sentence, Word}

trait Tu extends Word
object Tu {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Tu(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Tu()) ++ sentence.words
    }
  }

  def apply() = new Tu{
    override val language = "french"
  }
}
         