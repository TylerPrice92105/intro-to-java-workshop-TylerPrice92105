PImage face ;
PImage tash ;
void setup() {
  size(500,500);
  face = loadImage("Face.jpg");
  face.resize(width, height);
  tash = loadImage("Fake-Moustache-PNG-File.png");
  tash.resize(200, 100);  
background(face);
}
void draw(){
background(face);
 image(tash,mouseX,mouseY);

}