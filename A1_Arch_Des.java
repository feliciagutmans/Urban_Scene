int i= 200;
int j=50;
int k=30;
int l=500;
int m=300;
int n=150;

void setup(){
  size(500,500);
  rectMode(CENTER);
}

void draw(){
  background(25,25,112);

//Roof
  fill(128,0,0);
  stroke(0,0,0);
  triangle(25,n,125,40,225,n);

//Ocean background
  fill(0, 26, 51);
  stroke(70,130,180);
  rect(0.5*width, 450,l ,m);

//Main House
  fill(153,101,21);
  stroke(0,0,0);
  rect(0.25*width, height/2,i,i);

//Windows
  fill(255,223,0);
  stroke(0,0,0);
  rect(0.15*width, height/2.5,j,j);
  rect(0.35*width, height/2.5,j,j);
  fill(30);
  rect(0.13*width, height/1.7,j,j);
  rect(0.37*width, height/1.7,j,j);

//Top left window frame
  stroke(128,0,0);
  line(75,175,75,225);
  line(50,i,100,i);
//Top right window frame
  line(175,175,175,225);
  line(150,i,i,i);

//Door
  stroke(0,0,0);
  fill(188,143,143);
  rect(0.25*width, height/1.5, 50, 100);

//Door Handle
  stroke(0,0,0);
  fill(218,165,32);
  ellipse(0.23*width, height/1.6, 10, 10);

//Moon
  fill(255,248,220);
  stroke(189,183,107);
  ellipse(0.85*width, height/6, n,n);

//Moon craters
  stroke(189,183,107);
  ellipse(0.75*width, height/6, k, k);
  ellipse(0.90*width, height/8, 10,10);
  ellipse(0.95*width, height/5,15,15);
  ellipse(0.85*width, height/4,20,20);
  ellipse(0.82*width, height/10,15,15);

//Stars
  ellipse(0.5*width, height/6,1,2);
  ellipse(0.4*width, height/9,1,2);
  ellipse(0.55*width, height/3,1,2);
  ellipse(0.65*width, height/5.5,1,2);
  ellipse(0.7*width, height/3.5,1,2);
  ellipse(0.7*width, height/2.5,1,2);
  ellipse(0.7*width, height/2.5,1,2);
  ellipse(0.9*width, height/2,1,2);
  ellipse(0.95*width, height/3,1,2);
  ellipse(0.95*width, height/3,1,2);
  ellipse(0.55*width, height/2,1,2);
  ellipse(0.1*width, height/6,1,2);
  ellipse(0.12*width, height/12,1,2);
  ellipse(0.6*width, height/13,1,2);

//Street
  fill(100,100,100);
  stroke(0,0,0);
  rect(0.5*width, 450,l ,i);
  rect(0.5*width, 450,l ,i);

//Small street wall
  fill(60);
  stroke(0,0,0);
  rect(0.5*width, 350,l ,k);

 //Gate
 fill(128,0,0);
 stroke(0,0,0);
 rect(0.25*width, height/1.45, 70, 40);
 line(150, 325, 150, 365);
 line(140, 325, 140, 365);
 line(130, 325, 130, 365);
 line(120, 325, 120, 365);
 line(110, 325, 110, 365);
 line(100, 325, 100, 365);

//Street Marks
  fill(218,165,32);
  stroke(225,225,153);
  rect(500,425,60,15);
  rect(400,425,60,15);
  rect(300,425,60,15);
  rect(200,425,60,15);
  rect(100,425,60,15);
  rect(0,425,60,15);

//Bushes
  fill(0,100,0);
  stroke(0,128,0);
  ellipse(0.15*width, height/1.5,50,70);
  ellipse(0.35*width, height/1.5,50,70);

//Streetlight
  fill(0,0,0);
  stroke(0,0,0);
  rect(0.85*width, height/1.8, 15, 175);
  arc(0.85*width, height/2.5, 50, 50, 0, PI+QUARTER_PI, PIE);
  fill(255,215,0,127);
   stroke(225,225,153);
  triangle(0.85*width, height/2.5, 350, 450, 250, 400);

}
