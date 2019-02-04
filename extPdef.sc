+ Pdef {
	*allPhrases{|phrasePrefix='phr_'|
		^this.all.keys.reject{|pdefname|
			var sliceTo = phrasePrefix.asString.size-1;

			pdefname.asString[0..sliceTo] != phrasePrefix.asString;

		}.asArray
	}

}
