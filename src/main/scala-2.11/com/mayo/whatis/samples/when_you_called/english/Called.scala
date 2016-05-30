package com.mayo.whatis.samples.when_you_called.english

import com.mayo.whatis.lang.{Sentence, Word}

trait Called extends Word
object Called {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Called(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Called()) ++ sentence.words
    }
  }

  def apply() = new Called{}
}
         