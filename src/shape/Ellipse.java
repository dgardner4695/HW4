package shape;

import helpers.Color;

public class Ellipse extends AbstractShape {

  private double radius;

  public Ellipse(String name,
                 int x,
                 int y,
                 int radius,
                 Color c) {
    this.name = name;
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
  public void scale(double factor) throws IllegalArgumentException {
    if (factor <= 0) {
      throw new IllegalArgumentException("Factor must be > 0");
    }
    double newRadius = this.getRadius() * factor;
    setRadius(newRadius);
  }

  @Override
  public String toString() {
    return "ellipse";
  }

  @Override
  public String getRefString() {
    return "Center";
  }
}
