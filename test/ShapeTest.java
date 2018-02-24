import helpers.Color;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import shape.Ellipse;
import shape.Rectangle;

public class ShapeTest {

  @Test
  public void ellipseGetRadiusCheck() {
    Ellipse e = new Ellipse("E",0, 0, 50, new Color(0.5, 0.5, 0.5));
    assertEquals(50, e.getRadius(), 0.0001);
  }

  @Test
  public void rectangleGetDimsCheck() {
    Rectangle r = new Rectangle("R", 0, 0, 50, 100, new Color(0.5, 0.5, 0.5));
    assertEquals(50, r.getWidth());
    assertEquals(100, r.getHeight());
  }

  @Test
  public void checkReferenceRect() {
    Rectangle r = new Rectangle("R", 0, 0, 50, 50, new Color(0,0,0));
    assertEquals("Bottom-Left Corner", r.getRefString());
  }

  @Test
  public void checkReferenceEllipse() {
    Ellipse e = new Ellipse("E", 0, 0, 50, new Color(0,0,0));
    assertEquals("Center", e.getRefString());
  }

  @Test
  public void checkScaleRect() {
    Rectangle r = new Rectangle("R", 0, 0, 50, 50, new Color(0,0,0));
    r.scale(0.5);
    assertEquals(25, r.getWidth());
    assertEquals(25, r.getHeight());
  }

  @Test
  public void checkScaleEllipse() {
    Ellipse e = new Ellipse("E", 0, 0, 50, new Color(0,0,0));
    e.scale(0.5);
    assertEquals(25, e.getRadius(), 0.0001);
  }

  @Test (expected = IllegalArgumentException.class)
  public void checkScaleInvalid() {
    Ellipse e = new Ellipse("E", 0, 0, 50, new Color(0,0,0));
    e.scale(-1);
  }
}
