public class TwoLargest{
    public static void main(String [] args){

	int nate = 0;

	double term = IO.readDouble();
	nate++;

	double input = IO.readDouble();
	double x, y;
	if(input!=term){
	    x = input;
	    y = input;
	    nate++;
	}
	else{
	    do{
		IO.reportBadInput();
		input = IO.readDouble();
		}
	    while(input==term);
	    x = input;
	    y = input;
	    nate++;
	}

	input = IO.readDouble();

	if(input==term){
	    do{
		IO.reportBadInput();
		input = IO.readDouble();
	    }
	    while(input==term);
	    nate++;
	}
	else
	    nate++;

	if(input > x){
	    double temp = x;
	    x = input;
	    y = temp;
	}
	else
		y = input;


	if(nate == 3){
	    input = IO.readDouble();
	    while(input != term){
		if(input > x){
		    double temp = x;
		    x = input;
		    y = temp;
		}
		else{
		    if(input > y)
			y = input;
		}
		input = IO.readDouble();
	    }
	}

	else
	    System.out.println("Error. Please Try Again.");

	IO.outputDoubleAnswer(x);
	IO.outputDoubleAnswer(y);

    }
}
