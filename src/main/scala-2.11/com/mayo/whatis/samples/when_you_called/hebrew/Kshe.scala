package com.mayo.whatis.samples.when_you_called.hebrew

import com.mayo.whatis.lang.{Sentence, Word}

trait Kshe extends Word
object Kshe {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Kshe(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Kshe()) ++ sentence.words
    }
  }

  def apply() = new Kshe{
    override val language = "hebrew"
  }
}


