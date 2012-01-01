import processing.core.*;

public class test02 extends PApplet{
	float t;
  public void setup() {
	    size(200,200);
	    background(0);
	    t = 0;
  }

  public void draw() {
    stroke(255);
    background(0);
    if (mousePressed) {
      line(t,noise(t)*100,pmouseX,pmouseY);
      t+=0.1;
    }
  }
}