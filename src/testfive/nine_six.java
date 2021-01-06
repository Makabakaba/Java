package testfive;

public class nine_six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch object =new StopWatch();
		int[] n=new int[100000];
		for(int i=0;i<100000;i++){
			n[i]=(int)(Math.random()*100);
		}
		select(n);
		object.stop(object.getElapsedTime());
		long time=object.getEndTime()-object.getStartTime();
		System.out.print(time);
	}
	
	public static void select(int[] list)
	{
		for(int i=0;i<list.length-1;i++){
			int max=list[i];
			int max_index=i;
			
			for(int j=i+1;j<list.length;j++){
				if(max<list[j]){
					max=list[j];
					max_index=j;
				}
			}
			
			if(max_index!=i){
			    list[max_index]=list[i];
			    list[i]=max;
			}
		}
	}
}

public class StopWatch{

	// TODO Auto-generated method stub
	private long startTime;
	private long endTime;
	public void StopWatch(){
		java.util.Date date=new java.util.Date();
		startTime=date.getTime();
	}
	public void start(long startTime){
		this.startTime=startTime;
	}
	public void stop(long endTime){
		this.endTime=endTime;
	}
	public long getElapsedTime(){
		java.util.Date time=new java.util.Date();
		return time.getTime();
	}
	public long getStartTime(){
		return startTime;
	}
	public long getEndTime(){
		return endTime;
	}
}
