package padroes_decorator;

import padroes_decorator.sorvete.SorveteProtocol;
import padroes_decorator.sorvete.SorveteBase;
import padroes_decorator.sorvete.CoberturaDecorador;
import padroes_decorator.sorvete.FrutasDecorador;

import padroes_decorator.formatador.CaixaAltaDecorator;
import padroes_decorator.formatador.FormatadorBase;
import padroes_decorator.formatador.FormatadorProtocol;
import padroes_decorator.formatador.RemoverCaracteresEspeciaisDecorator;
import padroes_decorator.formatador.RemoverNumerosDecorator;
import padroes_decorator.formatador.TrimDecorator;

public class Main {
  public static void main(String[] args) {
    
    SorveteProtocol sorvete = new SorveteBase("Sorvete de Chocolate", 5.0);
    sorvete = new FrutasDecorador(sorvete, "Morango", 2.0);
    sorvete = new FrutasDecorador(sorvete, "Banana", 2.0);
    sorvete = new CoberturaDecorador(sorvete, "Caramelo", 1.0);
    System.out.println(sorvete);

    String texto = "*/ Exemplo1 $%";
    FormatadorProtocol formatador = new FormatadorBase();
    formatador = new CaixaAltaDecorator(formatador);
    formatador = new TrimDecorator(formatador);
    formatador = new RemoverCaracteresEspeciaisDecorator(formatador);
    formatador = new RemoverNumerosDecorator(formatador);
    System.out.println(formatador.formatar(texto));

  }
}