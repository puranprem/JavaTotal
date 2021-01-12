package com.talento.java.MapaDeHashmatique;

import java.util.HashMap;

public class MapaDeHashmatique {
	
	void hasmatique () {
	HashMap <String, String> cancionMap = new HashMap<String, String>();
	
    cancionMap.put("Ardas","Amardas bahe, Amardas guru, Ramdas Guru, Amradas bhee...");
    cancionMap.put("Adi Mantra", "Ong namo guru dev namo, ong namo guru deva...");
    cancionMap.put("Mul mantra", "Ek oong kar sat nam, karta pur nibaho nirber, akal muret ayuni...");
    cancionMap.put("Shabad Hazare","Mera Man Lochai gur darshan taa-ee Bilap karay chaatrik kee ni-aa-ee");
    
    String cancion = cancionMap.get("Mul mantra");
     
    
         System.out.println(cancion);
     }


}

// Agregue al menos 4 canciones a su trackList HashMap y después obtenga uno por su nombre. 
//También quieren poder ver las letras que les siguen inmediatamente.