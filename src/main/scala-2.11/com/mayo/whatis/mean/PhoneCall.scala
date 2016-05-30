package com.mayo.whatis.mean

/**
 * @author yoav @since 4/7/16.
 */
trait PhoneCall extends Action {
  val caller = performer
  val attendees: List[Person]
  override type Performer = Person
}

//case class PhoneCall(val when: Time) extends PhoneCall //with Call
