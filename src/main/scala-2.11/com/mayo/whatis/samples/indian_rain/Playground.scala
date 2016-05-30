package com.mayo.whatis.samples.indian_rain

import com.mayo.whatis.SentenceEngine
import com.mayo.whatis.samples.indian_rain.english.{Shutdown, Strongest}
import com.mayo.whatis.samples.indian_rain.meta_lang.{Capital, Closed, Ever, In, India, Its, Most, Powerful, Rain, Recorded, The}

/**
 * @author yoav @since 2/25/16.
 */
//com.whatis.samples.indian_rain.meta_lang.The strongest rain ever recorded in com.whatis.samples.indian_rain.meta_lang.India shut down the financial hub of Mumbai,
// snapped communication lines,
// closed airports and forced thousands of people to sleep in their offices or walk home during the night, officials said today.

object Playground {

  //We don’t want values to ever be null.
  //The strongest rain ever recorded in India shut down its capital.
  val rawPhrase =  The(Most(Powerful(Rain(Ever(Recorded(In(India(Closed(Its(Capital()))))))))))
  //I want to convert the string to meaning:
  // 1. I parse the sentence string to List[Word] - Words should be as clean of meanings as possible.
  // 2. I go over each word, analyzing it and assign its complete/presumed role in the sentence.
  //
  val phraseContext = rawPhrase.words map {word =>
    //in order to get the SentenceWord I need to get the Role of the word(the rest is given):
    //1. The Word is the association ->
    val index = rawPhrase.words.indexOf(word)
    //get the existing uncomplete parts
    (index, word)
  }



}

















object Simple extends SentenceEngine with App{

  //theRainSentenceEnglish should be parsed into theRainSentenceMeta

  val theRainSentenceEnglish = The(Strongest(Rain(Ever(Recorded(In(India(Shutdown(Its(Capital())))))))))

  val theRainSentenceMeta = The(Rain(Most(Powerful(Ever(Recorded(In(India(Closed(Its(Capital()))))))))))

  /*
The strongest rain ever recorded in India shut down its capital.

The purpose of this is to analyze how I parse the sentence and into what structure.

* {[com.whatis.samples.indian_rain.meta_lang.The strongest rain][ever recorded in com.whatis.samples.indian_rain.meta_lang.India][shut down its capital]}
*
* Chronology of parsing:
* 1. 'The' (subject_declaration_hint)  -> understands the subject is coming

* 2. 'strongest' (subject_descriptive_declaration) [Most][Powerful] -> since 'strongest' is descriptive I know it's a descriptive declaration and
*    keep reading awaiting an object

* 3. 'rain' (location_bound_sentence_hint)  -> got the noun but:
*                              a. surely, a specification part(which strongest rain exactly) will follow
*                              b. I guess the sentence is a 2 part pattern of [[subject_descriptive_declaration] [specification]][remark]

* 4. 'ever' (specification) -> could stand alone since  but does does not much any usual/inteligent syntax so I continue expecting the specification complement

* 5. 'recorded' (complementary_segment)  -> I know this is a part of the specification since 'ever recorded' is a known combination
*                               but I also know another accuration complement
*                               is likely to follow

* 6. 'in' (necessarily bound complement segment)(location_hint) -> 'in' does not stand alone in any case so I expect another fragment. 'in' hits a location
*    since rain is a natural, geographically bound phenomenon.

* 7. 'India' (complement)(last_complement_segment_hint)[Country] -> since rain is geographically bound, 'India' is most likely to be the last complement.

* 8. 'shut' (remark) (occurrence_description) (verb) (damage_hint) -> 'shut' doesn't stand alone in any case so I expect another fragment.
*                                     damage hint since rain can damage and shut_down happens in many cases when damage is done.

* 9. 'down' (verb_end_hint) (seconday_subject_hint) -> the term 'shut down' is usually bound and final.
*                                                         only an additional verb should postpone the seconday_subject

* 10. 'its' (possessive_back_reference)
*           (secondary_subject)
*           (possessive_object_hints: (last_object_in_sentence)(logical_association)) -> the last object until now is 'India'.
*                                                                        this helps in associating the possessive pronoun 'its' with com.whatis.samples.indian_rain.meta_lang.India
*                                                                        but there's a more important hint - you cannot 'shut down' a rain.
*                                                                        let's take the following example:
*                                                                        com.whatis.samples.indian_rain.meta_lang.The strongest rain ever recorded in com.whatis.samples.indian_rain.meta_lang.India, biggest country in asia, shut down its capital.
*                                                                        com.whatis.samples.indian_rain.meta_lang.In this example only the logical_association hint helps us here since the
*                                                                        last_object_in_sentence hint would have suggested that the rain shut down Asia.
*
* 11. 'capital' ->
*

*
 *  */

}

//com.whatis.samples.indian_rain.meta_lang.The current extreme El Niño is now the strongest ever recorded, smashing the previous record from 1997-8.
//com.whatis.samples.indian_rain.meta_lang.The most extreme El Niño currently striking is now the strongest ever recorded, smashing the previous record from 1997-8.













//הברווז עם המקור השחור והנוצות הכחולות