PImage cat;
void setup() {
  
  cat = loadImage ("cat.jpeg");
  size (800,600);
  cat.resize(width,height);
}

void draw() {
  background(cat);
  if (mousePressed){ println(mouseX, mouseY);
  }
  fill (#FFFFFF);
  ellipse(222,239,150,75);
  fill (0);
  ellipse (mouseX,mouseY,30,30);
 
  fill (#FFFFFF);
  ellipse (513,227,150,75);
  
  fill (0);
  ellipse (mouseX + 291,mouseY -12 ,30,30);
 
}
