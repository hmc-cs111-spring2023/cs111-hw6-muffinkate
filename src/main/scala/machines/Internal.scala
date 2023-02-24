package machines

import regex._
import dfa._

// implicit conversion from char to regular language
given Conversion[Char, RegularLanguage] = Character(_)


// implicit conversion from string to regular language
given Conversion[String, RegularLanguage] with
    def apply(s: String): RegularLanguage = {
        if (s.isEmpty)
            Epsilon
        else 
            Concat(Character(s.head), apply(s.tail))
    }
