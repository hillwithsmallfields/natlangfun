(language-description (Albanian Indo-European)
		      Shqip
		      ALN
		      ((latin alphabet
			      ["a" "b" "c" "ç" "d" "dh" "e" "ë" "f" "g" "gj" 
			       "h" "i" "j" "k" "l" "ll" "m" "n" "nj" "o" "p" 
			       "q" "r" "rr" "s" "sh" "t" "th" "u" "v" "x" "xh"
			       "y" "z" "zh"])))

(template pronoun [pronoun-case person number gender]
	  (case pronoun-case
	     	nominative (case number
	     		   	 singular (case person
				 	  	1 "unë"
						2 "ti"
						3 (case gender
						  	masculine "ai"
							feminine "ajo"))
				  plural (case person
				  	       1 "ne"
					       2 "ju"
					       3 (case gender
					       	       masculine "ata"
						       feminine "ato")))))

							
;; negative verb: nuk or s' before verb
