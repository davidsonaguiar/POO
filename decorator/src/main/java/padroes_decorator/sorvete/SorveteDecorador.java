package padroes_decorator.sorvete;

public abstract class SorveteDecorador implements SorveteProtocol {
  
  protected final SorveteProtocol sorvete;
  protected final String name;
  protected final double price;

  public SorveteDecorador(SorveteProtocol sorvete, String name, double price) {
    this.sorvete = sorvete;
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return this.sorvete.getName() + " + " + this.name;
  }

  public double getPrice() {
    return this.sorvete.getPrice() + this.price;
  }

  public String toString() {
    return this.getName() + " - R$" + this.getPrice();
  }

}
