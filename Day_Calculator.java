/* You are using Day Calculator.
   For using this calculator, input the date
   in separate lines in the format DD/MM/YYYY.
   The day will be printed after calculations.
*/

import java.util.Scanner;

class DC {

  static void CheckDay(int x) {
    int y = x % 7;
    switch (y) {
      case 0:
        System.out.println("The Day Is Sunday.");
        break;
      case 1:
        System.out.println("The Day Is Monday.");
        break;
      case 2:
        System.out.println("The Day Is Tuesday.");
        break;
      case 3:
        System.out.println("The Day Is Wednesday.");
        break;
      case 4:
        System.out.println("The Day Is Thursday.");
        break;
      case 5:
        System.out.println("The Day Is Friday.");
        break;
      case 6:
        System.out.println("The Day Is Saturday.");
        break;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the date.");
    int a = scanner.nextInt();
    System.out.println("Enter the month.");
    int b = scanner.nextInt();
    System.out.println("Enter the year.");
    int c = scanner.nextInt();
    if (c < 1) {
      System.out.println("Error In Input.");
      System.exit(0);
    }
    int d = b - 1;
    int e = c - 1;
    int f = c % 4;
    int g = c % 100;
    int h = c % 400;
    int i = e % 400;
    int j = (i - (i % 4)) / 4;
    int k = (i - (i % 100)) / 100;
    int l = i + j - k;
    int m;
    switch (d) {
      case 0:
        if (a < 0 || a > 31) {
          System.out.println("Error In Input.");
        } else {
          m = a + l;
          CheckDay(m);
        }
        break;
      case 1:
        if (a < 0) {
          System.out.println("Error In Input.");
        } else if (c == 0 && a > 29) {
          System.out.println("Error In Input.");
        } else if (c != 0 && a > 28) {
          System.out.println("Error In Input.");
        } else {
          m = a + 3 + l;
          CheckDay(m);
        }
        break;
      case 2:
        if (a < 0 || a > 31) {
          System.out.println("Error In Input.");
        } else {
          if ((f == 0 && g != 0) || h == 0) {
            m = a + 4 + l;
            CheckDay(m);
          } else {
            m = a + 3 + l;
            CheckDay(m);
          }
        }
        break;
      case 3:
        if (a < 0 || a > 30) {
          System.out.println("Error In Input.");
        } else {
          if ((f == 0 && g != 0) || h == 0) {
            m = a + 7 + l;
            CheckDay(m);
          } else {
            m = a + 6 + l;
            CheckDay(m);
          }
        }
        break;
      case 4:
        if (a < 0 || a > 31) {
          System.out.println("Error In Input.");
        } else {
          if ((f == 0 && g != 0) || h == 0) {
            m = a + 9 + l;
            CheckDay(m);
          } else {
            m = a + 8 + l;
            CheckDay(m);
          }
        }
        break;
      case 5:
        if (a < 0 || a > 30) {
          System.out.println("Error In Input.");
        } else {
          if ((f == 0 && g != 0) || h == 0) {
            m = a + 12 + l;
            CheckDay(m);
          } else {
            m = a + 11 + l;
            CheckDay(m);
          }
        }
        break;
      case 6:
        if (a < 0 || a > 31) {
          System.out.println("Error In Input.");
        } else {
          if ((f == 0 && g != 0) || h == 0) {
            m = a + 14 + l;
            CheckDay(m);
          } else {
            m = a + 13 + l;
            CheckDay(m);
          }
        }
        break;
      case 7:
        if (a < 0 || a > 31) {
          System.out.println("Error In Input.");
        } else {
          if ((f == 0 && g != 0) || h == 0) {
            m = a + 17 + l;
            CheckDay(m);
          } else {
            m = a + 16 + l;
            CheckDay(m);
          }
        }
        break;
      case 8:
        if (a < 0 || a > 30) {
          System.out.println("Error In Input.");
        } else {
          if ((f == 0 && g != 0) || h == 0) {
            m = a + 20 + l;
            CheckDay(m);
          } else {
            m = a + 19 + l;
            CheckDay(m);
          }
        }
        break;
      case 9:
        if (a < 0 || a > 31) {
          System.out.println("Error In Input.");
        } else {
          if ((f == 0 && g != 0) || h == 0) {
            m = a + 22 + l;
            CheckDay(m);
          } else {
            m = a + 21 + l;
            CheckDay(m);
          }
        }
        break;
      case 10:
        if (a < 0 || a > 30) {
          System.out.println("Error In Input.");
        } else {
          if ((f == 0 && g != 0) || h == 0) {
            m = a + 25 + l;
            CheckDay(m);
          } else {
            m = a + 24 + l;
            CheckDay(m);
          }
        }
        break;
      case 11:
        if (a < 0 || a > 31) {
          System.out.println("Error In Input.");
        } else {
          if ((f == 0 && g != 0) || h == 0) {
            m = a + 27 + l;
            CheckDay(m);
          } else {
            m = a + 26 + l;
            CheckDay(m);
          }
        }
        break;
      default:
        System.out.println("Error In Input.");
    }
  }

}