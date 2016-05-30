package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}

/**
 * @author yoav @since 3/9/16.
 */
trait Recording extends Word

object Recording {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Closed(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Recording()) ++ sentence.words
    }
  }

  def apply() = new Recording{}
}

