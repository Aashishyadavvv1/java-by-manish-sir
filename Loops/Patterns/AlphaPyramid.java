//A
//B B
//C C C 
//D D D D
//E E E E E



class AlphaPyramid{
void main()throws Exception{

int i,j;
char input,alphabet='A';
System.out.println("Enter a uppercase character you want to print in last row");
int x=System.in.read();
input=(char)x;

for(i=1;i<=(input-'A');++i){
	for(j=1;j<=i;++j){
	System.out.printf(" %d ",alphabet);
	}
	++alphabet;
	System.out.printf("\n");
	}
	}
	}