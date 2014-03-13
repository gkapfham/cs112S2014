public class BubbleSortingExample
{

    public static void main(String[] args)
    {

	int[] data = {45,5};
	
	print(data);
	bubbleSort(data);
	print(data);

    }

    public static void print(int array[])
    {

	int i = 0;
	for(i=0; i < array.length; i++)
	    {
		System.out.print(array[i] + " ");
	    }
	System.out.println();
	System.out.println();

    }

    public static void bubbleSort(int[] data)
    {
	for (int k = 0; k < data.length - 1; k++)
	    {
      
		boolean isSorted = true;

		for (int i = 1; i < data.length - k; i++)
		    {
         
			if (data[i] < data[i - 1])
			    {
				int tempVariable = data[i];
				data[i] = data[i - 1];
				data[i - 1] = tempVariable;

				isSorted = false;

			    }
		    }

		if (isSorted)
		    break;
	    }

    }

}