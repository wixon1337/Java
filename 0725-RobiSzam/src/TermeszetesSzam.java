public class TermeszetesSzam extends Szam {

  public TermeszetesSzam(String value) {
    super(value);
    if (this.getValue() < 0) {
      throw new IllegalArgumentException();
    }
  }

  @Override
  public String toString() {
    return Long.toString(Math.round(this.getValue()));
  }
}
