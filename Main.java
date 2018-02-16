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
	
	public static void InsertionSort(int[] arr)
	{
		int j = -1;
		for (int i = 1; i < n; i++)
		{
			int key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key)
			{
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void Display(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int[] arr = {5, 3, 4, 1, 2};
		Display(arr);
		SelectionSort();
		Display(arr);
	}
}