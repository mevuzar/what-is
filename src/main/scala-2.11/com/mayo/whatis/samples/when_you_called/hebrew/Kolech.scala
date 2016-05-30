package com.mayo.whatis.samples.when_you_called.hebrew

import com.mayo.whatis.lang.{Sentence, Word}

trait Kolech extends Word
object Kolech {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Kolech(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Kolech()) ++ sentence.words
    }
  }

  def apply() = new Kolech{
    override val language = "hebrew"
  }
}
         