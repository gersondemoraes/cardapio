import com.google.gson.Gson;
import mx.florinda.cardapio.ItemCardapio;

import java.math.BigDecimal;

import static mx.florinda.cardapio.ItemCardapio.CategoriaCardapio;

public class MainClass {

    public static void main(String[] args) {

        ItemCardapio refrescoChaves = new ItemCardapio(1L, "Refresco do Chaves", """
                Suco de limão, que parece tamarindo, mas tem gosto de groselha""",
                CategoriaCardapio.BEBIDAS, new BigDecimal("2.99"), null);

        Gson gson = new Gson();
        System.out.println(gson.toJson(refrescoChaves));
    }
}
