package it.beccaria.petstore.provini;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class MagistratoToJson {

	static ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			List<Magistrato> elle = new ArrayList<>();

			Magistrato m1 = new Magistrato();
			m1.setNome("Maria");
			m1.setCognome("Rossi");
			elle.add(m1);

			Magistrato m2 = new Magistrato();
			m2.setNome("Gianni");
			m2.setCognome("Bella");
			elle.add(m2);

			Content c = new Content();
			c.setMagistratoList(elle);

			String output = mapper.writeValueAsString( c);


           System.out.println(output);


		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
