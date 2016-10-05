
+Main{
	run{
		PathName("/home/simdax/.local/share/SuperCollider/downloaded-quarks/SynthDefs-for-Patterns/")
		.files.do{arg x;
			if(x.extension=="scd")
			{x.absolutePath.postln.load}
		};
		 defer{ SynthDescLib.browse}
	}
}

