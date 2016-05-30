package com.mayo.whatis.brain

import com.mayo.whatis.mean.Meaning

/**
 * @author yoav @since 4/16/16.
 */
trait Brain {

  def whatIsTheMeaningOf(phrase: String): List[Meaning] = {
    val words = phrase.split(" ").toList
    val groupedWords = words.indices.flatMap(i => Range(1, words.size + 1).map(z => words.slice(i, i + z))).filterNot(_.isEmpty).distinct

    val assosiactions = groupedWords.map(words => {
      val meaningfulString = words.mkString(" ")
      if (MemoryBag.contains(meaningfulString)) Some(MemoryBag(meaningfulString))
      else None
    }).toList.filterNot(_.isEmpty).map(_.get)

    assosiactions.map(_.meaning)
  }
}
