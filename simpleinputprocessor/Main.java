import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    String searchForRoom;

    Scanner scanner = new Scanner (System.in);
    System.out.print("Do you want to rent a room?");  
    searchForRoom = scanner.next();

    int roomNum = 1;
    int newRoom = 1;

    if (searchForRoom.equals("yes")) {  
      roomNum = roomNum + newRoom;
      System.out.println("We have " + roomNum + " rooms availible. You will be fitted into a room.");
    } else if (searchForRoom.equals("Yes")) {  
      roomNum = roomNum + newRoom;
      System.out.println("We have " + roomNum + " rooms availible. You will be fitted into a room.");
    }  else if (searchForRoom.equals("no")) {  
      System.out.println("Okay. That is fine.");
    }  else if (searchForRoom.equals("No")) {  
      System.out.println("Okay. That is fine.");
    }
  }
}
