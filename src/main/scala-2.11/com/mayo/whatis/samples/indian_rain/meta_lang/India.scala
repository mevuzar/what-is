package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}

trait India extends Word with Place
object India {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(India(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(India()) ++ sentence.words
    }
  }

  def apply() = new India{}
}
         