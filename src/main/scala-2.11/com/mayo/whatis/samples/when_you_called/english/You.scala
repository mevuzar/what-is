package com.mayo.whatis.samples.when_you_called.english

import com.mayo.whatis.lang.{Sentence, Word}

trait You extends Word
object You {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(You(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(You()) ++ sentence.words
    }
  }

  def apply() = new You{}
}
         