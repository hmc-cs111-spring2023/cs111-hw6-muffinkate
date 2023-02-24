package machines

import regex._
import dfa._

// implicit conversion from char to regular language
given Conversion[Char, RegularLanguage] = Character(_)
