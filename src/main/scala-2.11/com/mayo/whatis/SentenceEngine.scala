package com.mayo.whatis

import java.io.{File, PrintWriter}
import java.nio.file.{Files, Paths}

import com.mayo.whatis.KnownLanguages.KnownLanguage

import scala.io.Source



/**
 * @author yoav @since 2/25/16.
 */
trait SentenceEngine {
  def make(text: String, language: String = "english"): Unit ={
    val currentRelativePath = Paths.get("/Users/yoav/IdeaProjects/WhatIs/src/main/scala-2.11/" + this.getClass.getCanonicalName.replace("$", "").replace(".", "/").split("/").dropRight(1).mkString("/"))
    val absolutePath = currentRelativePath.toAbsolutePath().toString() + s"/$language"
    val dir = new File(absolutePath)

    if(Files.exists(dir.toPath) == false)Files.createDirectory(dir.toPath)
    val canonical = this.getClass.getCanonicalName.replace("$", "")
    text.split(" ").foreach{word => {
      val name = word(0).toUpper + word.substring(1).toLowerCase
      Writer.write(new File(s"$absolutePath/${name}.scala"),
        s"""package ${canonical.split('.').dropRight(1).mkString(".") + s".$language"}
           |
           |import com.whatis.lang.{Sentence, Word}
           |
           |trait ${name} extends Word
           |object ${name} {
           |  def apply(word: Word):Sentence = {
           |    new Sentence {
           |      override val words: List[Word] = List(${name}(), word)
           |    }
           |  }
           |
           |  def apply(sentence: Sentence):Sentence = {
           |    new Sentence {
           |      override val words: List[Word] = List($name()) ++ sentence.words
           |    }
           |  }
           |
           |  def apply() = new ${name}{
           |    override val language = "$language"
           |  }
           |}
         """.stripMargin)
    }}
  }

  def make(text: String, language: KnownLanguage): Unit = make(text, language.toString.toLowerCase)
}

object KnownLanguages extends Enumeration{
  type KnownLanguage = Value
  val ENGLISH, HEBREW, FRENCH = Value
}

object Writer {
  def write(file: File, content: String) {
    val writer = new PrintWriter(file)

    writer.write(content)
    writer.close()

    println(Source.fromFile(file).mkString)
  }

}
