package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}

trait Most extends Word
object Most {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Most(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Most()) ++ sentence.words
    }
  }

  def apply() = new Most{}
}
         