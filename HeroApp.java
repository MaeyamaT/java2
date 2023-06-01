import java.util.*;
public class HeroApp{
	public static void main(String[] args){
		//Heroインスタンスの生成
		Hero h1=new Hero();
		h1.name="ゼシカ";
		h1.hp=100;

		Hero h2=new Hero();
		h2.name="ヤンガス";
		h2.hp=200;

		Matango ma=new Matango();
		ma.hp=20;
		ma.suffix='A';

		Matango mb=new Matango();
		mb.hp=20;
		mb.suffix='B';

		Matango[] ms=new Matango[3];
		ms[0]=ma;
		ms[1]=mb;
		ms[2]=new Matango();
		ms[2].hp=30;
		ms[2].suffix='C';

		for(Matango m:ms){
			m.appear();
		}
		h1.attack(ms[0]);

		Sword[] swords={
		new Sword("ひのきの棒",1),
		new Sword("鉄の棒",3),
		new Sword("炎の剣",10),
		new Sword("エクスカリバー",20),
		};

		int sidx=new Random().nextInt(swords.length);
		h1.setSword(swords[sidx]);
		h1.attack(ms[0]);

		Cleric cleric=new Cleric();
		cleric.name="ククール";
		cleric.hp-=30;
		cleric.selfAid();

		h1.slip();
		h2.slip();
		cleric.heal(h1);
		cleric.heal(h2);
		cleric.pray(5);
		h1.sit(3);
		h1.sleep();
		h1.run();
		h2.run();
	}
}
