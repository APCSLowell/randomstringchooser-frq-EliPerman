import java.util.*;
public class RandomStringChooser
{
  protected ArrayList<String> arr;

  public RandomStringChooser(String[] list){
    arr = new ArrayList<String>();
    for (String word : list) arr.add(word);
  }

  public String getNext(){
    if (arr.size() == 0) return "NONE";
    int i = (int)(Math.random()*arr.size());
    String temp = arr.get(i);
    arr.remove(i);
    return temp;
  }
}
