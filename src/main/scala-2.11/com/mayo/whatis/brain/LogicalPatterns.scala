package com.mayo.whatis.brain

import com.mayo.whatis.mean.{Action, EventReference, InstantDeclaration, Meaning, Person, Thing, Time}

import scala.collection.immutable.Seq
import scala.collection.mutable

/**
 * @author yoav @since 4/18/16.
 */
object LogicalPatterns extends mutable.HashMap[Seq[Meaning], Meaning] {
  def tryToFindTheMeaning(pattern: Product): Option[Meaning] = {
    pattern match {
      case (InstantDeclaration, person: Person, action: Action) =>
        Some(new EventReference {
          override val action: Action = action
          override val eventObject: Thing = person
          override val time: Time = action.when
        })
      case (thing: Thing, action: Action) =>
        Some(new EventReference {
          override val action: Action = action
          override val eventObject: Thing = thing
          override val time: Time = action.when
        })
    }
  }
}

