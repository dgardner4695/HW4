package shape;

public class Ellipse extends AbstractShape {

  private double radius;

  public Ellipse(int x,
                 int y,
                 int radius,
                 Color c) {
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.color = c;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double newRadius) {
    this.radius = newRadius;
  }

  @Override
  public void scale(double factor) {
    double newRadius = this.getRadius() * factor;
    setRadius(newRadius);
  }
}
