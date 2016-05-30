package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}

trait Down extends Word
object Down {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Down(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Strongest()) ++ sentence.words
    }
  }

  def apply() = new Down{}
}
         