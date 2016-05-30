package com.mayo.whatis.samples.when_you_called.english

import com.mayo.whatis.lang.{Sentence, Word}

trait When extends Word
object When {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(When(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(When()) ++ sentence.words
    }
  }

  def apply() = new When{}
}
         