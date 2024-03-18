package padroes_decorator.formatador;

public class TrimDecorator implements FormatadorProtocol {
  
  private FormatadorProtocol formatador;
  
  public TrimDecorator(FormatadorProtocol formatador) {
    if (formatador == null) {
      throw new IllegalArgumentException("Formatador não pode ser nulo");
    }
    this.formatador = formatador;
  }
  
  public String formatar(String texto) {
    return this.formatador.formatar(texto).trim();
  }

}
