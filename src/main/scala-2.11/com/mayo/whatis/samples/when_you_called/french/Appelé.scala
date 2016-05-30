package com.mayo.whatis.samples.when_you_called.french

import com.mayo.whatis.lang.{Sentence, Word}

trait Appelé extends Word
object Appelé {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Appelé(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Appelé()) ++ sentence.words
    }
  }

  def apply() = new Appelé{
    override val language = "french"
  }
}
         