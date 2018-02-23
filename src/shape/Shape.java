package shape;

public interface Shape {

  Color getColor();
  void setColor(Color c);

  int getX();
  int getY();
  void setX(int newX);
  void setY(int newY);

  void scale(double factor);


}
