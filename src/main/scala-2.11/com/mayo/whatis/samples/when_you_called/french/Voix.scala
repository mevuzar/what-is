package com.mayo.whatis.samples.when_you_called.french

import com.mayo.whatis.lang.{Sentence, Word}

trait Voix extends Word
object Voix {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Voix(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Voix()) ++ sentence.words
    }
  }

  def apply() = new Voix{
    override val language = "french"
  }
}
         