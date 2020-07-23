

void setup(){
  size(600,600);
  fill(255, 0, 0, 100);
  ellipse (231, 285, 45, 45);
  fill(0, 255, 0, 100);
  ellipse (251, 282, 45, 45);
  fill(0,0,255, 100);
  ellipse (233, 257, 45, 45);
  

  
}

void draw(){
  
    
  if(mousePressed){
    println("mouse x " + mouseX + " and mouse y " + mouseY);
  }
  
  
}
