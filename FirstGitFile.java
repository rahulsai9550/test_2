import java.util.Scanner;
class FirstGitFile{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    if(s.equals("first")){
      System.out.println("This is the 1st committed file");
    }
    else{
      System.out.println("Not the 1st committed file");
    }
  }
}
