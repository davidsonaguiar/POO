package padroes_decorator.formatador;

public class RemoverNumerosDecorator implements FormatadorProtocol {
  
  private FormatadorProtocol formatador;
  
  public RemoverNumerosDecorator(FormatadorProtocol formatador) {
    if (formatador == null) {
      throw new IllegalArgumentException("Formatador não pode ser nulo");
    }
    this.formatador = formatador;
  }
  
  public String formatar(String texto) {
    return this.formatador.formatar(texto).replaceAll("[0-9]", "");
  }

}
