import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONRead {

    JSONArray jsonArray;
    JSONParser parser;
    Faturamento fat;
    public JSONRead(){
        parser = new JSONParser();
    }

    int cont;
    int dia;
    double valor;
    public void convertJson(){
        try {
            //Salva no objeto JSONArray o que o parse tratou do arquivo
            jsonArray = (JSONArray) this.parser.parse(new FileReader(
                    "src/file.json"));

            //Percorre o array de objetos e salva nas variáveis os dados retirados de cada objeto
            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                valor = (Double) jsonObject.get("valor");
                dia = ((Long) jsonObject.get("dia")).intValue();
                cont = cont + 1;

                fat = new Faturamento(dia,valor,cont);
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        } catch (
                ParseException e) {
            e.printStackTrace();
        }
    }
}
