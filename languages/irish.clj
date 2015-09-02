(language-description (Irish Goidelic Celtic Indo-European)
		      Gaeilge
		      GLE
		      ((latin alphabet
			      ["[aá]" "b" "c" "d" "[eé]" "f" "g" "h" "[ií]"
			       "l" "m" "n" "[oó]" "p" "r" "s" "t" "[uú]"])))

(template definite-article-for [noun noun-case noun-number]
          ;; http://www.bitesizeirishgaelic.com/blog/the-definite-article-in-irish-part-1/
          (case noun-number
            singular "an"
            plural "na"))

(template articled-noun [noun article-type noun-case noun-number]
          ;; http://www.bitesizeirishgaelic.com/blog/the-definite-article-in-irish-part-1/
          )

(template statement [subject verb object]
	  (words verb subject object))

(template noun-phrase [definite noun-case noun-number noun adjectives]
          (noun adjectives))
