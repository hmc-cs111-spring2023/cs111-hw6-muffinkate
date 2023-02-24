package machines

import regex._
import dfa._
import machines._

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


// operators
// binary operator
extension(l1: RegularLanguage) {
    def ||(l2: RegularLanguage): RegularLanguage = Union(l1, l2)
}
