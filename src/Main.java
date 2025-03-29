import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Team[] team = new Team[n];
            for(int j = 0; j < n; j++)
                team[i] = new Team();
            for(int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                int id = Integer.parseInt(st.nextToken())-1;
                int problem = Integer.parseInt(st.nextToken());
                int score = Integer.parseInt(st.nextToken());
                team[id].setLastTried(j);
                team[id].addScore(problem, score);
            }
        }
        
    }
    
    static class Team {
        private HashMap<Integer, Integer> score;
        private int tries;
        private int lastTried;
        
        public Team () {
            score = new HashMap<>();
            tries = 0;
            lastTried = 0;
        }
        
        public int getScoreSum() {
            int sum = 0;
            for(int id : score.keySet()) {
                sum += score.get(id);
            }
            return sum;
        }
        
        public void addScore(int problem, int score) {
            this.score.put(problem, Math.max(this.score.getOrDefault(problem, 0), score));
        }
        
        public int getTries() {
            return tries;
        }
        
        public void addSubmit(int submit) {
            this.tries += submit;
        }
        
        public int getLastTried() {
            return lastTried;
        }
        
        public void setLastTried(int lastTried) {
            this.lastTried = lastTried;
        }
    }
}
