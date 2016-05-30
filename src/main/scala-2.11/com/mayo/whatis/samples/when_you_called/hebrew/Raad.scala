package com.mayo.whatis.samples.when_you_called.hebrew

import com.mayo.whatis.lang.{Sentence, Word}

trait Raad extends Word
object Raad {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Raad(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Raad()) ++ sentence.words
    }
  }

  def apply() = new Raad{
    override val language = "hebrew"
  }
}
         