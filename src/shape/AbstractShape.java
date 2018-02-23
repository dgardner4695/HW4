package shape;


public abstract class AbstractShape implements Shape {

  int x, y;
  Color color;

  @Override
  public Color getColor() {
    return color;
  }

  @Override
  public void setColor(Color c) {
    this.color.set(c);
  }

  public void setColor(double r, double g, double b) {
    this.color.set(r, g, b);
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
}
