public abstract class Szam implements Pozitiv, Negativ, Paross, Paratlan {

//  private final Long value;
  private Double value;

  private Double im;

  Szam(String value) {
    try {
      this.value = Double.parseDouble(value);
    } catch (NumberFormatException e) {
      if (value.contains("i")) {

      }
    }
  }

  public Double getValue() {
    return value;
  }

  @Override
  public boolean isPozitiv() {
    return this.value >= 0;
  }

  @Override
  public boolean isNegativ() {
    return this.value < 0;
  }

  @Override
  public boolean isParatlan() {
    return this.value % 2 != 0;
  }

  @Override
  public boolean isParos() {
    return this.value % 2 == 0;
  }

  @Override
  public String toString() {
    return Double.toString(this.value);
  }
}
