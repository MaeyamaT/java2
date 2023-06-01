public class Cleric{
	String name;
	int MAX_HP=50;
	int MAX_MP=20;
	int hp=MAX_HP;
	int mp=MAX_MP;

	public void selfAid(){
		System.out.println(this.name+"はセルフエイドを唱えた!");
		this.hp=this.MAX_HP;
		this.mp-=5;
		System.out.println("HPが最大まで回復した");
	}
	public int pray(int sec){
		int rnd=new java.util.Random().nextInt(3);
		int rec=sec+rnd;
		rec=Math.min(this.MAX_MP-this.mp,rec);
		System.out.println(this.name+"は祈った!");
		System.out.println("MPが"+rec+"回復した!");
		this.mp+=rec;
		return rec;
	}
	public void heal(Hero h){
		System.out.println(this.name+"はhealを唱えた!");
    if(this.mp<10){
			System.out.println("mpが足りない!");
			return;
		}
		this.mp-=10;
		h.hp+=30;
		System.out.printf("%sのHPが30回復した!%n",h.name);
	}
}
