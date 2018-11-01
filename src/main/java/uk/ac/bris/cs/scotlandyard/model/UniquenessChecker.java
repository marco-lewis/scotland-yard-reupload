package uk.ac.bris.cs.scotlandyard.model;

import java.util.Set;
import java.util.HashSet;
import static java.util.Objects.requireNonNull;

class UniquenessChecker<V>{
  //The set which unique items are added to
  private Set<V> set;

  //Creates an initial empty set
  UniquenessChecker(){
    set = new HashSet<V>();
  }

  //Adds an item to the set if it is unique, otherwise sends error
  public void addUniqueItem(V item){
    if (set.contains(requireNonNull(item))){
      throw new IllegalArgumentException("Invalid player");
    }
    set.add(item);
  }

}
