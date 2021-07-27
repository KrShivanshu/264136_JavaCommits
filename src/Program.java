import java.util.*; 

class Bowling {
    private String s;
    private int max = 0;
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    public void getWinner(){
    for (Map.Entry<String, Integer> set :
             players.entrySet()){
                if(set.getValue()>max){
                    max= set.getValue();
                    s = set.getKey();
                }
            }
            System.out.println(s);
        }
            
}

public class Program {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}