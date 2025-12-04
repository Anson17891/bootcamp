
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MSWord {
  private List<Character> characters;
  private Deque<Character> undoStack;
  private Deque<Character> redoStack;
  //Deque //!Excersice

  public MSWord(){
    this.characters = new LinkedList();
    this.undoStack = new LinkedList();
  }
  public void write(char c){
    this.characters.add(c);
  }

  public void undo(){
   this.undoStack.add(this.characters.getLast());
   this.characters.removeLast();
  }

  public void redo(){
    
  }
  
}
