public class Hero{
	/*フィールド変数*/
	String name;
	int hp;
	//has-aの関係(Hero has a Sword)
	Sword sword;

	/*インスタンスメソッド*/
	public void sleep(){
		this.hp=100;
		System.out.println(this.name+"は、眠って回復した!");
	}
	public void sit(int sec){
		this.hp+=sec;
		System.out.println(this.name+"は、"+sec+"秒座った!");
		System.out.println("HPが"+sec+"ポイント回復した");
	}
	public void slip(){
		this.hp-=5;
		System.out.println(this.name+"は、転んだ!");
		System.out.println("5のダメージ");
	}
	public void run(){
		System.out.println(this.name+"は、逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+this.hp+"でした");
	}
	public void setSword(Sword s){
		System.out.printf("%sは%sを装備した!%n",this.name,s.name);
		this.sword=s;
	}
	public void attack(Matango m){
		if(this.sword==null){
			System.out.println("剣を装備していない!!");
			return;
		}
		System.out.println(this.name+"は攻撃した!");
		System.out.printf("マタンゴ%sに%dのダメージを与えた!!%n",m.suffix,this.sword.damage);
		m.hp-=this.sword.damage;
	}
}
