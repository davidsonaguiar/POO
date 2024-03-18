package padroes_decorator.formatador;

public class RemoverCaracteresEspeciaisDecorator implements FormatadorProtocol {
  
  private FormatadorProtocol formatador;
  
  public RemoverCaracteresEspeciaisDecorator(FormatadorProtocol formatador) {
    if (formatador == null) {
      throw new IllegalArgumentException("Formatador não pode ser nulo");
    }
    this.formatador = formatador;
  }
  
  public String formatar(String texto) {
    return this.formatador.formatar(texto).replaceAll("[^a-zA-Z0-9]", "");
  }

}
