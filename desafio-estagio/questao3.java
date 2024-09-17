import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FaturamentoDistribuidora {
    public static void main(String[] args) throws IOException {
        String json = new String(Files.readAllBytes(new File("faturamento.json").toPath()));
        JSONArray faturamentoArray = new JSONArray(json);

        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;
        int diasAcimaDaMedia = 0;

        for (int i = 0; i < faturamentoArray.length(); i++) {
            JSONObject dia = faturamentoArray.getJSONObject(i);
            double valor = dia.getDouble("faturamento");
            if (valor > 0) {
                menorValor = Math.min(menorValor, valor);
                maiorValor = Math.max(maiorValor, valor);
                soma += valor;
                diasComFaturamento++;
            }
        }

        double mediaMensal = soma / diasComFaturamento;

        for (int i = 0; i < faturamentoArray.length(); i++) {
            JSONObject dia = faturamentoArray.getJSONObject(i);
            double valor = dia.getDouble("faturamento");
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Dias acima da média: " + diasAcimaDaMedia);
    }
}
