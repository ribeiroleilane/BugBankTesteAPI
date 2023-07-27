import static io.restassured.RestAssured.get;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CepTestes {

	@BeforeClass
	public static void testCep() {
		RestAssured.baseURI = "https://viacep.com.br/ws";
	}

	@Test
	public void testCepValido() {
		Response response = get("/12237140/json");
		response.then().statusCode(200);
		String bodyResponse = response.asPrettyString();
		assertTrue(bodyResponse.contains("Rua Professor Francisco Pereira da Silva"));
	}

	@Test
	public void testCepInvalido() {
		Response response = get("/00000000/json");
		response.then().statusCode(200);
		String bodyResponse = response.asPrettyString();
		assertTrue(bodyResponse.contains("erro"));
	}
}