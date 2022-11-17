public class LinkedListDeque<T> implements Deque<T>{
    public class StuffNode {
        public StuffNode prev;
        public T item;
        public StuffNode next;

        public StuffNode(StuffNode p, T i, StuffNode n) {
            item = i;
            next = n;
            prev = p;
        }
    }
    private StuffNode sentinel;
    public int size;


	public LinkedListDeque() {
		sentinel= new StuffNode(null, null, null);
		sentinel.next=sentinel;
		sentinel.prev=sentinel;
		size=0;
	}
    public LinkedListDeque(T x) {
        sentinel= new StuffNode(null, null, null);
        sentinel.next= new StuffNode(sentinel, x, sentinel);
        size=1;
    }

	@Override
    public void addFirst(T item) {
        StuffNode x=new StuffNode(sentinel, item, sentinel.next);
        sentinel.next.prev=x;
        sentinel.next=x;
        size += 1;
    }

	@Override
	public void addLast(T item){
    	StuffNode x=new StuffNode(sentinel.prev, item, sentinel);
        sentinel.prev.next=x;
        sentinel.prev=x;
        size += 1;
    }

	@Override
	public boolean isEmpty(){
    	if (size==0)
    		return true;
    	else
    		return false;
    }

	@Override
    public int size(){
    	return this.size;
    }


	@Override
    public void printDeque(){
    	StuffNode p=sentinel.next;
    	while (p !=sentinel){
    		System.out.print(p.item+" ");
    		p=p.next;
    	}}


	@Override
    public T removeFirst(){
    	if (this.size==0)
    		return null;
    	else{
    		T item=sentinel.next.item;
    		sentinel.next=sentinel.next.next;
    		sentinel.next.prev=sentinel;
    		size--;
    		return item;
    	}
    }


	@Override
    public T removeLast(){
    	if (this.size==0)
    		return null;
    	else{
    		T item=sentinel.prev.item;
    		sentinel.prev=sentinel.prev.prev;
    		sentinel.prev.next=sentinel;
    		size--;
    		return item;
    	}}


	@Override
	public T get(int index){
		if (index>this.size-1)
			return null;
		else{
			int i=-1;
			StuffNode p=sentinel;
			for (; i<index; i++){
				p=p.next;
			}
			return p.item;
		}}

    public T getRecursive(int index){
		return gethelper(index, this.sentinel.next);
    }
    public T gethelper(int index, StuffNode n){
		if (index>this.size-1)
			return null;
		else{
    	if (index==0){
    		return n.item;
    	}else{
    		return gethelper(index-1, n.next);
    	}}


    }

}