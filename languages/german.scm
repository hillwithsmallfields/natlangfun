(language-description (German West-Germanic Germanic Indo-European)
		      Deutsch
		      DEU
		      ((latin alphabet
			      ["[aä]" "b" "c" "d" "e" "f" "g" "h" "i" "j" "k"
			       "l" "m" "n" "[oö]" "p" "q" "r" "[sß]" "t"
			       "[uü]" "v" "w" "x" "y" "z"])))

(template definite-article-for (noun noun-case noun-number)
	  (case number
	    ((plural) (case noun-case
			((nominative accusative) "die")
			((genitive) "der")
			((dative) "den"))
	     ((singular) (case (gender-of noun) 
			   (masculine (case noun-case
					((nominative)  "der")
					((accusative) "den")
					((genitive) "des")
					((dative) "dem")))
			   (feminine (case noun-case
				       ((nominative accusative) "die")
				       ((genitive dative) "der")))
			   (neuter (case noun-case
				     ((nominative accusative) "das")
				     ((genitive)  "des")
				     ((dative) "dem"))))))))

(template noun-phrase (definite noun-case noun-number noun adjectives)
	  (if definite
	      (words (definite-article-for noun noun-case noun-number)
		     adjectives
		     noun)
	      (words adjectives
		     noun)))

(template (statement subject verb object)
	  (words (nominative subject) (person-number verb) (accusative object) "."))
