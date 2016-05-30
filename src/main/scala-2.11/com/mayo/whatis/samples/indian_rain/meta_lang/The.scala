package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}
import com.mayo.whatis.samples.indian_rain.meta_lang.phrase_structure.SubjectDeclarationHint

trait The extends Word with SubjectDeclarationHint
object The {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(The(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(The()) ++ sentence.words
    }
  }

  def apply() = new The{}
}
         