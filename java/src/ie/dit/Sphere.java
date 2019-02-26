package ie.dit;
import processing.core.*;
import processing.data.*;

class Sphere
{
    float sphereSize;
    float rotate;

  
    Sphere(float s, float r)
    {
        sphereSize = s;
        rotate = r;
    }
  
    void update()
    {
        sphereSize = 80;
        rotate= 20 * radians(t += (TWO_PI / 360));
    
        rotateY(rotate);
        sphere(sphereSize);
    }
}