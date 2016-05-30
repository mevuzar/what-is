package com.mayo.whatis.samples.indian_rain.meta_lang

import com.mayo.whatis.lang.{Sentence, Word}

/**
 * @author yoav @since 3/9/16.
 */
trait Place extends Word

object Place {
  def apply(word: Word):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Place(), word)
    }
  }

  def apply(sentence: Sentence):Sentence = {
    new Sentence {
      override val words: List[Word] = List(Place()) ++ sentence.words
    }
  }

  def apply() = new Place{}
}

