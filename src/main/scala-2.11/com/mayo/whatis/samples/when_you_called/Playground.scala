package com.mayo.whatis.samples.when_you_called

import com.mayo.whatis.SentenceEngine
import com.mayo.whatis.brain.{Brain, MemoryBag}
import com.mayo.whatis.mean.{Anything, InstantDeclaration, Past, Person, PhoneCall, SomePeople, Someone, Time, Tremble}
import com.mayo.whatis.samples.when_you_called.english.{Called, Trembled, When, You, Your}
import com.mayo.whatis.samples.when_you_called.french.{Appelé, As, Quand, Ta, Tremblais, Tu, Voix}
import com.mayo.whatis.samples.when_you_called.hebrew.{Ata, Kolech, Kshe, Raad, Tsiltsalt}

//import com.whatis.samples.when_you_called.meta_lang.{AbstractPerson, Action, Call, EventReference, Instant, Past, Thing, Time, TimeReference, Tremble, Voice}

import scala.collection.immutable.Seq

/**
 * @author yoav @since 4/6/16.
 */
object Playground extends App with SentenceEngine with Brain {
  //כשצלצלת רעד קולך ואני ידעתי שאני אבל בגללך
  //the above sentence is not complete but for humans it is meaningful to a minimal common denominator: a description of an event.
  //
  //make("kshe tsiltsalt raad kolech", "hebrew")
  //When(You(Called(Your(Voice(Trembled()))))).words.foreach(println)

  //make("quand tu as appelé ta voix tremblais", KnownLanguages.FRENCH)

  Quand(Tu(As(Appelé(Ta(Voix(Tremblais()))))))
  MemoryBag.addAssociation(Seq(Quand()), InstantDeclaration)
  MemoryBag.addAssociation(Seq(Tu()), Someone, new com.mayo.whatis.mean.You {
    override val name: String = "tu"
  })
  MemoryBag.addAssociation(Tu(As()).words, Someone, new com.mayo.whatis.mean.You {
    override val name: String = "tu"
  })
  /////////////////////////////////////////////////////////////////////////////////////////////
  When(You(Called(Your(english.Voice(Trembled())))))
  MemoryBag.addAssociation(Seq(When()), InstantDeclaration)
  MemoryBag.addAssociation(Seq(You()), Someone, new com.mayo.whatis.mean.You {
    override val name: String = "you"
  })
  MemoryBag.addAssociation(Seq(Called()), new PhoneCall {
    override val attendees: List[Person] = SomePeople()
    override val when: Time = Past
    override val performer: Performer = Someone
  })
  MemoryBag.addAssociation(Seq(Your()), new com.mayo.whatis.mean.Your with Someone {
    override val thing = Anything
  })
  MemoryBag.addAssociation(Seq(english.Voice()), com.mayo.whatis.mean.Voice)
  MemoryBag.addAssociation(Seq(Trembled()), Tremble)


  /////////////////////////////////////////////////////////////////////////////////////////////
  Kshe(Tsiltsalt(Raad(Kolech())))
  MemoryBag.addAssociation(Seq(Kshe()), InstantDeclaration)
  MemoryBag.addAssociation(Seq(Ata()), Someone, new com.mayo.whatis.mean.You {
    override val name: String = "ata"
  })


  //  MemoryBag.addAssociation(Seq(When()), meta_lang.TimeReference)
  //  MemoryBag.addAssociation(When(You(Called())).words.toSeq, meta_lang.Instant(new meta_lang.EventReference {
  //    override val action: meta_lang.Action = meta_lang.Call
  //    override val eventObject: meta_lang.Thing = new meta_lang.You with meta_lang.AbstractPerson
  //    override val time: meta_lang.Time = meta_lang.Past
  //  }))
  //  MemoryBag.addAssociation(Your(english.Voice(Trembled())).words.toSeq, new meta_lang.EventReference {
  //    override val action: meta_lang.Action = meta_lang.Tremble
  //    override val eventObject: meta_lang.Thing = new meta_lang.Your with meta_lang.AbstractPerson with Voice
  //    override val time: meta_lang.Time = meta_lang.Past
  //  })
  //
  //  MemoryBag.addAssociation(Seq(Kshe()), meta_lang.TimeReference)
  //  MemoryBag.addAssociation(Kshe(Tsiltsalt()).words.toSeq, meta_lang.Instant(new meta_lang.EventReference {
  //    override val action: meta_lang.Action = meta_lang.Call
  //    override val eventObject: meta_lang.Thing = new meta_lang.You with meta_lang.AbstractPerson
  //    override val time: meta_lang.Time = meta_lang.Past
  //  }))
  //  MemoryBag.addAssociation(Raad(Kolech()).words.toSeq, new meta_lang.EventReference {
  //    override val action: meta_lang.Action = meta_lang.Tremble
  //    override val eventObject: meta_lang.Thing = new meta_lang.Your with meta_lang.AbstractPerson with Voice
  //    override val time: meta_lang.Time = meta_lang.Past
  //  })

  val meaning = this whatIsTheMeaningOf "kshe tsiltsalt raad kolech"
  println("hebrew: " + meaning)

  //println("english: " + convert("when you called your voice trembled"))
  //once I broke the phrase down and converted it to meanings,
  // WhatIs is supposed to be able to convert the same phrase
  // I'm supposed to be able to assemble a new phrase out of the same meanings(or part of them)
  // using meta_lang


}
