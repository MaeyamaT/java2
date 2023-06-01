public class Matango{
	int hp;
	final int LEVEL=10;
	char suffix;
	public void run(){
		System.out.println("おばけキノコ"+this.suffix+"は逃げ出した");
	}
	public void appear(){
		System.out.printf("おばけキノコ%s(%d)があらわれた!%n",this.suffix,this.hp);
	}
}
