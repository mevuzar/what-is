package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}
import com.mayo.whatis.samples.indian_rain.brain.Thing

trait Rain extends Word with Thing
object Rain {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Rain(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Rain()) ++ sentence.words
    }
  }

  def apply() = new Rain{
    override val description: Seq[Word] = ???
  }
}
         