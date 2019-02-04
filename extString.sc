/*

extString.sc
2019-02-04
By: Mads Kjeldgaard, mail@madskjeldgaard.dk

*/
+ String{
	// Loading stuff
	loadMax{
        "open -a Max %".format(this).unixCmd;
    }

	loadReaper{
		"open -a Reaper64 %".format(this).unixCmd;
	}

	// Postln with a time prefix
	postt{
		"[%] % ".format(Date.getDate.format("%H:%M:%S"), this).postln;
	}
}
