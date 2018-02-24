package shape;


import helpers.Color;

public abstract class AbstractShape implements Shape {

  int x, y;
  int appears = -1;
  int disappears = -1;
  Color color;
  String name;

  @Override
  public Color getColor() {
    return this.color;
  }

  @Override
  public void setColor(Color c) {
    this.color.set(c);
  }

  @Override
  public int getX() {
    return this.x;
  }

  @Override
  public int getY() {
    return this.y;
  }

  @Override
  public void setX(int newX) {
    this.x = newX;
  }

  @Override
  public void setY(int newY) {
    this.y = newY;
  }

  @Override
  public void setAppears(int newT) {
    this.appears = newT;
  }

  @Override
  public void setDisappears(int newT) {
    this.disappears = newT;
  }

  @Override
  public int getAppears() {
    return this.appears;
  }

  @Override
  public int getDisappears() {
    return this.disappears;
  }

  @Override
  public String getName() {
    return this.name;
  }
}
