# Reflection on implementing regular expressions of a DSL

## Which operators were easiest to implement and why?
The operators that extended Regular Language were easier to implement in my opinion because that functionality already existed in the RegularLanguage, we were just defining a new way to write it. After that, Scala features did the rest of the work for us by being able to write things using infix notation, etc.

## Which operators were most difficult to implement and why?
The conversion from RegularLanguage to DFA was the hardest - writing given statements was confusing and I'm still not sure how it works. That was the one that took me the longest to figure out what types Scala wanted.

## Comment on the design of this internal DSL

Write a few brief paragraphs that discuss:

- What works about this design? (For example, what things seem easy and
  natural to say, using the DSL?)
- What doesn't work about this design? (For example, what things seem
  cumbersome to say?)
- Think of a syntactic change that might make the language better. How would
  you implement it _or_ what features of Scala would prevent you from
  implementing it? (You don't have to write code for this part. You could say
  "I would use extension to..." or "Scala's rules for valid
  identifiers prevent...")

I thought most of the new operators were much easier to use in this design. It feels much more natural to be able to use the operators than to write a bunch of methods. That being said, sometimes sequences of operators are harder to read than names of methods that are very clear what they do.

I think if I were going to try and make it better, I'd want to tackle how you have to put parentheses around every operator to protect order of operations. I think this would be really hard though, because of the way that Scala implements things and they way we've already leveraged Scala to use infix notation - it seems hard to further break it into allowing us to not have to use a lot of parentheses.
