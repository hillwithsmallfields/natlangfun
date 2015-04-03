(language-description (English West-Germanic Germanic Indo-European)
		      English
		      ENG
		      ((latin alphabet 
			      ["a" "b" "c" "d" "e" "f" "g" "h" "i" "j" "k" "l"
			       "m" "n" "o" "p" "q" "r" "s" "t" "u" "v" "w" "x"
			       "y" "z"])))

(template articled-noun (noun article-type noun-case noun-number)
          (words "the" noun))

(template definite-article-for (noun noun-case noun-number)
          "the")

(template statement (subject verb object)
	  (words (nominative subject) (person-number verb) (accusative object) "."))

(template noun-phrase (definite noun-case noun-number noun adjectives)
	  (words adjectives noun))

(template verb-phrase (verb adverbs)
	  (words verb adverbs))
