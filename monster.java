import java.util.Arrays;
import java.util.Scanner;

public class monster {
  static class countkils{
    int power;
    int bonus;
     countkils(int power,int bonus){
        this.power=power;
        this.bonus=bonus;
    }
  }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,e; //n- number of monsters , e- Initial expereinece;
        System.out.println("Enter the Monsters: ");
        n = sc.nextInt();
        System.out.println("Enter the Initial Experience: ");
        e = sc.nextInt();
        int[] power=new int[n];
        int[] bonus=new int[n];
        System.out.println("Enter the Powers");
        for(int i=0;i<n;i++){
            power[i]=sc.nextInt();
            
        }
        System.out.println("Enter the Bonus");
        for(int j=0;j<n;j++){
            bonus[j]=sc.nextInt();
            
        }

        countkils[] monsters=new countkils[n];
        for(int i=0;i<n;i++){
             monsters[i]= new countkils(power[i],bonus[i]);
          }
          Arrays.sort(monsters,(a,b)->Integer.compare(a.power,b.power));

          int kills=0;
          for(int i=0;i<n;i++){
            if(e>=monsters[i].power){
                kills++;
                e+=monsters[i].bonus;
            }
            else{
                break;
            }
          }
          System.out.println("Number of kills: "+kills);
          
}
}