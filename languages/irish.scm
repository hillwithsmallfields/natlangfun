(language-description (Irish Goidelic Celtic Indo-European)
		      Gaeilge
		      GLE
		      ((latin alphabet
			      ["[aá]" "b" "c" "d" "[eé]" "f" "g" "h" "[ií]"
			       "l" "m" "n" "[oó]" "p" "r" "s" "t" "[uú]"])))

(template (statement subject verb object)
	  (words verb subject object))

(template (noun-phrase noun adjectives)
	  ;; todo: how do I pass the case in?  Fake a dynamic environment by passing it around?
	  )
