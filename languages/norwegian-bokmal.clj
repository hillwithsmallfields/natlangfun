(language-description (Norwegian North-Germanic Germanic Indo-European)
		      Norsk 
		      NOB
		      ((latin alphabet
			      ["a" "b" "d" "e" "f" "g" "h" "i" "j" "k" "l" "m"
			       "n" "o" "p" "r" "s" "t" "u" "v" "y" "æ" "ø" "å"])))
(template response (reply expectation)
          (case resp
            affirmative (case expectation
                          affirmative "ja"
                          negative "jo")
            negative "nei"))
