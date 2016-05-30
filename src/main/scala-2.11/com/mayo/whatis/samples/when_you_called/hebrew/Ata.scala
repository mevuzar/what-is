package com.mayo.whatis.samples.when_you_called.hebrew

/**
 * @author yoav @since 4/16/16.
 */

import com.mayo.whatis.lang.{Sentence, Word}

trait Ata extends Word

object Ata {
  def apply(word: Word): Sentence = {
    new Sentence {
      override val words: List[Word] = List(Ata(), word)
    }
  }

  def apply(sentence: Sentence): Sentence = {
    new Sentence {
      override val words: List[Word] = List(Ata()) ++ sentence.words
    }
  }

  def apply() = new Ata {
    override val language = "hebrew"
  }
}
