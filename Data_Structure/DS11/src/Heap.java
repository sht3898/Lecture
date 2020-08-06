
public class Heap {
	
	void heapify(int[] a, int i, int n){
		int ai = a[i];
		while(i < n/2){	// 트리의 내부를 나타내는 인덱스인지 검사 (리프노드 제외)
			int j = 2*i + 1;	// i의 왼쪽 자식의 인덱스 저장 
			if(j+1 < n && a[j+1] > a[j]) ++j;	// i의 두 자식 중 더 큰 자식의 인덱스 저장 
			if(a[j] <= ai) break;	// 더 큰 자식이 부모보다 작거나 같으면 이미 정렬된 경우로 heapify 멈춤 
			a[i] = a[j];	// 아닌 경우에는 루트의 값과 교체
			a[j] = ai;
			i = j;	// 다음 검사를 위한 인덱스 재조정
		}
	}
	
	// AS01 --------------------------------------------------------------------------------
	void buildHeap(int[] a, int i, int n){
//		if(i >= n/2) return;	// 트리의 내부를 나타내는 인덱스인지 검사 (리프노드 제외)
//		buildHeap(a, 2*i + 1, n);	// 왼쪽 자식에 대한 히프 구축
//		buildHeap(a, 2*i + 2, n);	// 오른쪽 자식에 대한 히프 구축
//		heapify(a, i, n);	// 루트에 대한 히프화 알고리즘 적용
		
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
