package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}

trait In extends Word

object In {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(In(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(In()) ++ sentence.words
    }
  }

  def apply() = new In{}
}
         