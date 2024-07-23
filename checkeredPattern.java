public class checkeredPattern {

  public static void main(String[] args) {
    char[][] array = new char[][] {
    {'■', '□', '■'},{'□', '■', '□'},{'■', '□', '■'}
    };
      for(int i = 0; i < array.length; i++) {
        for(int j = 0; j < array[i].length; j++) {
          if(j != array[i].length - 1) {
            System.out.print(array[i][j]);
          } else {
            System.out.println(array[i][j]);
          }
        }
      }
  }
}
