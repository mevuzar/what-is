package com.mayo.whatis.samples.indian_rain.english

import com.mayo.whatis.lang.{Sentence, Word}

trait Shutdown extends Word
object Shutdown {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Shutdown(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Strongest()) ++ sentence.words
    }
  }

  def apply() = new Shutdown{}
}
         