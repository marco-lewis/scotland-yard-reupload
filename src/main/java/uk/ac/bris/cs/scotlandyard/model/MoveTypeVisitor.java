package uk.ac.bris.cs.scotlandyard.model;

class MoveTypeVisitor implements MoveVisitor{
  //The type of a visited move, described below
  private int typeNumber;

  //Creates the visitor with no specific type
  public MoveTypeVisitor(){
    typeNumber = 0;
  }

  //Returns the type number
  public int getType(){
    return typeNumber;
  }

  //Sets type number to 1 if a PassMove
  @Override
  public void visit(PassMove move){
    typeNumber = 1;
  }

  //Sets type number to 2 if a TicketMove
  @Override
  public void visit(TicketMove move){
    typeNumber = 2;
  }

  //Sets type number to 2 if a DoubleMove
  @Override
  public void visit(DoubleMove move){
    typeNumber = 3;
  }
}
