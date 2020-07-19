package 행렬경로문제;
import java.util.Scanner;
 
public class DP_basic {
    static int T; // 테스트 케이스
    static int N; // N
    static int [][] L; // 행렬값을 저장한 배열
    static int [][] M; // 메모리제이션 테이블
    static int [][] D; // 다이나믹 테이블
     
    static int sum;
     
    static int max(int a,int b) {
        return (a>b) ? a : b;
    }
     
    static int DFS(int i,int j) {
        if(i==1 && j==1) {
            return L[i][j];
        } else if(i==1) {
            return DFS(i,j-1) + L[i][j];
        } else if(j==1) {
            return DFS(i-1,j) + L[i][j];
        } else {
            return max(DFS(i,j-1),DFS(i-1,j)) + L[i][j];
        }
    }
     
    static int Memoization(int i,int j) {
        if(M[i][j] != 0) return M[i][j];
        if(i==1 && j==1) {
            M[i][j] = L[i][j];
        } else if(i==1) {
            M[i][j] = Memoization(i,j-1) + L[i][j];
        } else if(j==1) {
            M[i][j] = Memoization(i-1,j) + L[i][j];
        } else {
            M[i][j] = max(Memoization(i,j-1),Memoization(i-1,j)) + L[i][j];
        }
        return M[i][j];
    }
     
    static int Dynamic() {
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                if(i==1 && j==1) {
                    D[i][j] = L[i][j];
                } else if(i==1) {
                    D[i][j] = D[i][j-1] + L[i][j];
                } else if(j==1) {
                    D[i][j] = D[i-1][j] + L[i][j];
                } else {
                    D[i][j] = max(D[i][j-1],D[i-1][j]) + L[i][j];
                }
            }
        }
        return D[N][N];
    }
     
    static int Dynamic2() {
        D[1][1] = L[1][1];
                 
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                D[i][j] = max(D[i][j-1],D[i-1][j]) + L[i][j];
            }
        }
        return D[N][N];
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
         
        for(int test_case=1; test_case<=T; test_case++) {
            N = sc.nextInt();
            L = new int[N+1][N+1];
            M = new int[N+1][N+1];
            D = new int[N+1][N+1];
             
            for(int i=1; i<=N; i++) {
                for(int j=1; j<=N; j++) {
                    L[i][j] = sc.nextInt();
                }
            }
             
            //int sol = DFS(N,N);
            //int sol = Memoization(N, N);
            //int sol = Dynamic();
            int sol = Dynamic2();
             
            System.out.println("#" + test_case + ": " + sol);
             
        }
        sc.close();
    }
}