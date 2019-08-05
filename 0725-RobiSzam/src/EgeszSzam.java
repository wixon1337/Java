public class EgeszSzam extends Szam {

  public EgeszSzam(String value) {
    super(value);
    if (value.contains(".")) {
      throw new IllegalArgumentException();
    }
  }

  @Override
  public String toString() {
    return Long.toString(Math.round(this.getValue()));
  }
}
