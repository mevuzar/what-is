package com.mayo.whatis.samples.when_you_called.english

import com.mayo.whatis.lang.{Sentence, Word}

trait Voice extends Word
object Voice {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Voice(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Voice()) ++ sentence.words
    }
  }

  def apply() = new Voice{}
}
         