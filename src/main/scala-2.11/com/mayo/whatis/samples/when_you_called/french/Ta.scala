package com.mayo.whatis.samples.when_you_called.french

import com.mayo.whatis.lang.{Sentence, Word}

trait Ta extends Word
object Ta {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Ta(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Ta()) ++ sentence.words
    }
  }

  def apply() = new Ta{
    override val language = "french"
  }
}
         