package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}
import com.mayo.whatis.samples.indian_rain.meta_lang.phrase_structure.Specification

trait Ever extends Word with Specification
object Ever {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Ever(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Strongest()) ++ sentence.words
    }
  }

  def apply() = new Ever{}
}
         