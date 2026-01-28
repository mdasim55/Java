import java.util.ArrayList;

class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

    // 1. Add the element in the heap...
    public void add(int data) {
        arr.add(data);       // O(1)   // Add the elemnt in the last;

        int x = arr.size()-1;   // Calculate the child idx
        int par = (x-1)/2;      // Calculate the parent indx
        
        while(arr.get(x)<arr.get(par)) {       // Time Complexity: O(log n)
            // Swap...
            int temp = arr.get(par);
            arr.set(par,arr.get(x));
            arr.set(x,temp);
            
            x=par;
            par=(x-1)/2;
        } 
    }
    // 2. Peek operation...  Time Complexity: O(1)
    public int peek() {
        return arr.get(0);
    }
    // 3.1 Heapify algorithm... for min heap..
    private void hepify(int i) {
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx=i;
        if(left<arr.size() && arr.get(minIdx)>arr.get(left)) {
            minIdx = left;
        }
        if(right<arr.size() && arr.get(minIdx)>arr.get(right)) {
            minIdx = right;
        }
        // Check min index change or not...
        if(minIdx!=i) {
            // swap : i & minIdx
            int temp = arr.get(i);
            arr.set(i,arr.get(minIdx));
            arr.set(minIdx,temp);
            hepify(minIdx);
        }
    }
    // 3.1 Heapify algorithm...for max heap...
    private void hepify1(int i) {
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx=i;
        if(left<arr.size() && arr.get(maxIdx)<arr.get(left)) {
            maxIdx = left;
        }
        if(right<arr.size() && arr.get(maxIdx)<arr.get(right)) {
            maxIdx = right;
        }
        // Check min index change or not...
        if(maxIdx!=i) {
            // swap : i & minIdx
            int temp = arr.get(i);
            arr.set(i,arr.get(maxIdx));
            arr.set(maxIdx,temp);
            hepify1(maxIdx);
        }
    }
    // 3. Remove operation... Time Complexity: O(log n)
    public int remove() {
        int element = arr.get(0);

        // step 1: Swap fist element and last element 
        int temp = arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1,temp);

        // step: Delete the last element
        arr.remove(arr.size()-1);

        // Manage the heap tree using hepify algorithm...
        // hepify(0);       // For min heap
        hepify1(0);         // For max heap
        return element;
    }
    // 4. isEmpty() operation...
    public boolean isempty() {
        return arr.size()==0;
    }

}

public class H1_Implementation {
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(1);
        hp.add(2);
        hp.add(3);
        hp.add(4);

        while(!hp.isempty()) {
            System.out.println(hp.peek());
            hp.remove();
        }
    }
}
