package com.mayo.whatis.samples.when_you_called.french

import com.mayo.whatis.lang.{Sentence, Word}

trait As extends Word
object As {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(As(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(As()) ++ sentence.words
    }
  }

  def apply() = new As{
    override val language = "french"
  }
}
         