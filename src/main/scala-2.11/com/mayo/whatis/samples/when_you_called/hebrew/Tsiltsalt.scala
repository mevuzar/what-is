package com.mayo.whatis.samples.when_you_called.hebrew

import com.mayo.whatis.lang.{Sentence, Word}

trait Tsiltsalt extends Word
object Tsiltsalt {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Tsiltsalt(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Tsiltsalt()) ++ sentence.words
    }
  }

  def apply() = new Tsiltsalt{
    override val language = "hebrew"
  }
}
         