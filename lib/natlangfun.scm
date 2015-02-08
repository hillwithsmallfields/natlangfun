;;;; natlangfun.scm --- natural language descriptions using functional programming
;;; Time-stamp: <2015-02-08 21:17:56 jcgs>

(define-module (natlangfun)
  )

(define-macro (language-description language-name own-name code scripts)
  "Describe a language which in the reference language is called
@var{language-name}.

If @var{language-name} is a list, it describes the language's place in
the tree of languages, with the specific language name coming first
and increasingly broad language families following.

The language's own name for itself is @var{own-name} (which, like the
reference name, may be a list; it, or any components of it, may be
arrays consisting of the word in the language's script and a
transliteration into Latin script).

If a name or name component will be read by Scheme as a symbol, it may
be given as a Scheme symbol.  Otherwise, it should be given as a
string.

The language's ISO 639-3 code is given as @var{code}.

The writing systems are described by @var{scripts}, which is a list of
lists of script-type and script-name.  If a third element is given for
a script description, it is a string containing the characters used in
that script, in their conventional sorting order for that language,
with spaces between them, and with symbols that share a place in the
sorting order grouped in square brackets.")
