Proyecto Xlmn: 4.0.0

Root
{
	Path a
	Group c
	Artifact e
	Version 5.5.5
	Packaging RAR
	Dependencias[
			{
					Group d 
					Artifact e 
					Version 5.5.5
					Scope TEST
				}
			]
	Hijos [
		Hijo 1{
			Group c 			
			Artifact e
			Version 5.5.5
			Plugins[
				{ 
					Group d 
					Artifact f
					Version 5.5.5
				}
			]
		}
		Hijo 2{
			Group d
			Artifact f
			Version 5.5.5
			Packaging RAR
			Dependencias[
				{
					Group c 					
					Artifact e
					Version 5.5.5
					Scope TEST
				}
				
			]
		}
	]
}