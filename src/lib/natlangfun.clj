;;;; natlangfun.clj --- natural language descriptions using functional programming
;;; Time-stamp: <2015-05-06 21:53:31 jcgs>

(ns natlangfun.core)

(defrecord language
    [
     reference-name
     own-name
     iso-code
     scripts
     templates
     vocabulary
     ])

(defmacro language-description
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
  a script description, it is a vector containing the characters used in
  that script, in their conventional sorting order for that language, as
  strings, with symbols that share a place in the sorting order grouped
  in square brackets in the same string."
  [language-name own-name code scripts])

(defmacro template
  "Define a template for a language construct, to be filled in with the given parts."
  [template-name template-parameters & templated-parts])

;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; word database lookups ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn [word-translation word]
  ;; todo: translation database lookup
  )

(defn [gender-of noun]
  ;; todo: translation database lookup
  )

;;;;;;;;;;;;;
;; joining ;;
;;;;;;;;;;;;;

(defn [words & word-containers]
  ;; todo: traverse word-containers, flattening it, concatenating the strings with spaces inbetween?  Or should I leave it as a list (perhaps just flatten it?)
  )

;;;;;;;;;;;;;;;;;;;;;;;
;; top-level drivers ;;
;;;;;;;;;;;;;;;;;;;;;;;

(defn [translate structure]
  ;; todo: translate the words of STRUCTURE
  )

;;;;;;;;;;;;;;;;;;;;;;;;
;; vocabulary reading ;;
;;;;;;;;;;;;;;;;;;;;;;;;

(defn [read-vocabulary vocab-file]
  (let [raw-maps (parse-csv (slurp vocab-file))]
    ))
