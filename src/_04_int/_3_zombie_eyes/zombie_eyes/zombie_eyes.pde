PImage face;
void setup() {
 face = loadImage("face.jpg");
size(500,500 );
face.resize(500, 500);
image(face, 0, 0);

}
void draw() {
println(mouseX);
println(mouseY);
fill (12, 26, 247);
ellipse (119,275, 30, 30);
ellipse (363,264, 30, 30);
fill (#080808);
ellipse (362,256, 10, 10);
ellipse (117,272, 10, 10);
fill (#FA0317);
rect (144,390, 200, 30);
}
