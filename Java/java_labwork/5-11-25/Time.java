class Time
{
	int hr,min,sec;

	Time(int h,int m,int s)
	{
		this.hr=h;
		this.min=m;
		this.sec=s;
		normalize();
	}
} class time ends here

void normalize()
{
	if(sec >=60)
	{
		min = min+sec/60;
		sec = sec % 60;
	}
	
	if(min >= 60)
	{
		hr = hr+min/60;
		min = min % 60;
	}
	
	if(hr >=24)
	{
		hr = hr % 24;
	}
} // normalize ends here



class TimeTest
{
	public static void main(String[] args)
	{
	
		Time t1 = new Time(10,37,03);
		Time t2 = new Time(18,57,33);
	} //main ends here
} //class timetest ends here

