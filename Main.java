public class Main
{
	public static void SelectionSort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			int maxIndex = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[j] > arr[maxIndex])
				{
					maxIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("hello world");
	}
}