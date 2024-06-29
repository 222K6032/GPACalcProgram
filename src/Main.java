import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        int[] arrayG;
        int[] array_g;
        double G;
        double g;
        arrayG = lastyear_unit();
        G = lastyear_calc(arrayG);
        while (true) {
            array_g = thisyear_unit();
            g = thisyear_calc(arrayG, array_g);
            if (g != -1.00) { // -1.00は単位数が多すぎることを示す値
                break;
            }
            System.out.println("入力する単位数が多すぎます、もう一度入力してください。");
        }
        print_result(G, g);
        // Debug
        System.out.println(G + " " + g);
    }

    @SuppressWarnings("resource")
    public static int[] lastyear_unit() {
        int S, A, B, C, F, T;
        System.out.println("入学してから前年度までに取得している成績ごとの単位数を入力してください(単位認定とは別に入力する)");
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("秀:");
            if (scan.hasNextInt()) {
                S = scan.nextInt();
                if (S >= 0) {
                    break;
                } else {
                    System.out.println("正の整数で入力してください");
                }
            } else {
                System.out.println("正の整数で入力してください");
            }

        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("優:");
            if (scan.hasNextInt()) {
                A = scan.nextInt();
                if (A >= 0) {
                    break;
                } else {
                    System.out.println("正の整数で入力してください");
                }
            } else {
                System.out.println("正の整数で入力してください");
            }

        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("良:");
            if (scan.hasNextInt()) {
                B = scan.nextInt();
                if (B >= 0) {
                    break;
                } else {
                    System.out.println("正の整数で入力してください");
                }
            } else {
                System.out.println("正の整数で入力してください");
            }

        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("可:");
            if (scan.hasNextInt()) {
                C = scan.nextInt();
                if (C >= 0) {
                    break;
                } else {
                    System.out.println("正の整数で入力してください");
                }
            } else {
                System.out.println("正の整数で入力してください");
            }

        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("不可:");
            if (scan.hasNextInt()) {
                F = scan.nextInt();
                if (F >= 0) {
                    break;
                } else {
                    System.out.println("正の整数で入力してください");
                }
            } else {
                System.out.println("正の整数で入力してください");
            }

        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("単位認定:");
            if (scan.hasNextInt()) {
                T = scan.nextInt();
                if (T >= 0) {
                    break;
                } else {
                    System.out.println("正の整数で入力してください");
                }
            } else {
                System.out.println("正の整数で入力してください");
            }
        }
        int[] score;
        score = new int[6];
        score[0] = S;
        score[1] = A;
        score[2] = B;
        score[3] = C;
        score[4] = F;
        score[5] = T;
        return score;
    }

    @SuppressWarnings("resource")
    public static int[] thisyear_unit() {
        int s, a, b, c, f, t;
        System.out.println("今年度までの目標とする成績ごとの単位数を半角数字で入力してください(単位認定とは別に入力する)");
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("秀:");
            if (scan.hasNextInt()) {
                s = scan.nextInt();
                if (s >= 0) {
                    break;
                } else {
                    System.out.println("正の整数で入力してください");
                }
            } else {
                System.out.println("正の整数で入力してください");
            }
        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("優:");
            if (scan.hasNextInt()) {
                a = scan.nextInt();
                if (a >= 0) {
                    break;
                } else {
                    System.out.println("正の整数で入力してください");
                }
            } else {
                System.out.println("正の整数で入力してください");
            }

        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("良:");
            if (scan.hasNextInt()) {
                b = scan.nextInt();
                if (b >= 0) {
                    break;
                } else {
                    System.out.println("正の整数で入力してください");
                }
            } else {
                System.out.println("正の整数で入力してください");
            }

        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("可:");
            if (scan.hasNextInt()) {
                c = scan.nextInt();
                if (c >= 0) {
                    break;
                } else {
                    System.out.println("正の整数で入力してください");
                }
            } else {
                System.out.println("正の整数で入力してください");
            }

        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("不可:");
            if (scan.hasNextInt()) {
                f = scan.nextInt();
                if (f >= 0) {
                    break;
                } else {
                    System.out.println("正の整数で入力してください");
                }
            } else {
                System.out.println("正の整数で入力してください");
            }

        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("単位認定:");
            if (scan.hasNextInt()) {
                t = scan.nextInt();
                if (t >= 0) {
                    break;
                } else {
                    System.out.println("正の整数で入力してください");
                }
            } else {
                System.out.println("正の整数で入力してください");
            }

        }
        int[] thisscore;
        thisscore = new int[6];
        thisscore[0] = s;
        thisscore[1] = a;
        thisscore[2] = b;
        thisscore[3] = c;
        thisscore[4] = f;
        thisscore[5] = t;
        return thisscore;
    }

    public static double print_result(double G, double g) {
        System.out.printf("入学してから前年度までの GPA: %.2f%n", G);
        System.out.printf("入学してから今年度までの目標となる GPA: %.2f%n", g);
        return 0;
    }

    public static double lastyear_calc(int[] array) {
        // s,t,a,b,c,f
        double G = (array[0] + array[5]) + array[1] + array[2] + array[3] + array[4];
        if (G == 0) {
            return 0.00;
        }
        // s,t,a,b,c,f
        return (4.0 * (array[0] + array[5]) + 3.0 * array[1] + 2.0 * array[2] + 1.0 * array[3] + 0.0 * array[4]) / G;
    }

    public static double thisyear_calc(int[] arrayG, int[] array_g) {
        if (!((array_g[0]/* s */ + array_g[1]/* a */ + array_g[2]/* b */ + array_g[3]/* c */
                + array_g[4]/* f */) <= 48))// s+a+b+c+fは48単位以下
        {
            return -1.00;// 0.00を返す
        } else {
            double g = ((arrayG[0]/* S */ + array_g[0]/* s */ + arrayG[5]/* T */ + array_g[5]/* t */)
                    + (arrayG[1]/* A */ + array_g[1]/* a */) + (arrayG[2]/* B */ + array_g[2]/* b */)
                    + (arrayG[3]/* C */ + array_g[3]/* c */) + (arrayG[4]/* F */ + array_g[4]/* f */));
            if (g == 0) {
                return 0.00;
            }
            return ((4 * (arrayG[0]/* S */ + array_g[0]/* s */ + arrayG[5]/* T */ + array_g[5]/* t */)
                    + 3 * (arrayG[1]/* A */ + array_g[1]/* a */) + 2 * (arrayG[2]/* B */ + array_g[2]/* b */)
                    + 1 * (arrayG[3]/* C */ + array_g[3]/* c */) + 0 * (arrayG[4]/* F */ + array_g[4]/* f */))) / g;
        }
    }
}
