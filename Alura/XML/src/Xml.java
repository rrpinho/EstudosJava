import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Xml 
{
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = fabrica.newDocumentBuilder();
        Document doc = builder.parse("src/vendas.xml");

        NodeList formasDePagamento = doc.getElementsByTagName("formaDePagamento");
        Element item = (Element) formasDePagamento.item(0);
        String forma = item.getTextContent();
        System.out.println(forma);

        NodeList nomeProduto = doc.getElementsByTagName("nome");
        for (int i = 0; i < nomeProduto.getLength(); i++)
        {
            Element np = (Element) nomeProduto.item(i);
            String nome = np.getTextContent();
            System.out.println(nome);
        }

        Element venda = doc.getDocumentElement();
        System.out.println("Moeda: "+venda.getAttribute("moeda"));

        NodeList produtos = doc.getElementsByTagName("produto");
        for (int i = 0; i < produtos.getLength(); i++)
        {
            Element p = (Element) produtos.item(i);
            String nomep = p.getElementsByTagName("nome").item(0).getTextContent();
            Double preco = Double.parseDouble(p.getElementsByTagName("preco").item(0).getTextContent());
            Produto product = new Produto(nomep, preco);
            System.out.println(product);
        }
    }
}
