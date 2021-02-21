import java.util.*;

public class Medianof3PivotSelector implements PivotSelector{
  


  public int choosePivotIndex(int[] array, int first, int last) {
    int middle = (first + last)/2;

    /*Is the first value less than the middle and the last values*/
    if (array[first] < array[middle] && array[first]< array[last] ){
      if (array[middle]< array[last]){
        return middle;
      }else {
        return last;
      }

    /* is the middle value less than the first and last values*/
    }else if (array[middle]< array[first] && array[middle]< array[last]){
      if (array[first]< array[last]){
        return first;
      }else {
        return last;
      }

    /*is the last value less than the first and middle values*/  
    } else if (array[last]< array[first] && array[last]< array[middle]){
      if (array[first]< array[middle]){
        return first;
      } else{
        return middle;
      }
    } else {
      System.out.println("This shouldn't be happeneing");
      return 1;
    }

           
  }
}
