package animation;

import shape.Shape;

public interface Animation {

  void draw();

  void add(Shape s);

  void clear();

  void redraw();

  void addAnim(int t_start, int t_end);

  String show();

}
