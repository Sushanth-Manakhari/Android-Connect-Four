package com.sushanthmanakhari.connectfour;

/**
 * Created by Sushanth Manakhari on 05/10/2015.
 */
public class Cell {
  public boolean empty;
  public Board.Turn player;

  public Cell() {
    empty = true;
  }

  public void setPlayer(Board.Turn player) {
    this.player = player;
    empty = false;
  }
}
