package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //TODO implementace domácího úkolu

//    // dal pisu cykl pro tvorbu  tela
//    zofka.turnRight(90);
//    for (int i = 0; i < 2; i++) {
//      zofka.penDown();
//      zofka.move(150);
//      zofka.turnRight(90);
//      zofka.move(100);
//      zofka.turnRight(90);
//    }
//
//    //dal jde cumacek
//    zofka.turnRight(180);
//    zofka.turnLeft(30);
//    zofka.move(100);
//    zofka.turnLeft(120);
//    zofka.move(100);
//
//    //jdu na predni nohy
//    zofka.turnRight(30);
//    zofka.move(50);
//    zofka.turnRight(180);
//    zofka.move(50);
//    zofka.turnLeft(110);
//    zofka.move(50);
//
////presouvam se do zadni casti tela
//    zofka.penUp();
//    zofka.turnLeft(180);
//    zofka.move(50);
//    zofka.turnRight(50);
//    zofka.move(150);
//
////kreslim zadni nohy
//    zofka.penDown();
//    zofka.turnRight(50);
//    zofka.move(50);
//    zofka.turnRight(180);
//    zofka.move(50);
//    zofka.turnLeft(110);
//    zofka.move(50);
//    zofka.penUp();
//    zofka.turnLeft(180);
//    zofka.move(50);
//    zofka.turnLeft(30);
//    zofka.move(100);
//    zofka.turnRight(100);
//
////kreslim ocas
//    zofka.penDown();
//    zofka.move(20);
//    for (int i = 0; i < 3; i++) {
//      zofka.turnLeft(60);
//      zofka.move(15);
//    }
//    for (int i = 0; i < 2; i++) {
//      zofka.turnLeft(100);
//      zofka.move(15);
//    }
//    for (int i = 0; i < 3; i++) {
//      zofka.turnLeft(60);
//      zofka.move(15);
//    }
//    zofka.penUp();
//    zofka.turnRight(20);
//    zofka.move(100);

//kreslim slunce
    zofka.turnRight(20);
    for (int i = 0; i < 12; i++) {
      zofka.penDown();
      zofka.move(25);
      zofka.turnLeft(75);
      zofka.move(25);
      zofka.turnRight(180);
      zofka.move(25);
      zofka.turnLeft(75);

    }
    zofka.turnRight(-20);

    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(25);
    zofka.penDown();
    zofka.move(5);
    zofka.penUp();
    zofka.move(35);
    zofka.penDown();
    zofka.move(5);
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(25);
    zofka.penDown();
    for (int i = 0; i < 3; i++) {
      zofka.turnRight(60);
      zofka.move(15);
      zofka.turnLeft(30);
    }
    //kolo
    zofka.penUp();
    zofka.move(200);
    zofka.penDown();
      for (int i = 0; i < 18; i++) {
          zofka.turnRight(20);
          zofka.move(20);}
//romb
          zofka.penUp();
          zofka.turnLeft(90);
          zofka.move(150);
zofka.penDown();
      for (int i = 0; i < 8; i++) {
          zofka.turnRight(45);
          zofka.move(40);
      }
  //posouvam zelvu
  zofka.penUp();
  zofka.turnLeft(90);
      zofka.move(100);



  }

}
