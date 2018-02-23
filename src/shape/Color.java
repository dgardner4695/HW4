package shape;

public class Color {
  private double r, g, b;

  public Color(double r, double g, double b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }

  public double getR() {
    return this.r;
  }

  public double getG() {
    return this.g;
  }

  public double getB() {
    return this.b;
  }

  public void setR(double newR) {
    this.r = newR;
  }

  public void setB(double b) {
    this.b = b;
  }

  public void setG(double g) {
    this.g = g;
  }

  public void set(double newR, double newG, double newB) {
    this.r = newR;
    this.g = newG;
    this.b = newB;
  }

  public void set(Color c) {
    this.r = c.getR();
    this.g = c.getG();
    this.b = c.getB();
  }
}
