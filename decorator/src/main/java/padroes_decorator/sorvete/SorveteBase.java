package padroes_decorator.sorvete;

public class SorveteBase implements SorveteProtocol {
  
  private String name;
  private double price;
  
  public SorveteBase(String name, double price) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Nome do sorvete não pode ser nulo ou vazio");
    }
    this.name = name;
    this.price = price;
  }
  
  public String getName() {
    return this.name;
  }
  
  public double getPrice() {
    return this.price;
  }
  
  public String toString() {
    return this.name + " - R$" + this.price;
  }
  
}
