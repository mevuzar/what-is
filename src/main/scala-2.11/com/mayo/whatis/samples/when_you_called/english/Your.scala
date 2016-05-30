package com.mayo.whatis.samples.when_you_called.english

import com.mayo.whatis.lang.{Sentence, Word}

trait Your extends Word
object Your {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Your(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Your()) ++ sentence.words
    }
  }

  def apply() = new Your{}
}
         