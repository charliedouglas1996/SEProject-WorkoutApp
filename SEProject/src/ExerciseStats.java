public class ExerciseStats {
    
        private int count;
        private int totalLength;

	public ExerciseStats(){
        this.count = 0;
        this.totalLength = 0;
        }

	public int getCount() {
		return this.count;
	}

	public void setCount() {
		this.count += 1;
	}
        
        public void setTotalLength(int n){
            totalLength += n;
        }
        
        public int getTotalLength(){
            return totalLength;
        }
}