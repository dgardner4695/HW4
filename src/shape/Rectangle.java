package shape;

import helpers.Color;

public class Rectangle extends AbstractShape {

  private int width, height;

  public Rectangle(String name,
                   int x,
                   int y,
                   int width,
                   int height,
                   Color c) {
    this.name = name;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.color = c;
  }

  public void setWidth(int newW) {
    this.width = newW;
  }

  public void setHeight(int newH) {
    this.height = newH;
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  @Override
  public void scale(double factor) throws IllegalArgumentException {
    if (factor <= 0) {
      throw new IllegalArgumentException("Factor must be > 0");
    }
    int newW = (int)(this.width * factor);
    int newH = (int)(this.height * factor);
    this.setHeight(newH);
    this.setWidth(newW);
  }

  @Override
  public String toString() {
    return "rectangle";
  }

  @Override
  public String getRefString() {
    return "Bottom-Left Corner";
  }
}
