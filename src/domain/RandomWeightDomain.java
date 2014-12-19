package domain;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

/*���� ���� �� �ϳ��� ����ġ�� ���� random���� ����*/
public class RandomWeightDomain implements Domain{
	private Map<String, Integer> params;
	private Random random;
	private int totalWeight;


	public RandomWeightDomain(Map<String, Integer> params){
		this.params = params;
		this.random = new Random();
		sumTotalWeight();
	}

	public void sumTotalWeight(){
		for(Integer w : params.values()){
			if(w != null && w > 0)
				totalWeight += w;
		}
	}

	@Override
	public String makeValue() {
		int rand = random.nextInt(totalWeight) + 1;
		int subSum = 0;
		for(Entry<String, Integer> entry : params.entrySet()){
			Integer value = entry.getValue();
			
				if(value != null && value > 0)
					subSum += value;

				if(rand <= subSum)
					return entry.getKey();
		}
		return  null;
	}

}
