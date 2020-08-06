
public class Heap {
	
	void heapify(int[] a, int i, int n){
		int ai = a[i];
		while(i < n/2){	// Ʈ���� ���θ� ��Ÿ���� �ε������� �˻� (������� ����)
			int j = 2*i + 1;	// i�� ���� �ڽ��� �ε��� ���� 
			if(j+1 < n && a[j+1] > a[j]) ++j;	// i�� �� �ڽ� �� �� ū �ڽ��� �ε��� ���� 
			if(a[j] <= ai) break;	// �� ū �ڽ��� �θ𺸴� �۰ų� ������ �̹� ���ĵ� ���� heapify ���� 
			a[i] = a[j];	// �ƴ� ��쿡�� ��Ʈ�� ���� ��ü
			a[j] = ai;
			i = j;	// ���� �˻縦 ���� �ε��� ������
		}
	}
	
	// AS01 --------------------------------------------------------------------------------
	void buildHeap(int[] a, int i, int n){
//		if(i >= n/2) return;	// Ʈ���� ���θ� ��Ÿ���� �ε������� �˻� (������� ����)
//		buildHeap(a, 2*i + 1, n);	// ���� �ڽĿ� ���� ���� ����
//		buildHeap(a, 2*i + 2, n);	// ������ �ڽĿ� ���� ���� ����
//		heapify(a, i, n);	// ��Ʈ�� ���� ����ȭ �˰��� ����
		
		for(int j=n/2; j>=0; j--)
		{
			heapify(a, j, n);
		}
	}
	
	// AS02 --------------------------------------------------------------------------------
	boolean isHeap(int[] a, int size){
		for(int i=0; i < size/2; i++)
		{
			int left = i*2 + 1;
			
			if(left < size && a[i] < a[left]) return false;
			if(left+1 < size && a[i] < a[left+1]) return false;
		}
		return true;
	}
	
	// AS03 --------------------------------------------------------------------------------
	boolean isHeapForSubTree(int[] a, int i, int n){
		int left = i*2+1;
		int right = left+1;
		
		if(i >= n/2) return true;
		if(left < n && a[i] < a[left]) return false;
		if(right < n && a[i] < a[right]) return false;
		
		return isHeapForSubTree(a, left, n) && isHeapForSubTree(a,  right, n);
	}
}
