package com.mayo.whatis.samples.when_you_called.english

import com.mayo.whatis.lang.{Sentence, Word}

trait Trembled extends Word
object Trembled {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Trembled(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Trembled()) ++ sentence.words
    }
  }

  def apply() = new Trembled{}
}
         