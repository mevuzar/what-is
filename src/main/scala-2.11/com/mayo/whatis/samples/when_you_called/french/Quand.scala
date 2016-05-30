package com.mayo.whatis.samples.when_you_called.french

import com.mayo.whatis.lang.{Sentence, Word}

trait Quand extends Word
object Quand {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Quand(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Quand()) ++ sentence.words
    }
  }

  def apply() = new Quand{
    override val language = "french"
  }
}
         