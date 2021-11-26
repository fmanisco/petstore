package it.beccaria.petstore.provini;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class JsonToMagistrato {

	static ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,
                    false);

			// Convert JSON string from file to Object
			Content content = mapper.readValue(new File("C:/_lavoro/_esecuzione/task-storie/gestione-richieste-intervento/mock-x-tipologiche/magistrati.json"), Content.class);

			System.out.println();
			System.out.println("INSERT ALL");
            for(Magistrato m: content.getMagistratoList()) {
            	System.out.println("INTO MAGISTRATO (ID,NOME,COGNOME) VALUES (" + m.getId() + ",'" + m.getNome() +"','" + m.getCognome() +"')");
            }
			System.out.println("SELECT 1 FROM DUAL;");

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
