package com.mayo.whatis.samples.when_you_called.french

import com.mayo.whatis.lang.{Sentence, Word}

trait Tremblais extends Word
object Tremblais {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Tremblais(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Tremblais()) ++ sentence.words
    }
  }

  def apply() = new Tremblais{
    override val language = "french"
  }
}
         