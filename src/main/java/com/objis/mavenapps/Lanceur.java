package com.objis.mavenapps;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Lanceur {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		Employe employe1 = new Employe("Frédéric", "Batault");
		File resultFile = new File("employe.json");
		mapper.writeValue(resultFile, employe1);
	}


}
